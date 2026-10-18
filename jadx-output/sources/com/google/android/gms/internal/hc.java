package com.google.android.gms.internal;

/* loaded from: classes.dex */
final class hc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hb f6020a;

    hc(hb hbVar) {
        this.f6020a = hbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6020a.c = Thread.currentThread();
        this.f6020a.a();
    }
}
