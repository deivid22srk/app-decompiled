package com.google.android.finsky.activities;

/* loaded from: classes.dex */
final class eh implements android.support.v4.app.ac {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1715a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1716b;

    eh(MainActivity mainActivity) {
        this.f1715a = mainActivity;
    }

    @Override // android.support.v4.app.ac
    public final void a() {
        com.google.android.finsky.navigationmanager.b bVar;
        boolean z;
        if (!this.f1716b) {
            this.f1715a.x_();
            this.f1715a.G();
            this.f1716b = true;
        }
        this.f1715a.y();
        bVar = this.f1715a.o;
        if (bVar.c.isEmpty()) {
            z = false;
        } else {
            z = bVar.c.peek().d;
        }
        if (z) {
            this.f1715a.p();
        } else {
            this.f1715a.q();
        }
    }
}
