package com.google.android.finsky.k;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ai;

@TargetApi(21)
/* loaded from: classes.dex */
public final class h extends Fade {

    /* renamed from: a, reason: collision with root package name */
    private static int f2910a = 10;

    /* renamed from: b, reason: collision with root package name */
    private static int f2911b = 20;
    private final int c;
    private final int[] d = new int[2];
    private final Rect e = new Rect();

    public h(int i) {
        this.c = i;
    }

    private void a(TransitionValues transitionValues) {
        int id;
        View view = transitionValues.view;
        if (view.getId() == R.id.controls_container) {
            transitionValues.values.put("pageFade:translationZ", Integer.valueOf(f2910a));
            do {
                view = (View) view.getParent();
                if (view == null || (id = view.getId()) == R.id.drawer_layout) {
                    return;
                }
            } while (id != R.id.content_frame);
            view.getLocationInWindow(this.d);
            transitionValues.values.put("pageFade:topInset", Integer.valueOf(this.d[1]));
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getGlobalVisibleRect(this.e)) {
            super.captureStartValues(transitionValues);
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                a(transitionValues);
            }
        }
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            a(transitionValues);
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (!(transitionValues != null && transitionValues.values.containsKey("pageFade:translationZ") && transitionValues.values.containsKey("pageFade:topInset"))) {
            return onDisappear;
        }
        viewGroup.getLocationInWindow(this.d);
        if (this.d[1] > 0) {
            onDisappear.addListener(new i(this, view, transitionValues));
            return onDisappear;
        }
        int width = view.getWidth();
        int intValue = ((Integer) transitionValues.values.get("pageFade:topInset")).intValue() - 1;
        ColorDrawable colorDrawable = new ColorDrawable(ai.g(view.getContext(), this.c));
        k kVar = new k(viewGroup.getContext());
        kVar.setBackground(colorDrawable);
        kVar.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(intValue, 1073741824));
        kVar.layout(0, 0, width, intValue);
        viewGroup.getOverlay().add(kVar);
        kVar.setTranslationZ(f2911b);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kVar, (Property<k, Float>) View.ALPHA, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, onDisappear);
        animatorSet.addListener(new j(this, view, transitionValues, viewGroup, kVar));
        return animatorSet;
    }
}
