package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.eb;
import android.view.View;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class c extends eb {

    /* renamed from: a, reason: collision with root package name */
    final Rect f1913a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    private Drawable f1914b;
    private Paint c;
    private int d;

    public c(Context context) {
        this.f1914b = null;
        Resources resources = context.getResources();
        ColorStateList colorStateList = resources.getColorStateList(R.color.play_white);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.stream_intro_card_radius);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.play_card_default_inset);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.play_card_default_elevation);
        this.f1914b = new com.google.android.play.c.o(resources, colorStateList, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize2);
        this.d = dimensionPixelSize2 + dimensionPixelSize3;
        this.c = new Paint();
        this.c.setStyle(Paint.Style.FILL);
        this.c.setColor(resources.getColor(R.color.play_main_background));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.eb
    public final void a(Canvas canvas, RecyclerView recyclerView) {
        this.f1913a.setEmpty();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof d) {
                this.f1913a.union(childAt.getLeft(), (childAt instanceof com.google.android.finsky.layout.ak ? ((com.google.android.finsky.layout.ak) childAt).getTopPeekAmount() : 0) + childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
        }
        if (!this.f1913a.isEmpty()) {
            this.f1913a.left -= this.d;
            this.f1913a.top -= this.d;
            this.f1913a.right += this.d;
            this.f1913a.bottom += this.d;
            this.f1914b.setBounds(this.f1913a);
            this.f1914b.draw(canvas);
        }
    }
}
