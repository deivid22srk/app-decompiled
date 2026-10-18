package com.google.android.finsky.api;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.android.volley.VolleyError;

/* loaded from: classes.dex */
public final class u extends com.google.android.play.image.l {
    final /* synthetic */ t j;
    private com.google.android.finsky.apkg.i k;
    private w l;
    private long m;
    private NetworkInfo n;
    private int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, com.google.android.finsky.apkg.i iVar, w wVar, String str, int i, int i2, Bitmap.Config config, com.android.volley.t<Bitmap> tVar2, com.android.volley.s sVar) {
        super(str, i, i2, config, tVar2, sVar);
        this.j = tVar;
        this.k = iVar;
        this.l = wVar;
        this.n = wVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.image.l, com.android.volley.apkg.v, com.android.volley.l
    public final com.android.volley.r<Bitmap> a(com.android.volley.k kVar) {
        this.m = kVar.e;
        this.o = kVar.f1244b.length;
        return super.a(kVar);
    }

    @Override // com.android.volley.l
    public final void b(VolleyError volleyError) {
        super.b(volleyError);
        this.m = volleyError.c;
        a(false, volleyError, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.play.image.l, com.android.volley.apkg.v, com.android.volley.l
    public final void a(Bitmap bitmap) {
        super.a(bitmap);
        a(true, null, this.m <= 0);
    }

    private void a(boolean z, VolleyError volleyError, boolean z2) {
        float f;
        if (z.a(z2, true)) {
            if (!(this.g instanceof com.android.volley.e)) {
                f = 0.0f;
            } else {
                f = ((com.android.volley.e) this.g).f1234a;
            }
            this.k.a(b(), this.m, 0L, this.g.b() + 1, this.g.a(), f, z, volleyError, this.n, this.l.a(), this.o, z2);
        }
    }
}
