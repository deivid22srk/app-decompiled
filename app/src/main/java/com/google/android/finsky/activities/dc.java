package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class dc implements com.android.volley.t<com.google.android.finsky.protos.ey> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f1677a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ db f1678b;

    dc(db dbVar, Context context) {
        this.f1678b = dbVar;
        this.f1677a = context;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.ey eyVar) {
        Toast.makeText(this.f1677a, R.string.content_flagged, 1).show();
    }
}
