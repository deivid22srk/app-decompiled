package com.google.android.wallet.ui.card;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends i {
    private final Animation f;
    private final Animation g;
    private final Animation h;
    private final Animation i;
    private final Animation j;
    private final Animation k;
    private final Animation l;
    private final boolean[] m;
    private final int n;

    public j(Context context, ImageView[] imageViewArr, ImageView[] imageViewArr2, View view, boolean z) {
        super(imageViewArr, imageViewArr2, view);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.e = z;
        this.m = new boolean[imageViewArr.length + imageViewArr2.length + 1];
        this.n = this.m.length - 1;
        Arrays.fill(this.m, true);
        if (z) {
            i = com.google.android.wallet.e.b.wallet_uic_fade_in_card_image;
        } else {
            i = com.google.android.wallet.e.b.wallet_uic_fade_in_card_image_from_translucent;
        }
        this.f = AnimationUtils.loadAnimation(context, i);
        if (z) {
            i2 = com.google.android.wallet.e.b.wallet_uic_fade_out_card_image;
        } else {
            i2 = com.google.android.wallet.e.b.wallet_uic_fade_out_card_image_to_translucent;
        }
        this.g = AnimationUtils.loadAnimation(context, i2);
        this.h = AnimationUtils.loadAnimation(context, com.google.android.wallet.e.b.wallet_uic_fade_in_card_image);
        this.i = AnimationUtils.loadAnimation(context, com.google.android.wallet.e.b.wallet_uic_fade_out_card_image);
        if (z) {
            i3 = com.google.android.wallet.e.b.wallet_uic_card_image_stay_transparent;
        } else {
            i3 = com.google.android.wallet.e.b.wallet_uic_card_image_stay_translucent;
        }
        this.j = AnimationUtils.loadAnimation(context, i3);
        if (z) {
            i4 = com.google.android.wallet.e.b.wallet_uic_fade_in_card_image;
        } else {
            i4 = com.google.android.wallet.e.b.wallet_uic_fade_in_card_image_from_translucent;
        }
        this.k = AnimationUtils.loadAnimation(context, i4);
        this.k.setDuration(0L);
        if (z) {
            i5 = com.google.android.wallet.e.b.wallet_uic_fade_out_card_image;
        } else {
            i5 = com.google.android.wallet.e.b.wallet_uic_fade_out_card_image_to_translucent;
        }
        this.l = AnimationUtils.loadAnimation(context, i5);
        this.l.setDuration(0L);
        int length = imageViewArr2.length;
        for (int i6 = 0; i6 < length; i6++) {
            imageViewArr2[i6].setVisibility(8);
            this.m[this.f7428a.length + i6] = false;
        }
        if (z) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
            this.m[this.n] = false;
        }
    }

    @Override // com.google.android.wallet.ui.card.i
    public final void a(com.google.b.a.a.a.b.a.bpkg.p pVar) {
        int c = c(pVar);
        int d = c == -1 ? d(pVar) : -1;
        int length = this.f7428a.length;
        for (int i = 0; i < length; i++) {
            if (c == i || (!this.e && c == -1 && d == -1)) {
                if (!this.m[i]) {
                    this.f7428a[i].startAnimation(this.k);
                    this.m[i] = true;
                }
            } else if (this.m[i]) {
                this.f7428a[i].startAnimation(this.l);
                this.m[i] = false;
            }
        }
        int length2 = this.f7429b.length;
        for (int i2 = 0; i2 < length2; i2++) {
            int length3 = this.f7428a.length + i2;
            if (d == i2) {
                if (!this.m[length3]) {
                    this.f7429b[i2].setVisibility(0);
                    this.m[length3] = true;
                }
            } else if (this.m[length3]) {
                this.f7429b[i2].setVisibility(8);
                this.m[length3] = false;
            }
        }
        if (this.e) {
            if (c == -1 && d == -1) {
                if (!this.m[this.n]) {
                    this.c.startAnimation(this.k);
                    this.m[this.n] = true;
                }
            } else if (this.m[this.n]) {
                this.c.startAnimation(this.l);
                this.m[this.n] = false;
            }
        }
        this.d = pVar;
    }

    @Override // com.google.android.wallet.ui.card.i
    public final void b(com.google.b.a.a.a.b.a.bpkg.p pVar) {
        if (!com.google.android.wallet.common.util.i.a(pVar, this.d)) {
            int c = c(pVar);
            int d = c == -1 ? d(pVar) : -1;
            int length = this.f7428a.length;
            for (int i = 0; i < length; i++) {
                if (c == i || (!this.e && c == -1 && d == -1)) {
                    this.f7428a[i].setVisibility(0);
                    if (!this.m[i]) {
                        this.f7428a[i].startAnimation(this.f);
                        this.m[i] = true;
                    } else {
                        this.f7428a[i].setAnimation(null);
                    }
                } else {
                    if (d != -1) {
                        if (this.e) {
                            this.f7428a[i].setVisibility(4);
                        } else {
                            this.f7428a[i].startAnimation(this.i);
                        }
                    } else if (this.m[i]) {
                        this.f7428a[i].startAnimation(this.g);
                    } else {
                        this.f7428a[i].startAnimation(this.j);
                    }
                    this.m[i] = false;
                }
            }
            int length2 = this.f7429b.length;
            for (int i2 = 0; i2 < length2; i2++) {
                int length3 = this.f7428a.length + i2;
                if (d == i2) {
                    if (!this.m[length3]) {
                        this.f7429b[i2].startAnimation(this.h);
                        this.f7429b[i2].setVisibility(0);
                        this.m[length3] = true;
                    } else {
                        this.f7429b[i2].setAnimation(null);
                    }
                } else if (this.m[length3]) {
                    this.f7429b[i2].setAnimation(null);
                    this.f7429b[i2].setVisibility(8);
                    this.m[length3] = false;
                }
            }
            if (this.e) {
                if (c == -1 && d == -1) {
                    this.c.setVisibility(0);
                    if (!this.m[this.n]) {
                        this.c.startAnimation(this.f);
                        this.m[this.n] = true;
                    } else {
                        this.c.setAnimation(null);
                    }
                } else {
                    if (d != -1) {
                        this.c.setVisibility(4);
                    } else if (this.m[this.n]) {
                        this.c.startAnimation(this.g);
                    } else {
                        this.c.startAnimation(this.j);
                    }
                    this.m[this.n] = false;
                }
            }
            this.d = pVar;
        }
    }
}
