package com.google.android.libraries.bind.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v4.view.dq;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class b extends dq {
    public b(Context context) {
        super(context);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    public final boolean f() {
        return Build.VERSION.SDK_INT >= 18 && getLayoutDirection() == 1;
    }

    public int getCurrentLogicalItem() {
        return c.a(getAdapter(), super.getCurrentItem());
    }

    public int getCurrentVisualItem() {
        return super.getCurrentItem();
    }

    public void setCurrentLogicalItem(int i) {
        setCurrentItem(c.b(getAdapter(), i));
    }

    @Override // android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int currentLogicalItem = getCurrentLogicalItem();
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).a(i == 1);
        }
        setCurrentLogicalItem(currentLogicalItem);
    }
}
