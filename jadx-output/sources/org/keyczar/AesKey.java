package org.keyczar;

import com.google.gson.a.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.keyczar.enums.CipherMode;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.i18n.Messages;
import org.keyczar.interfaces.DecryptingStream;
import org.keyczar.interfaces.EncryptingStream;
import org.keyczar.interfaces.KeyType;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

/* loaded from: classes.dex */
public class AesKey extends KeyczarKey {
    private static final String AES_ALGORITHM = "AES";
    private static final int BLOCK_SIZE = 16;
    private static final CipherMode DEFAULT_MODE = CipherMode.CBC;
    private SecretKey aesKey;

    @a
    private final String aesKeyString;
    private final byte[] hash;

    @a
    private final HmacKey hmacKey;

    @a
    private final CipherMode mode;

    public AesKey(byte[] bArr, HmacKey hmacKey) {
        super(bArr.length * 8);
        this.hash = new byte[4];
        this.aesKeyString = Base64Coder.encodeWebSafe(bArr);
        this.mode = DEFAULT_MODE;
        this.hmacKey = hmacKey;
        initJceKey(bArr);
    }

    private AesKey() {
        super(0);
        this.hash = new byte[4];
        this.aesKeyString = null;
        this.hmacKey = null;
        this.mode = null;
    }

    static AesKey generate() {
        return generate(DefaultKeyType.AES.defaultSize());
    }

    static AesKey generate(int i) {
        return new AesKey(Util.rand(i / 8), HmacKey.generate());
    }

    static AesKey fromPackedKey(byte[] bArr) {
        byte[][] lenPrefixUnpack = Util.lenPrefixUnpack(bArr);
        if (lenPrefixUnpack.length != 2) {
            throw new KeyczarException(Messages.getString("AesKey.InvalidPackedKey", new Object[0]));
        }
        return new AesKey(lenPrefixUnpack[0], new HmacKey(lenPrefixUnpack[1]));
    }

    @Override // org.keyczar.KeyczarKey
    public KeyType getType() {
        return DefaultKeyType.AES;
    }

    @Override // org.keyczar.KeyczarKey
    protected byte[] hash() {
        return this.hash;
    }

    static AesKey read(String str) {
        AesKey aesKey = (AesKey) Util.gson().a(str, AesKey.class);
        aesKey.hmacKey.initFromJson();
        aesKey.initJceKey(Base64Coder.decodeWebSafe(aesKey.aesKeyString));
        return aesKey;
    }

    private void initJceKey(byte[] bArr) {
        this.aesKey = new SecretKeySpec(bArr, AES_ALGORITHM);
        System.arraycopy(Util.hash(Util.fromInt(16), bArr, this.hmacKey.getEncoded()), 0, this.hash, 0, this.hash.length);
    }

    byte[] getEncoded() {
        return Util.lenPrefixPack(this.aesKey.getEncoded(), this.hmacKey.getEncoded());
    }

    @Override // org.keyczar.KeyczarKey
    protected Stream getStream() {
        return new AesStream();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.keyczar.KeyczarKey
    public SecretKey getJceKey() {
        return this.aesKey;
    }

    /* loaded from: classes2.dex */
    class AesStream implements DecryptingStream, EncryptingStream {
        private final Cipher decryptingCipher;
        private final Cipher encryptingCipher;
        boolean ivRead = false;
        private final SigningStream signStream;

        public AesStream() {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
            try {
                this.encryptingCipher = Cipher.getInstance(AesKey.this.mode.getMode());
                this.encryptingCipher.init(1, AesKey.this.aesKey, ivParameterSpec);
                this.decryptingCipher = Cipher.getInstance(AesKey.this.mode.getMode());
                this.decryptingCipher.init(2, AesKey.this.aesKey, ivParameterSpec);
                this.signStream = (SigningStream) AesKey.this.hmacKey.getStream();
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.EncryptingStream
        public SigningStream getSigningStream() {
            return this.signStream;
        }

        @Override // org.keyczar.interfaces.DecryptingStream
        public VerifyingStream getVerifyingStream() {
            return (VerifyingStream) this.signStream;
        }

        @Override // org.keyczar.interfaces.DecryptingStream
        public void initDecrypt(ByteBuffer byteBuffer) {
            byte[] bArr = new byte[16];
            byteBuffer.get(bArr);
            this.decryptingCipher.update(bArr);
            this.ivRead = true;
        }

        @Override // org.keyczar.interfaces.EncryptingStream
        public int initEncrypt(ByteBuffer byteBuffer) {
            byte[] bArr = new byte[16];
            Util.rand(bArr);
            try {
                return this.encryptingCipher.update(ByteBuffer.wrap(bArr), byteBuffer);
            } catch (ShortBufferException e) {
                throw new org.keyczar.exceptions.ShortBufferException(e);
            }
        }

        @Override // org.keyczar.interfaces.DecryptingStream
        public int updateDecrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            if (this.ivRead && byteBuffer.remaining() >= 16) {
                byte[] bArr = new byte[16];
                byteBuffer.get(bArr);
                this.decryptingCipher.update(bArr);
                this.ivRead = false;
            }
            try {
                return this.decryptingCipher.update(byteBuffer, byteBuffer2);
            } catch (ShortBufferException e) {
                throw new org.keyczar.exceptions.ShortBufferException(e);
            }
        }

        @Override // org.keyczar.interfaces.EncryptingStream
        public int updateEncrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            try {
                return this.encryptingCipher.update(byteBuffer, byteBuffer2);
            } catch (ShortBufferException e) {
                throw new org.keyczar.exceptions.ShortBufferException(e);
            }
        }

        @Override // org.keyczar.interfaces.DecryptingStream
        public int doFinalDecrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            int i = 0;
            try {
                if (this.ivRead) {
                    if (byteBuffer.remaining() != 0) {
                        byte[] bArr = new byte[16];
                        byteBuffer.get(bArr);
                        this.decryptingCipher.update(bArr);
                        this.ivRead = false;
                    }
                    return i;
                }
                if (byteBuffer.remaining() == 0) {
                    byte[] doFinal = this.decryptingCipher.doFinal();
                    byteBuffer2.put(doFinal);
                    i = doFinal.length;
                } else {
                    i = this.decryptingCipher.doFinal(byteBuffer, byteBuffer2);
                }
                return i;
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.EncryptingStream
        public int doFinalEncrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            try {
                return this.encryptingCipher.doFinal(byteBuffer, byteBuffer2);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.DecryptingStream, org.keyczar.interfaces.EncryptingStream
        public int maxOutputSize(int i) {
            return AesKey.this.mode.getOutputSize(16, i);
        }
    }
}
