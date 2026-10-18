package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class bo extends android.support.v7.widget.eb {

    /* renamed from: a, reason: collision with root package name */
    private final int f2565a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2566b;
    private final Paint c;

    public bo(Context context) {
        Resources resources = context.getResources();
        this.f2565a = resources.getDimensionPixelSize(R.dimen.details_new_content_margin);
        this.c = new Paint();
        this.c.setColor(-16777216);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_hairline_separator_thickness);
        this.f2566b = ((dimensionPixelSize + 2) - 1) / 2;
        this.c.setStrokeWidth(dimensionPixelSize);
    }

    @Override // android.support.v7.widget.eb
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        int i = 0;
        boolean z = false;
        float f = 1.0f;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (!z && !(childAt instanceof bq)) {
                int top = childAt.getTop() + Math.round(android.support.v4.view.by.q(childAt));
                this.c.setAlpha(Math.round(Math.min(f, android.support.v4.view.by.f(childAt)) * 38.0f));
                canvas.drawLine(childAt.getLeft() + this.f2565a, top, childAt.getRight() - this.f2565a, top, this.c);
            }
            i++;
            f = android.support.v4.view.by.f(childAt);
            z = childAt instanceof bp;
        }
    }

    @Override // android.support.v7.widget.eb
    public final void a(Rect rect, View view) {
        rect.set(0, 0, 0, 0);
    }
}
