package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* loaded from: classes.dex */
public class AccessibleTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private final String f2918a;

    public AccessibleTextView(Context context) {
        this(context, null);
    }

    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.AccessibleTextView);
        this.f2918a = obtainStyledAttributes.getString(com.google.android.play.o.PlayAccessibilityHelper_playAccessibilityClassOverride);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isShown()) {
            CharSequence text = getText();
            if (TextUtils.isEmpty(text)) {
                text = getHint();
            }
            if (!TextUtils.isEmpty(text)) {
                if (text.length() > 500) {
                    text = text.subSequence(0, 501);
                }
                accessibilityEvent.getText().add(text.toString().toLowerCase());
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.play.utils.g.a(accessibilityNodeInfo, this.f2918a);
    }
}
