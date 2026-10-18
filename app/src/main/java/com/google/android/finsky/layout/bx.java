package com.google.android.finsky.layout;

/* loaded from: classes.dex */
final class bx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f3175a;

    bx(bv bvVar) {
        this.f3175a = bvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3175a.e) {
            this.f3175a.a();
        }
    }
}
