package com.google.android.vending.verifier;

import android.content.SharedPreferences;
import com.google.android.finsky.FinskyApp;
import java.io.File;

/* loaded from: classes.dex */
final class w extends u {
    private w() {
        super((byte) 0);
    }

    /* synthetic */ w(byte b2) {
        this();
    }

    @Override // com.google.android.vending.verifier.u, com.google.android.vending.verifier.s
    public final String a() {
        return "PreferenceConsentWithExportPreKK";
    }

    @Override // com.google.android.vending.verifier.u, com.google.android.vending.verifier.s
    public final void a(int i, Boolean bool) {
        super.a(i, bool);
        SharedPreferences.Editor edit = FinskyApp.a().getSharedPreferences("package_verifer_public_preferences", 1).edit();
        edit.putBoolean("accepted-anti-malware-consent", i == 1);
        edit.commit();
    }

    @Override // com.google.android.vending.verifier.u, com.google.android.vending.verifier.s
    public final boolean c() {
        return false;
    }

    @Override // com.google.android.vending.verifier.u, com.google.android.vending.verifier.s
    public final void d() {
        super.d();
        new File(new File(FinskyApp.a().getApplicationInfo().dataDir, "shared_prefs"), "package_verifer_public_preferences.xml").delete();
    }
}
