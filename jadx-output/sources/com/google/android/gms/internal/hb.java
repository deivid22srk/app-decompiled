package com.google.android.gms.internal;

import java.util.concurrent.Future;

@gw
/* loaded from: classes.dex */
public abstract class hb {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f6018a = new hc(this);

    /* renamed from: b, reason: collision with root package name */
    private boolean f6019b = false;
    volatile Thread c;

    public abstract void a();

    public final Future b() {
        return this.f6019b ? he.a(1, this.f6018a) : he.a(this.f6018a);
    }
}
