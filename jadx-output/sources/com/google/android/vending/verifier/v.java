package com.google.android.vending.verifier;

import android.content.ContentResolver;
import android.provider.Settings;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class v extends u {
    private v() {
        super((byte) 0);
    }

    /* synthetic */ v(byte b2) {
        this();
    }

    @Override // com.google.android.vending.verifier.u, com.google.android.vending.verifier.s
    public final String a() {
        return "PreferenceConsentWithExport";
    }

    @Override // com.google.android.vending.verifier.u, com.google.android.vending.verifier.s
    public final void a(int i, Boolean bool) {
        super.a(i, bool);
        ContentResolver contentResolver = FinskyApp.a().getContentResolver();
        Settings.Secure.putInt(contentResolver, "package_verifier_user_consent", i);
        if (bool != null) {
            Settings.Global.putInt(contentResolver, "upload_apk_enable", bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.google.android.vending.verifier.u, com.google.android.vending.verifier.s
    public final boolean c() {
        return true;
    }
}
