package com.google.android.finsky.activities;

/* loaded from: classes.dex */
final class aw extends android.support.v7.widget.cl {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.adapters.s f1560b;
    final /* synthetic */ av c;

    aw(av avVar, com.google.android.finsky.adapters.s sVar) {
        this.c = avVar;
        this.f1560b = sVar;
    }

    @Override // android.support.v7.widget.cl
    public final int a(int i) {
        if (this.f1560b.f(i)) {
            return 1;
        }
        return 2;
    }
}
