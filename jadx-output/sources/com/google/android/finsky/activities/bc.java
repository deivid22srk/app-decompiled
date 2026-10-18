package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class bc implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentFiltersActivity2 f1609a;

    bc(ContentFiltersActivity2 contentFiltersActivity2) {
        this.f1609a = contentFiltersActivity2;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyLog.d("Error saving content filters in dfe. %s", volleyError);
    }
}
