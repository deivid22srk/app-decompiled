package com.google.android.gms.car;

import android.os.IBinder;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ev implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<eu> f5515a;

    public ev(eu euVar) {
        this.f5515a = new WeakReference<>(euVar);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        eu euVar = this.f5515a.get();
        if (euVar != null) {
            eu.a(euVar);
        }
    }
}
