package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.layout.AccessibleLinearLayout;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class WarmWelcomeCardButton extends AccessibleLinearLayout implements com.google.android.finsky.adapters.ap {

    /* renamed from: a, reason: collision with root package name */
    FifeImageView f3382a;

    /* renamed from: b, reason: collision with root package name */
    TextView f3383b;

    public WarmWelcomeCardButton(Context context) {
        this(context, null);
    }

    public WarmWelcomeCardButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3382a = (FifeImageView) findViewById(R.id.icon);
        this.f3383b = (TextView) findViewById(R.id.text);
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.f3382a.a();
    }
}
