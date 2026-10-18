package org.keyczar;

import com.google.gson.apkg.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.KeyType;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

/* loaded from: classes.dex */
public class HmacKey extends KeyczarKey {
    private static final String MAC_ALGORITHM = "HMACSHA1";
    private final byte[] hash;
    private SecretKey hmacKey;

    @a
    private final String hmacKeyString;

    public HmacKey(byte[] bArr) {
        super(bArr.length * 8);
        this.hash = new byte[4];
        this.hmacKeyString = Base64Coder.encodeWebSafe(bArr);
        initJceKey(bArr);
    }

    private HmacKey() {
        super(0);
        this.hash = new byte[4];
        this.hmacKeyString = null;
    }

    static HmacKey generate() {
        return generate(DefaultKeyType.HMAC_SHA1.defaultSize());
    }

    static HmacKey generate(int i) {
        return new HmacKey(Util.rand(i / 8));
    }

    void initFromJson() {
        initJceKey(Base64Coder.decodeWebSafe(this.hmacKeyString));
    }

    private void initJceKey(byte[] bArr) {
        this.hmacKey = new SecretKeySpec(bArr, MAC_ALGORITHM);
        System.arraycopy(Util.hash(bArr), 0, this.hash, 0, this.hash.length);
    }

    byte[] getEncoded() {
        return this.hmacKey.getEncoded();
    }

    @Override // org.keyczar.KeyczarKey
    protected Stream getStream() {
        return new HmacStream();
    }

    @Override // org.keyczar.KeyczarKey
    public KeyType getType() {
        return DefaultKeyType.HMAC_SHA1;
    }

    @Override // org.keyczar.KeyczarKey
    protected byte[] hash() {
        return this.hash;
    }

    static HmacKey read(String str) {
        HmacKey hmacKey = (HmacKey) Util.gson().a(str, HmacKey.class);
        hmacKey.initFromJson();
        return hmacKey;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.keyczar.KeyczarKey
    public SecretKey getJceKey() {
        return this.hmacKey;
    }

    /* loaded from: classes2.dex */
    class HmacStream implements SigningStream, VerifyingStream {
        private final Mac hmac;

        public HmacStream() {
            try {
                this.hmac = Mac.getInstance(HmacKey.MAC_ALGORITHM);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.SigningStream, org.keyczar.interfaces.VerifyingStream
        public int digestSize() {
            return HmacKey.this.getType().getOutputSize();
        }

        @Override // org.keyczar.interfaces.SigningStream
        public void initSign() {
            try {
                this.hmac.init(HmacKey.this.hmacKey);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public void initVerify() {
            initSign();
        }

        @Override // org.keyczar.interfaces.SigningStream
        public void sign(ByteBuffer byteBuffer) {
            byteBuffer.put(this.hmac.doFinal());
        }

        @Override // org.keyczar.interfaces.SigningStream
        public void updateSign(ByteBuffer byteBuffer) {
            this.hmac.update(byteBuffer);
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public void updateVerify(ByteBuffer byteBuffer) {
            updateSign(byteBuffer);
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public boolean verify(ByteBuffer byteBuffer) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return Util.safeArrayEquals(this.hmac.doFinal(), bArr);
        }
    }
}
