package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class IdentifiableLinearLayout extends LinearLayout implements com.google.android.finsky.layout.play.ag {

    /* renamed from: a, reason: collision with root package name */
    private String f3005a;

    public IdentifiableLinearLayout(Context context) {
        super(context);
    }

    public IdentifiableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ag
    public void setIdentifier(String str) {
        this.f3005a = str;
    }

    @Override // com.google.android.finsky.layout.play.ag
    public String getIdentifier() {
        return this.f3005a;
    }
}
