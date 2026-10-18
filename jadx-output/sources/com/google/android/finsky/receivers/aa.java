package com.google.android.finsky.receivers;

/* loaded from: classes.dex */
final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f4435a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f4436b;

    aa(z zVar, int i) {
        this.f4436b = zVar;
        this.f4435a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4436b.f4509b.a(this.f4436b.f4508a, u.b(this.f4435a));
    }
}
