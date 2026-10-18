package com.google.android.finsky.gpkg;

/* loaded from: classes.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2830b;

    l(h hVar, a aVar) {
        this.f2830b = hVar;
        this.f2829a = aVar;
    }

    @Override // com.google.android.finsky.gpkg.c
    public final void a() {
        r0.d.post(new m(this.f2830b, this.f2829a));
    }
}
