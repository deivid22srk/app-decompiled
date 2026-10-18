package com.google.android.finsky.gpkg;

/* loaded from: classes.dex */
public final class ap implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao f2807a;

    ap(ao aoVar) {
        this.f2807a = aoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2807a.e.f2795a.post(this.f2807a.d);
    }
}
