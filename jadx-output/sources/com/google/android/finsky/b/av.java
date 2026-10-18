package com.google.android.finsky.b;

/* loaded from: classes.dex */
final class av implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2102a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f2103b;
    final /* synthetic */ ab c;

    av(ab abVar, String str, long j) {
        this.c = abVar;
        this.f2102a = str;
        this.f2103b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f2063a.a(this.f2102a, this.f2103b);
    }
}
