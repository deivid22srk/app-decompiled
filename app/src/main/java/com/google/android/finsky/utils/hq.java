package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class hq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4971a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.download.b f4972b;
    final /* synthetic */ hn c;

    hq(hn hnVar, String str, com.google.android.finsky.download.b bVar) {
        this.c = hnVar;
        this.f4971a = str;
        this.f4972b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ea.a(this.f4972b.k(), this.c.d, this.c.e, new hr(this), false, "");
    }
}
