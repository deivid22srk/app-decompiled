package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements android.support.v4.view.bi, android.support.v4.view.bk {
    private static final String d = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] y = {R.attr.enabled};
    private int A;
    private float B;
    private ak C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    private float I;
    private boolean J;
    private int K;
    private int L;
    private boolean M;
    private Animation.AnimationListener N;
    private final Animation O;
    private final Animation P;

    /* renamed from: a, reason: collision with root package name */
    public boolean f413a;

    /* renamed from: b, reason: collision with root package name */
    protected int f414b;
    protected int c;
    private View e;
    private bp f;
    private int g;
    private float h;
    private float i;
    private final android.support.v4.view.bl j;
    private final android.support.v4.view.bj k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private float r;
    private float s;
    private boolean t;
    private int u;
    private boolean v;
    private boolean w;
    private final DecelerateInterpolator x;
    private d z;

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.z.clearAnimation();
        this.C.stop();
        this.z.setVisibility(8);
        setColorViewAlpha(255);
        if (this.v) {
            setAnimationProgress(0.0f);
        } else {
            a(this.c - this.p, true);
        }
        this.p = this.z.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    private void setColorViewAlpha(int i) {
        this.z.getBackground().setAlpha(i);
        this.C.setAlpha(i);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.K = i2;
                this.L = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.K = i3;
                this.L = i3;
            }
            this.z.setImageDrawable(null);
            this.C.a(i);
            this.z.setImageDrawable(this.C);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f413a = false;
        this.h = -1.0f;
        this.l = new int[2];
        this.m = new int[2];
        this.q = false;
        this.u = -1;
        this.A = -1;
        this.N = new bh(this);
        this.O = new bm(this);
        this.P = new bn(this);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.o = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.x = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.K = (int) (displayMetrics.density * 40.0f);
        this.L = (int) (displayMetrics.density * 40.0f);
        this.z = new d(getContext());
        this.C = new ak(getContext(), this);
        this.C.b(-328966);
        this.z.setImageDrawable(this.C);
        this.z.setVisibility(8);
        addView(this.z);
        android.support.v4.view.by.a((ViewGroup) this);
        this.I = displayMetrics.density * 64.0f;
        this.h = this.I;
        this.j = new android.support.v4.view.bl(this);
        this.k = new android.support.v4.view.bj(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.A >= 0) {
            if (i2 == i - 1) {
                return this.A;
            }
            if (i2 >= this.A) {
                return i2 + 1;
            }
            return i2;
        }
        return i2;
    }

    public void setOnRefreshListener(bp bpVar) {
        this.f = bpVar;
    }

    private static boolean b() {
        return Build.VERSION.SDK_INT < 11;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.f413a != z) {
            this.f413a = z;
            if (!this.M) {
                i = (int) (this.I + this.c);
            } else {
                i = (int) this.I;
            }
            a(i - this.p, true);
            this.J = false;
            Animation.AnimationListener animationListener = this.N;
            this.z.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 11) {
                this.C.setAlpha(255);
            }
            this.D = new bi(this);
            this.D.setDuration(this.o);
            if (animationListener != null) {
                this.z.f452a = animationListener;
            }
            this.z.clearAnimation();
            this.z.startAnimation(this.D);
            return;
        }
        a(z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimationProgress(float f) {
        if (b()) {
            setColorViewAlpha((int) (255.0f * f));
        } else {
            android.support.v4.view.by.d(this.z, f);
            android.support.v4.view.by.e(this.z, f);
        }
    }

    private void a(boolean z, boolean z2) {
        if (this.f413a != z) {
            this.J = z2;
            c();
            this.f413a = z;
            if (this.f413a) {
                int i = this.p;
                Animation.AnimationListener animationListener = this.N;
                this.f414b = i;
                this.O.reset();
                this.O.setDuration(200L);
                this.O.setInterpolator(this.x);
                if (animationListener != null) {
                    this.z.f452a = animationListener;
                }
                this.z.clearAnimation();
                this.z.startAnimation(this.O);
                return;
            }
            a(this.N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Animation.AnimationListener animationListener) {
        this.E = new bj(this);
        this.E.setDuration(150L);
        this.z.f452a = animationListener;
        this.z.clearAnimation();
        this.z.startAnimation(this.E);
    }

    private Animation a(int i, int i2) {
        if (this.v && b()) {
            return null;
        }
        bk bkVar = new bk(this, i, i2);
        bkVar.setDuration(300L);
        this.z.f452a = null;
        this.z.clearAnimation();
        this.z.startAnimation(bkVar);
        return bkVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.z.setBackgroundColor(i);
        this.C.b(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        c();
        ak akVar = this.C;
        akVar.f421a.a(iArr);
        akVar.f421a.a(0);
    }

    private void c() {
        if (this.e == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.z)) {
                    this.e = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.h = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.e == null) {
                c();
            }
            if (this.e != null) {
                View view = this.e;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.z.getMeasuredWidth();
                this.z.layout((measuredWidth / 2) - (measuredWidth2 / 2), this.p, (measuredWidth / 2) + (measuredWidth2 / 2), this.p + this.z.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.e == null) {
            c();
        }
        if (this.e != null) {
            this.e.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.z.measure(View.MeasureSpec.makeMeasureSpec(this.K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.L, 1073741824));
            if (!this.M && !this.q) {
                this.q = true;
                int i3 = -this.z.getMeasuredHeight();
                this.c = i3;
                this.p = i3;
            }
            this.A = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.z) {
                    this.A = i4;
                    return;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        if (this.z != null) {
            return this.z.getMeasuredHeight();
        }
        return 0;
    }

    private boolean d() {
        if (Build.VERSION.SDK_INT < 14) {
            if (!(this.e instanceof AbsListView)) {
                return android.support.v4.view.by.b(this.e, -1) || this.e.getScrollY() > 0;
            }
            AbsListView absListView = (AbsListView) this.e;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
        return android.support.v4.view.by.b(this.e, -1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c();
        int a2 = android.support.v4.view.bc.a(motionEvent);
        if (this.w && a2 == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || d() || this.f413a || this.n) {
            return false;
        }
        switch (a2) {
            case 0:
                a(this.c - this.z.getTop(), true);
                this.u = android.support.v4.view.bc.b(motionEvent, 0);
                this.t = false;
                float a3 = a(motionEvent, this.u);
                if (a3 == -1.0f) {
                    return false;
                }
                this.s = a3;
                break;
            case 1:
            case 3:
                this.t = false;
                this.u = -1;
                break;
            case 2:
                if (this.u == -1) {
                    Log.e(d, "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                float a4 = a(motionEvent, this.u);
                if (a4 == -1.0f) {
                    return false;
                }
                if (a4 - this.s > this.g && !this.t) {
                    this.r = this.s + this.g;
                    this.t = true;
                    this.C.setAlpha(76);
                    break;
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        return this.t;
    }

    private static float a(MotionEvent motionEvent, int i) {
        int a2 = android.support.v4.view.bc.a(motionEvent, i);
        if (a2 < 0) {
            return -1.0f;
        }
        return android.support.v4.view.bc.d(motionEvent, a2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.e instanceof AbsListView)) {
            if (this.e == null || android.support.v4.view.by.F(this.e)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || !d() || this.w || this.f413a || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.j.f353a = i;
        startNestedScroll(i & 2);
        this.i = 0.0f;
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.i > 0.0f) {
            if (i2 > this.i) {
                iArr[1] = i2 - ((int) this.i);
                this.i = 0.0f;
            } else {
                this.i -= i2;
                iArr[1] = i2;
            }
            a(this.i);
        }
        if (this.M && i2 > 0 && this.i == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.z.setVisibility(8);
        }
        int[] iArr2 = this.l;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr2[1] + iArr[1];
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.j.f353a;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onStopNestedScroll(View view) {
        this.j.f353a = 0;
        this.n = false;
        if (this.i > 0.0f) {
            b(this.i);
            this.i = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.m);
        if (this.m[1] + i4 < 0) {
            this.i = Math.abs(r0) + this.i;
            a(this.i);
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.k.a(z);
    }

    @Override // android.view.View, android.support.v4.view.bi
    public boolean isNestedScrollingEnabled() {
        return this.k.f351a;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.k.a(i);
    }

    @Override // android.view.View, android.support.v4.view.bi
    public void stopNestedScroll() {
        this.k.b();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.k.a();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.k.a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.k.a(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.k.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.k.a(f, f2);
    }

    private static boolean a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void a(float f) {
        this.C.a(true);
        float min = Math.min(1.0f, Math.abs(f / this.h));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.h;
        float f2 = this.M ? this.I - this.c : this.I;
        float max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2);
        float pow = ((float) ((max2 / 4.0f) - Math.pow(max2 / 4.0f, 2.0d))) * 2.0f;
        int i = ((int) ((f2 * min) + (f2 * pow * 2.0f))) + this.c;
        if (this.z.getVisibility() != 0) {
            this.z.setVisibility(0);
        }
        if (!this.v) {
            android.support.v4.view.by.d((View) this.z, 1.0f);
            android.support.v4.view.by.e(this.z, 1.0f);
        }
        if (this.v) {
            setAnimationProgress(Math.min(1.0f, f / this.h));
        }
        if (f < this.h) {
            if (this.C.getAlpha() > 76 && !a(this.F)) {
                this.F = a(this.C.getAlpha(), 76);
            }
        } else if (this.C.getAlpha() < 255 && !a(this.G)) {
            this.G = a(this.C.getAlpha(), 255);
        }
        this.C.b(Math.min(0.8f, max * 0.8f));
        this.C.a(Math.min(1.0f, max));
        this.C.f421a.c(((-0.25f) + (max * 0.4f) + (pow * 2.0f)) * 0.5f);
        a(i - this.p, true);
    }

    private void b(float f) {
        if (f > this.h) {
            a(true, true);
            return;
        }
        this.f413a = false;
        this.C.b(0.0f);
        bl blVar = null;
        if (!this.v) {
            blVar = new bl(this);
        }
        int i = this.p;
        if (!this.v) {
            this.f414b = i;
            this.P.reset();
            this.P.setDuration(200L);
            this.P.setInterpolator(this.x);
            if (blVar != null) {
                this.z.f452a = blVar;
            }
            this.z.clearAnimation();
            this.z.startAnimation(this.P);
        } else {
            this.f414b = i;
            if (b()) {
                this.B = this.C.getAlpha();
            } else {
                this.B = android.support.v4.view.by.u(this.z);
            }
            this.H = new bo(this);
            this.H.setDuration(150L);
            if (blVar != null) {
                this.z.f452a = blVar;
            }
            this.z.clearAnimation();
            this.z.startAnimation(this.H);
        }
        this.C.a(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a2 = android.support.v4.view.bc.a(motionEvent);
        if (this.w && a2 == 0) {
            this.w = false;
        }
        if (!isEnabled() || this.w || d() || this.n) {
            return false;
        }
        switch (a2) {
            case 0:
                this.u = android.support.v4.view.bc.b(motionEvent, 0);
                this.t = false;
                return true;
            case 1:
                int a3 = android.support.v4.view.bc.a(motionEvent, this.u);
                if (a3 < 0) {
                    Log.e(d, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                float d2 = (android.support.v4.view.bc.d(motionEvent, a3) - this.r) * 0.5f;
                this.t = false;
                b(d2);
                this.u = -1;
                return false;
            case 2:
                int a4 = android.support.v4.view.bc.a(motionEvent, this.u);
                if (a4 < 0) {
                    Log.e(d, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float d3 = (android.support.v4.view.bc.d(motionEvent, a4) - this.r) * 0.5f;
                if (this.t) {
                    if (d3 <= 0.0f) {
                        return false;
                    }
                    a(d3);
                }
                return true;
            case 3:
                return false;
            case 4:
            default:
                return true;
            case 5:
                int b2 = android.support.v4.view.bc.b(motionEvent);
                if (b2 < 0) {
                    Log.e(d, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.u = android.support.v4.view.bc.b(motionEvent, b2);
                return true;
            case 6:
                a(motionEvent);
                return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        this.z.bringToFront();
        this.z.offsetTopAndBottom(i);
        this.p = this.z.getTop();
        if (z && Build.VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    private void a(MotionEvent motionEvent) {
        int b2 = android.support.v4.view.bc.b(motionEvent);
        if (android.support.v4.view.bc.b(motionEvent, b2) == this.u) {
            this.u = android.support.v4.view.bc.b(motionEvent, b2 == 0 ? 1 : 0);
        }
    }
}
