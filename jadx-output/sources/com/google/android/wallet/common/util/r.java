package com.google.android.wallet.common.util;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f7307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f7308b;

    r(p pVar, int i) {
        this.f7308b = pVar;
        this.f7307a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7308b.f7305b.a(this.f7307a);
    }
}
