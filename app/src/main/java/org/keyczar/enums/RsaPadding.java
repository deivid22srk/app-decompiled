package org.keyczar.enums;

import java.security.interfaces.RSAPublicKey;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.util.Util;

/* loaded from: classes2.dex */
public enum RsaPadding {
    OAEP("RSA/ECB/OAEPWITHSHA1ANDMGF1PADDING"),
    PKCS("RSA/ECB/PKCS1PADDING");

    private final String cryptAlgorithm;

    RsaPadding(String str) {
        this.cryptAlgorithm = str;
    }

    public final String getCryptAlgorithm() {
        return this.cryptAlgorithm;
    }

    public final byte[] computeFullHash(RSAPublicKey rSAPublicKey) {
        switch (this) {
            case OAEP:
                return Util.prefixHash(Util.stripLeadingZeros(rSAPublicKey.getModulus().toByteArray()), Util.stripLeadingZeros(rSAPublicKey.getPublicExponent().toByteArray()));
            case PKCS:
                return Util.prefixHash(rSAPublicKey.getModulus().toByteArray(), rSAPublicKey.getPublicExponent().toByteArray());
            default:
                throw new KeyczarException("Bug! Unknown padding type");
        }
    }
}
