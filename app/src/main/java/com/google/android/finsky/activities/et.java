package com.google.android.finsky.activities;

/* loaded from: classes.dex */
final class et implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f1727a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ er f1728b;

    et(er erVar, boolean z) {
        this.f1728b = erVar;
        this.f1727a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1728b.c == null || this.f1728b.f1725b == null) {
            return;
        }
        this.f1728b.c.setAdapter(this.f1728b.f1725b);
        if (this.f1727a) {
            this.f1728b.f1725b.b(this.f1728b.c, this.f1728b.e);
            this.f1728b.e.clear();
        }
    }
}
