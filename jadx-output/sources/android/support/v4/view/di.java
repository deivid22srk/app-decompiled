package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class di extends ViewGroup.LayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public boolean f373a;

    /* renamed from: b, reason: collision with root package name */
    public int f374b;
    float c;
    boolean d;
    int e;
    int f;

    public di() {
        super(-1, -1);
        this.c = 0.0f;
    }

    public di(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr;
        this.c = 0.0f;
        iArr = ViewPager.f310b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        this.f374b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
