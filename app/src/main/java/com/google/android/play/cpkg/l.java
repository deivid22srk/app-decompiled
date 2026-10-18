package com.google.android.play.cpkg;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

@TargetApi(5)
/* loaded from: classes.dex */
public class l implements i {
    public l() {
    }

    /* synthetic */ l(byte b2) {
        this();
    }

    @Override // com.google.android.play.cpkg.i
    public void a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray a2 = a(context, attributeSet, i);
        view.setBackgroundDrawable(new o(context.getResources(), a2.getColorStateList(com.google.android.play.o.PlayCardViewGroup_playCardBackgroundColor), a(a2), b(a2), c(a2)));
        a2.recycle();
    }

    public static TypedArray a(Context context, AttributeSet attributeSet, int i) {
        return context.obtainStyledAttributes(attributeSet, com.google.android.play.o.PlayCardViewGroup, i, 0);
    }

    public static float a(TypedArray typedArray) {
        return typedArray.getDimension(com.google.android.play.o.PlayCardViewGroup_playCardCornerRadius, 0.0f);
    }

    public static float b(TypedArray typedArray) {
        return typedArray.getDimension(com.google.android.play.o.PlayCardViewGroup_playCardElevation, 0.0f);
    }

    public static int c(TypedArray typedArray) {
        return typedArray.getDimensionPixelSize(com.google.android.play.o.PlayCardViewGroup_playCardInset, 0);
    }

    @Override // com.google.android.play.cpkg.i
    public final void a(View view, int i) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            ((h) background).c(i);
        } else {
            Log.w("CardViewGroupDelegates", "Unable to set background color. CardView is not using a CardViewBackgroundDrawable");
        }
    }

    @Override // com.google.android.play.cpkg.i
    public final void b(View view, int i) {
        if (i != 0) {
            Resources resources = view.getResources();
            Drawable background = view.getBackground();
            if (background instanceof h) {
                try {
                    ((h) background).a(resources.getColorStateList(i));
                    return;
                } catch (Resources.NotFoundException e) {
                    Log.w("CardViewGroupDelegates", "Unable to set background - ColorStateList not found.", e);
                    return;
                }
            }
            Log.w("CardViewGroupDelegates", "Unable to set background. CardView is not using a CardViewBackgroundDrawable.");
        }
    }

    @Override // com.google.android.play.cpkg.i
    public void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof o) {
            ((o) background).a(0.0f);
        }
    }
}
