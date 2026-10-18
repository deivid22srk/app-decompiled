package com.android.ex.photo;

import android.support.v4.view.dm;
import android.view.View;

/* loaded from: classes.dex */
final class v implements dm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PhotoViewPager f1173a;

    v(PhotoViewPager photoViewPager) {
        this.f1173a = photoViewPager;
    }

    @Override // android.support.v4.view.dm
    public final void a(View view, float f) {
        if (f < 0.0f || f >= 1.0f) {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        view.setTranslationX((-f) * view.getWidth());
        view.setAlpha(Math.max(0.0f, 1.0f - f));
        float max = Math.max(0.0f, 1.0f - (0.3f * f));
        view.setScaleX(max);
        view.setScaleY(max);
    }
}
