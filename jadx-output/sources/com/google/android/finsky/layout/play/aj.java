package com.google.android.finsky.layout.play;

import android.support.v7.widget.el;
import android.support.v7.widget.em;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
final class aj extends el {

    /* renamed from: a, reason: collision with root package name */
    boolean f3396a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f3397b;
    final /* synthetic */ ah c;

    aj(ah ahVar, int i) {
        this.c = ahVar;
        this.f3397b = i;
        this.g = Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.el
    public final void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.el
    public final void a(View view, em emVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.el
    public final void a(int i, int i2, em emVar) {
        if (!this.f3396a) {
            this.f3396a = true;
            int i3 = this.f3397b;
            emVar.e = true;
            emVar.f789a = i3;
            int sqrt = ((int) (275.0d * Math.sqrt(Math.abs(this.f3397b) / this.c.getWidth()))) + 125;
            emVar.e = true;
            emVar.f790b = sqrt;
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(2.0f);
            emVar.e = true;
            emVar.d = decelerateInterpolator;
        }
    }
}
