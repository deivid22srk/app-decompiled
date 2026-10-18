package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class be implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6341a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f6342b;
    final /* synthetic */ long c;
    final /* synthetic */ bc d;

    be(bc bcVar, String str, String str2, long j) {
        this.d = bcVar;
        this.f6341a = str;
        this.f6342b = str2;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bc.a(this.d, this.f6341a, this.f6342b, null, this.c);
    }
}
