package com.google.android.finsky.detailspage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* loaded from: classes.dex */
final class dp implements com.google.android.play.image.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2622a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2623b;
    final /* synthetic */ Cdo c;

    dp(Cdo cdo, int i, int i2) {
        this.c = cdo;
        this.f2622a = i;
        this.f2623b = i2;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        int i;
        com.google.android.play.image.j[] jVarArr;
        int[] iArr;
        Drawable[] drawableArr;
        TransitionDrawable a2;
        boolean a3;
        int[] iArr2;
        i = this.c.f2621a;
        if (i != 2) {
            jVarArr = this.c.v;
            jVarArr[this.f2622a] = null;
            Bitmap bitmap = jVar.f6944a;
            if (bitmap == null) {
                a3 = this.c.a(this.c.c);
                if (a3) {
                    iArr2 = this.c.A;
                    iArr2[this.f2622a] = 0;
                    this.c.d.a((bd) this.c, false);
                    return;
                } else {
                    if (Cdo.d(this.c) == this.f2623b) {
                        this.c.f2621a = 3;
                        this.c.d.a((bd) this.c, false);
                        return;
                    }
                    return;
                }
            }
            iArr = this.c.A;
            iArr[this.f2622a] = 2;
            this.c.f2621a = 1;
            drawableArr = this.c.x;
            int i2 = this.f2622a;
            a2 = this.c.a(bitmap);
            drawableArr[i2] = a2;
            this.c.d.a((bd) this.c, false);
        }
    }
}
