package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzd;

/* loaded from: classes.dex */
final class io implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ in f6065a;

    io(in inVar) {
        this.f6065a = inVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iq iqVar;
        iq unused;
        this.f6065a.f6063a.t();
        zzd f = this.f6065a.f6063a.f();
        if (f != null) {
            f.l.removeView(f.f);
            f.a(true);
        }
        iqVar = this.f6065a.h;
        if (iqVar != null) {
            unused = this.f6065a.h;
            in.e(this.f6065a);
        }
    }
}
