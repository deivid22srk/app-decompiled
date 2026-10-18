package com.google.android.finsky.auth;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.jm;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Account f2015a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2016b;
    public final com.google.android.finsky.billing.a.h c;
    public final boolean d;
    private AsyncTask<Void, Void, j> e;

    public a(Account account) {
        this(account, false);
    }

    public a(Account account, boolean z) {
        this.f2015a = account;
        this.c = new com.google.android.finsky.billing.a.h(FinskyApp.a().f1434a);
        this.d = z;
        if (a(this.d, this.f2015a.name)) {
            this.f2016b = new i(FinskyApp.a(), this.f2015a);
        } else {
            this.f2016b = null;
        }
    }

    public final void a() {
        if (this.e != null) {
            this.e.cancel(true);
            this.e = null;
        }
    }

    public final void a(f fVar) {
        if (!a(this.d, this.f2015a.name)) {
            String str = this.f2015a.name;
            fVar.a(new AuthState(false, null, b(str), false, str));
            return;
        }
        j a2 = this.f2016b.a(this.f2015a);
        if (a2 != null) {
            a(fVar, a2);
            return;
        }
        this.e = new c(this, fVar);
        jm.a(this.e, new Void[0]);
        fVar.a();
    }

    public static boolean a(boolean z, String str) {
        if (Build.VERSION.SDK_INT < 14) {
            return false;
        }
        FinskyApp a2 = FinskyApp.a();
        return (!ic.b(a2) && z && a2.d(str).a(12604372L)) ? false : true;
    }

    public static boolean a(String str) {
        android.support.v4.d.a.a a2 = android.support.v4.d.a.a.a(FinskyApp.a());
        return !FinskyApp.a().d(str).a(12603961L) && android.support.v4.d.a.a.f270b.b(a2.f271a) && android.support.v4.d.a.a.f270b.a(a2.f271a);
    }

    public static boolean b(String str) {
        return bg.aR.b(str).a().booleanValue() && b();
    }

    public static void c(String str) {
        if (a(str)) {
            try {
                KeyStore.getInstance("AndroidKeyStore").load(null);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder("FingerprintKey", 3).setEncryptionPaddings("PKCS7Padding").setBlockModes("CBC").setUserAuthenticationRequired(true).build());
                keyGenerator.generateKey();
            } catch (IOException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @TargetApi(23)
    public static boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            Cipher cipher = Cipher.getInstance(TextUtils.join("/", new String[]{"AES", "CBC", "PKCS7Padding"}));
            keyStore.load(null);
            SecretKey secretKey = (SecretKey) keyStore.getKey("FingerprintKey", null);
            if (secretKey == null) {
                return true;
            }
            cipher.init(1, secretKey);
            return true;
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT < 23 || !(e instanceof KeyPermanentlyInvalidatedException)) {
                throw new RuntimeException(e);
            }
            return false;
        }
    }

    final void a(f fVar, j jVar) {
        boolean z = jVar != null && jVar.f2023a == 0 && jVar.c != null && "active".equalsIgnoreCase(jVar.c.f2025a) && (jVar.f2024b == null || !"active".equalsIgnoreCase(jVar.f2024b));
        String str = z ? jVar.c.f2026b : null;
        this.e = null;
        fVar.a(new AuthState(z, str, b(this.f2015a.name), false, this.f2015a.name));
    }
}
