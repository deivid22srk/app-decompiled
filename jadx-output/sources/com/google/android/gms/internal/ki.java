package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class ki {

    /* renamed from: a, reason: collision with root package name */
    private int f6111a;

    private ki() {
        this.f6111a = 0;
    }

    /* synthetic */ ki(byte b2) {
        this();
    }

    public final synchronized void a() {
        this.f6111a++;
    }

    public final boolean a(TimeUnit timeUnit) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        long convert = TimeUnit.MILLISECONDS.convert(100L, timeUnit);
        synchronized (this) {
            while (true) {
                if (this.f6111a == 0) {
                    z = true;
                    break;
                }
                if (convert <= 0) {
                    z = false;
                    break;
                }
                wait(convert);
                convert -= System.currentTimeMillis() - currentTimeMillis;
            }
        }
        return z;
    }

    public final synchronized void b() {
        if (this.f6111a == 0) {
            throw new RuntimeException("too many decrements");
        }
        this.f6111a--;
        if (this.f6111a == 0) {
            notifyAll();
        }
    }
}
