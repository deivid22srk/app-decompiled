package com.google.android.finsky.utils;

import com.google.android.finsky.protos.qf;

/* loaded from: classes.dex */
final class jg implements com.android.volley.t<qf> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5026a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5027b;
    final /* synthetic */ com.android.volley.t c;

    jg(String str, int i, com.android.volley.t tVar) {
        this.f5026a = str;
        this.f5027b = i;
        this.c = tVar;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(qf qfVar) {
        qf qfVar2 = qfVar;
        jb.a(this.f5026a, qfVar2.f4292a);
        jb.a(this.f5026a, this.f5027b);
        if (this.c == null) {
            return;
        }
        this.c.a_(qfVar2);
    }
}
