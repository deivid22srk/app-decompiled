package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class w extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f466a;

    /* renamed from: b, reason: collision with root package name */
    private float f467b;
    private boolean c;
    private int d;

    static /* synthetic */ int b(w wVar, int i) {
        int i2 = wVar.d | i;
        wVar.d = i2;
        return i2;
    }

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr;
        this.f466a = 0;
        iArr = DrawerLayout.n;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        this.f466a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public w() {
        super(-1, -1);
        this.f466a = 0;
    }

    public w(w wVar) {
        super((ViewGroup.MarginLayoutParams) wVar);
        this.f466a = 0;
        this.f466a = wVar.f466a;
    }

    public w(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f466a = 0;
    }

    public w(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f466a = 0;
    }
}
