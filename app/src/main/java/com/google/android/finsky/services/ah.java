package com.google.android.finsky.services;

import com.android.volley.VolleyError;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.cl;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class ah implements cl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f4573a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean[] f4574b;
    final /* synthetic */ Semaphore c;
    final /* synthetic */ ag d;

    ah(ag agVar, int i, boolean[] zArr, Semaphore semaphore) {
        this.d = agVar;
        this.f4573a = i;
        this.f4574b = zArr;
        this.c = semaphore;
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(pw pwVar) {
        pt[] ptVarArr = pwVar.f4273a;
        int length = ptVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (this.f4573a != ptVarArr[i].f4268a) {
                i++;
            } else {
                this.f4574b[0] = true;
                break;
            }
        }
        this.c.release();
    }

    @Override // com.google.android.finsky.utils.cl
    public final void a(VolleyError volleyError) {
        this.c.release();
    }
}
