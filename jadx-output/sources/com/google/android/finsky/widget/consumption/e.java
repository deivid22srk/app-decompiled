package com.google.android.finsky.widget.consumption;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class e implements Callable<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f5177a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f5178b;

    e(a aVar, k kVar) {
        this.f5178b = aVar;
        this.f5177a = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        byte[] b2;
        b2 = this.f5178b.b(this.f5177a);
        return b2;
    }
}
