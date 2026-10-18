package com.google.android.vending.verifier;

import android.content.ComponentName;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class y extends x {
    private y() {
        super((byte) 0);
    }

    /* synthetic */ y(byte b2) {
        this();
    }

    @Override // com.google.android.vending.verifier.x, com.google.android.vending.verifier.s
    public final String a() {
        return "SecureSettingsConsentPreKK";
    }

    @Override // com.google.android.vending.verifier.x, com.google.android.vending.verifier.s
    public final void a(int i, Boolean bool) {
        if (i != 0 || bool != null || Settings.Secure.getInt(FinskyApp.a().getContentResolver(), "package_verifier_user_consent", 0) != 0) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.security.settings.UpdateConsentReceiver"));
            intent.putExtra("consent", i == 1);
            if (bool != null) {
                intent.putExtra("upload_consent", bool.booleanValue());
            }
            FinskyApp.a().sendBroadcast(intent);
        }
    }

    @Override // com.google.android.vending.verifier.x, com.google.android.vending.verifier.s
    public final boolean c() {
        return true;
    }
}
