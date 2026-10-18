package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

@gw
/* loaded from: classes.dex */
public final class he {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f6021a = Executors.newFixedThreadPool(10, a("Default"));

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f6022b = Executors.newFixedThreadPool(5, a("Loader"));

    public static ij<Void> a(int i, Runnable runnable) {
        return i == 1 ? a(f6022b, new hf(runnable)) : a(f6021a, new hg(runnable));
    }

    public static ij<Void> a(Runnable runnable) {
        return a(0, runnable);
    }

    private static ThreadFactory a(String str) {
        return new hj(str);
    }

    private static <T> ij<T> a(ExecutorService executorService, Callable<T> callable) {
        ii iiVar = new ii();
        try {
            hi hiVar = new hi(iiVar, executorService.submit(new hh(iiVar, callable)));
            ik ikVar = iiVar.f6058b;
            synchronized (ikVar.f6059a) {
                if (ikVar.c) {
                    ik.a(hiVar);
                } else {
                    ikVar.f6060b.add(hiVar);
                }
            }
        } catch (RejectedExecutionException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Thread execution is rejected.", e);
            iiVar.cancel(true);
        }
        return iiVar;
    }
}
