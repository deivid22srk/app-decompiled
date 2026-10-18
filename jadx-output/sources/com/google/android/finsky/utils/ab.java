package com.google.android.finsky.utils;

import android.widget.Toast;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ab implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.a.i f4723a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f4724b;
    final /* synthetic */ z c;

    ab(z zVar, com.google.android.finsky.a.i iVar, Document document) {
        this.c = zVar;
        this.f4723a = iVar;
        this.f4724b = document;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        this.f4723a.b(new com.google.android.finsky.a.b(851).a(this.f4724b.f1963a.f3890a).b(1).a(1).a(volleyError).f1473a);
        Toast.makeText(FinskyApp.a(), R.string.cancel_subscription_error, 0).show();
        z.z();
    }
}
