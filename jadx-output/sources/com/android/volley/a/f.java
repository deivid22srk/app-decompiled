package com.android.volley.a;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class f extends com.android.volley.l<Object> {
    private final com.android.volley.a j;
    private final Runnable k;

    public f(com.android.volley.a aVar, Runnable runnable) {
        super(0, null, null);
        this.j = aVar;
        this.k = runnable;
    }

    @Override // com.android.volley.l
    public final boolean e() {
        this.j.b();
        if (this.k != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.k);
            return true;
        }
        return true;
    }

    @Override // com.android.volley.l
    public final com.android.volley.n l() {
        return com.android.volley.n.IMMEDIATE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final com.android.volley.r<Object> a(com.android.volley.k kVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final void a(Object obj) {
    }
}
