package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class ba extends LinearLayout implements View.OnClickListener, View.OnFocusChangeListener, s {

    /* renamed from: a, reason: collision with root package name */
    public ImageWithCaptionView f7502a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.b.a.a.a.b.a.bpkg.t f7503b;
    private bb c;
    private boolean d;
    private View e;

    public ba(Context context) {
        super(context, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw new UnsupportedOperationException("Do not directly add views to TooltipUiFieldView.");
    }

    public final void a(View view, com.google.b.a.a.a.b.a.bpkg.t tVar, com.android.volley.apkg.n nVar) {
        if (this.e != null) {
            throw new IllegalStateException("setContent should only be called once.");
        }
        if (!(view instanceof TextView)) {
            throw new IllegalArgumentException("Tooltips are only supported for text and date UI fields.");
        }
        this.e = view;
        super.addView(view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.weight = 1.0f;
        this.e.setOnFocusChangeListener(this);
        this.f7503b = tVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.uicFormTooltipIconSize, com.google.android.wallet.e.c.uicClickableBackground});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        this.f7502a = new ImageWithCaptionView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams2.gravity = 17;
        android.support.v4.view.ao.a(layoutParams2, getResources().getDimensionPixelSize(com.google.android.wallet.e.f.wallet_uic_margin_touchable));
        android.support.v4.view.ao.b(layoutParams2, android.support.v4.view.ao.b(layoutParams));
        android.support.v4.view.ao.b(layoutParams, 0);
        addView(this.f7502a, layoutParams2);
        this.f7502a.a(tVar.f7688a, nVar, com.google.android.wallet.a.d.f7228a.b().booleanValue());
        this.f7502a.setBackgroundResource(resourceId);
        a(false);
        this.f7502a.setOnClickListener(this);
    }

    @Override // com.google.android.wallet.ui.common.s
    public final View getInnerFieldView() {
        return this.e;
    }

    public final void a() {
        if (this.e == null) {
            throw new IllegalStateException("This should not be called before setting the contents.");
        }
        removeView(this.f7502a);
        super.addView(this.f7502a, 0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7502a.getLayoutParams();
        android.support.v4.view.ao.b(layoutParams, android.support.v4.view.ao.b(layoutParams2));
        android.support.v4.view.ao.b(layoutParams2, android.support.v4.view.ao.a(layoutParams2));
        android.support.v4.view.ao.a(layoutParams2, android.support.v4.view.ao.a(layoutParams));
        android.support.v4.view.ao.a(layoutParams, 0);
    }

    public final void setIconHiddenWhenUnfocused(boolean z) {
        this.d = z;
        if (this.e != null) {
            a(false);
        }
    }

    public final void setOnTooltipIconClickListener(bb bbVar) {
        this.c = bbVar;
    }

    private void a(boolean z) {
        boolean z2 = !this.d || this.e.hasFocus();
        int i = z2 ? 0 : 4;
        if (this.f7502a.getVisibility() != i) {
            if (z) {
                if (z2) {
                    bj.a(this.f7502a, 0);
                    return;
                } else {
                    bj.b(this.f7502a, 0);
                    return;
                }
            }
            this.f7502a.setVisibility(i);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.e != null) {
            this.e.setEnabled(z);
        }
        this.f7502a.setEnabled(z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f7502a && this.c != null) {
            this.c.a(this.f7503b);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (view == this.e) {
            a(true);
        }
    }
}
