package com.google.android.finsky.g;

/* loaded from: classes.dex */
public final class ay implements s {

    /* renamed from: a, reason: collision with root package name */
    private long f2815a;

    @Override // com.google.android.finsky.g.s
    public final void a(long j) {
        this.f2815a += j;
    }

    @Override // com.google.android.finsky.g.s
    public final void b(long j) {
        this.f2815a -= j;
    }

    @Override // com.google.android.finsky.g.s
    public final long a() {
        return this.f2815a;
    }

    @Override // com.google.android.finsky.g.s
    public final void b() {
        this.f2815a = 0L;
    }
}
