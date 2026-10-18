package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class AppScreenshot extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f2921a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f2922b;
    private ImageView c;
    private ProgressBar d;
    private Runnable e;
    private Handler f;

    public AppScreenshot(Context context) {
        super(context);
    }

    public AppScreenshot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2922b = (ImageView) findViewById(R.id.screenshot);
        this.d = (ProgressBar) findViewById(R.id.screenshot_small_progress_bar);
        this.c = (ImageView) findViewById(R.id.download_icon);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f != null) {
            this.f.removeCallbacks(this.e);
        }
    }

    public void setState(int i) {
        byte b2 = 0;
        if (this.f2921a != 0 || i != 1) {
            if (this.f2921a != 1 || i != 2) {
                if (this.f2921a == 1 && i == 0) {
                    this.f.removeCallbacks(this.e);
                    if (this.d.getVisibility() == 0) {
                        this.d.setVisibility(8);
                    }
                    this.c.setAnimation(null);
                    this.c.setVisibility(0);
                }
            } else {
                this.f.removeCallbacks(this.e);
                if (this.d.getVisibility() == 0) {
                    this.d.setVisibility(8);
                }
            }
        } else {
            if (this.f == null && this.e == null) {
                this.e = new l(this, b2);
                this.f = new Handler();
            }
            this.f.postDelayed(this.e, 500L);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_out);
            loadAnimation.setAnimationListener(new k(this, b2));
            this.c.startAnimation(loadAnimation);
        }
        this.f2921a = i;
    }

    public void setScreenshotDrawable(Drawable drawable) {
        this.f2922b.setImageDrawable(drawable);
        if (drawable instanceof TransitionDrawable) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
        }
    }
}
