package com.google.android.wallet.ui.card;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    protected final ImageView[] f7428a;

    /* renamed from: b, reason: collision with root package name */
    protected final ImageView[] f7429b;
    protected final View c;
    protected com.google.b.a.a.a.b.a.bpkg.p d;
    protected boolean e;

    public abstract void a(com.google.b.a.a.a.b.a.bpkg.p pVar);

    public abstract void b(com.google.b.a.a.a.b.a.bpkg.p pVar);

    public i(ImageView[] imageViewArr, ImageView[] imageViewArr2, View view) {
        this.f7428a = imageViewArr;
        this.f7429b = imageViewArr2;
        this.c = view;
    }

    protected final int c(com.google.b.a.a.a.b.a.bpkg.p pVar) {
        return a(this.f7428a, pVar);
    }

    protected final int d(com.google.b.a.a.a.b.a.bpkg.p pVar) {
        return a(this.f7429b, pVar);
    }

    private static int a(ImageView[] imageViewArr, com.google.b.a.a.a.b.a.bpkg.p pVar) {
        if (imageViewArr == null || pVar == null) {
            return -1;
        }
        int length = imageViewArr.length;
        for (int i = 0; i < length; i++) {
            if (com.google.android.wallet.common.util.g.a(pVar.f7684a, ((com.google.b.a.a.a.b.a.bpkg.p) imageViewArr[i].getTag()).f7684a)) {
                return i;
            }
        }
        return -1;
    }
}
