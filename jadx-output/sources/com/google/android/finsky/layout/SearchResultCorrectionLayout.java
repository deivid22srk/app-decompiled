package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import com.android.vending.R;

/* loaded from: classes.dex */
public class SearchResultCorrectionLayout extends IdentifiableLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3076a;

    /* renamed from: b, reason: collision with root package name */
    public SuggestionBarLayout f3077b;
    public SuggestionBarLayout c;

    public SearchResultCorrectionLayout(Context context) {
        super(context);
    }

    public SearchResultCorrectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3077b = (SuggestionBarLayout) findViewById(R.id.suggestion_line);
        this.c = (SuggestionBarLayout) findViewById(R.id.replaced_line);
    }
}
