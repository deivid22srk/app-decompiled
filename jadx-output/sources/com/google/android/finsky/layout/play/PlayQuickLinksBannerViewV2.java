package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.api.model.DfeToc;

/* loaded from: classes.dex */
public class PlayQuickLinksBannerViewV2 extends ci {

    /* renamed from: a, reason: collision with root package name */
    private HorizontalScrollView f3363a;

    /* renamed from: b, reason: collision with root package name */
    private LinearLayout f3364b;
    private int c;
    private int d;
    private int e;
    private int f;

    public PlayQuickLinksBannerViewV2(Context context) {
        this(context, null);
    }

    public PlayQuickLinksBannerViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ci, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3363a = (HorizontalScrollView) findViewById(R.id.quick_links_banner);
        this.f3364b = (LinearLayout) findViewById(R.id.items);
        this.c = this.f3364b.getPaddingLeft();
        Resources resources = getResources();
        this.d = resources.getDimensionPixelSize(R.dimen.quicklink_minwidth_single);
        this.e = resources.getDimensionPixelSize(R.dimen.quicklink_minwidth_double);
        this.f = resources.getDimensionPixelSize(R.dimen.quicklink_fillwidth_threshold);
    }

    @Override // com.google.android.finsky.layout.play.ci
    protected int getPlayStoreUiElementType() {
        return 429;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int round;
        int i4;
        a(0, 0);
        super.onMeasure(i, i2);
        int childCount = this.f3364b.getChildCount();
        int size = View.MeasureSpec.getSize(getMeasuredWidth());
        int size2 = View.MeasureSpec.getSize(getMeasuredHeight());
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            int measuredWidth = this.f3364b.getChildAt(i5).getMeasuredWidth();
            int i7 = i6 + measuredWidth;
            if (i7 <= size) {
                i5++;
                i6 = i7;
            } else {
                int i8 = size - this.c;
                if (Math.round(measuredWidth * 0.25f) + i6 <= size) {
                    round = i8 - Math.max(i6 + Math.round(measuredWidth * 0.75f), size);
                    i4 = i5;
                } else {
                    round = i8 - (i6 - Math.round(this.f3364b.getChildAt(i5 - 1).getMeasuredWidth() * 0.25f));
                    i4 = i5 - 1;
                }
                if (round >= 10) {
                    a(0, (round / ((i4 * 2) + 1)) * 2);
                    this.f3364b.setPadding(this.c, this.f3364b.getPaddingTop(), this.f3364b.getPaddingRight(), this.f3364b.getPaddingBottom());
                    super.onMeasure(size, size2);
                    return;
                }
                return;
            }
        }
        if (childCount == 1) {
            i3 = this.d;
        } else {
            i3 = childCount == 2 ? this.e : 0;
        }
        int a2 = i3 > 0 ? a(i3, 0) + i6 : i6;
        int i9 = size - a2;
        if (i9 < this.f && i9 > 10) {
            a2 = a(i3, i9 / childCount) + i6;
        }
        if (a2 >= size) {
            a(0, 0);
        } else {
            i6 = a2;
        }
        this.f3364b.setPadding((size - i6) / 2, this.f3364b.getPaddingTop(), this.f3364b.getPaddingRight(), this.f3364b.getPaddingBottom());
        super.onMeasure(size, size2);
    }

    private int a(int i, int i2) {
        int childCount = this.f3364b.getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (i3 < childCount) {
            PlayQuickLinksBannerItemPillView playQuickLinksBannerItemPillView = (PlayQuickLinksBannerItemPillView) this.f3364b.getChildAt(i3);
            int measuredWidth = playQuickLinksBannerItemPillView.getMeasuredWidth() + i2;
            int i5 = measuredWidth < i ? i - measuredWidth : i2;
            playQuickLinksBannerItemPillView.setAdditionalWidth(i5);
            i3++;
            i4 = i5 + i4;
        }
        return i4;
    }

    public final void a(com.google.android.play.image.e eVar, com.google.android.finsky.protos.ba[] baVarArr, com.google.android.finsky.navigationmanager.b bVar, DfeToc dfeToc, cy cyVar, Bundle bundle) {
        int i = 0;
        a((byte[]) null, cyVar);
        e();
        LayoutInflater from = LayoutInflater.from(getContext());
        while (this.f3364b.getChildCount() < baVarArr.length) {
            this.f3364b.addView(from.inflate(R.layout.play_quicklinks_banner_pill_item, (ViewGroup) this.f3364b, false));
        }
        while (this.f3364b.getChildCount() > baVarArr.length) {
            this.f3364b.removeView(this.f3364b.getChildAt(0));
        }
        while (true) {
            int i2 = i;
            if (i2 >= baVarArr.length) {
                break;
            }
            ((PlayQuickLinksBannerItemPillView) this.f3364b.getChildAt(i2)).a(baVarArr[i2], bVar, dfeToc, eVar, getPlayStoreUiElementNode());
            i = i2 + 1;
        }
        if (bundle == null) {
            return;
        }
        this.f3363a.post(new ct(this, bundle.getInt("PlayQuickLinksBannerViewV2.scrollPosition")));
    }

    @Override // com.google.android.finsky.layout.play.ci
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("PlayQuickLinksBannerViewV2.scrollPosition", this.f3363a.getScrollX());
    }
}
