package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class hp implements Callable<File> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f6035a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ho f6036b;

    hp(ho hoVar, Context context) {
        this.f6036b = hoVar;
        this.f6035a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ File call() {
        return this.f6035a.getCacheDir();
    }
}
