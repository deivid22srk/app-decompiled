package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.deivid22srk.store.R;
import com.google.android.play.layout.PlayTextView;

/* loaded from: classes.dex */
public class FamilyShareTextBlock extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public ImageView f2985a;

    /* renamed from: b, reason: collision with root package name */
    public PlayTextView f2986b;

    public FamilyShareTextBlock(Context context) {
        this(context, null);
    }

    public FamilyShareTextBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2985a = (ImageView) findViewById(R.id.icon);
        this.f2986b = (PlayTextView) findViewById(R.id.body);
    }

    public void setCorpusStyle(int i) {
        Context context = getContext();
        int f = com.google.android.finsky.utils.ai.f(context, i);
        setBackgroundColor(f);
        this.f2986b.setLastLineOverdrawColor(f);
        ColorStateList c = com.google.android.finsky.utils.ai.c(context, i);
        this.f2986b.setTextColor(c);
        this.f2986b.setLinkTextColor(c);
    }
}
