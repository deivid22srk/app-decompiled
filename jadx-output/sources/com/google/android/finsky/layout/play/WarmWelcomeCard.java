package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ds;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class WarmWelcomeCard extends com.google.android.finsky.layout.bp implements com.google.android.finsky.adapters.ap, cy {

    /* renamed from: a, reason: collision with root package name */
    private TextView f3380a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f3381b;
    private View c;
    private FifeImageView d;
    private WarmWelcomeCardButton e;
    private WarmWelcomeCardButton f;
    private View g;
    private final boolean h;
    private final int i;
    private com.google.android.finsky.a.ai j;
    private cy k;

    public WarmWelcomeCard(Context context) {
        this(context, null);
    }

    public WarmWelcomeCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.WarmWelcomeCard);
        this.h = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.i = context.getResources().getDimensionPixelSize(R.dimen.warm_welcome_title_top_padding);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3380a = (TextView) findViewById(R.id.warm_welcome_title);
        this.f3381b = (TextView) findViewById(R.id.warm_welcome_body);
        this.c = findViewById(R.id.warm_welcome_graphic_box);
        this.d = (FifeImageView) this.c.findViewById(R.id.warm_welcome_graphic);
        this.e = (WarmWelcomeCardButton) findViewById(R.id.button_primary);
        this.f = (WarmWelcomeCardButton) findViewById(R.id.button_secondary);
        this.g = findViewById(R.id.button_separator);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, ds dsVar, int i, cy cyVar, byte[] bArr) {
        this.f3380a.setText(charSequence);
        this.f3381b.setText(charSequence2);
        boolean z = (i == 0 || i == 9) ? false : true;
        if (dsVar != null) {
            this.c.setVisibility(0);
            this.d.a(dsVar.f, dsVar.l, FinskyApp.a().d);
            if (z) {
                this.c.setBackgroundColor(com.google.android.finsky.utils.ai.a(getContext(), i));
            } else {
                this.c.setBackgroundDrawable(null);
            }
        } else {
            this.c.setVisibility(8);
        }
        android.support.v4.view.by.a(this.f3380a, android.support.v4.view.by.n(this.f3380a), (dsVar == null || z || !this.h) ? false : true ? 0 : this.i, android.support.v4.view.by.o(this.f3380a), this.f3380a.getPaddingBottom());
        this.j = com.google.android.finsky.a.i.a(516);
        com.google.android.finsky.a.i.a(this.j, bArr);
        this.k = cyVar;
        getParentNode().a(this);
    }

    public final void b() {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        c();
    }

    public final void a(String str, ds dsVar, View.OnClickListener onClickListener, boolean z) {
        WarmWelcomeCardButton warmWelcomeCardButton;
        if (z) {
            warmWelcomeCardButton = this.e;
        } else {
            warmWelcomeCardButton = this.f;
            this.g.setVisibility(0);
            this.f.setVisibility(0);
        }
        com.google.android.play.image.e eVar = FinskyApp.a().d;
        warmWelcomeCardButton.f3383b.setText(str);
        if (dsVar != null) {
            warmWelcomeCardButton.f3382a.a(dsVar.f, dsVar.l, eVar);
            warmWelcomeCardButton.f3382a.setVisibility(0);
        } else {
            warmWelcomeCardButton.f3382a.setVisibility(8);
        }
        warmWelcomeCardButton.setContentDescription(str);
        warmWelcomeCardButton.setOnClickListener(onClickListener);
        c();
    }

    private void c() {
        if (this.f.getVisibility() == 8) {
            this.e.setGravity(8388627);
        } else {
            this.e.setGravity(17);
            this.f.setGravity(17);
        }
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.d.a();
        this.e.ab_();
        this.f.ab_();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.j;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.k;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }
}
