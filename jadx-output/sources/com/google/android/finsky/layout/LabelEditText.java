package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;

/* loaded from: classes.dex */
public class LabelEditText extends EditText {

    /* renamed from: a, reason: collision with root package name */
    private int f3010a;

    /* renamed from: b, reason: collision with root package name */
    private String f3011b;

    public LabelEditText(Context context) {
        this(context, null);
    }

    public LabelEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.android.vending.b.LabelEditText, 0, 0);
        try {
            this.f3010a = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            this.f3011b = getText().toString();
            setOnFocusChangeListener(new bu(this));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setTextValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f3011b = str.toString().trim();
            if (this.f3010a == 0) {
                setText(this.f3011b);
            } else {
                setText(getContext().getString(this.f3010a, this.f3011b));
            }
        }
    }

    public String getTextValue() {
        if (hasFocus()) {
            this.f3011b = getText().toString().trim();
        }
        return this.f3011b;
    }
}
