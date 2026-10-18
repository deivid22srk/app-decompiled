package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import com.google.android.gms.measurement.AppMeasurementService;

/* loaded from: classes.dex */
final class bq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bm f6360a;

    bq(bm bmVar) {
        this.f6360a = bmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg.a(this.f6360a.c, new ComponentName(this.f6360a.c.i(), (Class<?>) AppMeasurementService.class));
    }
}
