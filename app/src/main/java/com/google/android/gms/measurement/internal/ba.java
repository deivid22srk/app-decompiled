package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class ba extends az {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6335a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6336b;
    boolean i;

    protected abstract void a();

    final boolean t() {
        return this.f6335a && !this.f6336b;
    }

    protected final void u() {
        if (!t()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    ba(ap apVar) {
        super(apVar);
        this.h.f++;
    }

    public final void v() {
        if (this.f6335a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        a();
        this.h.g++;
        this.f6335a = true;
    }
}
