package com.google.android.finsky.layout;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class dw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScreenshotView f3244a;

    private dw(ScreenshotView screenshotView) {
        this.f3244a = screenshotView;
    }

    /* synthetic */ dw(ScreenshotView screenshotView, byte b2) {
        this(screenshotView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressBar progressBar;
        ProgressBar progressBar2;
        ProgressBar progressBar3;
        progressBar = this.f3244a.f3075b;
        Animation loadAnimation = AnimationUtils.loadAnimation(progressBar.getContext(), R.anim.play_fade_in);
        progressBar2 = this.f3244a.f3075b;
        progressBar2.setVisibility(0);
        progressBar3 = this.f3244a.f3075b;
        progressBar3.startAnimation(loadAnimation);
    }
}
