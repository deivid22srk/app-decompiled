package android.support.v7.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class b extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f491a;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f491a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.b.l.ActionBarLayout);
        this.f491a = obtainStyledAttributes.getInt(android.support.v7.b.l.ActionBarLayout_android_layout_gravity, 0);
        obtainStyledAttributes.recycle();
    }

    public b(int i) {
        super(i, -2);
        this.f491a = 0;
        this.f491a = 8388627;
    }

    public b(b bVar) {
        super((ViewGroup.MarginLayoutParams) bVar);
        this.f491a = 0;
        this.f491a = bVar.f491a;
    }

    public b(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f491a = 0;
    }
}
