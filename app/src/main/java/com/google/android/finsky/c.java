package com.google.android.finsky;

import com.google.android.finsky.protos.kf;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kf f2446a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f2447b;

    c(b bVar, kf kfVar) {
        this.f2447b = bVar;
        this.f2446a = kfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2447b.b(this.f2446a);
    }
}
