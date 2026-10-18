package com.android.a.a;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f1121a;

    o(n nVar) {
        this.f1121a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar;
        r rVar2;
        l.a(this.f1121a.f1120a);
        rVar = this.f1121a.f1120a.i;
        if (rVar != null) {
            rVar2 = this.f1121a.f1120a.i;
            rVar2.a();
        }
    }
}
