package com.google.android.gms.internal;

import android.content.Context;

/* loaded from: classes.dex */
final class hl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f6033a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hk f6034b;

    hl(hk hkVar, Context context) {
        this.f6034b = hkVar;
        this.f6033a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.f6034b.h;
        synchronized (obj) {
            this.f6034b.j = hk.a(this.f6033a);
            obj2 = this.f6034b.h;
            obj2.notifyAll();
        }
    }
}
