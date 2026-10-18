package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.android.vending.R;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
final class cw implements com.android.volley.t<com.google.android.finsky.protos.ey> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f1669a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cv f1670b;

    cw(cv cvVar, Context context) {
        this.f1670b = cvVar;
        this.f1669a = context;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.ey eyVar) {
        Toast.makeText(this.f1669a, R.string.content_flagged, 1).show();
        cv.a((VolleyError) null);
    }
}
