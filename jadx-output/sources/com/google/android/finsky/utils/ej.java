package com.google.android.finsky.utils;

/* loaded from: classes.dex */
final class ej implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4851a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eg f4852b;

    ej(eg egVar, String str) {
        this.f4852b = egVar;
        this.f4851a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ee eeVar;
        eeVar = this.f4852b.f4847a.d;
        eeVar.a(915, this.f4851a);
    }
}
