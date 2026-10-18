package com.google.android.libraries.bind.apkg;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f6645a;

    g(f fVar) {
        this.f6645a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f6645a;
        if (!f.f6643a) {
            a.a();
            fVar.c.lock();
            try {
                fVar.e = false;
                fVar.d.signalAll();
            } finally {
                fVar.c.unlock();
            }
        }
    }
}
