package com.google.android.finsky.utils.bpkg;

import java.util.Map;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f4769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4770b;

    g(f fVar, Map map) {
        this.f4770b = fVar;
        this.f4769a = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.a(this.f4770b.f4768a, this.f4769a);
    }
}
