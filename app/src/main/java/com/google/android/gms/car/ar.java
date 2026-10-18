package com.google.android.gms.car;

import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ar extends di {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<ap> f5476a;

    @Override // com.google.android.gms.car.dh
    public final void a(int i, int i2, int i3, int i4, int i5) {
        ap apVar = this.f5476a.get();
        if (apVar != null) {
            if (ah.a("CAR.SENSOR", 3)) {
                Log.d("CAR.SENSOR", "onStart(" + i + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5 + ")");
            }
            apVar.d = i;
            apVar.e = i2;
            apVar.f = i3;
            apVar.g = i4;
            apVar.h = i5;
            apVar.i.sendMessage(apVar.i.obtainMessage(1));
        }
    }

    @Override // com.google.android.gms.car.dh
    public final void a() {
        ap apVar = this.f5476a.get();
        if (apVar != null) {
            apVar.i.sendMessage(apVar.i.obtainMessage(2));
        }
    }
}
