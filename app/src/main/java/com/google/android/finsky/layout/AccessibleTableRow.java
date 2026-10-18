package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TableRow;

/* loaded from: classes.dex */
public class AccessibleTableRow extends TableRow {
    public AccessibleTableRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccessibleTableRow(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().clear();
        return dispatchPopulateAccessibilityEvent;
    }
}
