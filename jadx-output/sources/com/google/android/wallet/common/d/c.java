package com.google.android.wallet.common.d;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.l;
import com.android.volley.s;

/* loaded from: classes.dex */
public class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.wallet.common.c.a.c<?> f7275a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f7276b;
    private final byte[] c;

    public c(b bVar, byte[] bArr) {
        this.f7276b = bVar;
        this.c = bArr;
    }

    @Override // com.android.volley.s
    public void a(VolleyError volleyError) {
        if (!(volleyError instanceof AuthFailureError) || this.f7276b.f7273a) {
            if ((volleyError instanceof NoConnectionError) && this.f7276b.b(this.f7276b.e)) {
                this.f7276b.e++;
                com.google.android.wallet.common.b.a.a.a(this.f7275a.o(), this.f7276b.e, this.c);
                new Handler(Looper.getMainLooper()).postDelayed(new d(this), com.google.android.wallet.a.b.f7225b.b().intValue());
                return;
            }
            if (volleyError instanceof ServerError) {
                this.f7276b.a(3, 3);
            } else if ((volleyError instanceof NetworkError) || (volleyError instanceof TimeoutError)) {
                this.f7276b.a(3, 2);
            } else if (volleyError instanceof AuthFailureError) {
                this.f7276b.a(3, 1);
            } else {
                Log.i("BaseOrchSidecar", "Unexpected error returned from Volley", volleyError);
                this.f7276b.a(3, 3);
            }
        } else {
            Intent intent = ((AuthFailureError) volleyError).f1194a;
            if (intent != null) {
                intent.setFlags(intent.getFlags() & (-268435457));
                this.f7276b.a(intent, 100);
                this.f7276b.a(1, 1);
                this.f7276b.a((l<?>) this.f7275a, true);
                return;
            }
            this.f7276b.a(3, 1);
        }
        com.google.android.wallet.common.b.a.a.a(this.f7275a.p(), 1, volleyError.getClass().getSimpleName(), this.f7275a.n(), -1L, this.c);
    }
}
