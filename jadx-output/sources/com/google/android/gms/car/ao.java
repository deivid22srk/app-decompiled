package com.google.android.gms.car;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ao extends dc {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<am> f5473a;

    @Override // com.google.android.gms.car.db
    public final void a(int i, int i2, int i3) {
        am amVar = this.f5473a.get();
        if (amVar == null) {
            return;
        }
        amVar.d.sendMessage(amVar.d.obtainMessage(1, i, i2, new Integer(i3)));
    }

    @Override // com.google.android.gms.car.db
    public final void a(int i) {
        am amVar = this.f5473a.get();
        if (amVar == null) {
            return;
        }
        amVar.d.sendMessage(amVar.d.obtainMessage(2, i, 0));
    }
}
