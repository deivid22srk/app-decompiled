package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class bo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f6356a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bm f6357b;

    bo(bm bmVar, ComponentName componentName) {
        this.f6357b = bmVar;
        this.f6356a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg.a(this.f6357b.c, this.f6356a);
    }
}
