package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class EditorialHeroSpacerView extends View implements com.google.android.finsky.layout.play.y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2975a;

    /* renamed from: b, reason: collision with root package name */
    public float f2976b;

    public EditorialHeroSpacerView(Context context) {
        this(context, null);
    }

    public EditorialHeroSpacerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int a2 = HeroGraphicView.a(getContext(), size, this.f2975a, this.f2976b);
        if (InsetsFrameLayout.f3009a) {
            a2 -= ik.d(getContext());
        }
        setMeasuredDimension(size, a2);
    }
}
