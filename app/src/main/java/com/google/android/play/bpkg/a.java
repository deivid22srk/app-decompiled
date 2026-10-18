package com.google.android.play.bpkg;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final View f6812a;
    public boolean e;

    /* renamed from: b, reason: collision with root package name */
    public float f6813b = 1.0f;
    public int c = 0;
    public int f = 0;
    public float d = 1.0f;

    public a(View view) {
        this.f6812a = view;
    }

    public final void a() {
        if (!this.e && Build.VERSION.SDK_INT < 11) {
            this.e = true;
            if (this.f6812a != null) {
                this.f6812a.clearAnimation();
                int i = this.f;
                int i2 = this.c;
                this.f = 0;
                this.c = 0;
                float f = i;
                if (this.f6812a == null) {
                    this.f = (int) f;
                } else if (Build.VERSION.SDK_INT >= 11) {
                    this.f6812a.setTranslationX(f);
                } else {
                    int i3 = this.f;
                    this.f = (int) f;
                    if (this.f != i3) {
                        if (this.e) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6812a.getLayoutParams();
                            marginLayoutParams.leftMargin = (this.f - i3) + marginLayoutParams.leftMargin;
                            this.f6812a.setLayoutParams(marginLayoutParams);
                        } else {
                            c();
                        }
                    }
                }
                c(i2);
            }
        }
    }

    public static void a(AnimationSet animationSet, Animation animation) {
        animation.setDuration(0L);
        animation.setFillAfter(true);
        animationSet.addAnimation(animation);
    }

    public void c() {
        AnimationSet animationSet = null;
        if (this.f6813b != 1.0f) {
            animationSet = new AnimationSet(false);
            a(animationSet, new AlphaAnimation(this.f6813b, this.f6813b));
        }
        if (!this.e && (this.f != 0 || this.c != 0)) {
            if (animationSet == null) {
                animationSet = new AnimationSet(false);
            }
            a(animationSet, new TranslateAnimation(this.f, this.f, this.c, this.c));
        }
        if (animationSet != null) {
            animationSet.setDuration(0L);
            animationSet.setFillAfter(true);
            this.f6812a.startAnimation(animationSet);
            return;
        }
        this.f6812a.clearAnimation();
    }

    @TargetApi(11)
    public final void a(float f) {
        if (this.f6812a != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                this.f6812a.setAlpha(f);
            } else if (this.f6813b != f) {
                this.f6813b = f;
                c();
            }
        }
    }

    @TargetApi(12)
    public final void b(float f) {
        if (this.f6812a != null) {
            if (Build.VERSION.SDK_INT >= 12) {
                this.f6812a.animate().alpha(f).setDuration(200L);
                return;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(this.f6813b, f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setFillAfter(true);
            if (Build.VERSION.SDK_INT < 12) {
                alphaAnimation.setAnimationListener(new b(this, f));
            }
            this.f6812a.startAnimation(alphaAnimation);
        }
    }

    @TargetApi(21)
    public final void a(float f, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6812a.animate().z(f).setDuration(i).setStartDelay(i2);
        }
    }

    @TargetApi(11)
    public final float b() {
        if (this.f6812a == null) {
            return this.c;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            return this.f6812a.getTranslationY();
        }
        return this.c;
    }

    @TargetApi(11)
    public final void c(float f) {
        if (this.f6812a == null) {
            this.c = (int) f;
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            this.f6812a.setTranslationY(f);
            return;
        }
        int i = this.c;
        this.c = (int) f;
        if (this.c != i) {
            if (this.e) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6812a.getLayoutParams();
                marginLayoutParams.topMargin = (this.c - i) + marginLayoutParams.topMargin;
                this.f6812a.setLayoutParams(marginLayoutParams);
                return;
            }
            c();
        }
    }

    public final void a(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6812a.getLayoutParams();
        int i2 = marginLayoutParams.topMargin;
        marginLayoutParams.topMargin = i;
        if (this.e && Build.VERSION.SDK_INT < 11) {
            marginLayoutParams.topMargin += this.c;
        }
        if (i2 != marginLayoutParams.topMargin) {
            this.f6812a.setLayoutParams(marginLayoutParams);
        }
    }
}
