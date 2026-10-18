package com.google.android.finsky.utils;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class et {
    public static void a(View view) {
        if (Build.VERSION.SDK_INT >= 11) {
            a(view, 0.0f, 150L).start();
        } else {
            view.startAnimation(a(view.getContext(), 150L, (Animation.AnimationListener) null));
        }
    }

    @TargetApi(11)
    public static Animator a(View view, float f, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, 1.0f);
        ofFloat.setStartDelay(0L);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        return ofFloat;
    }

    public static Animation a(Context context, long j, Animation.AnimationListener animationListener) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.play_fade_in);
        loadAnimation.setStartOffset(0L);
        loadAnimation.setDuration(j);
        if (animationListener != null) {
            loadAnimation.setAnimationListener(animationListener);
        }
        return loadAnimation;
    }

    public static Animation b(Context context, long j, Animation.AnimationListener animationListener) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        loadAnimation.setStartOffset(0L);
        loadAnimation.setDuration(j);
        if (animationListener != null) {
            loadAnimation.setAnimationListener(animationListener);
        }
        return loadAnimation;
    }
}
