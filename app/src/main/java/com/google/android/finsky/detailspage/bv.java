package com.google.android.finsky.detailspage;

/* loaded from: classes.dex */
final class bv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bw f2568a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bu f2569b;

    bv(bu buVar, bw bwVar) {
        this.f2569b = buVar;
        this.f2568a = bwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2568a.t != null) {
            this.f2568a.a(this.f2568a.t.f795a);
        }
    }
}
