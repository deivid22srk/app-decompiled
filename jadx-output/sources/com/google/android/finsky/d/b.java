package com.google.android.finsky.d;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f2472a;

    b(a aVar) {
        this.f2472a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2472a.f2471b = false;
        new Handler(Looper.getMainLooper()).postDelayed(new c(this.f2472a, SystemClock.elapsedRealtime(), com.google.android.finsky.c.d.fl.b().intValue(), r4), com.google.android.finsky.c.d.fm.b().intValue());
    }
}
