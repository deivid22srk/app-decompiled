package com.google.android.gms.internal;

/* loaded from: classes.dex */
abstract class mb {

    /* renamed from: a, reason: collision with root package name */
    private final lz f6156a;

    protected mb(lz lzVar) {
        this.f6156a = lzVar;
    }

    protected abstract void a();

    public final void a(ma maVar) {
        maVar.f6154a.lock();
        try {
            if (maVar.k != this.f6156a) {
                return;
            }
            a();
        } finally {
            maVar.f6154a.unlock();
        }
    }
}
