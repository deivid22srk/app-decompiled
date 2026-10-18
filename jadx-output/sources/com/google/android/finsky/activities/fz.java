package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.on;
import com.google.android.finsky.utils.hn;

/* loaded from: classes.dex */
final class fz implements com.google.android.finsky.utils.cf {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1758a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SettingsActivity f1759b;

    fz(SettingsActivity settingsActivity, String str) {
        this.f1759b = settingsActivity;
        this.f1758a = str;
    }

    @Override // com.google.android.finsky.utils.cf
    public final void a(on onVar) {
        Boolean bool;
        Boolean unused = SettingsActivity.f1523a = Boolean.valueOf(FinskyApp.a().m.a(hn.a(onVar), this.f1758a));
        SettingsActivity settingsActivity = this.f1759b;
        bool = SettingsActivity.f1523a;
        settingsActivity.a(bool.booleanValue());
    }

    @Override // com.google.android.finsky.utils.cf
    public final void a(VolleyError volleyError) {
        this.f1759b.a(false);
    }
}
