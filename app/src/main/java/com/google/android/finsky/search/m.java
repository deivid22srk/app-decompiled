package com.google.android.finsky.search;

import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Semaphore f4536a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f4537b;

    m(l lVar, Semaphore semaphore) {
        this.f4537b = lVar;
        this.f4536a = semaphore;
    }

    @Override // com.google.android.finsky.search.n
    public final void a() {
        this.f4536a.release();
    }
}
