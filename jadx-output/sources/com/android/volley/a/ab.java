package com.android.volley.a;

/* loaded from: classes.dex */
final class ab implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f1200a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f1201b;

    ab(aa aaVar, t tVar) {
        this.f1201b = aaVar;
        this.f1200a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1201b.a(this.f1200a, false);
    }
}
