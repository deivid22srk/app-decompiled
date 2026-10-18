package com.google.android.finsky.utils.b;

import android.os.Handler;
import java.util.Map;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f4768a;

    f(c cVar) {
        this.f4768a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        Handler handler;
        bVar = this.f4768a.f4762a;
        Map<String, Map<String, String>> a2 = bVar.a();
        handler = this.f4768a.e;
        handler.post(new g(this, a2));
    }
}
