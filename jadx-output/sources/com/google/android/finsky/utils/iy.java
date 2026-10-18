package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.qf;

/* loaded from: classes.dex */
final class iy implements com.android.volley.t<qf> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5014a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskyApp f5015b;
    final /* synthetic */ int c;
    final /* synthetic */ Integer d;
    final /* synthetic */ com.android.volley.t e = null;

    iy(int i, FinskyApp finskyApp, int i2, Integer num) {
        this.f5014a = i;
        this.f5015b = finskyApp;
        this.c = i2;
        this.d = num;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(qf qfVar) {
        qf qfVar2 = qfVar;
        Integer c = ix.c(this.f5014a);
        if (c != null) {
            this.f5015b.h().a(c.intValue(), Integer.valueOf(this.c), this.d, (String) null);
        }
        if (this.e == null) {
            return;
        }
        this.e.a_(qfVar2);
    }
}
