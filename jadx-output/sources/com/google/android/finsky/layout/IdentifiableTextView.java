package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class IdentifiableTextView extends TextView implements com.google.android.finsky.layout.play.ag {

    /* renamed from: a, reason: collision with root package name */
    private String f3006a;

    public IdentifiableTextView(Context context) {
        super(context);
    }

    public IdentifiableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.play.ag
    public void setIdentifier(String str) {
        this.f3006a = str;
    }

    @Override // com.google.android.finsky.layout.play.ag
    public String getIdentifier() {
        return this.f3006a;
    }
}
