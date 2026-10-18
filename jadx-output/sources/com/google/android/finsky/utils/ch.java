package com.google.android.finsky.utils;

import com.android.volley.VolleyError;
import com.google.android.finsky.protos.pw;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class ch implements cl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pw[] f4797a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Semaphore f4798b;

    ch(pw[] pwVarArr, Semaphore semaphore) {
        this.f4797a = pwVarArr;
        this.f4798b = semaphore;
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(pw pwVar) {
        this.f4797a[0] = pwVar;
        this.f4798b.release();
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(VolleyError volleyError) {
        this.f4797a[0] = null;
        this.f4798b.release();
    }
}
