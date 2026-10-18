package com.google.android.finsky.api;

import android.graphics.Bitmap;
import com.google.android.play.image.ag;

/* loaded from: classes.dex */
public final class t extends com.google.android.play.image.e {
    private final com.google.android.finsky.apkg.i c;
    private w d;

    public t(com.google.android.finsky.apkg.i iVar, w wVar, com.android.volley.o oVar, int i, int i2, ag agVar) {
        super(oVar, i, i2, agVar);
        this.c = iVar;
        this.d = wVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.image.e
    public final com.google.android.play.image.l a(String str, int i, int i2, Bitmap.Config config, com.android.volley.t<Bitmap> tVar, com.android.volley.s sVar) {
        return new u(this, this.c, this.d, str, i, i2, config, tVar, sVar);
    }
}
