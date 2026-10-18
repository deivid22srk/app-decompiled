package com.android.ex.photo;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
final class l implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f1163a;

    l(k kVar) {
        this.f1163a = kVar;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        if (Build.VERSION.SDK_INT >= 19 && i == 0 && this.f1163a.d == 3846) {
            this.f1163a.a(false, true);
        }
    }
}
