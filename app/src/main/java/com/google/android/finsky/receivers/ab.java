package com.google.android.finsky.receivers;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.volley.DisplayMessageError;

/* loaded from: classes.dex */
final class ab implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4437a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f4438b;

    ab(u uVar, String str) {
        this.f4438b = uVar;
        this.f4437a = str;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        String str;
        com.google.android.finsky.apkg.n nVar;
        int a2 = com.google.android.finsky.installer.n.a(volleyError);
        if (!(volleyError instanceof DisplayMessageError)) {
            str = null;
        } else {
            str = ((DisplayMessageError) volleyError).f7176a;
        }
        FinskyLog.a("Received VolleyError %d (%s)", Integer.valueOf(a2), str);
        this.f4438b.a(false);
        com.google.android.finsky.apkg.b a3 = new com.google.android.finsky.apkg.b(104).a(this.f4437a).a(a2).a(volleyError);
        nVar = this.f4438b.k;
        FinskyApp.a().h().b(a3.a(nVar).f1473a);
        this.f4438b.a(3, a2);
        this.f4438b.a(a2, str);
    }
}
