package org.keyczar;

import com.google.gson.apkg.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import org.keyczar.enums.RsaPadding;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.DecryptingStream;
import org.keyczar.interfaces.EncryptingStream;
import org.keyczar.interfaces.KeyType;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Util;

/* loaded from: classes.dex */
public class RsaPrivateKey extends KeyczarKey implements KeyczarPrivateKey {
    private static final String KEY_GEN_ALGORITHM = "RSA";
    private static final String SIG_ALGORITHM = "SHA1withRSA";

    @a
    private final String crtCoefficient;
    private RSAPrivateCrtKey jcePrivateKey;

    @a
    private final String primeExponentP;

    @a
    private final String primeExponentQ;

    @a
    private final String primeP;

    @a
    private final String primeQ;

    @a
    private final String privateExponent;

    @a
    private final RsaPublicKey publicKey;

    static RsaPrivateKey generate(RsaPadding rsaPadding) {
        return generate(DefaultKeyType.RSA_PRIV.defaultSize(), rsaPadding);
    }

    static RsaPrivateKey generate(int i, RsaPadding rsaPadding) {
        return new RsaPrivateKey((RSAPrivateCrtKey) Util.generateKeyPair(KEY_GEN_ALGORITHM, i).getPrivate(), rsaPadding);
    }

    static RsaPrivateKey read(String str) {
        return ((RsaPrivateKey) Util.gson().a(str, RsaPrivateKey.class)).initFromJson();
    }

    public RsaPrivateKey(RSAPrivateCrtKey rSAPrivateCrtKey, RsaPadding rsaPadding) {
        super(rSAPrivateCrtKey.getModulus().bitLength());
        this.publicKey = new RsaPublicKey(rSAPrivateCrtKey, rsaPadding);
        this.privateExponent = Util.encodeBigInteger(rSAPrivateCrtKey.getPrivateExponent());
        this.primeP = Util.encodeBigInteger(rSAPrivateCrtKey.getPrimeP());
        this.primeQ = Util.encodeBigInteger(rSAPrivateCrtKey.getPrimeQ());
        this.primeExponentP = Util.encodeBigInteger(rSAPrivateCrtKey.getPrimeExponentP());
        this.primeExponentQ = Util.encodeBigInteger(rSAPrivateCrtKey.getPrimeExponentQ());
        this.crtCoefficient = Util.encodeBigInteger(rSAPrivateCrtKey.getCrtCoefficient());
        this.jcePrivateKey = rSAPrivateCrtKey;
    }

    private RsaPrivateKey() {
        super(0);
        this.publicKey = null;
        this.privateExponent = null;
        this.primeP = null;
        this.primeQ = null;
        this.primeExponentP = null;
        this.primeExponentQ = null;
        this.crtCoefficient = null;
        this.jcePrivateKey = null;
    }

    @Override // org.keyczar.KeyczarKey
    protected Stream getStream() {
        return new RsaPrivateStream();
    }

    @Override // org.keyczar.KeyczarKey
    public KeyType getType() {
        return DefaultKeyType.RSA_PRIV;
    }

    @Override // org.keyczar.KeyczarKey
    protected byte[] hash() {
        return this.publicKey.hash();
    }

    @Override // org.keyczar.KeyczarPrivateKey
    public KeyczarPublicKey getPublic() {
        return this.publicKey;
    }

    private RsaPrivateKey initFromJson() {
        this.publicKey.initFromJson();
        try {
            this.jcePrivateKey = (RSAPrivateCrtKey) KeyFactory.getInstance(KEY_GEN_ALGORITHM).generatePrivate(new RSAPrivateCrtKeySpec(Util.decodeBigInteger(this.publicKey.modulus), Util.decodeBigInteger(this.publicKey.publicExponent), Util.decodeBigInteger(this.privateExponent), Util.decodeBigInteger(this.primeP), Util.decodeBigInteger(this.primeQ), Util.decodeBigInteger(this.primeExponentP), Util.decodeBigInteger(this.primeExponentQ), Util.decodeBigInteger(this.crtCoefficient)));
            return this;
        } catch (GeneralSecurityException e) {
            throw new KeyczarException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.keyczar.KeyczarKey
    public RSAPrivateCrtKey getJceKey() {
        return this.jcePrivateKey;
    }

    /* loaded from: classes2.dex */
    class RsaPrivateStream implements DecryptingStream, EncryptingStream, SigningStream, VerifyingStream {
        private Cipher cipher;
        private EncryptingStream encryptingStream;
        private Signature signature;
        private VerifyingStream verifyingStream;

        public RsaPrivateStream() {
            try {
                this.signature = Signature.getInstance(RsaPrivateKey.SIG_ALGORITHM);
                this.verifyingStream = (VerifyingStream) RsaPrivateKey.this.publicKey.getStream();
                this.cipher = Cipher.getInstance(RsaPrivateKey.this.publicKey.getPadding().getCryptAlgorithm());
                this.encryptingStream = (EncryptingStream) RsaPrivateKey.this.publicKey.getStream();
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.SigningStream, org.keyczar.interfaces.VerifyingStream
        public int digestSize() {
            return RsaPrivateKey.this.getType().getOutputSize();
        }

        @Override // org.keyczar.interfaces.DecryptingStream
        public int doFinalDecrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            try {
                return this.cipher.doFinal(byteBuffer, byteBuffer2);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.EncryptingStream
        public int doFinalEncrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            return this.encryptingStream.doFinalEncrypt(byteBuffer, byteBuffer2);
        }

        @Override // org.keyczar.interfaces.EncryptingStream
        public SigningStream getSigningStream() {
            return this.encryptingStream.getSigningStream();
        }

        @Override // org.keyczar.interfaces.DecryptingStream
        public VerifyingStream getVerifyingStream() {
            return new VerifyingStream() { // from class: org.keyczar.RsaPrivateKey.RsaPrivateStream.1
                @Override // org.keyczar.interfaces.VerifyingStream
                public int digestSize() {
                    return 0;
                }

                @Override // org.keyczar.interfaces.VerifyingStream
                public void initVerify() {
                }

                @Override // org.keyczar.interfaces.VerifyingStream
                public void updateVerify(ByteBuffer byteBuffer) {
                }

                @Override // org.keyczar.interfaces.VerifyingStream
                public boolean verify(ByteBuffer byteBuffer) {
                    return true;
                }
            };
        }

        @Override // org.keyczar.interfaces.DecryptingStream
        public void initDecrypt(ByteBuffer byteBuffer) {
            try {
                this.cipher.init(2, RsaPrivateKey.this.jcePrivateKey);
            } catch (InvalidKeyException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.EncryptingStream
        public int initEncrypt(ByteBuffer byteBuffer) {
            return this.encryptingStream.initEncrypt(byteBuffer);
        }

        @Override // org.keyczar.interfaces.SigningStream
        public void initSign() {
            try {
                this.signature.initSign(RsaPrivateKey.this.jcePrivateKey);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public void initVerify() {
            this.verifyingStream.initVerify();
        }

        @Override // org.keyczar.interfaces.DecryptingStream, org.keyczar.interfaces.EncryptingStream
        public int maxOutputSize(int i) {
            return RsaPrivateKey.this.getType().getOutputSize(RsaPrivateKey.this.size);
        }

        @Override // org.keyczar.interfaces.SigningStream
        public void sign(ByteBuffer byteBuffer) {
            try {
                byteBuffer.put(this.signature.sign());
            } catch (SignatureException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.DecryptingStream
        public int updateDecrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            try {
                return this.cipher.update(byteBuffer, byteBuffer2);
            } catch (ShortBufferException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.EncryptingStream
        public int updateEncrypt(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            return this.encryptingStream.updateEncrypt(byteBuffer, byteBuffer2);
        }

        @Override // org.keyczar.interfaces.SigningStream
        public void updateSign(ByteBuffer byteBuffer) {
            try {
                this.signature.update(byteBuffer);
            } catch (SignatureException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public void updateVerify(ByteBuffer byteBuffer) {
            this.verifyingStream.updateVerify(byteBuffer);
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public boolean verify(ByteBuffer byteBuffer) {
            return this.verifyingStream.verify(byteBuffer);
        }
    }
}
