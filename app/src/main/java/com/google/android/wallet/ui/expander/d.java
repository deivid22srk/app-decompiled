package com.google.android.wallet.ui.expander;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.os.Build;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.e.g;
import com.google.android.wallet.ui.common.s;

@TargetApi(19)
/* loaded from: classes2.dex */
public final class d extends Visibility {
    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        Animator animator;
        View innerFieldView;
        if (Build.VERSION.SDK_INT >= 21) {
            animator = super.onDisappear(viewGroup, transitionValues, i, transitionValues2, i2);
        } else if (transitionValues == null || transitionValues2 == null) {
            animator = null;
        } else {
            Animator onDisappear = onDisappear(viewGroup, transitionValues2.view, transitionValues, transitionValues2);
            if (onDisappear != null) {
                a(transitionValues2.view, onDisappear);
            }
            animator = onDisappear;
        }
        if (animator != null && (transitionValues2.view instanceof s) && (innerFieldView = ((s) transitionValues2.view).getInnerFieldView()) != null) {
            a(innerFieldView, animator);
        }
        return animator;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z;
        String str = (String) view.getTag(g.summary_expander_transition_name);
        if (str == null) {
            return null;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        switch (str.hashCode()) {
            case 1069289409:
                if (str.equals("expandedField")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 1271870320:
                if (str.equals("optionViewComponents")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 1662640372:
                if (str.equals("summaryField")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
            case true:
                b(view, ofFloat);
                return ofFloat;
            case true:
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, "y", view.getTop(), 0.0f));
                animatorSet.setInterpolator(getInterpolator());
                animatorSet.setDuration(getDuration());
                b(view, animatorSet);
                return animatorSet;
            default:
                return null;
        }
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.onAppear(viewGroup, transitionValues, i, transitionValues2, i2);
        }
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        return onAppear(viewGroup, transitionValues2.view, transitionValues, transitionValues2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        boolean z;
        String str = (String) view.getTag(g.summary_expander_transition_name);
        if (str == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        switch (str.hashCode()) {
            case 1069289409:
                if (str.equals("expandedField")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 1271870320:
                if (str.equals("optionViewComponents")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 1662640372:
                if (str.equals("summaryField")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
            case true:
                return ofFloat;
            case true:
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(view, "y", 0.0f, view.getTop()));
                animatorSet.setInterpolator(getInterpolator());
                animatorSet.setDuration(getDuration());
                return animatorSet;
            default:
                return null;
        }
    }

    private void a(View view, Animator animator) {
        int visibility = view.getVisibility();
        if (visibility != 0) {
            view.setVisibility(0);
            animator.addListener(new e(this, view, visibility));
        }
    }

    private void b(View view, Animator animator) {
        animator.addListener(new f(this, view));
    }
}
