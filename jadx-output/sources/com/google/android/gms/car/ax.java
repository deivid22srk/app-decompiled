package com.google.android.gms.car;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ax extends ea {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<aw> f5485a;

    @Override // com.google.android.gms.car.dz
    public final void a(CarSensorEvent carSensorEvent) {
        aw awVar = this.f5485a.get();
        if (awVar != null) {
            awVar.c.sendMessage(awVar.c.obtainMessage(0, carSensorEvent));
        }
    }
}
