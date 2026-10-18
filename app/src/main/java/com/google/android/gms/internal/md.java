package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class md {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f6158a = Executors.newFixedThreadPool(2, new mw("GAC_Executor"));

    public static ExecutorService a() {
        return f6158a;
    }
}
