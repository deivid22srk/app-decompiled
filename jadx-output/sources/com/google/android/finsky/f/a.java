package com.google.android.finsky.f;

import android.content.IntentFilter;
import android.os.Build;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.m;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2775a;
    private static a g;
    private volatile boolean c = false;
    private LinkedList<Runnable> d = new LinkedList<>();
    private volatile boolean e = false;

    /* renamed from: b, reason: collision with root package name */
    public CountDownLatch f2776b = new CountDownLatch(1);
    private m f = null;

    static {
        f2775a = Build.VERSION.SDK_INT >= 21;
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (g == null) {
                a aVar2 = new a();
                g = aVar2;
                aVar2.a((Runnable) null);
            }
            aVar = g;
        }
        return aVar;
    }

    private a() {
    }

    public final synchronized void a(Runnable runnable) {
        if (f2775a) {
            if (this.f2776b.getCount() == 0) {
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                if (runnable != null) {
                    synchronized (this.d) {
                        this.d.add(runnable);
                    }
                }
                if (!this.e) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.car.CONNECTED");
                    intentFilter.addAction("com.google.android.gms.car.DISCONNECTED");
                    FinskyApp a2 = FinskyApp.a();
                    a2.registerReceiver(new b(this), intentFilter, "com.google.android.gms.permission.CAR", null);
                    this.f = com.google.android.gms.car.a.a(a2, new c(this), new d(this), new e(this));
                    this.e = true;
                    this.f.b();
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final boolean b() {
        if (!f2775a) {
            return false;
        }
        try {
            this.f2776b.await();
            return this.c;
        } catch (InterruptedException e) {
            FinskyLog.c("Interrupted while awaiting projection result!", new Object[0]);
            return false;
        }
    }

    static /* synthetic */ void a(a aVar) {
        new Object[1][0] = Boolean.valueOf(aVar.c);
        aVar.f2776b.countDown();
        synchronized (aVar.d) {
            while (!aVar.d.isEmpty()) {
                aVar.d.remove().run();
            }
        }
    }
}
