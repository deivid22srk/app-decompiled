package com.google.android.gms.internal;

import android.os.IBinder;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class lv implements IBinder.DeathRecipient, lx {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<ly<?>> f6150a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<com.google.android.gms.common.api.aa> f6151b;
    private final WeakReference<IBinder> c;

    private lv(ly lyVar, com.google.android.gms.common.api.aa aaVar, IBinder iBinder) {
        this.f6151b = new WeakReference<>(aaVar);
        this.f6150a = new WeakReference<>(lyVar);
        this.c = new WeakReference<>(iBinder);
    }

    /* synthetic */ lv(ly lyVar, com.google.android.gms.common.api.aa aaVar, IBinder iBinder, byte b2) {
        this(lyVar, aaVar, iBinder);
    }

    private void a() {
        ly<?> lyVar = this.f6150a.get();
        com.google.android.gms.common.api.aa aaVar = this.f6151b.get();
        if (aaVar != null && lyVar != null) {
            lyVar.b().intValue();
            aaVar.a();
        }
        IBinder iBinder = this.c.get();
        if (this.c != null) {
            iBinder.unlinkToDeath(this, 0);
        }
    }

    @Override // com.google.android.gms.internal.lx
    public final void a(ly<?> lyVar) {
        a();
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a();
    }
}
