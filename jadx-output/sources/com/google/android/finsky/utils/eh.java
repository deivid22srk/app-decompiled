package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class eh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eg f4848a;

    eh(eg egVar) {
        this.f4848a = egVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ee eeVar;
        eeVar = this.f4848a.f4847a.d;
        eeVar.a();
    }
}
