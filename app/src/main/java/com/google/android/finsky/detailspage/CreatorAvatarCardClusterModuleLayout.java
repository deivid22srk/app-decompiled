package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.DetailsAvatarClusterHeader;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CreatorAvatarCardClusterModuleLayout extends CardClusterModuleLayout {
    public CreatorAvatarCardClusterModuleLayout(Context context) {
        this(context, null);
    }

    public CreatorAvatarCardClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(com.google.android.finsky.layout.s sVar, com.google.android.play.image.e eVar, int i, String str, String str2, int i2, com.google.android.finsky.protos.ds dsVar, com.google.android.finsky.protos.ds dsVar2, com.google.android.finsky.protos.an anVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        super.a(sVar, i, str, null, str2, i2, onClickListener);
        ((DetailsAvatarClusterHeader) this.f2488a).a(eVar, i, dsVar2, dsVar, anVar, str, str2, onClickListener2);
    }

    private int getCardYOffset() {
        DetailsAvatarClusterHeader detailsAvatarClusterHeader = (DetailsAvatarClusterHeader) this.f2488a;
        return ((detailsAvatarClusterHeader.getBackgroundImageHeight() * 2) / 3) + detailsAvatarClusterHeader.getBackgroundImageTopMargin();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int cardYOffset = getCardYOffset();
        Iterator<BucketRow> it = this.f2489b.iterator();
        while (true) {
            i3 = cardYOffset;
            if (!it.hasNext()) {
                break;
            }
            BucketRow next = it.next();
            cardYOffset = next.getVisibility() != 8 ? next.getMeasuredHeight() + i3 : i3;
        }
        if (mode == 1073741824) {
            i3 = size2;
        } else if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size2);
        }
        setMeasuredDimension(size, getPaddingTop() + i3 + getPaddingBottom());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f2488a.layout(paddingLeft, paddingTop, this.f2488a.getMeasuredWidth() + paddingLeft, this.f2488a.getMeasuredHeight() + paddingTop);
        int cardYOffset = paddingTop + getCardYOffset();
        Iterator<BucketRow> it = this.f2489b.iterator();
        while (true) {
            int i5 = cardYOffset;
            if (it.hasNext()) {
                BucketRow next = it.next();
                if (next.getVisibility() != 8) {
                    int measuredHeight = next.getMeasuredHeight() + i5;
                    next.layout(paddingLeft, i5, next.getMeasuredWidth() + paddingLeft, measuredHeight);
                    cardYOffset = measuredHeight;
                } else {
                    cardYOffset = i5;
                }
            } else {
                return;
            }
        }
    }
}
