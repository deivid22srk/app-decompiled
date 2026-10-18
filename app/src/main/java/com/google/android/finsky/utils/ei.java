package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f4849a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eg f4850b;

    ei(eg egVar, int i) {
        this.f4850b = egVar;
        this.f4849a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ee eeVar;
        eeVar = this.f4850b.f4847a.d;
        eeVar.a(this.f4849a, null);
    }
}
