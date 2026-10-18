package com.google.android.libraries.bind.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f6638a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private static Executor f6639b = new b();
    private static Executor c = new c();

    public static void a() {
        com.google.android.libraries.bind.d.a.a(b(), "Not on the main thread");
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static Handler c() {
        return f6638a;
    }

    public static Executor d() {
        return f6639b;
    }

    public static Executor e() {
        return c;
    }
}
