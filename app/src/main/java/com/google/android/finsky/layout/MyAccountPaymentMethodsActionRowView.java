package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.caverock.androidsvg.SVGParseException;

/* loaded from: classes.dex */
public class MyAccountPaymentMethodsActionRowView extends cm implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.finsky.apkg.ai f3028a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.finsky.layout.play.cy f3029b;
    private ImageView c;
    private TextView d;

    public MyAccountPaymentMethodsActionRowView(Context context) {
        this(context, null);
    }

    public MyAccountPaymentMethodsActionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3028a = com.google.android.finsky.apkg.i.a(0);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.image_icon);
        this.d = (TextView) findViewById(R.id.title);
    }

    public final void a(int i, int i2, View.OnClickListener onClickListener, int i3, com.google.android.finsky.layout.play.cy cyVar) {
        this.d.setText(i);
        try {
            Resources resources = getResources();
            this.c.setImageDrawable(com.caverock.androidsvg.q.a(resources, i2, new com.caverock.androidsvg.at().a(resources.getColor(R.color.my_account_action_fg))));
            setOnClickListener(onClickListener);
            this.f3028a.f1453a = i3;
            this.f3029b = cyVar;
            this.f3029b.a(this);
        } catch (SVGParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.finsky.layout.cm
    protected final int a(boolean z) {
        return z ? this.d.getRight() : this.d.getLeft();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.f3028a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.f3029b;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.apkg.i.a(this, cyVar);
    }
}
