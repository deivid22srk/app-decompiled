package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.activities.ReviewsActivity;
import com.google.android.finsky.activities.fe;
import com.google.android.finsky.activities.ff;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.protos.ny;
import java.util.List;

/* loaded from: classes.dex */
public class ReviewsSamplesModuleLayout extends k<dk> {
    private dl j;
    private fe k;
    private final boolean l;

    @Override // com.google.android.finsky.detailspage.k
    protected final /* synthetic */ View a(dk dkVar, Document document, ViewGroup viewGroup) {
        dk dkVar2 = dkVar;
        ReviewItemLayout reviewItemLayout = (ReviewItemLayout) this.g.inflate(R.layout.review_item, viewGroup, false);
        ny nyVar = dkVar2.f2618a;
        boolean z = !TextUtils.isEmpty(nyVar.f4191a);
        reviewItemLayout.a(document, nyVar, 3, this.h, false, this.l, dkVar2.f2619b, dkVar2.c, this.i);
        if (z) {
            if (this.l) {
                reviewItemLayout.setReviewFeedbackActionListener(new di(this, nyVar));
            } else {
                reviewItemLayout.setActionClickListener(new dj(this, nyVar));
            }
        } else {
            reviewItemLayout.setActionClickListener(null);
        }
        return reviewItemLayout;
    }

    public ReviewsSamplesModuleLayout(Context context) {
        this(context, null);
    }

    public ReviewsSamplesModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = ReviewsActivity.o();
    }

    @Override // com.google.android.finsky.detailspage.k
    protected final int a(Resources resources) {
        return resources.getInteger(R.integer.sample_reviews_max_rows);
    }

    @Override // com.google.android.finsky.detailspage.k
    protected final int b(Resources resources) {
        return resources.getInteger(R.integer.sample_reviews_per_row);
    }

    public void setReviewFeedbackListener(fe feVar) {
        this.k = feVar;
    }

    public final void a(List<dk> list, Document document, boolean z, boolean z2, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar, dl dlVar) {
        super.a(list, document, z, bVar, cyVar);
        this.j = dlVar;
        if (z2) {
            setOnClickListener(new dh(this, document));
        } else {
            this.f2660b.setVisibility(8);
        }
    }

    @Override // com.google.android.finsky.detailspage.k
    protected int getBucketRowLayout() {
        return R.layout.review_samples_row;
    }

    @Override // com.google.android.finsky.detailspage.k
    protected String getFooterText() {
        return getContext().getString(R.string.all_reviews).toUpperCase();
    }

    @Override // com.google.android.finsky.detailspage.k
    protected String getSectionTitleText() {
        return getContext().getString(R.string.reviews_section_title).toUpperCase();
    }

    @Override // com.google.android.finsky.detailspage.k
    protected TextView getFooterView() {
        return (TextView) findViewById(R.id.all_reviews_footer);
    }

    @Override // com.google.android.finsky.detailspage.k
    protected TextView getSectionTitleView() {
        return (TextView) findViewById(R.id.reviews_section_title);
    }

    static /* synthetic */ void a(ReviewsSamplesModuleLayout reviewsSamplesModuleLayout, ny nyVar, ff ffVar) {
        if (reviewsSamplesModuleLayout.k == null) {
            return;
        }
        reviewsSamplesModuleLayout.k.a(reviewsSamplesModuleLayout.f, nyVar.f4191a, ffVar);
    }
}
