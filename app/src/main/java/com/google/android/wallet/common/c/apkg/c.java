package com.google.android.wallet.common.c.apkg;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.android.volley.l;
import com.android.volley.s;
import com.android.volley.t;

/* loaded from: classes.dex */
public abstract class c<T> extends l<T> {
    public final t<T> j;
    public final long k;
    public long l;

    public abstract int o();

    public abstract int p();

    public c(t<T> tVar, s sVar) {
        super(1, null, sVar);
        this.j = tVar;
        this.k = SystemClock.elapsedRealtime();
    }

    @Override // com.android.volley.l
    public final void a(T t) {
        this.l = SystemClock.elapsedRealtime();
        this.j.a_(t);
    }

    @Override // com.android.volley.l
    public final void b(VolleyError volleyError) {
        this.l = SystemClock.elapsedRealtime();
        super.b(volleyError);
    }

    public final long n() {
        return this.l - this.k;
    }
}
