package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    i f138a;

    /* renamed from: b, reason: collision with root package name */
    boolean f139b;
    public int c;
    public int d;
    public int e;
    int f;
    View g;
    View h;
    boolean i;
    boolean j;
    boolean k;
    final Rect l;
    Object m;

    public l() {
        super(-2, -2);
        this.f139b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f139b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.design.i.CoordinatorLayout_LayoutParams);
        this.c = obtainStyledAttributes.getInteger(android.support.design.i.CoordinatorLayout_LayoutParams_android_layout_gravity, 0);
        this.f = obtainStyledAttributes.getResourceId(android.support.design.i.CoordinatorLayout_LayoutParams_layout_anchor, -1);
        this.d = obtainStyledAttributes.getInteger(android.support.design.i.CoordinatorLayout_LayoutParams_layout_anchorGravity, 0);
        this.e = obtainStyledAttributes.getInteger(android.support.design.i.CoordinatorLayout_LayoutParams_layout_keyline, -1);
        this.f139b = obtainStyledAttributes.hasValue(android.support.design.i.CoordinatorLayout_LayoutParams_layout_behavior);
        if (this.f139b) {
            this.f138a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(android.support.design.i.CoordinatorLayout_LayoutParams_layout_behavior));
        }
        obtainStyledAttributes.recycle();
    }

    public l(l lVar) {
        super((ViewGroup.MarginLayoutParams) lVar);
        this.f139b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public l(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f139b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public l(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f139b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.l = new Rect();
    }

    public final void a(i iVar) {
        if (this.f138a != iVar) {
            this.f138a = iVar;
            this.m = null;
            this.f139b = true;
        }
    }

    final boolean a(View view) {
        return view == this.h || (this.f138a != null && this.f138a.a(view));
    }
}
