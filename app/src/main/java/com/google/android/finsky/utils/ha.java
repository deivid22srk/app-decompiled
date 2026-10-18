package com.google.android.finsky.utils;

import com.google.android.finsky.protos.nz;

/* loaded from: classes.dex */
final class ha implements com.android.volley.t<nz> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f4931a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4932b;
    final /* synthetic */ com.google.android.finsky.api.b c;
    final /* synthetic */ String d;
    final /* synthetic */ hh e;
    final /* synthetic */ int f;
    final /* synthetic */ String g;
    final /* synthetic */ String h;

    ha(ac acVar, String str, com.google.android.finsky.api.b bVar, String str2, hh hhVar, int i, String str3, String str4) {
        this.f4931a = acVar;
        this.f4932b = str;
        this.c = bVar;
        this.d = str2;
        this.e = hhVar;
        this.f = i;
        this.g = str3;
        this.h = str4;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(nz nzVar) {
        ah ahVar;
        ac acVar = this.f4931a;
        String str = this.f4932b;
        acVar.c.a(str);
        if (acVar.f4726b.containsKey(str) && (ahVar = acVar.f4726b.get(str)) != ac.f4725a) {
            ahVar.d = true;
        }
        this.c.a(this.d);
        di.a(this.c);
        if (this.e == null) {
            return;
        }
        this.e.a(this.f);
    }
}
