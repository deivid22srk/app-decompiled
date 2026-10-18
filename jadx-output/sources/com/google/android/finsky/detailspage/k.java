package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.BucketRow;
import com.google.android.finsky.layout.ForegroundLinearLayout;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k<T> extends ForegroundLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected TextView f2659a;

    /* renamed from: b, reason: collision with root package name */
    protected TextView f2660b;
    protected final int c;
    protected final int d;
    protected boolean e;
    protected String f;
    protected LayoutInflater g;
    protected com.google.android.finsky.navigationmanager.b h;
    protected com.google.android.finsky.layout.play.cy i;

    protected abstract int a(Resources resources);

    protected abstract View a(T t, Document document, ViewGroup viewGroup);

    protected abstract int b(Resources resources);

    protected abstract int getBucketRowLayout();

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = LayoutInflater.from(context);
        Resources resources = context.getResources();
        this.c = b(resources);
        this.d = a(resources);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2659a = getSectionTitleView();
        this.f2660b = getFooterView();
    }

    protected final void a(List<T> list, Document document, boolean z, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.layout.play.cy cyVar) {
        this.i = cyVar;
        this.h = bVar;
        this.f = document.f1963a.f3890a;
        this.e = true;
        int i = this.f2660b != null ? 1 : 0;
        int i2 = (this.f2659a != null ? 1 : 0) + i;
        if (getChildCount() > i2) {
            removeViews(1, getChildCount() - i2);
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        int min = Math.min(getMaxItemsToShow(), list.size());
        int i3 = ((min + r0) - 1) / this.c;
        for (int i4 = 0; i4 < i3; i4++) {
            BucketRow bucketRow = (BucketRow) from.inflate(getBucketRowLayout(), (ViewGroup) this, false);
            bucketRow.setSameChildHeight(true);
            for (int i5 = 0; i5 < this.c; i5++) {
                int i6 = (this.c * i4) + i5;
                if (i6 < min) {
                    bucketRow.addView(a(list.get(i6), document, this));
                } else {
                    View view = new View(getContext());
                    view.setVisibility(4);
                    bucketRow.addView(view);
                }
            }
            addView(bucketRow, getChildCount() - i);
        }
        if (this.f2659a != null) {
            if (z) {
                this.f2659a.setText(getSectionTitleText());
                this.f2659a.setVisibility(0);
            } else {
                this.f2659a.setVisibility(8);
            }
        }
        if (this.f2660b != null) {
            if (a(list)) {
                Context context = getContext();
                this.f2660b.setVisibility(0);
                this.f2660b.setText(getFooterText());
                this.f2660b.setTextColor(com.google.android.play.utils.h.a(context, document.f1963a.g));
                return;
            }
            this.f2660b.setVisibility(8);
        }
    }

    public final boolean a() {
        return this.e;
    }

    protected TextView getFooterView() {
        return null;
    }

    protected TextView getSectionTitleView() {
        return null;
    }

    protected boolean a(List<T> list) {
        return list.size() > getMaxItemsToShow();
    }

    public int getMaxItemsToShow() {
        return this.c * this.d;
    }

    protected String getFooterText() {
        return null;
    }

    protected String getSectionTitleText() {
        return null;
    }
}
