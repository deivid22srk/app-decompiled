package com.google.android.wallet.ui.card;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.ImageView;

@TargetApi(14)
/* loaded from: classes.dex */
public final class k extends i {
    public k(ImageView[] imageViewArr, ImageView[] imageViewArr2, View view) {
        super(imageViewArr, imageViewArr2, view);
    }

    @Override // com.google.android.wallet.ui.card.i
    public final void a(com.google.b.a.a.a.b.a.bpkg.p pVar) {
        int c = c(pVar);
        int d = c == -1 ? d(pVar) : -1;
        float f = (c == -1 && d == -1) ? 1.0f : 0.0f;
        int length = this.f7428a.length;
        for (int i = 0; i < length; i++) {
            this.f7428a[i].animate().cancel();
            if (i == c) {
                this.f7428a[i].setAlpha(1.0f);
                this.f7428a[i].setX(this.f7428a[0].getLeft());
            } else {
                this.f7428a[i].setAlpha(f);
                this.f7428a[i].setTranslationX(0.0f);
            }
        }
        int length2 = this.f7429b.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this.f7429b[i2].animate().cancel();
            if (i2 == d) {
                this.f7429b[i2].setAlpha(1.0f);
            } else {
                this.f7429b[i2].setAlpha(0.0f);
            }
        }
        this.d = pVar;
    }

    @Override // com.google.android.wallet.ui.card.i
    public final void b(com.google.b.a.a.a.b.a.bpkg.p pVar) {
        if (!com.google.android.wallet.common.util.i.a(pVar, this.d)) {
            int c = c(pVar);
            int d = c == -1 ? d(pVar) : -1;
            float f = (c == -1 && d == -1 && !this.e) ? 1.0f : 0.0f;
            int length = this.f7428a.length;
            for (int i = 0; i < length; i++) {
                if (i == c) {
                    this.f7428a[i].animate().alpha(1.0f);
                    if (!this.e) {
                        this.f7428a[i].animate().x(this.f7428a[0].getLeft());
                    }
                } else {
                    this.f7428a[i].animate().alpha(f);
                    if (!this.e) {
                        this.f7428a[i].animate().translationX(0.0f);
                    }
                }
            }
            int length2 = this.f7429b.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (i2 == d) {
                    this.f7429b[i2].animate().alpha(1.0f);
                } else {
                    this.f7429b[i2].animate().alpha(0.0f);
                }
            }
            if (this.e) {
                if (c == -1 && d == -1) {
                    this.c.animate().alpha(1.0f);
                } else {
                    this.c.animate().alpha(0.0f);
                }
            }
            this.d = pVar;
        }
    }

    public final void a() {
        if (!this.e) {
            int c = c(this.d);
            int d = c == -1 ? d(this.d) : -1;
            int length = this.f7428a.length;
            for (int i = 0; i < length; i++) {
                this.f7428a[i].animate().cancel();
                this.f7428a[i].setX(this.f7428a[0].getLeft());
                if (i == c) {
                    this.f7428a[i].setAlpha(1.0f);
                } else {
                    this.f7428a[i].setAlpha(0.0f);
                }
            }
            int length2 = this.f7429b.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.f7429b[i2].animate().cancel();
                if (i2 == d) {
                    this.f7429b[i2].setAlpha(1.0f);
                } else {
                    this.f7429b[i2].setAlpha(0.0f);
                }
            }
            this.c.animate().cancel();
            this.c.setVisibility(0);
            if (c == -1 && d == -1) {
                this.c.setAlpha(1.0f);
            } else {
                this.c.setAlpha(0.0f);
            }
        }
        this.e = true;
    }
}
