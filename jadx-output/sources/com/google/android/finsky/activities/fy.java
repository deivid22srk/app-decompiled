package com.google.android.finsky.activities;

import android.preference.CheckBoxPreference;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class fy implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckBoxPreference f1756a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f1757b;
    final /* synthetic */ SettingsActivity c;

    fy(SettingsActivity settingsActivity, CheckBoxPreference checkBoxPreference, boolean z) {
        this.c = settingsActivity;
        this.f1756a = checkBoxPreference;
        this.f1757b = z;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f1756a.setChecked(!this.f1757b);
    }
}
