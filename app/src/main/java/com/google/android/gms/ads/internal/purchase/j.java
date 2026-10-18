package com.google.android.gms.ads.internal.purchase;

import android.util.Base64;
import com.google.android.gms.internal.gw;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

@gw
/* loaded from: classes.dex */
public final class j {
    public static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            com.google.android.gms.ads.internal.util.client.b.b("Invalid key specification.");
            throw new IllegalArgumentException(e2);
        }
    }

    public static boolean a(PublicKey publicKey, String str, String str2) {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            if (signature.verify(Base64.decode(str2, 0))) {
                return true;
            }
            com.google.android.gms.ads.internal.util.client.b.b("Signature verification failed.");
            return false;
        } catch (InvalidKeyException e) {
            com.google.android.gms.ads.internal.util.client.b.b("Invalid key specification.");
            return false;
        } catch (NoSuchAlgorithmException e2) {
            com.google.android.gms.ads.internal.util.client.b.b("NoSuchAlgorithmException.");
            return false;
        } catch (SignatureException e3) {
            com.google.android.gms.ads.internal.util.client.b.b("Signature exception.");
            return false;
        }
    }
}
