package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements android.support.v4.view.bk, br {

    /* renamed from: b, reason: collision with root package name */
    static final int[] f608b = {android.support.v7.b.b.actionBarSize, R.attr.windowContentOverlay};
    private final Runnable A;
    private final android.support.v4.view.bl B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f609a;
    private int c;
    private int d;
    private ContentFrameLayout e;
    private ActionBarContainer f;
    private bs g;
    private Drawable h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private i u;
    private final int v;
    private android.support.v4.widget.bc w;
    private android.support.v4.view.dy x;
    private final android.support.v4.view.eo y;
    private final Runnable z;

    static /* synthetic */ boolean a(ActionBarOverlayLayout actionBarOverlayLayout) {
        actionBarOverlayLayout.l = false;
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.v = 600;
        this.y = new f(this);
        this.z = new g(this);
        this.A = new h(this);
        a(context);
        this.B = new android.support.v4.view.bl(this);
    }

    private void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f608b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.h = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.h == null);
        obtainStyledAttributes.recycle();
        this.i = context.getApplicationInfo().targetSdkVersion < 19;
        this.w = android.support.v4.widget.bc.a(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    public void setActionBarVisibilityCallback(i iVar) {
        this.u = iVar;
        if (getWindowToken() != null) {
            this.u.c(this.d);
            if (this.n != 0) {
                onWindowSystemUiVisibilityChanged(this.n);
                android.support.v4.view.by.x(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f609a = z;
        this.i = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.j = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        android.support.v4.view.by.x(this);
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        h();
        int i2 = this.n ^ i;
        this.n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        if (this.u != null) {
            this.u.e(z2 ? false : true);
            if (z || !z2) {
                this.u.k();
            } else {
                this.u.l();
            }
        }
        if ((i2 & 256) != 0 && this.u != null) {
            android.support.v4.view.by.x(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.d = i;
        if (this.u != null) {
            this.u.c(i);
        }
    }

    private static boolean a(View view, Rect rect, boolean z) {
        boolean z2 = false;
        j jVar = (j) view.getLayoutParams();
        if (jVar.leftMargin != rect.left) {
            jVar.leftMargin = rect.left;
            z2 = true;
        }
        if (jVar.topMargin != rect.top) {
            jVar.topMargin = rect.top;
            z2 = true;
        }
        if (jVar.rightMargin != rect.right) {
            jVar.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || jVar.bottomMargin == rect.bottom) {
            return z2;
        }
        jVar.bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        h();
        android.support.v4.view.by.w(this);
        boolean a2 = a(this.f, rect, false);
        this.r.set(rect);
        gm.a(this, this.r, this.o);
        if (!this.p.equals(this.o)) {
            this.p.set(this.o);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new j(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof j;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        h();
        measureChildWithMargins(this.f, i, 0, i2, 0);
        j jVar = (j) this.f.getLayoutParams();
        int max = Math.max(0, this.f.getMeasuredWidth() + jVar.leftMargin + jVar.rightMargin);
        int max2 = Math.max(0, jVar.bottomMargin + this.f.getMeasuredHeight() + jVar.topMargin);
        int a2 = gm.a(0, android.support.v4.view.by.l(this.f));
        boolean z = (android.support.v4.view.by.w(this) & 256) != 0;
        if (z) {
            measuredHeight = this.c;
            if (this.j && this.f.getTabContainer() != null) {
                measuredHeight += this.c;
            }
        } else {
            measuredHeight = this.f.getVisibility() != 8 ? this.f.getMeasuredHeight() : 0;
        }
        this.q.set(this.o);
        this.s.set(this.r);
        if (!this.f609a && !z) {
            Rect rect = this.q;
            rect.top = measuredHeight + rect.top;
            this.q.bottom += 0;
        } else {
            Rect rect2 = this.s;
            rect2.top = measuredHeight + rect2.top;
            this.s.bottom += 0;
        }
        a(this.e, this.q, true);
        if (!this.t.equals(this.s)) {
            this.t.set(this.s);
            this.e.a(this.s);
        }
        measureChildWithMargins(this.e, i, 0, i2, 0);
        j jVar2 = (j) this.e.getLayoutParams();
        int max3 = Math.max(max, this.e.getMeasuredWidth() + jVar2.leftMargin + jVar2.rightMargin);
        int max4 = Math.max(max2, jVar2.bottomMargin + this.e.getMeasuredHeight() + jVar2.topMargin);
        int a3 = gm.a(a2, android.support.v4.view.by.l(this.e));
        setMeasuredDimension(android.support.v4.view.by.a(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, a3), android.support.v4.view.by.a(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, a3 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                j jVar = (j) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = jVar.leftMargin + paddingLeft;
                int i7 = jVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.h != null && !this.i) {
            int bottom = this.f.getVisibility() == 0 ? (int) (this.f.getBottom() + android.support.v4.view.by.q(this.f) + 0.5f) : 0;
            this.h.setBounds(0, bottom, getWidth(), this.h.getIntrinsicHeight() + bottom);
            this.h.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f.getVisibility() != 0) {
            return false;
        }
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.B.f353a = i;
        this.m = getActionBarHideOffset();
        i();
        if (this.u != null) {
            this.u.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.m += i2;
        setActionBarHideOffset(this.m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onStopNestedScroll(View view) {
        if (this.k && !this.l) {
            if (this.m <= this.f.getHeight()) {
                i();
                postDelayed(this.z, 600L);
            } else {
                i();
                postDelayed(this.A, 600L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.k || !z) {
            return false;
        }
        this.w.a(0, (int) f2, 0, 0);
        if (this.w.e() > this.f.getHeight()) {
            i();
            this.A.run();
        } else {
            i();
            this.z.run();
        }
        this.l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.f353a;
    }

    private void h() {
        bs wrapper;
        if (this.e == null) {
            this.e = (ContentFrameLayout) findViewById(android.support.v7.b.g.action_bar_activity_content);
            this.f = (ActionBarContainer) findViewById(android.support.v7.b.g.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(android.support.v7.b.g.action_bar);
            if (findViewById instanceof bs) {
                wrapper = (bs) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.g = wrapper;
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.k) {
            this.k = z;
            if (!z) {
                i();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        if (this.f != null) {
            return -((int) android.support.v4.view.by.q(this.f));
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        i();
        android.support.v4.view.by.b(this.f, -Math.max(0, Math.min(i, this.f.getHeight())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        removeCallbacks(this.z);
        removeCallbacks(this.A);
        if (this.x != null) {
            this.x.a();
        }
    }

    @Override // android.support.v7.widget.br
    public void setWindowCallback(Window.Callback callback) {
        h();
        this.g.a(callback);
    }

    @Override // android.support.v7.widget.br
    public void setWindowTitle(CharSequence charSequence) {
        h();
        this.g.a(charSequence);
    }

    public CharSequence getTitle() {
        h();
        return this.g.e();
    }

    @Override // android.support.v7.widget.br
    public final void a(int i) {
        h();
        switch (i) {
            case 2:
                this.g.f();
                break;
            case 5:
                this.g.g();
                break;
            case 109:
                setOverlayMode(true);
                break;
        }
    }

    public void setUiOptions(int i) {
    }

    public void setIcon(int i) {
        h();
        this.g.a(i);
    }

    public void setIcon(Drawable drawable) {
        h();
        this.g.a(drawable);
    }

    public void setLogo(int i) {
        h();
        this.g.b(i);
    }

    @Override // android.support.v7.widget.br
    public final boolean a() {
        h();
        return this.g.h();
    }

    @Override // android.support.v7.widget.br
    public final boolean b() {
        h();
        return this.g.i();
    }

    @Override // android.support.v7.widget.br
    public final boolean c() {
        h();
        return this.g.j();
    }

    @Override // android.support.v7.widget.br
    public final boolean d() {
        h();
        return this.g.k();
    }

    @Override // android.support.v7.widget.br
    public final boolean e() {
        h();
        return this.g.l();
    }

    @Override // android.support.v7.widget.br
    public final void f() {
        h();
        this.g.m();
    }

    @Override // android.support.v7.widget.br
    public final void a(Menu menu, android.support.v7.view.menu.y yVar) {
        h();
        this.g.a(menu, yVar);
    }

    @Override // android.support.v7.widget.br
    public final void g() {
        h();
        this.g.n();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new j();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new j(getContext(), attributeSet);
    }
}
