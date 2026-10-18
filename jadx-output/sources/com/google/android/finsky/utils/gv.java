package com.google.android.finsky.utils;

import android.accounts.Account;
import com.android.vending.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class gv implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Account f4923a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Document f4924b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ gw e;

    gv(Account account, Document document, int i, boolean z, gw gwVar) {
        this.f4923a = account;
        this.f4924b = document;
        this.c = i;
        this.d = z;
        this.e = gwVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        FinskyApp.a().c(this.f4923a).a(301, this.f4924b.f1963a.f3890a, this.c, volleyError.getClass().getSimpleName(), volleyError.f1195b != null ? volleyError.f1195b.f1243a : 0, null, volleyError.c);
        if (this.d) {
            String string = FinskyApp.a().getString(R.string.error);
            String a2 = aw.a(FinskyApp.a(), volleyError);
            FinskyApp.a().n.a(string, a2, a2, this.f4924b.f1963a.f3890a, this.f4924b.f1963a.D);
        }
        if (this.e != null) {
            this.e.b();
        }
    }
}
