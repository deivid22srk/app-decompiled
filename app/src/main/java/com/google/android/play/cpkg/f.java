package com.google.android.play.cpkg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.v;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/* loaded from: classes.dex */
public class f implements d {
    public f() {
    }

    /* synthetic */ f(byte b2) {
        this();
    }

    public static void a(int[] iArr, View view, int i, float f) {
        int i2 = iArr[0] + ((int) (i == 3 ? f : 0.0f));
        int i3 = iArr[1] + ((int) (i == 48 ? f : 0.0f));
        int i4 = ((int) (i == 5 ? f : 0.0f)) + iArr[2];
        int i5 = iArr[3];
        if (i != 80) {
            f = 0.0f;
        }
        view.setPadding(i2, i3, i4, ((int) f) + i5);
    }

    public Drawable a(Resources resources, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        return new b(resources, com.google.android.play.h.play_overlay_highlight_fill, f, f2, f3, f4, i, i2, i3);
    }

    @Override // com.google.android.play.cpkg.i
    public final void a(View view, int i) {
        Drawable background = view.getBackground();
        if (background instanceof h) {
            ((h) background).c(i);
        } else {
            Log.w("BubbleViewGroupDelegate", "Unable to set background color. CardView is not using a CardViewBackgroundDrawable");
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
                    Log.w("BubbleViewGroupDelegate", "Unable to set background - ColorStateList not found.", e);
                    return;
                }
            }
            Log.w("BubbleViewGroupDelegate", "Unable to set background. CardView is not using a CardViewBackgroundDrawable.");
        }
    }

    @Override // com.google.android.play.cpkg.i
    public final void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof o) {
            ((o) background).a(0.0f);
        }
    }

    public static a b(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof a)) {
            throw new IllegalArgumentException("Given view was not initialized by this CardBubbleViewGroupDelegate");
        }
        return (a) background;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b c(View view) {
        if (!(view instanceof com.google.android.play.layout.l)) {
            return null;
        }
        Drawable foreground = ((com.google.android.play.layout.l) view).getForeground();
        if (!(foreground instanceof b)) {
            throw new IllegalArgumentException("Given view was not initialized by this CardBubbleViewGroupDelegate");
        }
        return (b) foreground;
    }

    @Override // com.google.android.play.cpkg.d
    public final void c(View view, int i) {
        b(view).a(i);
        e(view, i);
    }

    public void e(View view, int i) {
        b c = c(view);
        if (c != null) {
            c.a(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.cpkg.d
    public final void d(View view, int i) {
        if (i != 48 && i != 80 && i != 8388611 && i != 8388613) {
            throw new IllegalArgumentException("Invalid gravity, must be TOP, BOTTOM, START or END.");
        }
        int a2 = v.a(i, com.google.android.play.utils.j.b(view.getContext()) ? 0 : 1);
        a b2 = b(view);
        b2.b(a2);
        int[] iArr = new int[4];
        if (view instanceof com.google.android.play.layout.k) {
            ((com.google.android.play.layout.k) view).a(iArr);
        }
        a(iArr, view, a2, b2.a());
        f(view, a2);
    }

    public void f(View view, int i) {
        b c = c(view);
        if (c != null) {
            c.b(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.cpkg.i
    public final void a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.play.o.PlayCardBubbleViewGroup, i, 0);
        int a2 = v.a(obtainStyledAttributes.getInt(com.google.android.play.o.PlayCardBubbleViewGroup_playCardBubbleGravity, 48), com.google.android.play.utils.j.b(view.getContext()) ? 0 : 1);
        float dimension = obtainStyledAttributes.getDimension(com.google.android.play.o.PlayCardBubbleViewGroup_playCardBubbleSize, 0.0f);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(com.google.android.play.o.PlayCardBubbleViewGroup_playCardBubbleOffset, 0);
        int i2 = obtainStyledAttributes.getInt(com.google.android.play.o.PlayCardBubbleViewGroup_playCardBubblePosition, 1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, com.google.android.play.o.PlayCardViewGroup, i, 0);
        Resources resources = context.getResources();
        float dimension2 = obtainStyledAttributes2.getDimension(com.google.android.play.o.PlayCardViewGroup_playCardCornerRadius, 0.0f);
        float dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(com.google.android.play.o.PlayCardViewGroup_playCardInset, 0);
        float dimension3 = obtainStyledAttributes2.getDimension(com.google.android.play.o.PlayCardViewGroup_playCardElevation, 0.0f);
        view.setBackgroundDrawable(new a(resources, obtainStyledAttributes2.getColorStateList(com.google.android.play.o.PlayCardViewGroup_playCardBackgroundColor), dimension2, dimensionPixelSize, dimension3, dimension, a2, dimensionPixelOffset, i2));
        if (view instanceof com.google.android.play.layout.l) {
            ((com.google.android.play.layout.l) view).setForeground(a(resources, dimension2, dimensionPixelSize, dimension3, dimension, a2, dimensionPixelOffset, i2));
        }
        int[] iArr = {view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()};
        if (view instanceof com.google.android.play.layout.k) {
            ((com.google.android.play.layout.k) view).a(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        a(iArr, view, a2, dimension);
        obtainStyledAttributes2.recycle();
    }
}
