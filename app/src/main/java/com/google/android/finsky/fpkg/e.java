package com.google.android.finsky.fpkg;

import com.google.android.gms.car.f;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f2780a;

    e(a aVar) {
        this.f2780a = aVar;
    }

    @Override // com.google.android.gms.car.f
    public final void a() {
        this.f2780a.c = true;
        a.a(this.f2780a);
    }

    @Override // com.google.android.gms.car.f
    public final void b() {
        this.f2780a.c = false;
        a.a(this.f2780a);
    }
}
