package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.vending.R;

/* loaded from: classes.dex */
public class ContentFrame extends InsetsFrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f2942b;
    private final LayoutInflater c;

    public ContentFrame(Context context) {
        this(context, null, 0);
    }

    public ContentFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        View inflate = this.c.inflate(R.layout.page_loading_indicator, (ViewGroup) this, false);
        inflate.setVisibility(8);
        addView(inflate);
        View inflate2 = this.c.inflate(R.layout.page_error_indicator, (ViewGroup) this, false);
        inflate2.setVisibility(8);
        addView(inflate2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.ContentFrame);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            addView(a(this.c, resourceId, resourceId2));
        }
    }

    public final ViewGroup a(LayoutInflater layoutInflater, int i, int i2) {
        if (i == 0) {
            return null;
        }
        this.f2942b = (ViewGroup) layoutInflater.inflate(i, (ViewGroup) this, false);
        if (i2 != 0) {
            this.f2942b.setId(i2);
        }
        return this.f2942b;
    }
}
