package android.support.design.widget;

import android.support.v4.view.er;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class c extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    boolean f128a;

    /* renamed from: b, reason: collision with root package name */
    private int f129b;
    private int c;
    private int d;
    private float e;
    private int f;
    private er g;

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
        this.f128a = false;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (((d) getChildAt(i5).getLayoutParams()).f132b != null) {
                this.f128a = true;
                return;
            }
        }
    }

    private void a() {
        this.f129b = -1;
        this.c = -1;
        this.d = -1;
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public final void setExpanded(boolean z) {
        boolean H = android.support.v4.view.by.H(this);
        this.f = (H ? 4 : 0) | (z ? 1 : 2);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    private static d a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    public final int getTotalScrollRange() {
        int i;
        if (this.f129b != -1) {
            return this.f129b;
        }
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f131a;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += dVar.bottomMargin + measuredHeight + dVar.topMargin;
            if ((i4 & 2) != 0) {
                i = i2 - android.support.v4.view.by.s(childAt);
                break;
            }
        }
        i = i2;
        int max = Math.max(0, i - getTopInset());
        this.f129b = max;
        return max;
    }

    private int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    private int getDownNestedPreScrollRange() {
        int i;
        if (this.c != -1) {
            return this.c;
        }
        int childCount = getChildCount() - 1;
        int i2 = 0;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = dVar.f131a;
            if ((i3 & 5) == 5) {
                int i4 = dVar.bottomMargin + dVar.topMargin + i2;
                if ((i3 & 8) != 0) {
                    i = i4 + android.support.v4.view.by.s(childAt);
                } else if ((i3 & 2) != 0) {
                    i = i4 + (measuredHeight - android.support.v4.view.by.s(childAt));
                } else {
                    i = i4 + measuredHeight;
                }
            } else {
                if (i2 > 0) {
                    break;
                }
                i = i2;
            }
            childCount--;
            i2 = i;
        }
        int max = Math.max(0, i2 - getTopInset());
        this.c = max;
        return max;
    }

    private int getDownNestedScrollRange() {
        int i;
        if (this.d != -1) {
            return this.d;
        }
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i4 = dVar.f131a;
            if ((i4 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i4 & 2) != 0) {
                i = i2 - (android.support.v4.view.by.s(childAt) + getTopInset());
                break;
            }
        }
        i = i2;
        int max = Math.max(0, i);
        this.d = max;
        return max;
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int b2 = this.g != null ? this.g.b() : 0;
        int s = android.support.v4.view.by.s(this);
        if (s != 0) {
            return (s * 2) + b2;
        }
        int childCount = getChildCount();
        if (childCount > 0) {
            return (android.support.v4.view.by.s(getChildAt(childCount - 1)) * 2) + b2;
        }
        return 0;
    }

    public final void setTargetElevation(float f) {
        this.e = f;
    }

    public final float getTargetElevation() {
        return this.e;
    }

    private int getPendingAction() {
        return this.f;
    }

    private int getTopInset() {
        if (this.g != null) {
            return this.g.b();
        }
        return 0;
    }

    private void setWindowInsets(er erVar) {
        this.f129b = -1;
        this.g = erVar;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            erVar = android.support.v4.view.by.b(getChildAt(i), erVar);
            if (erVar.e()) {
                return;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

}
