package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class SummaryTextLayout extends LinearLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public FormEditText f7463a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f7464b;
    int c;
    private int d;
    private int e;
    private ay f;

    public SummaryTextLayout(Context context) {
        super(context);
        a(context, null);
    }

    public SummaryTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    @TargetApi(11)
    public SummaryTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        String str;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.wallet.e.k.SummaryTextLayout);
            this.d = obtainStyledAttributes.getDimensionPixelSize(com.google.android.wallet.e.k.SummaryTextLayout_internalUicTopMarginWhenHint, 0);
            this.e = obtainStyledAttributes.getDimensionPixelSize(com.google.android.wallet.e.k.SummaryTextLayout_internalUicTopMarginWhenSummary, 0);
            String string = obtainStyledAttributes.getString(com.google.android.wallet.e.k.SummaryTextLayout_internalUicSummaryHint);
            obtainStyledAttributes.recycle();
            str = string;
        } else {
            str = null;
        }
        setOrientation(0);
        View inflate = LayoutInflater.from(context).inflate(com.google.android.wallet.e.h.view_summary_text_layout, (ViewGroup) this, true);
        this.f7463a = (FormEditText) inflate.findViewById(com.google.android.wallet.e.g.summary_text_view_text);
        this.f7464b = (ImageView) inflate.findViewById(com.google.android.wallet.e.g.summary_text_view_edit);
        setEditMode(1);
        if (this.f7463a.getPaddingBottom() < this.f7463a.getPaddingTop()) {
            this.f7464b.setPadding(this.f7464b.getPaddingLeft(), (this.f7464b.getPaddingTop() + this.f7463a.getPaddingTop()) - this.f7463a.getPaddingBottom(), this.f7464b.getPaddingRight(), this.f7464b.getPaddingBottom());
        } else {
            this.f7464b.setPadding(this.f7464b.getPaddingLeft(), this.f7464b.getPaddingTop(), this.f7464b.getPaddingRight(), (this.f7464b.getPaddingBottom() + this.f7463a.getPaddingBottom()) - this.f7463a.getPaddingTop());
        }
        this.f7463a.setInputType(524288);
        this.f7463a.setKeyListener(null);
        this.f7463a.setEllipsize(TextUtils.TruncateAt.END);
        this.f7463a.setSingleLine();
        if (!TextUtils.isEmpty(str)) {
            this.f7463a.setHint(str);
        }
        this.f7463a.addTextChangedListener(new ax(this));
        a();
        this.f7463a.setOnClickListener(this);
        this.f7464b.setOnClickListener(this);
    }

    public void setSummaryOnClickListener(ay ayVar) {
        this.f = ayVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f7463a != null) {
            this.f7463a.setEnabled(z);
        }
        if (this.f7464b != null) {
            this.f7464b.setEnabled(z);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f != null) {
            if (view == this.f7464b && this.c == 2) {
                this.f.i();
            } else {
                this.f.h();
            }
            setEditMode(1);
        }
    }

    public void setEditMode(int i) {
        this.c = i;
        a();
    }

    public void setHint(CharSequence charSequence) {
        this.f7463a.setHint(charSequence);
    }

    public void setText(CharSequence charSequence) {
        this.f7463a.setText(charSequence);
        a();
    }

    public void setText(int i) {
        setText(getContext().getResources().getText(i));
    }

    public CharSequence getText() {
        return this.f7463a.getText();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putInt("editMode", this.c);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        this.c = bundle.getInt("editMode", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int i;
        String string;
        if (TextUtils.isEmpty(this.f7463a.getText())) {
            this.f7464b.setVisibility(8);
            this.f7463a.getBackground().setAlpha(255);
            setMarginTop(this.d);
            setFocusableInTouchMode(true);
            return;
        }
        if (this.c == 2) {
            i = com.google.android.wallet.e.c.uicClearDrawable;
            string = getResources().getString(com.google.android.wallet.e.j.wallet_uic_summary_clear_button_description);
        } else {
            i = com.google.android.wallet.e.c.uicEditDrawable;
            string = getResources().getString(com.google.android.wallet.e.j.wallet_uic_summary_edit_button_description);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i, com.google.android.wallet.e.c.internalUicEditAndClearableIconColor});
        Drawable c = android.support.v4.c.apkg.a.c(obtainStyledAttributes.getDrawable(0));
        android.support.v4.c.apkg.a.a(c, obtainStyledAttributes.getColorStateList(1));
        obtainStyledAttributes.recycle();
        this.f7464b.setImageDrawable(c);
        this.f7464b.setVisibility(0);
        this.f7464b.setContentDescription(string);
        this.f7463a.getBackground().setAlpha(0);
        setMarginTop(this.e);
        setFocusable(false);
    }

    private void setMarginTop(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            setLayoutParams(marginLayoutParams);
        }
    }
}
