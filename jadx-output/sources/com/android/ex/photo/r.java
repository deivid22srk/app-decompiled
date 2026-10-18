package com.android.ex.photo;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class r implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f1169a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f1170b;

    r(k kVar, View view) {
        this.f1170b = kVar;
        this.f1169a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1169a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            this.f1169a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        this.f1170b.n();
    }
}
