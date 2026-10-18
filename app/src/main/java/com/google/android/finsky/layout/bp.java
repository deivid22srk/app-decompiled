package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class bp extends FrameLayout implements com.google.android.finsky.layout.play.ag {

    /* renamed from: a, reason: collision with root package name */
    private String f3168a;

    public bp(Context context) {
        super(context);
    }

    public bp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ag
    public void setIdentifier(String str) {
        this.f3168a = str;
    }

    @Override // com.google.android.finsky.layout.play.ag
    public String getIdentifier() {
        return this.f3168a;
    }
}
