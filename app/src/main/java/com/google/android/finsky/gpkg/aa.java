package com.google.android.finsky.gpkg;

/* loaded from: classes.dex */
public final class aa implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ af f2784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2785b;
    public final /* synthetic */ x c;

    aa(x xVar, af afVar, String str) {
        this.c = xVar;
        this.f2784a = afVar;
        this.f2785b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2784a.a(this.f2785b);
    }
}
