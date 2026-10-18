package com.google.android.finsky.layout.play;

/* loaded from: classes.dex */
final class bw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f3458a;

    bw(bv bvVar) {
        this.f3458a = bvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PlayCardRateClusterView.c(this.f3458a.f3457b, this.f3458a.f3456a);
    }
}
