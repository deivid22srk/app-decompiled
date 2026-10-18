package com.google.android.finsky.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.keyczar.KeyczarFileReader;
import org.keyczar.Verifier;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.KeyczarReader;

/* loaded from: classes.dex */
public final class q implements DfeResponseVerifier {

    /* renamed from: a, reason: collision with root package name */
    private static final SecureRandom f2003a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f2004b = "keys" + File.separator + "dfe-response-auth";
    private static final String c = "keys" + File.separator + "dfe-response-auth-dev";
    private static KeyczarReader d;
    private static boolean e;
    private static KeyczarReader f;
    private final Context g;
    private boolean h;
    private byte[] i = new byte[256];

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e2) {
            FinskyLog.d("Could not initialize SecureRandom, SHA1PRNG not supported. %s", e2);
            secureRandom = null;
        }
        f2003a = secureRandom;
    }

    public q(Context context) {
        this.g = context;
    }

    @Override // com.google.android.play.dfe.api.DfeResponseVerifier
    public final synchronized String a() {
        if (f2003a == null) {
            throw new DfeResponseVerifier.DfeResponseVerifierException("Uninitialized SecureRandom.");
        }
        if (!this.h) {
            f2003a.nextBytes(this.i);
            this.h = true;
        }
        return "nonce=" + Base64.encodeToString(this.i, 11);
    }

    @Override // com.google.android.play.dfe.api.DfeResponseVerifier
    public final void a(byte[] bArr, String str) {
        KeyczarReader b2;
        boolean a2 = a(a(this.g), this.i, bArr, str);
        if (!a2 && (b2 = b(this.g)) != null) {
            FinskyLog.a("Retry verification using fallback keys.", new Object[0]);
            a2 = a(b2, this.i, bArr, str);
        }
        if (!a2) {
            FinskyLog.a("Response signature verified: %b", Boolean.valueOf(a2));
            throw new DfeResponseVerifier.DfeResponseVerifierException("Response signature mismatch.");
        }
        FinskyLog.b("Response signature verified: %b", Boolean.valueOf(a2));
    }

    private static boolean a(KeyczarReader keyczarReader, byte[] bArr, byte[] bArr2, String str) {
        try {
            Verifier verifier = new Verifier(keyczarReader);
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            if (TextUtils.isEmpty(str)) {
                FinskyLog.d("No signing response found.", new Object[0]);
                throw new DfeResponseVerifier.DfeResponseVerifierException("No signing response found.");
            }
            for (String str2 : str.split(";")) {
                String trim = str2.trim();
                if (trim.startsWith("signature=")) {
                    return verifier.verify(bArr3, Base64.decode(trim.substring(10), 11));
                }
            }
            throw new DfeResponseVerifier.DfeResponseVerifierException("Signature not found in response: " + str);
        } catch (KeyczarException e2) {
            FinskyLog.c("Keyczar exception during signature verification: %s", e2);
            return false;
        }
    }

    private static synchronized KeyczarReader a(Context context) {
        KeyczarReader keyczarReader;
        synchronized (q.class) {
            if (d == null) {
                d = new com.google.android.finsky.api.apkg.a(context.getResources(), f2004b);
            }
            keyczarReader = d;
        }
        return keyczarReader;
    }

    private static synchronized KeyczarReader b(Context context) {
        KeyczarReader keyczarReader;
        synchronized (q.class) {
            if (!e) {
                File file = new File(context.getFilesDir(), c);
                if (file.exists()) {
                    f = new KeyczarFileReader(file.getAbsolutePath());
                }
                e = true;
            }
            keyczarReader = f;
        }
        return keyczarReader;
    }
}
