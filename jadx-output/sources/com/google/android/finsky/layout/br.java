package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class br extends ViewGroup implements com.google.android.finsky.layout.play.ag {

    /* renamed from: a, reason: collision with root package name */
    private String f3170a;

    public br(Context context) {
        super(context);
    }

    public br(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ag
    public void setIdentifier(String str) {
        this.f3170a = str;
    }

    @Override // com.google.android.finsky.layout.play.ag
    public String getIdentifier() {
        return this.f3170a;
    }
}
