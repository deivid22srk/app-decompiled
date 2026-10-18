package com.google.android.gms.car;

import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class av extends bc {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<au> f5482a;

    @Override // com.google.android.gms.car.bb
    public final void a() {
        au auVar = this.f5482a.get();
        if (auVar != null) {
            if (ah.a("CAR.RETAIL", 3)) {
                Log.d("CAR.RETAIL", "CarRetailModeManager#onShowcaseActivated");
            }
            auVar.c.sendMessage(auVar.c.obtainMessage(0));
        }
    }

    @Override // com.google.android.gms.car.bb
    public final void b() {
        au auVar = this.f5482a.get();
        if (auVar != null) {
            if (ah.a("CAR.RETAIL", 3)) {
                Log.d("CAR.RETAIL", "CarRetailModeManager#onShowcaseDeactivated");
            }
            auVar.c.sendMessage(auVar.c.obtainMessage(1));
        }
    }
}
