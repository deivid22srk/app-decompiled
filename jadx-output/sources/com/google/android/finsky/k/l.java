package com.google.android.finsky.k;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.support.v7.widget.RecyclerView;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* loaded from: classes.dex */
public final class l extends Visibility {
    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        RecyclerView recyclerView;
        super.captureStartValues(transitionValues);
        View view = transitionValues.view;
        View view2 = view;
        while (true) {
            Object parent = view2.getParent();
            if (parent instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent;
                break;
            } else {
                if (!(parent instanceof View)) {
                    recyclerView = null;
                    break;
                }
                view2 = (View) parent;
            }
        }
        if (recyclerView == null) {
            return;
        }
        int top = view.getTop();
        int bottom = view.getBottom();
        int childCount = recyclerView.getChildCount();
        int i = bottom;
        int i2 = top;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                i2 = Math.min(i2, childAt.getTop());
                i = Math.max(i, childAt.getBottom());
            }
        }
        transitionValues.values.put("translate:y", Integer.valueOf(i - i2));
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || !transitionValues.values.containsKey("translate:y")) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, ((Integer) transitionValues.values.get("translate:y")).intValue());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.6f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return new f(animatorSet);
    }
}
