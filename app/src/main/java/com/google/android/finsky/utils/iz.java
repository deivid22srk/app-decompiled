package com.google.android.finsky.utils;

import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
final class iz implements com.android.volley.s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5016a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5017b;
    final /* synthetic */ Integer c;
    final /* synthetic */ FinskyApp d;
    final /* synthetic */ com.android.volley.s e;

    iz(int i, int i2, Integer num, FinskyApp finskyApp, com.android.volley.s sVar) {
        this.f5016a = i;
        this.f5017b = i2;
        this.c = num;
        this.d = finskyApp;
        this.e = sVar;
    }

    @Override // com.android.volley.s
    public final void a(VolleyError volleyError) {
        Integer c = ix.c(this.f5016a);
        if (c != null) {
            this.d.h().b(new com.google.android.finsky.apkg.b(c.intValue()).b(Integer.valueOf(this.f5017b)).a(this.c).a(1).c(volleyError.getClass().getSimpleName()).f1473a);
        }
        FinskyLog.d("Error updating user setting for type %d: %s", Integer.valueOf(this.f5016a), volleyError);
        if (this.e != null) {
            this.e.a(volleyError);
        }
    }
}
