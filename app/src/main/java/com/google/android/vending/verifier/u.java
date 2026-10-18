package com.google.android.vending.verifier;

import android.os.Build;
import android.provider.Settings;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
class u implements s {
    private u() {
    }

    /* synthetic */ u(byte b2) {
        this();
    }

    @Override // com.google.android.vending.verifier.s
    public String a() {
        return "PreferenceConsent";
    }

    @Override // com.google.android.vending.verifier.s
    public void a(int i, Boolean bool) {
        bg.C.a((com.google.android.finsky.cpkg.o<Boolean>) Boolean.valueOf(i == 1));
    }

    @Override // com.google.android.vending.verifier.s
    public boolean c() {
        return false;
    }

    @Override // com.google.android.vending.verifier.s
    public void d() {
        bg.C.c();
    }

    @Override // com.google.android.vending.verifier.s
    public final int b() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 17) {
            z = Settings.Global.getInt(FinskyApp.a().getContentResolver(), "package_verifier_enable", 1) > 0;
        } else {
            z = Settings.Secure.getInt(FinskyApp.a().getContentResolver(), "package_verifier_enable", 1) > 0;
        }
        if (z) {
            return (bg.C.a().booleanValue() || r.d()) ? 1 : 0;
        }
        return -1;
    }
}
