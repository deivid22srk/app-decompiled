package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.protos.rv;

/* loaded from: classes.dex */
final class cy implements com.android.volley.t<rv> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f1672a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cv f1673b;

    cy(cv cvVar, Context context) {
        this.f1673b = cvVar;
        this.f1672a = context;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(rv rvVar) {
        Toast.makeText(this.f1672a, R.string.content_flagged, 1).show();
    }
}
