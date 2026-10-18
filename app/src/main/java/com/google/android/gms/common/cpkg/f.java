package com.google.android.gms.common.cpkg;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public static f f5604a;

    public static synchronized a c() {
        f fVar;
        synchronized (f.class) {
            if (f5604a == null) {
                f5604a = new f();
            }
            fVar = f5604a;
        }
        return fVar;
    }

    @Override // com.google.android.gms.common.cpkg.a
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.cpkg.a
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
