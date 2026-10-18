package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.HeroGraphicView;

/* loaded from: classes.dex */
public class FeaturedCardView extends com.google.android.play.layout.a {

    /* renamed from: a, reason: collision with root package name */
    private HeroGraphicView f3291a;

    public FeaturedCardView(Context context) {
        this(context, null);
    }

    public FeaturedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3291a = (HeroGraphicView) findViewById(R.id.li_featured_hero);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        this.f3291a.getLayoutParams().height = (int) (HeroGraphicView.a(((Document) getData()).f1963a.e) * View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 15;
    }

    public HeroGraphicView getFeaturedHeroImage() {
        return this.f3291a;
    }
}
