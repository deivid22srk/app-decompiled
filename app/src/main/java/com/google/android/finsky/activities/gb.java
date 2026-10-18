package com.google.android.finsky.activities;

import com.google.android.finsky.auth.AuthState;

/* loaded from: classes.dex */
final class gb implements com.google.android.finsky.auth.f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1762a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f1763b;
    final /* synthetic */ SettingsActivity c;

    gb(SettingsActivity settingsActivity, int i, int i2) {
        this.c = settingsActivity;
        this.f1762a = i;
        this.f1763b = i2;
    }

    @Override // com.google.android.finsky.auth.f
    public final void a() {
    }

    @Override // com.google.android.finsky.auth.f
    public final void a(AuthState authState) {
        SettingsActivity.a(this.c, this.f1762a, this.f1763b, authState);
    }
}
