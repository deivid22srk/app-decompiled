package com.google.android.gms.measurement;

import com.google.android.gms.measurement.internal.i;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f6276a;

    c(b bVar) {
        this.f6276a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6276a.d.stopSelfResult(this.f6276a.f6275b)) {
            if (i.B()) {
                this.f6276a.c.g.a("Device AppMeasurementService processed last upload request");
            } else {
                this.f6276a.c.g.a("Local AppMeasurementService processed last upload request");
            }
        }
    }
}
