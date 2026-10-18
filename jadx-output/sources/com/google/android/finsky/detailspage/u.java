package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class u extends android.support.v7.widget.eb {

    /* renamed from: a, reason: collision with root package name */
    private final int f2672a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f2673b;
    private final boolean c;
    private final int d;

    public u(Context context) {
        Resources resources = context.getResources();
        this.f2672a = resources.getDimensionPixelSize(R.dimen.details_cluster_background_peeking);
        this.d = resources.getDimensionPixelSize(R.dimen.play_card_inset);
        this.c = resources.getBoolean(R.bool.use_wide_layout);
        this.f2673b = new Paint();
        this.f2673b.setStyle(Paint.Style.FILL);
        this.f2673b.setColor(resources.getColor(R.color.play_main_background));
    }

    @Override // android.support.v7.widget.eb
    public final void a(Canvas canvas, RecyclerView recyclerView) {
        boolean z;
        int childCount = recyclerView.getChildCount();
        int i = 0;
        boolean z2 = false;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof v) {
                int top = childAt.getTop();
                if (!z2) {
                    top -= this.f2672a;
                }
                canvas.drawRect(0.0f, top, recyclerView.getWidth(), childAt.getBottom(), this.f2673b);
                z = true;
            } else {
                z = false;
            }
            i++;
            z2 = z;
        }
    }
}
