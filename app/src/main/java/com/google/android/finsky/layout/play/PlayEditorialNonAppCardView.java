package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.ex;

/* loaded from: classes.dex */
public class PlayEditorialNonAppCardView extends com.google.android.play.layout.a implements ex {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f3349a = {4, 0, 2};

    public PlayEditorialNonAppCardView(Context context) {
        this(context, null);
    }

    public PlayEditorialNonAppCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.play.layout.a
    public int getCardType() {
        return 6;
    }

    @Override // com.google.android.finsky.utils.ex
    public int[] getImageTypePreference() {
        return f3349a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.layout.a, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Document document = (Document) getData();
        this.z = as.b(document == null ? 6 : document.f1963a.e);
        ((ViewGroup.MarginLayoutParams) this.b_.getLayoutParams()).width = (int) (r0.height / this.z);
        super.onMeasure(i, i2);
    }
}
