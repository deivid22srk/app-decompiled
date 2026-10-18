package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;

/* loaded from: classes.dex */
final class ab implements com.google.android.play.c.i {

    /* renamed from: a, reason: collision with root package name */
    static final ab f3389a = new ab();

    ab() {
    }

    @Override // com.google.android.play.c.i
    public final void a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.PlayCardViewGroup, i, 0);
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        Resources resources = context.getResources();
        int round = Math.round(resources.getDisplayMetrics().density);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension + round);
        gradientDrawable.setStroke(round, resources.getColor(R.color.flat_card_stroke_color));
        gradientDrawable.setColor(0);
        view.setBackgroundDrawable(new ac(this, gradientDrawable, dimensionPixelSize - round));
        if (Build.VERSION.SDK_INT >= 21) {
            view.setClipToOutline(obtainStyledAttributes.getBoolean(4, true));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // com.google.android.play.c.i
    public final void a(View view, int i) {
    }

    @Override // com.google.android.play.c.i
    public final void b(View view, int i) {
    }

    @Override // com.google.android.play.c.i
    public final void a(View view) {
    }
}
