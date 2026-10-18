package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class ga implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SettingsActivity f1761a;

    ga(SettingsActivity settingsActivity) {
        this.f1761a = settingsActivity;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error writing opt-in value: %s", volleyError);
    }
}
