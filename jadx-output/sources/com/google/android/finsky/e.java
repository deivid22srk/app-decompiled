package com.google.android.finsky;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class e implements com.android.volley.t<com.google.android.finsky.protos.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2745a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f2746b;

    e(b bVar, String str) {
        this.f2746b = bVar;
        this.f2745a = str;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(com.google.android.finsky.protos.b bVar) {
        FinskyLog.a("Notification [%s] successfully ack'd.", this.f2745a);
        this.f2746b.f2059b.remove(this.f2745a);
        b.b(this.f2746b);
    }
}
