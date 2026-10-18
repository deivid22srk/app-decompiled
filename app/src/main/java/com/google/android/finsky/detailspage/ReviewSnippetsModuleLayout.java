package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.ReviewSnippetLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ReviewSnippetsModuleLayout extends k<da> {
    private boolean j;
    private cz k;
    private View.OnClickListener l;

    @Override // com.google.android.finsky.detailspage.k
    protected final /* synthetic */ View a(da daVar, Document document, ViewGroup viewGroup) {
        CharSequence a2;
        da daVar2 = daVar;
        ReviewSnippetLayout reviewSnippetLayout = (ReviewSnippetLayout) this.g.inflate(R.layout.review_snippet, viewGroup, false);
        String str = daVar2.f2601a;
        String str2 = daVar2.f2602b;
        int i = daVar2.c;
        boolean z = daVar2.e;
        boolean z2 = daVar2.f;
        reviewSnippetLayout.c.a(com.google.android.finsky.utils.bc.a(str), reviewSnippetLayout.getContext().getResources().getQuantityString(R.plurals.review_snippet_count, i, reviewSnippetLayout.f3060a.format(i)));
        TextView textView = reviewSnippetLayout.f3061b;
        if (TextUtils.isEmpty(str2)) {
            a2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("&ldquo;");
            if (z) {
                sb.append("&#8230;");
            }
            sb.append(str2);
            if (z2) {
                sb.append("&#8230;");
            }
            sb.append("&rdquo;");
            a2 = com.google.android.finsky.utils.bc.a(sb.toString());
        }
        textView.setText(a2);
        if (this.j) {
            reviewSnippetLayout.setOnClickListener(new cy(this, daVar2));
        }
        return reviewSnippetLayout;
    }

    public ReviewSnippetsModuleLayout(Context context) {
        this(context, null);
    }

    public ReviewSnippetsModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void b(List<da> list, Document document, boolean z, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.j = z;
        super.a(list, document, true, bVar, cyVar);
        if (this.j) {
            this.f2660b.setOnClickListener(new cx(this));
        } else {
            this.f2660b.setVisibility(8);
        }
    }

    public void setAllReviewsClickListener(View.OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    public void setReviewSnippetClickListener(cz czVar) {
        this.k = czVar;
    }

    @Override // com.google.android.finsky.detailspage.k
    protected String getFooterText() {
        return getContext().getString(R.string.review_snippets_footer).toUpperCase();
    }

    @Override // com.google.android.finsky.detailspage.k
    protected String getSectionTitleText() {
        return getContext().getString(R.string.review_snippets_title).toUpperCase();
    }

    @Override // com.google.android.finsky.detailspage.k
    protected int getBucketRowLayout() {
        return R.layout.review_samples_row;
    }

    @Override // com.google.android.finsky.detailspage.k
    protected final int a(Resources resources) {
        return resources.getInteger(R.integer.snippets_max_rows);
    }

    @Override // com.google.android.finsky.detailspage.k
    protected final int b(Resources resources) {
        return resources.getInteger(R.integer.snippets_per_row);
    }

    @Override // com.google.android.finsky.detailspage.k
    protected TextView getSectionTitleView() {
        return (TextView) findViewById(R.id.snippets_section_title);
    }

    @Override // com.google.android.finsky.detailspage.k
    protected TextView getFooterView() {
        return (TextView) findViewById(R.id.all_reviews_footer);
    }

    @Override // com.google.android.finsky.detailspage.k
    protected final boolean a(List<da> list) {
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3 = 0;
        super.onMeasure(i, i2);
        List<ReviewSnippetLayout> snippetLayoutChildren = getSnippetLayoutChildren();
        int i4 = 0;
        boolean z2 = false;
        while (i4 < snippetLayoutChildren.size() && !z2) {
            boolean z3 = snippetLayoutChildren.get(i4).d;
            i4++;
            z2 = z3;
        }
        if (z2) {
            boolean z4 = false;
            while (i3 < snippetLayoutChildren.size()) {
                ReviewSnippetLayout reviewSnippetLayout = snippetLayoutChildren.get(i3);
                if (reviewSnippetLayout.d) {
                    z = z4;
                } else {
                    reviewSnippetLayout.c.f3065b = true;
                    reviewSnippetLayout.f3061b.setGravity(1);
                    z = true;
                }
                i3++;
                z4 = z;
            }
            if (z4) {
                super.onMeasure(i, i2);
            }
        }
    }

    private List<ReviewSnippetLayout> getSnippetLayoutChildren() {
        ArrayList arrayList = new ArrayList(getChildCount());
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof BucketRow) {
                BucketRow bucketRow = (BucketRow) childAt;
                for (int i2 = 0; i2 < bucketRow.getChildCount(); i2++) {
                    View childAt2 = bucketRow.getChildAt(i2);
                    if (childAt2 instanceof ReviewSnippetLayout) {
                        arrayList.add((ReviewSnippetLayout) childAt2);
                    }
                }
            }
        }
        return arrayList;
    }
}
