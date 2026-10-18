package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.vending.R;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.play.PlayCardClusterViewHeader;
import com.google.android.finsky.utils.ik;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CardClusterModuleLayout extends LinearLayout implements bp, bq, bt, v {

    /* renamed from: a, reason: collision with root package name */
    protected PlayCardClusterViewHeader f2488a;

    /* renamed from: b, reason: collision with root package name */
    protected final List<BucketRow> f2489b;
    private final int c;
    private final int d;

    public CardClusterModuleLayout(Context context) {
        this(context, null);
    }

    protected ViewGroup getBucketParent() {
        return this;
    }

    public CardClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2489b = new ArrayList(1);
        Resources resources = context.getResources();
        if (resources.getBoolean(R.bool.use_wide_layout)) {
            this.d = -resources.getDimensionPixelSize(R.dimen.play_card_inset);
        } else {
            this.d = 0;
        }
        this.c = b(getResources());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2488a = (PlayCardClusterViewHeader) findViewById(R.id.cluster_header);
        BucketRow bucketRow = (BucketRow) getBucketParent().findViewById(R.id.bucket_row);
        a(bucketRow);
        this.f2489b.add(bucketRow);
    }

    public void a(com.google.android.finsky.layout.s sVar, int i, String str, String str2, String str3, int i2, View.OnClickListener onClickListener) {
        this.f2488a.a(i, str, str2, str3, onClickListener);
        int min = Math.min(i2, ((sVar.d() + this.c) - 1) / this.c);
        int size = this.f2489b.size();
        if (size > min) {
            for (int i3 = min; i3 < size; i3++) {
                this.f2489b.get(i3).setVisibility(8);
            }
        } else if (size < min) {
            LayoutInflater from = LayoutInflater.from(getContext());
            while (size < min) {
                BucketRow bucketRow = (BucketRow) from.inflate(R.layout.card_cluster_module_row, (ViewGroup) this, false);
                a(bucketRow);
                this.f2489b.add(bucketRow);
                getBucketParent().addView(bucketRow);
                size++;
            }
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < min) {
            BucketRow bucketRow2 = this.f2489b.get(i4);
            bucketRow2.setVisibility(0);
            int i6 = i5;
            int i7 = 0;
            while (i7 < this.c) {
                sVar.a(bucketRow2.getChildAt(i7), i6);
                i7++;
                i6++;
            }
            i4++;
            i5 = i6;
        }
    }

    private void a(BucketRow bucketRow) {
        Context context = getContext();
        LayoutInflater from = LayoutInflater.from(context);
        Resources resources = context.getResources();
        for (int i = 0; i < this.c; i++) {
            bucketRow.addView(from.inflate(a(resources), (ViewGroup) bucketRow, false));
        }
    }

    protected int a(Resources resources) {
        return resources.getBoolean(R.bool.play_can_use_mini_cards) ? R.layout.play_card_mini : R.layout.play_card_small;
    }

    protected int b(Resources resources) {
        return ik.e(resources);
    }

    public final int a(int i) {
        return b(getResources()) * i;
    }

    @Override // com.google.android.finsky.detailspage.bt
    public int getMarginOffset() {
        return this.d;
    }
}
