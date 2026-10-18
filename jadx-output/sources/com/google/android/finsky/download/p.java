package com.google.android.finsky.download;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f2727a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f2728b;

    p(n nVar, b bVar) {
        this.f2728b = nVar;
        this.f2727a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q a2 = n.a(this.f2728b);
        if (!this.f2727a.equals(this.f2728b.f2724b)) {
            return;
        }
        this.f2728b.f2723a = a2;
    }
}
