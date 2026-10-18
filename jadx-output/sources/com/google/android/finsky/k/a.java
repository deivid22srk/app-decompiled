package com.google.android.finsky.k;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import com.google.android.play.image.FifeImageView;

@TargetApi(21)
/* loaded from: classes.dex */
public final class a extends Transition {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f2898b = {"circleTransition:bounds", "circleTransition:position"};

    /* renamed from: a, reason: collision with root package name */
    public int f2899a = -1;
    private final int c;

    public a(int i) {
        this.c = i;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return f2898b;
    }

    private static void a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        transitionValues.values.put("circleTransition:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        int[] iArr = new int[2];
        transitionValues.view.getLocationInWindow(iArr);
        transitionValues.values.put("circleTransition:position", iArr);
        if (view instanceof FifeImageView) {
            transitionValues.values.put("circleTransition:isAvatar", Boolean.valueOf(((FifeImageView) view).c != null));
        } else {
            transitionValues.values.put("circleTransition:isAvatar", false);
        }
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            a(transitionValues);
        }
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            a(transitionValues);
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            transitionValues.values.put("circleTransition:image", createBitmap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        boolean booleanValue = ((Boolean) transitionValues.values.get("circleTransition:isAvatar")).booleanValue();
        boolean booleanValue2 = ((Boolean) transitionValues2.values.get("circleTransition:isAvatar")).booleanValue();
        Rect rect = (Rect) transitionValues.values.get("circleTransition:bounds");
        Rect rect2 = (Rect) transitionValues2.values.get("circleTransition:bounds");
        if (rect == null || rect2 == null || rect.equals(rect2)) {
            return null;
        }
        Bitmap bitmap = (Bitmap) transitionValues.values.get("circleTransition:image");
        View a2 = a(viewGroup, bitmap.getWidth(), bitmap.getHeight(), new BitmapDrawable(bitmap));
        ColorDrawable colorDrawable = new ColorDrawable(this.c);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(this.c);
        View a3 = a(viewGroup, bitmap.getWidth(), bitmap.getHeight(), booleanValue ? shapeDrawable : colorDrawable);
        int[] iArr = new int[2];
        viewGroup.getLocationInWindow(iArr);
        int[] iArr2 = (int[]) transitionValues.values.get("circleTransition:position");
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        a2.setTranslationX(i);
        a2.setTranslationY(i2);
        a3.setTranslationX(i);
        a3.setTranslationY(i2);
        View view = transitionValues2.view;
        float a4 = a(a3);
        int min = Math.min(b(a3), b(view));
        if (this.f2899a > 0) {
            min = Math.min(min, this.f2899a / 2);
        }
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable2.getPaint().setColor(this.c);
        View a5 = a(viewGroup, min * 2, min * 2, shapeDrawable2);
        float width = (iArr2[0] - iArr[0]) + ((a2.getWidth() - a3.getWidth()) / 2);
        float height = (iArr2[1] - iArr[1]) + ((a2.getHeight() - a3.getHeight()) / 2);
        a3.setAlpha(0.0f);
        view.setAlpha(0.0f);
        Animator a6 = a(a3, a4, min);
        Animator a7 = a(a2, a4, min);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a3, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        int[] iArr3 = (int[]) transitionValues2.values.get("circleTransition:position");
        Path path = getPathMotion().getPath(width, height, (iArr3[0] - iArr[0]) + ((view.getWidth() - a3.getWidth()) / 2), (iArr3[1] - iArr[1]) + ((view.getHeight() - a3.getHeight()) / 2));
        a5.setVisibility(4);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a3, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a2, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        ColorDrawable colorDrawable2 = shapeDrawable;
        if (!booleanValue2) {
            colorDrawable2 = colorDrawable;
        }
        View a8 = a(viewGroup, width2, height2, colorDrawable2);
        a8.setVisibility(4);
        float f = iArr3[0] - iArr[0];
        float f2 = iArr3[1] - iArr[1];
        a8.setTranslationX(f);
        a8.setTranslationY(f2);
        float a9 = a(view);
        animatorSet.playTogether(a6, a7, ofFloat, ofFloat2, ofFloat3);
        a6.addListener(new b(this, a3, a2, a5, min));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a8, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        Animator a10 = a(view, min, a9);
        Animator a11 = a(a8, min, a9);
        a11.addListener(new c(this, a5, view, a8, viewGroup, a2, a3));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat4, a10, a11);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.addListener(new d(this, viewGroup, a2, a5, a3, a8));
        return animatorSet3;
    }

    private static View a(ViewGroup viewGroup, int i, int i2, Drawable drawable) {
        e eVar = new e(viewGroup.getContext());
        eVar.setBackground(drawable);
        eVar.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        eVar.layout(0, 0, i, i2);
        viewGroup.getOverlay().add(eVar);
        return eVar;
    }

    private static Animator a(View view, float f, float f2) {
        return new f(ViewAnimationUtils.createCircularReveal(view, view.getWidth() / 2, view.getHeight() / 2, f, f2));
    }

    private static float a(View view) {
        return ((float) Math.sqrt((view.getWidth() * view.getWidth()) + (view.getHeight() * view.getHeight()))) * 0.5f;
    }

    private static int b(View view) {
        return Math.min(view.getWidth() / 2, view.getHeight() / 2);
    }
}
