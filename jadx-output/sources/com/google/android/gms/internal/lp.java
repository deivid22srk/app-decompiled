package com.google.android.gms.internal;

/* loaded from: classes.dex */
abstract class lp implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ lc f6143b;

    private lp(lc lcVar) {
        this.f6143b = lcVar;
    }

    /* synthetic */ lp(lc lcVar, byte b2) {
        this(lcVar);
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        this.f6143b.f6126b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.f6143b.f6126b.unlock();
            }
        } catch (RuntimeException e) {
            ma maVar = this.f6143b.f6125a;
            maVar.e.sendMessage(maVar.e.obtainMessage(2, e));
        } finally {
            this.f6143b.f6126b.unlock();
        }
    }
}
