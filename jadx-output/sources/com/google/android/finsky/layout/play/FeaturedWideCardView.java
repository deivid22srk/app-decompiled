package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.HeroGraphicView;

/* loaded from: classes.dex */
public class FeaturedWideCardView extends com.google.android.play.layout.a {

    /* renamed from: a, reason: collision with root package name */
    private HeroGraphicView f3292a;

    public FeaturedWideCardView(Context context) {
        this(context, null);
    }

    public FeaturedWideCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3292a = (HeroGraphicView) findViewById(R.id.li_featured_hero);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Document document = (Document) getData();
        this.f3292a.getLayoutParams().width = View.MeasureSpec.getSize(i) / 2;
        this.f3292a.getLayoutParams().height = (int) (HeroGraphicView.a(document.f1963a.e) * this.f3292a.getLayoutParams().width);
        super.onMeasure(i, i2);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 20;
    }

    public HeroGraphicView getFeaturedHeroImage() {
        return this.f3292a;
    }
}
