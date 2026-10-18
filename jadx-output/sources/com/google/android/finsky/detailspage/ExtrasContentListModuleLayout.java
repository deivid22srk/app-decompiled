package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.ExtrasItemSnippet;

/* loaded from: classes.dex */
public class ExtrasContentListModuleLayout extends LinearLayout implements com.google.android.finsky.layout.bd {

    /* renamed from: a, reason: collision with root package name */
    boolean f2497a;

    /* renamed from: b, reason: collision with root package name */
    View f2498b;
    TextView c;
    TextView d;
    ay e;

    public ExtrasContentListModuleLayout(Context context) {
        super(context);
    }

    public ExtrasContentListModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtrasContentListModuleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2498b = findViewById(R.id.extras_item_header);
        this.c = (TextView) findViewById(R.id.extras_item_list_title);
        this.d = (TextView) findViewById(R.id.extras_item_list_subtitle);
    }

    @Override // com.google.android.finsky.layout.bd
    public final void a(ExtrasItemSnippet extrasItemSnippet) {
        int childCount = getChildCount();
        for (int i = 1; i < childCount; i++) {
            ExtrasItemSnippet extrasItemSnippet2 = (ExtrasItemSnippet) getChildAt(i);
            if (extrasItemSnippet2 != extrasItemSnippet && extrasItemSnippet2.f2983a != null) {
                extrasItemSnippet2.f2983a.setVisibility(8);
            }
        }
        if (extrasItemSnippet.b()) {
            this.e.b(extrasItemSnippet.getDocument());
        } else {
            this.e.b(null);
        }
    }
}
