package com.google.android.vending.verifier;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.provider.Settings;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;

@TargetApi(19)
/* loaded from: classes.dex */
class x implements s {
    private x() {
    }

    /* synthetic */ x(byte b2) {
        this();
    }

    @Override // com.google.android.vending.verifier.s
    public String a() {
        return "SecureSettingsConsent";
    }

    @Override // com.google.android.vending.verifier.s
    public final int b() {
        if (!com.google.android.finsky.cpkg.d.cg.b().booleanValue() || r.d()) {
            return 1;
        }
        int i = Settings.Secure.getInt(FinskyApp.a().getContentResolver(), "package_verifier_user_consent", 0);
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    @Override // com.google.android.vending.verifier.s
    public void a(int i, Boolean bool) {
        ContentResolver contentResolver = FinskyApp.a().getContentResolver();
        Settings.Secure.putInt(contentResolver, "package_verifier_user_consent", i);
        if (Settings.Global.getInt(contentResolver, "package_verifier_enable", 1) != 1) {
            try {
                Settings.Global.putInt(contentResolver, "package_verifier_enable", 1);
            } catch (SecurityException e) {
                FinskyLog.d("Unable to set package_verifier_enable: %s", e);
            }
        }
        if (bool != null) {
            Settings.Global.putInt(contentResolver, "upload_apk_enable", bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.google.android.vending.verifier.s
    public boolean c() {
        return true;
    }

    @Override // com.google.android.vending.verifier.s
    public final void d() {
    }
}
