package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f implements u {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1236a;

    public f(Handler handler) {
        this.f1236a = new g(this, handler);
    }

    @Override // com.android.volley.u
    public final void a(l<?> lVar, r<?> rVar) {
        a(lVar, rVar, null);
    }

    @Override // com.android.volley.u
    public final void a(l<?> lVar, VolleyError volleyError) {
        lVar.a("post-error");
        this.f1236a.execute(new h(this, lVar, r.a(volleyError), null));
    }

    @Override // com.android.volley.u
    public final void a(l<?> lVar, r<?> rVar, Runnable runnable) {
        lVar.f = true;
        lVar.a("post-response");
        this.f1236a.execute(new h(this, lVar, rVar, runnable));
    }
}
