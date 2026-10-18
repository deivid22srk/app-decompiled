package com.google.android.finsky.utils.bpkg;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f4765b;

    d(c cVar, String str) {
        this.f4765b = cVar;
        this.f4764a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        bVar = this.f4765b.f4762a;
        bVar.a(this.f4764a);
    }
}
