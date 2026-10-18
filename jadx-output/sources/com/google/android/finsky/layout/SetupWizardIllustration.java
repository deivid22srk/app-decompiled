package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class SetupWizardIllustration extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3080a;

    /* renamed from: b, reason: collision with root package name */
    public FifeImageView f3081b;
    private final float c;
    private final float d;
    private final int e;
    private final boolean f;
    private TextView g;

    public SetupWizardIllustration(Context context) {
        this(context, null);
    }

    public SetupWizardIllustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.SetupWizardIllustration, 0, 0);
        this.f3080a = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getFloat(1, 0.0f);
        obtainStyledAttributes.recycle();
        this.d = getResources().getDimensionPixelSize(R.dimen.setup_wizard_baseline_grid_size);
        this.e = getResources().getDimensionPixelOffset(R.dimen.setup_wizard_status_bar_offset);
        this.f = getResources().getBoolean(R.bool.setup_wizard_use_tablet_graphic);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3081b = (FifeImageView) findViewById(R.id.setup_wizard_header_graphic);
        this.g = (TextView) findViewById(R.id.title);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z = (this.f3081b == null || this.f3081b.getVisibility() == 8) ? false : true;
        if (this.g != null) {
            ((LinearLayout.LayoutParams) this.g.getLayoutParams()).topMargin = z ? 0 : this.e;
        }
        if (z && this.c != 0.0f) {
            int size = (int) (View.MeasureSpec.getSize(i) / this.c);
            this.f3081b.getLayoutParams().height = (int) (size - (size % this.d));
        }
        super.onMeasure(i, i2);
    }

    static /* synthetic */ void a(SetupWizardIllustration setupWizardIllustration, View view, Matrix matrix, RectF rectF) {
        if (android.support.v4.view.by.h(setupWizardIllustration) == 0) {
            return;
        }
        float width = rectF.width();
        float height = rectF.height();
        matrix.postScale(-1.0f, 1.0f, (width / 2.0f) + ((view.getWidth() - width) / 2.0f), (height / 2.0f) + ((view.getHeight() - height) / 2.0f));
    }
}
