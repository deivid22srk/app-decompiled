package com.google.android.finsky.activities;

import com.google.android.finsky.auth.AuthState;

/* loaded from: classes.dex */
final class gc implements com.google.android.finsky.auth.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SettingsActivity f1764a;

    gc(SettingsActivity settingsActivity) {
        this.f1764a = settingsActivity;
    }

    @Override // com.google.android.finsky.auth.f
    public final void a() {
    }

    @Override // com.google.android.finsky.auth.f
    public final void a(AuthState authState) {
        String str;
        SettingsActivity settingsActivity = this.f1764a;
        SettingsActivity settingsActivity2 = this.f1764a;
        str = this.f1764a.c;
        settingsActivity.startActivityForResult(GaiaAuthActivity.a(settingsActivity2, str, false, authState, null), 37);
    }
}
