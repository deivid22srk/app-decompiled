package com.google.android.play.dfe.api;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.k;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.r;

/* loaded from: classes.dex */
public final class a extends l<Object> {
    private final com.android.volley.a j;
    private final Runnable k;
    private final String l;
    private final boolean m;

    public a(com.android.volley.a aVar, String str) {
        super(0, null, null);
        this.j = aVar;
        this.l = str;
        this.m = true;
        this.k = null;
    }

    @Override // com.android.volley.l
    public final boolean e() {
        this.j.a(this.l, this.m);
        if (this.k != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.k);
            return true;
        }
        return true;
    }

    @Override // com.android.volley.l
    public final n l() {
        return n.IMMEDIATE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final r<Object> a(k kVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public final void a(Object obj) {
    }
}
