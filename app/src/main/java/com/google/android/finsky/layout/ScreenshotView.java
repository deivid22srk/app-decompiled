package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class ScreenshotView extends FrameLayout implements com.google.android.play.image.t {

    /* renamed from: a, reason: collision with root package name */
    private FifeImageView f3074a;

    /* renamed from: b, reason: collision with root package name */
    private ProgressBar f3075b;
    private Runnable c;
    private Handler d;

    public ScreenshotView(Context context) {
        super(context);
        this.c = new dw(this, (byte) 0);
        this.d = new Handler();
    }

    public ScreenshotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new dw(this, (byte) 0);
        this.d = new Handler();
    }

    public ScreenshotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new dw(this, (byte) 0);
        this.d = new Handler();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3074a = (FifeImageView) findViewById(R.id.screenshot_content);
        this.f3075b = (ProgressBar) findViewById(R.id.screenshot_progress_bar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.removeCallbacks(this.c);
    }

    public final void a(com.google.android.finsky.protos.ds dsVar, com.google.android.play.image.e eVar) {
        this.f3074a.setOnLoadedListener(this);
        this.f3074a.a(dsVar.f, dsVar.l, eVar);
        if (!this.f3074a.c()) {
            this.d.postDelayed(this.c, 500L);
        }
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView, Bitmap bitmap) {
        this.d.removeCallbacks(this.c);
        if (this.f3075b.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_out);
            loadAnimation.setAnimationListener(new dx(this, (byte) 0));
            this.f3075b.startAnimation(loadAnimation);
        }
    }

    @Override // com.google.android.play.image.t
    public final void a(FifeImageView fifeImageView) {
    }
}
