package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class ActionMenuView extends cm implements android.support.v7.view.menu.k, android.support.v7.view.menu.z {

    /* renamed from: a, reason: collision with root package name */
    android.support.v7.view.menu.i f610a;

    /* renamed from: b, reason: collision with root package name */
    boolean f611b;
    k c;
    private Context d;
    private int e;
    private android.support.v7.view.menu.y f;
    private android.support.v7.view.menu.j g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private w l;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.cm, android.view.ViewGroup
    public /* synthetic */ cn generateDefaultLayoutParams() {
        return c();
    }

    @Override // android.support.v7.widget.cm, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.cm, android.view.ViewGroup
    public /* synthetic */ cn generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    @Override // android.support.v7.widget.cm, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.j = (int) (56.0f * f);
        this.k = (int) (f * 4.0f);
        this.d = context;
        this.e = 0;
    }

    public void setPopupTheme(int i) {
        if (this.e != i) {
            this.e = i;
            if (i == 0) {
                this.d = getContext();
            } else {
                this.d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.e;
    }

    public void setPresenter(k kVar) {
        this.c = kVar;
        this.c.a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        if (this.c != null) {
            this.c.b(false);
            if (this.c.g()) {
                this.c.d();
                this.c.c();
            }
        }
    }

    public void setOnMenuItemClickListener(w wVar) {
        this.l = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d8  */
    @Override // android.support.v7.widget.cm, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    static int a(View view, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        u uVar = (u) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.b();
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z2 && i5 < 2) {
                i5 = 2;
            }
        }
        if (!uVar.f866a && z2) {
            z = true;
        }
        uVar.d = z;
        uVar.f867b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.cm, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int width;
        int i9;
        if (!this.h) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = 0;
        int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
        boolean z3 = false;
        boolean a2 = gm.a(this);
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                u uVar = (u) childAt.getLayoutParams();
                if (uVar.f866a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (a(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i9 = uVar.leftMargin + getPaddingLeft();
                        width = i9 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - uVar.rightMargin;
                        i9 = width - measuredWidth;
                    }
                    int i13 = i10 - (measuredHeight / 2);
                    childAt.layout(i9, i13, width, measuredHeight + i13);
                    i8 = paddingRight - measuredWidth;
                    z2 = true;
                    i7 = i11;
                } else {
                    int measuredWidth2 = paddingRight - (uVar.rightMargin + (childAt.getMeasuredWidth() + uVar.leftMargin));
                    a(i12);
                    i7 = i11 + 1;
                    boolean z4 = z3;
                    i8 = measuredWidth2;
                    z2 = z4;
                }
            } else {
                z2 = z3;
                i7 = i11;
                i8 = paddingRight;
            }
            i12++;
            i11 = i7;
            paddingRight = i8;
            z3 = z2;
        }
        if (childCount == 1 && !z3) {
            View childAt2 = getChildAt(0);
            int measuredWidth3 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = ((i3 - i) / 2) - (measuredWidth3 / 2);
            int i15 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth3 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (z3 ? 0 : 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            int i17 = 0;
            while (i17 < childCount) {
                View childAt3 = getChildAt(i17);
                u uVar2 = (u) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8 || uVar2.f866a) {
                    i6 = width2;
                } else {
                    int i18 = width2 - uVar2.rightMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth4, i19, i18, measuredHeight3 + i19);
                    i6 = i18 - ((uVar2.leftMargin + measuredWidth4) + max);
                }
                i17++;
                width2 = i6;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        int i20 = 0;
        while (i20 < childCount) {
            View childAt4 = getChildAt(i20);
            u uVar3 = (u) childAt4.getLayoutParams();
            if (childAt4.getVisibility() == 8 || uVar3.f866a) {
                i5 = paddingLeft;
            } else {
                int i21 = paddingLeft + uVar3.leftMargin;
                int measuredWidth5 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth5, measuredHeight4 + i22);
                i5 = uVar3.rightMargin + measuredWidth5 + max + i21;
            }
            i20++;
            paddingLeft = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        k kVar = this.c;
        if (kVar.i != null) {
            kVar.i.setImageDrawable(drawable);
        } else {
            kVar.k = true;
            kVar.j = drawable;
        }
    }

    public Drawable getOverflowIcon() {
        getMenu();
        k kVar = this.c;
        if (kVar.i != null) {
            return kVar.i.getDrawable();
        }
        if (kVar.k) {
            return kVar.j;
        }
        return null;
    }

    public void setOverflowReserved(boolean z) {
        this.f611b = z;
    }

    private static u c() {
        u uVar = new u();
        uVar.h = 16;
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v7.widget.cm, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u generateLayoutParams(AttributeSet attributeSet) {
        return new u(getContext(), attributeSet);
    }

    protected static u a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            u uVar = layoutParams instanceof u ? new u((u) layoutParams) : new u(layoutParams);
            if (uVar.h <= 0) {
                uVar.h = 16;
                return uVar;
            }
            return uVar;
        }
        return c();
    }

    @Override // android.support.v7.widget.cm, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof u);
    }

    public static u a() {
        u c = c();
        c.f866a = true;
        return c;
    }

    @Override // android.support.v7.view.menu.k
    public final boolean a(android.support.v7.view.menu.m mVar) {
        return this.f610a.a(mVar, (android.support.v7.view.menu.x) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.support.v7.view.menu.z
    public final void a(android.support.v7.view.menu.i iVar) {
        this.f610a = iVar;
    }

    public Menu getMenu() {
        byte b2 = 0;
        if (this.f610a == null) {
            Context context = getContext();
            this.f610a = new android.support.v7.view.menu.i(context);
            this.f610a.a(new v(this, b2));
            this.c = new k(context);
            this.c.b();
            this.c.f = this.f != null ? this.f : new t(this, (byte) 0);
            this.f610a.a(this.c, this.d);
            this.c.a(this);
        }
        return this.f610a;
    }

    public final void a(android.support.v7.view.menu.y yVar, android.support.v7.view.menu.j jVar) {
        this.f = yVar;
        this.g = jVar;
    }

    public final void b() {
        if (this.c != null) {
            this.c.e();
        }
    }

    private boolean a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof s)) {
            z = ((s) childAt).d() | false;
        }
        return (i <= 0 || !(childAt2 instanceof s)) ? z : ((s) childAt2).c() | z;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.c.n = z;
    }
}
