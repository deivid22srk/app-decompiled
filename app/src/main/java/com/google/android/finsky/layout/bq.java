package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class bq extends RelativeLayout implements com.google.android.finsky.layout.play.ag {

    /* renamed from: a, reason: collision with root package name */
    private String f3169a;

    public bq(Context context) {
        super(context);
    }

    public bq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ag
    public void setIdentifier(String str) {
        this.f3169a = str;
    }

    @Override // com.google.android.finsky.layout.play.ag
    public String getIdentifier() {
        return this.f3169a;
    }
}
