package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class CheckableLinearLayout extends LinearLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private CheckedTextView f2938a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2939b;

    public CheckableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.CheckableLinearLayout);
        this.f2939b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        if (this.f2938a != null) {
            return this.f2938a.isChecked();
        }
        return false;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f2938a != null) {
            this.f2938a.setChecked(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (this.f2938a != null) {
            this.f2938a.toggle();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.f2939b != 0) {
            this.f2938a = (CheckedTextView) findViewById(this.f2939b);
        }
    }
}
