package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class MyAccountPaymentMethodsExistingInstrumentRowView extends cm implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.finsky.a.ai f3034a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.finsky.layout.play.cy f3035b;
    public FifeImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public boolean h;
    private LinearLayout i;

    public MyAccountPaymentMethodsExistingInstrumentRowView(Context context) {
        this(context, null);
    }

    public MyAccountPaymentMethodsExistingInstrumentRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3034a = com.google.android.finsky.a.i.a(802);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (FifeImageView) findViewById(R.id.image_icon);
        this.i = (LinearLayout) findViewById(R.id.title_container);
        this.d = (TextView) findViewById(R.id.title);
        this.e = (TextView) findViewById(R.id.subtitle);
        this.f = (TextView) findViewById(R.id.byline);
        this.g = (TextView) findViewById(R.id.edit_button);
    }

    @Override // com.google.android.finsky.layout.cm
    protected final boolean aa_() {
        return this.h;
    }

    @Override // com.google.android.finsky.layout.cm
    protected final int a(boolean z) {
        return z ? this.i.getRight() : this.i.getLeft();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.f3034a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.f3035b;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.a.i.a(this, cyVar);
    }
}
