package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class MyAccountPaymentMethodsCreatableInstrumentRowView extends cm implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.finsky.apkg.ai f3032a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.finsky.layout.play.cy f3033b;
    public FifeImageView c;
    public TextView d;

    public MyAccountPaymentMethodsCreatableInstrumentRowView(Context context) {
        this(context, null);
    }

    public MyAccountPaymentMethodsCreatableInstrumentRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3032a = com.google.android.finsky.apkg.i.a(0);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (FifeImageView) findViewById(R.id.image_icon);
        this.d = (TextView) findViewById(R.id.title);
    }

    @Override // com.google.android.finsky.layout.cm
    protected final int a(boolean z) {
        return z ? this.d.getRight() : this.d.getLeft();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.f3032a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.f3033b;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.apkg.i.a(this, cyVar);
    }
}
