package com.google.android.finsky.widget.consumption;

import java.util.Map;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f5173a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f5174b;
    final /* synthetic */ a c;

    c(a aVar, f fVar, Map map) {
        this.c = aVar;
        this.f5173a = fVar;
        this.f5174b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        if (this.f5173a != null) {
            this.f5173a.a(this.f5174b);
        }
        semaphore = this.c.g;
        semaphore.release();
    }
}
