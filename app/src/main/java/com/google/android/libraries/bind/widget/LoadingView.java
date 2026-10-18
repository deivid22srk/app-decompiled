package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class LoadingView extends FrameLayout {
    public LoadingView(Context context) {
        this(context, null, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, com.google.android.libraries.bind.d.bind__loading, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
