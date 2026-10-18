package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class lw extends me {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<lr> f6152b;

    lw(lr lrVar) {
        this.f6152b = new WeakReference<>(lrVar);
    }

    @Override // com.google.android.gms.internal.me
    public final void a() {
        lr lrVar = this.f6152b.get();
        if (lrVar == null) {
            return;
        }
        lr.b(lrVar);
    }
}
