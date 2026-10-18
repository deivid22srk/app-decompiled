package com.google.android.finsky.utils.b;

import java.util.Map;

/* loaded from: classes.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f4769a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f4770b;

    g(f fVar, Map map) {
        this.f4770b = fVar;
        this.f4769a = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.a(this.f4770b.f4768a, this.f4769a);
    }
}
