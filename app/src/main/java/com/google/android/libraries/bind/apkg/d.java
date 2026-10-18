package com.google.android.libraries.bind.apkg;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f6641b;
    public final Handler d;
    public final Runnable e = new e(this);

    /* renamed from: a, reason: collision with root package name */
    public final Object f6640a = this.e;
    long c = -1;

    public d(Handler handler, Runnable runnable) {
        this.f6641b = runnable;
        this.d = handler;
    }

    public final boolean a() {
        long uptimeMillis = 500 + SystemClock.uptimeMillis();
        synchronized (this.f6640a) {
            if (!(this.c > 0)) {
                a(uptimeMillis);
                return false;
            }
            if (uptimeMillis > this.c) {
                a(uptimeMillis);
            }
            return true;
        }
    }

    public void a(long j) {
        this.c = j;
        this.d.removeCallbacks(this.e);
        if (this.d.postAtTime(this.e, this.c)) {
            return;
        }
        this.c = -1L;
    }
}
