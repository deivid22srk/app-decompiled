package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class FormCheckBox extends android.support.v7.widget.al implements CompoundButton.OnCheckedChangeListener, t {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7446a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f7447b;
    private CompoundButton.OnCheckedChangeListener c;
    private l d;

    public FormCheckBox(Context context) {
        super(context);
        this.f7446a = false;
        super.setOnCheckedChangeListener(this);
    }

    public FormCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7446a = false;
        super.setOnCheckedChangeListener(this);
    }

    @TargetApi(11)
    public FormCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7446a = false;
        super.setOnCheckedChangeListener(this);
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean af_() {
        boolean ag_ = ag_();
        if (!ag_) {
            setError(getRequiredErrorString());
        }
        return ag_;
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean ag_() {
        return !this.f7446a || isChecked();
    }

    @Override // android.widget.TextView, com.google.android.wallet.ui.common.t
    public void setError(CharSequence charSequence) {
        if (this.d != null) {
            this.d.a(charSequence);
        } else {
            super.setError(charSequence);
        }
    }

    @Override // android.widget.TextView, com.google.android.wallet.ui.common.t
    public CharSequence getError() {
        return this.d != null ? this.d.a() : super.getError();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        setError(null);
        if (this.c != null) {
            this.c.onCheckedChanged(compoundButton, z);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.c = onCheckedChangeListener;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z && getError() != null) {
            a();
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT < 16 && accessibilityEvent.getEventType() == 8 && getError() != null) {
            accessibilityEvent.setContentDescription(getErrorTextForAccessibility());
            return true;
        }
        return true;
    }

    public void setState(int i) {
        switch (i) {
            case 0:
            case 3:
                throw new IllegalArgumentException(new StringBuilder(39).append("Unsupported checkbox state: ").append(i).toString());
            case 1:
                setChecked(true);
                return;
            case 2:
                setChecked(false);
                return;
            default:
                return;
        }
    }

    public int getState() {
        return isChecked() ? 1 : 2;
    }

    public void setRequired(boolean z) {
        this.f7446a = z;
    }

    public void setRequiredErrorString(CharSequence charSequence) {
        this.f7447b = charSequence;
    }

    public void setErrorHandler(l lVar) {
        this.d = lVar;
    }

    public final void a() {
        bj.a((View) this, (CharSequence) getErrorTextForAccessibility());
    }

    private String getErrorTextForAccessibility() {
        return getResources().getString(com.google.android.wallet.e.j.wallet_uic_accessibility_event_form_field_error, getText(), getError());
    }

    private CharSequence getRequiredErrorString() {
        return !TextUtils.isEmpty(this.f7447b) ? this.f7447b : getContext().getString(com.google.android.wallet.e.j.wallet_uic_error_field_must_not_be_empty);
    }
}
