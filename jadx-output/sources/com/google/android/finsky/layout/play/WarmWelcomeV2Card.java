package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.CardLinearLayout;

/* loaded from: classes.dex */
public class WarmWelcomeV2Card extends com.google.android.finsky.layout.bp implements com.google.android.finsky.adapters.ap, cy {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3384a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3385b;
    public FifeImageView c;
    public View d;
    public View e;
    public TextView f;
    public TextView g;
    public com.google.android.finsky.a.ai h;
    public cy i;
    public CardLinearLayout j;

    public WarmWelcomeV2Card(Context context) {
        this(context, null);
    }

    public WarmWelcomeV2Card(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3384a = (TextView) findViewById(R.id.warm_welcome_v2_title);
        this.f3385b = (TextView) findViewById(R.id.warm_welcome_v2_body);
        this.j = (CardLinearLayout) findViewById(R.id.warm_welcome_v2_card_content);
        this.c = (FifeImageView) findViewById(R.id.warm_welcome_v2_graphic);
        this.d = findViewById(R.id.warm_welcome_v2_graphic_box);
        this.f = (TextView) findViewById(R.id.button_primary);
        this.g = (TextView) findViewById(R.id.button_secondary);
        this.e = findViewById(R.id.warm_welcome_v2_button_panel);
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.c.a();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.h;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.i;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }
}
