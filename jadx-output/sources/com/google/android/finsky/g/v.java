package com.google.android.finsky.g;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    final Handler f2840a;

    /* renamed from: b, reason: collision with root package name */
    final av f2841b;
    final a c;
    final List<Runnable> d = new ArrayList();
    int e = 0;
    private final Handler f;

    public v(av avVar, a aVar, Handler handler, Handler handler2) {
        this.f2841b = avVar;
        this.c = aVar;
        this.f = handler2;
        this.f2840a = handler;
    }

    public final synchronized void a(Runnable runnable) {
        this.d.add(runnable);
        this.f.post(new w(this));
    }
}
