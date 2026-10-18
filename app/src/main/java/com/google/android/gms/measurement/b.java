package com.google.android.gms.measurement;

import android.os.Handler;
import com.google.android.gms.measurement.internal.ap;
import com.google.android.gms.measurement.internal.z;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f6274a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f6275b;
    final /* synthetic */ z c;
    final /* synthetic */ AppMeasurementService d;

    b(AppMeasurementService appMeasurementService, ap apVar, int i, z zVar) {
        this.d = appMeasurementService;
        this.f6274a = apVar;
        this.f6275b = i;
        this.c = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        this.f6274a.k();
        handler = this.d.f6272a;
        handler.post(new c(this));
    }
}
