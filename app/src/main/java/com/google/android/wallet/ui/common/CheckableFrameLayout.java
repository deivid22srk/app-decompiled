package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CheckableFrameLayout extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f7435a = {android.R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private boolean f7436b;

    public CheckableFrameLayout(Context context) {
        super(context);
        this.f7436b = false;
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7436b = false;
    }

    public CheckableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7436b = false;
    }

    @TargetApi(21)
    public CheckableFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7436b = false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7436b;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z != this.f7436b) {
            this.f7436b = z;
            refreshDrawableState();
            a(this, z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7436b);
    }

    private void a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(z);
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f7435a);
        }
        return onCreateDrawableState;
    }
}
