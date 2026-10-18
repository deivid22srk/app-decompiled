package com.google.android.finsky.activities.onboard;

/* loaded from: classes.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1862a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AnimatedEntertainmentOnboardPage f1863b;

    g(AnimatedEntertainmentOnboardPage animatedEntertainmentOnboardPage, int i) {
        this.f1863b = animatedEntertainmentOnboardPage;
        this.f1862a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1863b.a(this.f1862a);
    }
}
