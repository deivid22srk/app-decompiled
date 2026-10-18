package com.google.android.finsky.layout;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ScrollView;
import java.util.List;

/* loaded from: classes.dex */
public class ObservableScrollView extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f3039a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3040b;
    private List<Object> c;

    static {
        f3039a = Build.VERSION.SDK_INT >= 18;
    }

    public ObservableScrollView(Context context) {
        this(context, null);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.c != null) {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                this.c.get(size);
            }
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f3040b = true;
        super.onLayout(z, i, i2, i3, i4);
        this.f3040b = false;
    }
}
