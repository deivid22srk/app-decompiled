package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class ih implements com.android.volley.t<com.google.android.finsky.protos.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4991a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4992b;

    ih(String str, String str2) {
        this.f4991a = str;
        this.f4992b = str2;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.a aVar) {
        FinskyLog.a("TOS acceptance response received", new Object[0]);
        bg.B.b(this.f4991a).a((com.google.android.finsky.c.o<String>) this.f4992b);
        jb.a(this.f4991a, 1);
        com.google.android.vending.verifier.r.f();
    }
}
