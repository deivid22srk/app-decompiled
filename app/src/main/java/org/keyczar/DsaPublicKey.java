package org.keyczar;

import com.google.gson.apkg.a;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.KeyType;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

/* loaded from: classes.dex */
public class DsaPublicKey extends KeyczarPublicKey {
    private static final String KEY_GEN_ALGORITHM = "DSA";
    private static final String SIG_ALGORITHM = "SHA1withDSA";

    @a
    final String g;
    private final byte[] hash;
    private DSAPublicKey jcePublicKey;

    @a
    final String p;

    @a
    final String q;

    @a
    final String y;

    static DsaPublicKey read(String str) {
        DsaPublicKey dsaPublicKey = (DsaPublicKey) Util.gson().a(str, DsaPublicKey.class);
        dsaPublicKey.initFromJson();
        return dsaPublicKey;
    }

    DsaPublicKey(DSAPublicKey dSAPublicKey) {
        this(dSAPublicKey.getY(), dSAPublicKey.getParams());
    }

    DsaPublicKey(DSAPrivateKey dSAPrivateKey) {
        this(computeY(dSAPrivateKey), dSAPrivateKey.getParams());
    }

    private DsaPublicKey() {
        super(0);
        this.hash = new byte[4];
        this.jcePublicKey = null;
        this.g = null;
        this.q = null;
        this.p = null;
        this.y = null;
    }

    private DsaPublicKey(BigInteger bigInteger, DSAParams dSAParams) {
        super(bigInteger.bitLength());
        this.hash = new byte[4];
        BigInteger p = dSAParams.getP();
        BigInteger q = dSAParams.getQ();
        BigInteger g = dSAParams.getG();
        this.y = Base64Coder.encodeWebSafe(bigInteger.toByteArray());
        this.p = Base64Coder.encodeWebSafe(p.toByteArray());
        this.q = Base64Coder.encodeWebSafe(q.toByteArray());
        this.g = Base64Coder.encodeWebSafe(g.toByteArray());
        initializeJceKey(bigInteger, p, q, g);
        initializeHash();
    }

    private static BigInteger computeY(DSAPrivateKey dSAPrivateKey) {
        return dSAPrivateKey.getParams().getG().modPow(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP());
    }

    @Override // org.keyczar.KeyczarKey
    protected Stream getStream() {
        return new DsaVerifyingStream();
    }

    @Override // org.keyczar.KeyczarKey
    public KeyType getType() {
        return DefaultKeyType.DSA_PUB;
    }

    @Override // org.keyczar.KeyczarKey
    public byte[] hash() {
        return this.hash;
    }

    void initFromJson() {
        initializeJceKey(new BigInteger(Base64Coder.decodeWebSafe(this.y)), new BigInteger(Base64Coder.decodeWebSafe(this.p)), new BigInteger(Base64Coder.decodeWebSafe(this.q)), new BigInteger(Base64Coder.decodeWebSafe(this.g)));
        initializeHash();
    }

    private void initializeJceKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        try {
            this.jcePublicKey = (DSAPublicKey) KeyFactory.getInstance(KEY_GEN_ALGORITHM).generatePublic(new DSAPublicKeySpec(bigInteger, bigInteger2, bigInteger3, bigInteger4));
        } catch (GeneralSecurityException e) {
            throw new KeyczarException(e);
        }
    }

    private void initializeHash() {
        DSAParams params = this.jcePublicKey.getParams();
        System.arraycopy(Util.prefixHash(Util.stripLeadingZeros(params.getP().toByteArray()), Util.stripLeadingZeros(params.getQ().toByteArray()), Util.stripLeadingZeros(params.getG().toByteArray()), Util.stripLeadingZeros(this.jcePublicKey.getY().toByteArray())), 0, this.hash, 0, this.hash.length);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.keyczar.KeyczarKey
    public PublicKey getJceKey() {
        return this.jcePublicKey;
    }

    @Override // org.keyczar.KeyczarKey
    protected boolean isSecret() {
        return false;
    }

    /* loaded from: classes2.dex */
    class DsaVerifyingStream implements VerifyingStream {
        private Signature signature;

        public DsaVerifyingStream() {
            try {
                this.signature = Signature.getInstance(DsaPublicKey.SIG_ALGORITHM);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public int digestSize() {
            return DsaPublicKey.this.getType().getOutputSize();
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public void initVerify() {
            try {
                this.signature.initVerify(DsaPublicKey.this.jcePublicKey);
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public void updateVerify(ByteBuffer byteBuffer) {
            try {
                this.signature.update(byteBuffer);
            } catch (SignatureException e) {
                throw new KeyczarException(e);
            }
        }

        @Override // org.keyczar.interfaces.VerifyingStream
        public boolean verify(ByteBuffer byteBuffer) {
            try {
                return this.signature.verify(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
            } catch (GeneralSecurityException e) {
                throw new KeyczarException(e);
            }
        }
    }
}
