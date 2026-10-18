package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class bd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6339a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6340b;
    final /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ bc e;

    bd(bc bcVar, String str, String str2, Object obj, long j) {
        this.e = bcVar;
        this.f6339a = str;
        this.f6340b = str2;
        this.c = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bc.a(this.e, this.f6339a, this.f6340b, this.c, this.d);
    }
}
