package com.google.android.finsky.bpkg;

/* loaded from: classes.dex */
public final class al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f2082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab f2083b;

    al(ab abVar, t tVar) {
        this.f2083b = abVar;
        this.f2082a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2083b.f2063a.a(this.f2082a);
    }
}
