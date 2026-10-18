package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.play.PlayCardViewBundleItemMedium;
import com.google.android.finsky.layout.play.PlayCardViewBundleItemSmall;
import com.google.android.finsky.utils.fe;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class BundleCardClusterModuleLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    boolean f2482a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2483b;
    private TextView c;
    private ViewStub d;
    private PlayCardViewBundleItemMedium e;

    public BundleCardClusterModuleLayout(Context context) {
        this(context, null);
    }

    public BundleCardClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2483b = ik.c(getResources());
        Resources resources = context.getResources();
        int dimensionPixelSize = (resources.getDimensionPixelSize(R.dimen.details_new_content_margin) - resources.getDimensionPixelSize(R.dimen.details_pack_row_padding)) - resources.getDimensionPixelSize(R.dimen.play_card_default_inset);
        android.support.v4.view.by.a(this, dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.bundle_card_cluster_module_heading);
        this.d = (ViewStub) findViewById(R.id.bundle_card_cluster_medium_card);
    }

    public final void a(com.google.android.finsky.api.model.i iVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar, int i) {
        com.google.android.finsky.layout.play.ca caVar;
        this.f2482a = true;
        String str = ((com.google.android.finsky.api.model.d) iVar).f1970a.f1963a.i;
        if (TextUtils.isEmpty(str)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText(str);
        }
        int p = iVar.p();
        if (p == 1 && this.f2483b > 1) {
            for (int childCount = getChildCount() - 1; childCount >= 2; childCount--) {
                removeViewAt(childCount);
            }
            if (this.d != null) {
                this.e = (PlayCardViewBundleItemMedium) this.d.inflate();
                this.d = null;
            }
            this.e.setVisibility(0);
            caVar = this.e;
        } else {
            if (this.e != null) {
                this.e.d();
                this.e.setVisibility(8);
            }
            int i2 = (((p + r0) - 1) / this.f2483b) + 2;
            for (int childCount2 = getChildCount() - 1; childCount2 >= i2; childCount2--) {
                removeViewAt(childCount2);
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            for (int childCount3 = getChildCount(); childCount3 < i2; childCount3++) {
                BucketRow bucketRow = (BucketRow) from.inflate(R.layout.card_cluster_module_row, (ViewGroup) this, false);
                for (int i3 = 0; i3 < this.f2483b; i3++) {
                    from.inflate(R.layout.play_card_bundle_item_small, bucketRow);
                }
                addView(bucketRow);
            }
            int i4 = p % this.f2483b;
            if (i4 > 0) {
                BucketRow bucketRow2 = (BucketRow) getChildAt(i2 - 1);
                while (true) {
                    int i5 = i4;
                    if (i5 >= this.f2483b) {
                        break;
                    }
                    ((PlayCardViewBundleItemSmall) bucketRow2.getChildAt(i5)).d();
                    i4 = i5 + 1;
                }
            }
            caVar = (com.google.android.finsky.layout.play.ca) ((BucketRow) getChildAt(2)).getChildAt(0);
        }
        a(caVar, iVar.c(0), eVar, bVar, cyVar, i);
        for (int i6 = 1; i6 < p; i6++) {
            a((com.google.android.finsky.layout.play.ca) ((BucketRow) getChildAt((i6 / this.f2483b) + 2)).getChildAt(i6 % this.f2483b), iVar.c(i6), eVar, bVar, cyVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(com.google.android.finsky.layout.play.ca caVar, Document document, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar, int i) {
        caVar.setCardType(i);
        fe.a((com.google.android.play.layout.a) caVar, document, null, eVar, bVar, cyVar);
        caVar.ad_();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.e != null && this.e.getVisibility() != 8) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.width = (((((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()) - layoutParams.leftMargin) - layoutParams.rightMargin) * 2) / this.f2483b;
            layoutParams.height = (layoutParams.width * 3) / 4;
        }
        super.onMeasure(i, i2);
    }
}
