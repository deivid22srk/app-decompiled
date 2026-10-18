package android.support.v4.widget;

import com.deivid22srk.store.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements android.support.v4.view.bi, android.support.v4.view.bk, android.support.v4.view.bs {
    private static final ap v = new ap();
    private static final int[] w = {android.R.attr.fillViewport};
    private aq A;

    /* renamed from: a, reason: collision with root package name */
    private long f410a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f411b;
    private bc c;
    private ad d;
    private ad e;
    private int f;
    private boolean g;
    private boolean h;
    private View i;
    private boolean j;
    private VelocityTracker k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private final int[] r;
    private final int[] s;
    private int t;
    private SavedState u;
    private final android.support.v4.view.bl x;
    private final android.support.v4.view.bj y;
    private float z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f411b = new Rect();
        this.g = true;
        this.h = false;
        this.i = null;
        this.j = false;
        this.m = true;
        this.q = -1;
        this.r = new int[2];
        this.s = new int[2];
        this.c = bc.a(getContext(), null);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.n = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.x = new android.support.v4.view.bl(this);
        this.y = new android.support.v4.view.bj(this);
        setNestedScrollingEnabled(true);
        android.support.v4.view.by.a(this, v);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.y.a(z);
    }

    @Override // android.view.View, android.support.v4.view.bi
    public boolean isNestedScrollingEnabled() {
        return this.y.f351a;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.y.a(i);
    }

    @Override // android.view.View, android.support.v4.view.bi
    public void stopNestedScroll() {
        this.y.b();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.y.a();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.y.a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.y.a(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.y.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.y.a(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.x.f353a = i;
        startNestedScroll(2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onStopNestedScroll(View view) {
        this.x.f353a = 0;
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        e((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.x.f353a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * getHeight());
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(aq aqVar) {
        this.A = aqVar;
    }

    public void setFillViewport(boolean z) {
        if (z != this.l) {
            this.l = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.m = z;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.A != null) {
            this.A.a(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.l && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public final boolean a(KeyEvent keyEvent) {
        boolean z;
        this.f411b.setEmpty();
        View childAt = getChildAt(0);
        if (childAt != null) {
            z = getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        } else {
            z = false;
        }
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 19:
                if (!keyEvent.isAltPressed()) {
                    return c(33);
                }
                return b(33);
            case 20:
                if (!keyEvent.isAltPressed()) {
                    return c(130);
                }
                return b(130);
            case 62:
                int i = keyEvent.isShiftPressed() ? 33 : 130;
                boolean z2 = i == 130;
                int height = getHeight();
                if (z2) {
                    this.f411b.top = getScrollY() + height;
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View childAt2 = getChildAt(childCount - 1);
                        if (this.f411b.top + height > childAt2.getBottom()) {
                            this.f411b.top = childAt2.getBottom() - height;
                        }
                    }
                } else {
                    this.f411b.top = getScrollY() - height;
                    if (this.f411b.top < 0) {
                        this.f411b.top = 0;
                    }
                }
                this.f411b.bottom = height + this.f411b.top;
                a(i, this.f411b.top, this.f411b.bottom);
                return false;
            default:
                return false;
        }
    }

    private void a() {
        if (this.k == null) {
            this.k = VelocityTracker.obtain();
        }
    }

    private void b() {
        if (this.k != null) {
            this.k.recycle();
            this.k = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            b();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 2 && this.j) {
            return true;
        }
        switch (action & 255) {
            case 0:
                int y = (int) motionEvent.getY();
                int x = (int) motionEvent.getX();
                if (getChildCount() > 0) {
                    int scrollY = getScrollY();
                    View childAt = getChildAt(0);
                    z = y >= childAt.getTop() - scrollY && y < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight();
                } else {
                    z = false;
                }
                if (!z) {
                    this.j = false;
                    b();
                    break;
                } else {
                    this.f = y;
                    this.q = android.support.v4.view.bc.b(motionEvent, 0);
                    if (this.k == null) {
                        this.k = VelocityTracker.obtain();
                    } else {
                        this.k.clear();
                    }
                    this.k.addMovement(motionEvent);
                    this.c.g();
                    this.j = this.c.a() ? false : true;
                    startNestedScroll(2);
                    break;
                }
                break;
            case 1:
            case 3:
                this.j = false;
                this.q = -1;
                b();
                if (this.c.a(getScrollX(), getScrollY(), getScrollRange())) {
                    android.support.v4.view.by.d(this);
                }
                stopNestedScroll();
                break;
            case 2:
                int i = this.q;
                if (i != -1) {
                    int a2 = android.support.v4.view.bc.a(motionEvent, i);
                    if (a2 == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + i + " in onInterceptTouchEvent");
                        break;
                    } else {
                        int d = (int) android.support.v4.view.bc.d(motionEvent, a2);
                        if (Math.abs(d - this.f) > this.n && (getNestedScrollAxes() & 2) == 0) {
                            this.j = true;
                            this.f = d;
                            a();
                            this.k.addMovement(motionEvent);
                            this.t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        return this.j;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        ViewParent parent;
        a();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int a2 = android.support.v4.view.bc.a(motionEvent);
        if (a2 == 0) {
            this.t = 0;
        }
        obtain.offsetLocation(0.0f, this.t);
        switch (a2) {
            case 0:
                if (getChildCount() == 0) {
                    return false;
                }
                boolean z = !this.c.a();
                this.j = z;
                if (z && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                if (!this.c.a()) {
                    this.c.h();
                }
                this.f = (int) motionEvent.getY();
                this.q = android.support.v4.view.bc.b(motionEvent, 0);
                startNestedScroll(2);
                break;
            case 1:
                if (this.j) {
                    VelocityTracker velocityTracker = this.k;
                    velocityTracker.computeCurrentVelocity(1000, this.p);
                    int b2 = (int) android.support.v4.view.bu.b(velocityTracker, this.q);
                    if (Math.abs(b2) > this.o) {
                        e(-b2);
                    } else if (this.c.a(getScrollX(), getScrollY(), getScrollRange())) {
                        android.support.v4.view.by.d(this);
                    }
                }
                this.q = -1;
                c();
                break;
            case 2:
                int a3 = android.support.v4.view.bc.a(motionEvent, this.q);
                if (a3 == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.q + " in onTouchEvent");
                    break;
                } else {
                    int d = (int) android.support.v4.view.bc.d(motionEvent, a3);
                    int i2 = this.f - d;
                    if (dispatchNestedPreScroll(0, i2, this.s, this.r)) {
                        i2 -= this.s[1];
                        obtain.offsetLocation(0.0f, this.r[1]);
                        this.t += this.r[1];
                    }
                    if (this.j || Math.abs(i2) <= this.n) {
                        i = i2;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.j = true;
                        if (i2 > 0) {
                            i = i2 - this.n;
                        } else {
                            i = i2 + this.n;
                        }
                    }
                    if (this.j) {
                        this.f = d - this.r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int a4 = android.support.v4.view.by.a((View) this);
                        boolean z2 = a4 == 0 || (a4 == 1 && scrollRange > 0);
                        if (a(0, i, 0, getScrollY(), scrollRange) && !hasNestedScrollingParent()) {
                            this.k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (dispatchNestedScroll(0, scrollY2, 0, i - scrollY2, this.r)) {
                            this.f -= this.r[1];
                            obtain.offsetLocation(0.0f, this.r[1]);
                            this.t += this.r[1];
                            break;
                        } else if (z2) {
                            d();
                            int i3 = scrollY + i;
                            if (i3 < 0) {
                                this.d.a(i / getHeight(), android.support.v4.view.bc.c(motionEvent, a3) / getWidth());
                                if (!this.e.a()) {
                                    this.e.c();
                                }
                            } else if (i3 > scrollRange) {
                                this.e.a(i / getHeight(), 1.0f - (android.support.v4.view.bc.c(motionEvent, a3) / getWidth()));
                                if (!this.d.a()) {
                                    this.d.c();
                                }
                            }
                            if (this.d != null && (!this.d.a() || !this.e.a())) {
                                android.support.v4.view.by.d(this);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                if (this.j && getChildCount() > 0 && this.c.a(getScrollX(), getScrollY(), getScrollRange())) {
                    android.support.v4.view.by.d(this);
                }
                this.q = -1;
                c();
                break;
            case 5:
                int b3 = android.support.v4.view.bc.b(motionEvent);
                this.f = (int) android.support.v4.view.bc.d(motionEvent, b3);
                this.q = android.support.v4.view.bc.b(motionEvent, b3);
                break;
            case 6:
                a(motionEvent);
                this.f = (int) android.support.v4.view.bc.d(motionEvent, android.support.v4.view.bc.a(motionEvent, this.q));
                break;
        }
        if (this.k != null) {
            this.k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    private void a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (android.support.v4.view.bc.b(motionEvent, action) == this.q) {
            int i = action == 0 ? 1 : 0;
            this.f = (int) android.support.v4.view.bc.d(motionEvent, i);
            this.q = android.support.v4.view.bc.b(motionEvent, i);
            if (this.k != null) {
                this.k.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((android.support.v4.view.bc.d(motionEvent) & 2) == 0) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 8:
                if (!this.j) {
                    float e = android.support.v4.view.bc.e(motionEvent, 9);
                    if (e != 0.0f) {
                        int verticalScrollFactorCompat = (int) (e * getVerticalScrollFactorCompat());
                        int scrollRange = getScrollRange();
                        int scrollY = getScrollY();
                        int i = scrollY - verticalScrollFactorCompat;
                        if (i < 0) {
                            scrollRange = 0;
                        } else if (i <= scrollRange) {
                            scrollRange = i;
                        }
                        if (scrollRange != scrollY) {
                            super.scrollTo(getScrollX(), scrollRange);
                            break;
                        }
                    }
                }
                break;
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.z;
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    private boolean a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        boolean z2;
        android.support.v4.view.by.a((View) this);
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i7 = i3 + i;
        int i8 = i4 + i2;
        int i9 = i5 + 0;
        if (i7 > 0) {
            z = true;
            i6 = 0;
        } else if (i7 < 0) {
            z = true;
            i6 = 0;
        } else {
            i6 = i7;
            z = false;
        }
        if (i8 > i9) {
            i8 = i9;
            z2 = true;
        } else if (i8 < 0) {
            z2 = true;
            i8 = 0;
        } else {
            z2 = false;
        }
        if (z2) {
            this.c.a(i6, i8, getScrollRange());
        }
        onOverScrolled(i6, i8, z, z2);
        return z || z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    private boolean b(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.f411b.top = 0;
        this.f411b.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f411b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            this.f411b.top = this.f411b.bottom - height;
        }
        return a(i, this.f411b.top, this.f411b.bottom);
    }

    private boolean a(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        View view;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        boolean z3 = i == 33;
        ArrayList focusables = getFocusables(2);
        View view2 = null;
        boolean z4 = false;
        int size = focusables.size();
        int i5 = 0;
        while (i5 < size) {
            View view3 = (View) focusables.get(i5);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z5 = i2 < top && bottom < i3;
                if (view2 == null) {
                    boolean z6 = z5;
                    view = view3;
                    z2 = z6;
                } else {
                    boolean z7 = (z3 && top < view2.getTop()) || (!z3 && bottom > view2.getBottom());
                    if (z4) {
                        if (z5 && z7) {
                            view = view3;
                            z2 = z4;
                        }
                    } else if (z5) {
                        view = view3;
                        z2 = true;
                    } else if (z7) {
                        view = view3;
                        z2 = z4;
                    }
                }
                i5++;
                view2 = view;
                z4 = z2;
            }
            z2 = z4;
            view = view2;
            i5++;
            view2 = view;
            z4 = z2;
        }
        if (view2 == null) {
            view2 = this;
        }
        if (i2 >= scrollY && i3 <= i4) {
            z = false;
        } else {
            d(z3 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (view2 != findFocus()) {
            view2.requestFocus(i);
        }
        return z;
    }

    private boolean c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && a(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f411b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f411b);
            d(a(this.f411b));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < maxScrollAmount) {
                    maxScrollAmount = bottom - scrollY;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            d(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private boolean a(View view) {
        return !a(view, 0, getHeight());
    }

    private boolean a(View view, int i, int i2) {
        view.getDrawingRect(this.f411b);
        offsetDescendantRectToMyCoords(view, this.f411b);
        return this.f411b.bottom + i >= getScrollY() && this.f411b.top - i <= getScrollY() + i2;
    }

    private void d(int i) {
        if (i != 0) {
            if (this.m) {
                a(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private void a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f410a > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                int max2 = Math.max(0, Math.min(scrollY + i2, max)) - scrollY;
                bc bcVar = this.c;
                bcVar.f437b.a(bcVar.f436a, getScrollX(), scrollY, max2);
                android.support.v4.view.by.d(this);
            } else {
                if (!this.c.a()) {
                    this.c.h();
                }
                scrollBy(i, i2);
            }
            this.f410a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void a(int i) {
        a(0 - getScrollX(), i - getScrollY());
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.c.g()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int b2 = this.c.b();
            int c = this.c.c();
            if (scrollX != b2 || scrollY != c) {
                int scrollRange = getScrollRange();
                int a2 = android.support.v4.view.by.a((View) this);
                boolean z = a2 == 0 || (a2 == 1 && scrollRange > 0);
                a(b2 - scrollX, c - scrollY, scrollX, scrollY, scrollRange);
                if (z) {
                    d();
                    if (c <= 0 && scrollY > 0) {
                        this.d.a((int) this.c.f());
                    } else if (c >= scrollRange && scrollY < scrollRange) {
                        this.e.a((int) this.c.f());
                    }
                }
            }
        }
    }

    private void b(View view) {
        view.getDrawingRect(this.f411b);
        offsetDescendantRectToMyCoords(view, this.f411b);
        int a2 = a(this.f411b);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    private int a(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i4 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = (rect.top - scrollY) + 0;
            } else {
                i3 = (rect.bottom - i4) + 0;
            }
            i = Math.min(i3, getChildAt(0).getBottom() - i4);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            i = 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i4 - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            i = Math.max(i2, -getScrollY());
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.g) {
            b(view2);
        } else {
            this.i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a2 = a(rect);
        boolean z2 = a2 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a2);
            } else {
                a(0, a2);
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.g = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.g = false;
        if (this.i != null && a(this.i, this)) {
            b(this.i);
        }
        this.i = null;
        if (!this.h) {
            if (this.u != null) {
                scrollTo(getScrollX(), this.u.f412a);
                this.u = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.h = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f411b);
            offsetDescendantRectToMyCoords(findFocus, this.f411b);
            d(a(this.f411b));
        }
    }

    private static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    private void e(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        if (!dispatchNestedPreFling(0.0f, i)) {
            dispatchNestedFling(0.0f, i, z);
            if (!z || getChildCount() <= 0) {
                return;
            }
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            int height2 = getChildAt(0).getHeight();
            bc bcVar = this.c;
            bcVar.f437b.b(bcVar.f436a, getScrollX(), getScrollY(), i, Math.max(0, height2 - height), height / 2);
            android.support.v4.view.by.d(this);
        }
    }

    private void c() {
        this.j = false;
        b();
        stopNestedScroll();
        if (this.d != null) {
            this.d.c();
            this.e.c();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int b2 = b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b3 = b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b2 != getScrollX() || b3 != getScrollY()) {
                super.scrollTo(b2, b3);
            }
        }
    }

    private void d() {
        if (android.support.v4.view.by.a((View) this) != 2) {
            if (this.d == null) {
                Context context = getContext();
                this.d = new ad(context);
                this.e = new ad(context);
                return;
            }
            return;
        }
        this.d = null;
        this.e = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.d != null) {
            int scrollY = getScrollY();
            if (!this.d.a()) {
                int save = canvas.save();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), Math.min(0, scrollY));
                this.d.a(width, getHeight());
                if (this.d.a(canvas)) {
                    android.support.v4.view.by.d(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.e.a()) {
                int save2 = canvas.save();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((-width2) + getPaddingLeft(), Math.max(getScrollRange(), scrollY) + height);
                canvas.rotate(180.0f, width2, 0.0f);
                this.e.a(width2, height);
                if (this.e.a(canvas)) {
                    android.support.v4.view.by.d(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    private static int b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.u = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f412a = getScrollY();
        return savedState;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new ar();

        /* renamed from: a, reason: collision with root package name */
        public int f412a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f412a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f412a);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f412a + "}";
        }
    }
}
