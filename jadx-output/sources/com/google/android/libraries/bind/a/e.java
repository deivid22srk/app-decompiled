package com.google.android.libraries.bind.a;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f6642a;

    e(d dVar) {
        this.f6642a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f6642a.f6640a) {
            this.f6642a.c = -1L;
        }
        this.f6642a.f6641b.run();
    }
}
