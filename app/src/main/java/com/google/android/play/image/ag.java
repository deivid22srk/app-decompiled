package com.google.android.play.image;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    int f6930a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6931b;
    Handler c;
    Runnable d = new ah(this);
    private HandlerThread e;

    public ag() {
        this.f6931b = Build.VERSION.SDK_INT >= 11 && Runtime.getRuntime().availableProcessors() > 1 && com.google.android.play.utils.bpkg.j.r.b().booleanValue();
        if (this.f6931b) {
            this.e = new HandlerThread("tentative-gc-runner", 10);
            this.e.start();
            this.c = new Handler(this.e.getLooper());
        }
    }
}
