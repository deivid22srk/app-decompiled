package com.google.android.gms.car;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class ei {
    public static void a(Looper looper, Runnable runnable) {
        new Handler(looper).post(runnable);
    }
}
