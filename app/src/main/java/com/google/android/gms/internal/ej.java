package com.google.android.gms.internal;

/* loaded from: classes.dex */
final class ej implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ei f5959a;

    ej(ei eiVar) {
        this.f5959a = eiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ek l = com.google.android.gms.ads.internal.d.l();
        l.f5960a.remove(this.f5959a);
    }
}
