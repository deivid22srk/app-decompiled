package com.google.android.gms.measurement.internal;

import android.os.Looper;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f6374a;

    m(l lVar) {
        this.f6374a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ap apVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            apVar = this.f6374a.f6373b;
            apVar.f().a(this);
            return;
        }
        boolean z2 = this.f6374a.f6372a != 0;
        l.b(this.f6374a);
        if (z2) {
            z = this.f6374a.e;
            if (z) {
                this.f6374a.a();
            }
        }
    }
}
