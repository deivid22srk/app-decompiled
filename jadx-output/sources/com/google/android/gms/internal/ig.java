package com.google.android.gms.internal;

import android.os.StrictMode;
import java.util.concurrent.Callable;

@gw
/* loaded from: classes.dex */
public final class ig {
    public static <T> T a(Callable<T> callable) {
        T t;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                t = callable.call();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.b.b("Unexpected exception.", th);
                com.google.android.gms.ads.internal.d.f().a(th, true);
                StrictMode.setThreadPolicy(threadPolicy);
                t = null;
            }
            return t;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
