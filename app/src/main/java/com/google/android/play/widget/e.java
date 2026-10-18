package com.google.android.play.widget;

import android.content.Context;
import android.support.v4.view.bn;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class e extends com.google.android.libraries.bind.bpkg.b {

    /* renamed from: b, reason: collision with root package name */
    private boolean f7098b;
    protected boolean e;

    public e(Context context) {
        super(context);
        this.e = true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override // android.support.v4.view.ViewPager
    public void setAdapter(bn bnVar) {
        this.e = true;
        super.setAdapter(bnVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e = false;
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i) {
        this.f7098b = true;
        super.setCurrentItem(i);
        this.f7098b = false;
    }

    @Override // android.support.v4.view.ViewPager
    public final void a(int i, boolean z) {
        this.f7098b = true;
        super.a(i, z);
        this.f7098b = false;
    }
}
