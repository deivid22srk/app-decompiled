package com.android.a.a;

/* loaded from: classes.dex */
public final class au implements ab {

    /* renamed from: a, reason: collision with root package name */
    private Object f1085a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1086b = false;

    au(Object obj) {
        this.f1085a = obj;
    }

    @Override // com.android.a.a.ab
    public final void a() {
        synchronized (this) {
            this.f1086b = true;
        }
        synchronized (this.f1085a) {
            this.f1085a.notify();
        }
    }

    final void b() {
        synchronized (this) {
            if (!this.f1086b) {
                synchronized (this.f1085a) {
                    this.f1085a.wait();
                }
            }
        }
    }
}
