package com.google.android.finsky.utils;

import android.os.HandlerThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class t implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return a(runnable);
    }

    public static Thread a(Runnable runnable) {
        return new Thread(b(runnable));
    }

    public static Thread a(String str, Runnable runnable) {
        return new Thread(b(runnable), str);
    }

    private static Runnable b(Runnable runnable) {
        return new u(runnable);
    }

    public static HandlerThread a(String str) {
        return new HandlerThread(str, 10);
    }
}
