package com.google.android.gms.internal;

@gw
/* loaded from: classes.dex */
public final class ei extends hb {

    /* renamed from: a, reason: collision with root package name */
    final im f5957a;

    /* renamed from: b, reason: collision with root package name */
    final el f5958b;
    private final String d;

    @Override // com.google.android.gms.internal.hb
    public final void a() {
        hk.f6031a.post(new ej(this));
    }

    ei(im imVar, el elVar, String str) {
        this.f5957a = imVar;
        this.f5958b = elVar;
        this.d = str;
        com.google.android.gms.ads.internal.d.l().f5960a.add(this);
    }
}
