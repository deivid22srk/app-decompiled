package com.google.android.finsky.receivers;

import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
final class at implements com.android.volley.t<com.google.android.finsky.protos.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4468a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4469b;
    final /* synthetic */ TosAckedReceiver c;

    at(TosAckedReceiver tosAckedReceiver, String str, String str2) {
        this.c = tosAckedReceiver;
        this.f4468a = str;
        this.f4469b = str2;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.a aVar) {
        bg.B.b(this.f4468a).a((com.google.android.finsky.c.o<String>) this.f4469b);
        com.google.android.vending.verifier.r.f();
    }
}
