package android.support.v4.view;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private float I;
    private float J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private android.support.v4.widget.ad R;
    private android.support.v4.widget.ad S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;

    /* renamed from: a, reason: collision with root package name */
    public Scroller f311a;
    private List<dl> aa;
    private dl ab;
    private dl ac;
    private dk ad;
    private dm ae;
    private Method af;
    private int ag;
    private ArrayList<View> ah;
    private final Runnable aj;
    private int ak;
    private int c;
    private final ArrayList<dh> f;
    private final dh g;
    private final Rect h;
    private bn i;
    private int j;
    private int k;
    private Parcelable l;
    private ClassLoader m;
    private boolean n;
    private dn o;
    private int p;
    private Drawable q;
    private int r;
    private int s;
    private float t;
    private float u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f310b = {R.attr.layout_gravity};
    private static final Comparator<dh> d = new dd();
    private static final Interpolator e = new de();
    private static final dp ai = new dp();

    public ViewPager(Context context) {
        super(context);
        this.f = new ArrayList<>();
        this.g = new dh();
        this.h = new Rect();
        this.k = -1;
        this.l = null;
        this.m = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.T = true;
        this.U = false;
        this.aj = new df(this);
        this.ak = 0;
        f();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new ArrayList<>();
        this.g = new dh();
        this.h = new Rect();
        this.k = -1;
        this.l = null;
        this.m = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.A = 1;
        this.K = -1;
        this.T = true;
        this.U = false;
        this.aj = new df(this);
        this.ak = 0;
        f();
    }

    private void f() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f311a = new Scroller(context, e);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.F = cq.a(viewConfiguration);
        this.M = (int) (400.0f * f);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.R = new android.support.v4.widget.ad(context);
        this.S = new android.support.v4.widget.ad(context);
        this.O = (int) (25.0f * f);
        this.P = (int) (2.0f * f);
        this.D = (int) (16.0f * f);
        by.a(this, new dj(this));
        if (by.e(this) == 0) {
            by.c((View) this, 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.aj);
        if (this.f311a != null && !this.f311a.isFinished()) {
            this.f311a.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.ak != i) {
            this.ak = i;
            if (this.ae != null) {
                boolean z = i != 0;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    by.a(getChildAt(i2), z ? 2 : 0, (Paint) null);
                }
            }
            if (this.ab != null) {
                this.ab.b(i);
            }
            if (this.aa != null) {
                int size = this.aa.size();
                for (int i3 = 0; i3 < size; i3++) {
                    dl dlVar = this.aa.get(i3);
                    if (dlVar != null) {
                        dlVar.b(i);
                    }
                }
            }
            if (this.ac == null) {
                return;
            }
            this.ac.b(i);
        }
    }

    public void setAdapter(bn bnVar) {
        if (this.i != null) {
            this.i.a((DataSetObserver) null);
            for (int i = 0; i < this.f.size(); i++) {
                dh dhVar = this.f.get(i);
                this.i.a((ViewGroup) this, dhVar.f372b, dhVar.f371a);
            }
            this.i.b();
            this.f.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((di) getChildAt(i2).getLayoutParams()).f373a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.j = 0;
            scrollTo(0, 0);
        }
        this.i = bnVar;
        this.c = 0;
        if (this.i != null) {
            if (this.o == null) {
                this.o = new dn(this, (byte) 0);
            }
            this.i.a((DataSetObserver) this.o);
            this.z = false;
            boolean z = this.T;
            this.T = true;
            this.c = this.i.a();
            if (this.k >= 0) {
                a(this.k, false, true);
                this.k = -1;
                this.l = null;
                this.m = null;
                return;
            }
            if (!z) {
                ac_();
            } else {
                requestLayout();
            }
        }
    }

    public bn getAdapter() {
        return this.i;
    }

    void setOnAdapterChangeListener(dk dkVar) {
        this.ad = dkVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.z = false;
        a(i, !this.T, false);
    }

    public void a(int i, boolean z) {
        this.z = false;
        a(i, z, false);
    }

    public int getCurrentItem() {
        return this.j;
    }

    private void a(int i, boolean z, boolean z2) {
        a(i, z, z2, 0);
    }

    private void a(int i, boolean z, boolean z2, int i2) {
        if (this.i == null || this.i.a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.j == i && this.f.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.i.a()) {
            i = this.i.a() - 1;
        }
        int i3 = this.A;
        if (i > this.j + i3 || i < this.j - i3) {
            for (int i4 = 0; i4 < this.f.size(); i4++) {
                this.f.get(i4).c = true;
            }
        }
        boolean z3 = this.j != i;
        if (this.T) {
            this.j = i;
            if (z3) {
                d(i);
            }
            requestLayout();
            return;
        }
        a(i);
        a(i, z, i2, z3);
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int i3;
        int scrollX;
        int abs;
        dh b2 = b(i);
        if (b2 == null) {
            i3 = 0;
        } else {
            i3 = (int) (getClientWidth() * Math.max(this.t, Math.min(b2.e, this.u)));
        }
        if (!z) {
            if (z2) {
                d(i);
            }
            a(false);
            scrollTo(i3, 0);
            c(i3);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if ((this.f311a == null || this.f311a.isFinished()) ? false : true) {
                int currX = this.n ? this.f311a.getCurrX() : this.f311a.getStartX();
                this.f311a.abortAnimation();
                setScrollingCacheEnabled(false);
                scrollX = currX;
            } else {
                scrollX = getScrollX();
            }
            int scrollY = getScrollY();
            int i4 = i3 - scrollX;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                a(false);
                ac_();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float sin = (i6 * ((float) Math.sin((float) ((Math.min(1.0f, (1.0f * Math.abs(i4)) / clientWidth) - 0.5f) * 0.4712389167638204d)))) + i6;
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    abs = Math.round(1000.0f * Math.abs(sin / abs2)) * 4;
                } else {
                    abs = (int) (((Math.abs(i4) / ((clientWidth * this.i.b(this.j)) + this.p)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.n = false;
                this.f311a.startScroll(scrollX, scrollY, i4, i5, min);
                by.d(this);
            }
        }
        if (z2) {
            d(i);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(dl dlVar) {
        this.ab = dlVar;
    }

    public final void setPageTransformer$382b7817(dm dmVar) {
        if (Build.VERSION.SDK_INT >= 11) {
            boolean z = true != (this.ae != null);
            this.ae = dmVar;
            setChildrenDrawingOrderEnabledCompat(true);
            this.ag = 2;
            if (z) {
                ac_();
            }
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.af == null) {
                try {
                    this.af = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e2) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e2);
                }
            }
            try {
                this.af.invoke(this, Boolean.valueOf(z));
            } catch (Exception e3) {
                Log.e("ViewPager", "Error changing children drawing order", e3);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((di) this.ah.get(i2).getLayoutParams()).f;
    }

    public int getOffscreenPageLimit() {
        return this.A;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.A) {
            this.A = i;
            ac_();
        }
    }

    public void setPageMargin(int i) {
        this.p = i;
        int width = getWidth();
        b(width, width);
        requestLayout();
    }

    public int getPageMargin() {
        return this.p;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    private dh a(int i, int i2) {
        dh dhVar = new dh();
        dhVar.f372b = i;
        dhVar.f371a = this.i.a((ViewGroup) this, i);
        dhVar.d = this.i.b(i);
        if (i2 < 0 || i2 >= this.f.size()) {
            this.f.add(dhVar);
        } else {
            this.f.add(i2, dhVar);
        }
        return dhVar;
    }

    final void a() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int a2 = this.i.a();
        this.c = a2;
        boolean z3 = this.f.size() < (this.A * 2) + 1 && this.f.size() < a2;
        boolean z4 = false;
        int i3 = this.j;
        boolean z5 = z3;
        int i4 = 0;
        while (i4 < this.f.size()) {
            dh dhVar = this.f.get(i4);
            int b2 = this.i.b(dhVar.f371a);
            if (b2 != -1) {
                if (b2 == -2) {
                    this.f.remove(i4);
                    int i5 = i4 - 1;
                    if (!z4) {
                        z4 = true;
                    }
                    this.i.a((ViewGroup) this, dhVar.f372b, dhVar.f371a);
                    if (this.j == dhVar.f372b) {
                        i = i5;
                        z = z4;
                        i2 = Math.max(0, Math.min(this.j, a2 - 1));
                        z2 = true;
                    } else {
                        i = i5;
                        z = z4;
                        i2 = i3;
                        z2 = true;
                    }
                } else if (dhVar.f372b != b2) {
                    if (dhVar.f372b == this.j) {
                        i3 = b2;
                    }
                    dhVar.f372b = b2;
                    i = i4;
                    z = z4;
                    i2 = i3;
                    z2 = true;
                }
                z5 = z2;
                i3 = i2;
                z4 = z;
                i4 = i + 1;
            }
            i = i4;
            z = z4;
            i2 = i3;
            z2 = z5;
            z5 = z2;
            i3 = i2;
            z4 = z;
            i4 = i + 1;
        }
        if (z4) {
            this.i.b();
        }
        Collections.sort(this.f, d);
        if (z5) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                di diVar = (di) getChildAt(i6).getLayoutParams();
                if (!diVar.f373a) {
                    diVar.c = 0.0f;
                }
            }
            a(i3, false, true);
            requestLayout();
        }
    }

    final void ac_() {
        a(this.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (r2.f372b == r17.j) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r18) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    private void g() {
        if (this.ag != 0) {
            if (this.ah == null) {
                this.ah = new ArrayList<>();
            } else {
                this.ah.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ah.add(getChildAt(i));
            }
            Collections.sort(this.ah, ai);
        }
    }

    private void a(dh dhVar, int i, dh dhVar2) {
        dh dhVar3;
        dh dhVar4;
        int a2 = this.i.a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.p / clientWidth : 0.0f;
        if (dhVar2 != null) {
            int i2 = dhVar2.f372b;
            if (i2 < dhVar.f372b) {
                int i3 = i2 + 1;
                float f2 = dhVar2.e + dhVar2.d + f;
                int i4 = 0;
                while (true) {
                    int i5 = i3;
                    if (i5 > dhVar.f372b || i4 >= this.f.size()) {
                        break;
                    }
                    dh dhVar5 = this.f.get(i4);
                    while (true) {
                        dhVar4 = dhVar5;
                        if (i5 <= dhVar4.f372b || i4 >= this.f.size() - 1) {
                            break;
                        }
                        i4++;
                        dhVar5 = this.f.get(i4);
                    }
                    float f3 = f2;
                    int i6 = i5;
                    while (i6 < dhVar4.f372b) {
                        float b2 = this.i.b(i6) + f + f3;
                        i6++;
                        f3 = b2;
                    }
                    dhVar4.e = f3;
                    float f4 = f3 + dhVar4.d + f;
                    i3 = i6 + 1;
                    f2 = f4;
                }
            } else if (i2 > dhVar.f372b) {
                int size = this.f.size() - 1;
                float f5 = dhVar2.e;
                int i7 = i2 - 1;
                int i8 = size;
                while (true) {
                    float f6 = f5;
                    int i9 = i7;
                    if (i9 < dhVar.f372b || i8 < 0) {
                        break;
                    }
                    dh dhVar6 = this.f.get(i8);
                    while (true) {
                        dhVar3 = dhVar6;
                        if (i9 >= dhVar3.f372b || i8 <= 0) {
                            break;
                        }
                        i8--;
                        dhVar6 = this.f.get(i8);
                    }
                    float f7 = f6;
                    int i10 = i9;
                    while (i10 > dhVar3.f372b) {
                        float b3 = f7 - (this.i.b(i10) + f);
                        i10--;
                        f7 = b3;
                    }
                    f5 = f7 - (dhVar3.d + f);
                    dhVar3.e = f5;
                    i7 = i10 - 1;
                }
            }
        }
        int size2 = this.f.size();
        float f8 = dhVar.e;
        int i11 = dhVar.f372b - 1;
        this.t = dhVar.f372b == 0 ? dhVar.e : -3.4028235E38f;
        this.u = dhVar.f372b == a2 + (-1) ? (dhVar.e + dhVar.d) - 1.0f : Float.MAX_VALUE;
        for (int i12 = i - 1; i12 >= 0; i12--) {
            dh dhVar7 = this.f.get(i12);
            float f9 = f8;
            while (i11 > dhVar7.f372b) {
                f9 -= this.i.b(i11) + f;
                i11--;
            }
            f8 = f9 - (dhVar7.d + f);
            dhVar7.e = f8;
            if (dhVar7.f372b == 0) {
                this.t = f8;
            }
            i11--;
        }
        float f10 = dhVar.e + dhVar.d + f;
        int i13 = dhVar.f372b + 1;
        for (int i14 = i + 1; i14 < size2; i14++) {
            dh dhVar8 = this.f.get(i14);
            float f11 = f10;
            while (i13 < dhVar8.f372b) {
                f11 = this.i.b(i13) + f + f11;
                i13++;
            }
            if (dhVar8.f372b == a2 - 1) {
                this.u = (dhVar8.d + f11) - 1.0f;
            }
            dhVar8.e = f11;
            f10 = f11 + dhVar8.d + f;
            i13++;
        }
        this.U = false;
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = android.support.v4.os.b.a(new Cdo());

        /* renamed from: a, reason: collision with root package name */
        int f312a;

        /* renamed from: b, reason: collision with root package name */
        Parcelable f313b;
        ClassLoader c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f312a);
            parcel.writeParcelable(this.f313b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f312a + "}";
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f312a = parcel.readInt();
            this.f313b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f312a = this.j;
        if (this.i != null) {
            savedState.f313b = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.i != null) {
            Parcelable parcelable2 = savedState.f313b;
            ClassLoader classLoader = savedState.c;
            a(savedState.f312a, false, true);
        } else {
            this.k = savedState.f312a;
            this.l = savedState.f313b;
            this.m = savedState.c;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        di diVar = (di) generateLayoutParams;
        diVar.f373a |= view instanceof dg;
        if (this.x) {
            if (diVar != null && diVar.f373a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            diVar.d = true;
            addViewInLayout(view, i, generateLayoutParams);
            return;
        }
        super.addView(view, i, generateLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final dh a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f.size()) {
                dh dhVar = this.f.get(i2);
                if (!this.i.a(view, dhVar.f371a)) {
                    i = i2 + 1;
                } else {
                    return dhVar;
                }
            } else {
                return null;
            }
        }
    }

    private dh b(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return a(view);
            }
        }
        return null;
    }

    private dh b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.f.size()) {
                dh dhVar = this.f.get(i3);
                if (dhVar.f372b != i) {
                    i2 = i3 + 1;
                } else {
                    return dhVar;
                }
            } else {
                return null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            b(i, i3);
        }
    }

    private void b(int i, int i2) {
        if (i2 > 0 && !this.f.isEmpty()) {
            a(this.j, false, 0, false);
            return;
        }
        dh b2 = b(this.j);
        int min = (int) ((b2 != null ? Math.min(b2.e, this.u) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            a(false);
            scrollTo(min, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        dh a2;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i3 - i;
        int i11 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                di diVar = (di) childAt.getLayoutParams();
                if (diVar.f373a) {
                    int i14 = diVar.f374b & 7;
                    int i15 = diVar.f374b & 112;
                    switch (i14) {
                        case 1:
                            i7 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            i7 = paddingLeft;
                            break;
                        case 3:
                            i7 = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (i10 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            i7 = measuredWidth;
                            break;
                    }
                    switch (i15) {
                        case 16:
                            measuredHeight = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i16 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i16;
                            break;
                        case 48:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i17 = paddingTop;
                            i9 = paddingBottom;
                            i8 = measuredHeight2;
                            measuredHeight = i17;
                            break;
                        case 80:
                            measuredHeight = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i8 = paddingTop;
                            i9 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i18 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i18;
                            break;
                    }
                    int i19 = i7 + scrollX;
                    childAt.layout(i19, measuredHeight, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + measuredHeight);
                    i5 = i12 + 1;
                    i6 = i8;
                    paddingBottom = i9;
                    i13++;
                    paddingLeft = paddingLeft;
                    paddingRight = paddingRight;
                    paddingTop = i6;
                    i12 = i5;
                }
            }
            i5 = i12;
            i6 = paddingTop;
            i13++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i6;
            i12 = i5;
        }
        int i20 = (i10 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                di diVar2 = (di) childAt2.getLayoutParams();
                if (!diVar2.f373a && (a2 = a(childAt2)) != null) {
                    int i22 = ((int) (a2.e * i20)) + paddingLeft;
                    if (diVar2.d) {
                        diVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (diVar2.c * i20), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.r = paddingTop;
        this.s = i11 - paddingBottom;
        this.W = i12;
        if (this.T) {
            a(this.j, false, 0, false);
        }
        this.T = false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.n = true;
        if (!this.f311a.isFinished() && this.f311a.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f311a.getCurrX();
            int currY = this.f311a.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!c(currX)) {
                    this.f311a.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            by.d(this);
            return;
        }
        a(true);
    }

    private boolean c(int i) {
        if (this.f.size() == 0) {
            this.V = false;
            a(0, 0.0f, 0);
            if (this.V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        dh j = j();
        int clientWidth = getClientWidth();
        int i2 = this.p + clientWidth;
        int i3 = j.f372b;
        float f = ((i / clientWidth) - j.e) / (j.d + (this.p / clientWidth));
        this.V = false;
        a(i3, f, (int) (i2 * f));
        if (!this.V) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    private void a(int i, float f, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        if (this.W > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                di diVar = (di) childAt.getLayoutParams();
                if (diVar.f373a) {
                    switch (diVar.f374b & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i6 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i6;
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            int i7 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i7;
                            break;
                        case 3:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i8 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i8;
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                } else {
                    int i9 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i9;
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        if (this.ab != null) {
            this.ab.a(i, f, i2);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i11 = 0; i11 < size; i11++) {
                dl dlVar = this.aa.get(i11);
                if (dlVar != null) {
                    dlVar.a(i, f, i2);
                }
            }
        }
        if (this.ac != null) {
            this.ac.a(i, f, i2);
        }
        if (this.ae != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = getChildAt(i12);
                if (!((di) childAt2.getLayoutParams()).f373a) {
                    this.ae.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.V = true;
    }

    private void d(int i) {
        if (this.ab != null) {
            this.ab.a_(i);
        }
        if (this.aa != null) {
            int size = this.aa.size();
            for (int i2 = 0; i2 < size; i2++) {
                dl dlVar = this.aa.get(i2);
                if (dlVar != null) {
                    dlVar.a_(i);
                }
            }
        }
        if (this.ac != null) {
            this.ac.a_(i);
        }
    }

    private void a(boolean z) {
        boolean z2 = this.ak == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f311a.isFinished()) {
                this.f311a.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f311a.getCurrX();
                int currY = this.f311a.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        c(currX);
                    }
                }
            }
        }
        this.z = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f.size(); i++) {
            dh dhVar = this.f.get(i);
            if (dhVar.c) {
                dhVar.c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                by.a(this, this.aj);
            } else {
                this.aj.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            h();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.I = x;
                this.G = x;
                float y = motionEvent.getY();
                this.J = y;
                this.H = y;
                this.K = bc.b(motionEvent, 0);
                this.C = false;
                this.n = true;
                this.f311a.computeScrollOffset();
                if (this.ak == 2 && Math.abs(this.f311a.getFinalX() - this.f311a.getCurrX()) > this.P) {
                    this.f311a.abortAnimation();
                    this.z = false;
                    ac_();
                    this.B = true;
                    i();
                    setScrollState(1);
                    break;
                } else {
                    a(false);
                    this.B = false;
                    break;
                }
                break;
            case 2:
                int i = this.K;
                if (i != -1) {
                    int a2 = bc.a(motionEvent, i);
                    float c = bc.c(motionEvent, a2);
                    float f = c - this.G;
                    float abs = Math.abs(f);
                    float d2 = bc.d(motionEvent, a2);
                    float abs2 = Math.abs(d2 - this.J);
                    if (f != 0.0f) {
                        float f2 = this.G;
                        if (!((f2 < ((float) this.E) && f > 0.0f) || (f2 > ((float) (getWidth() - this.E)) && f < 0.0f)) && a(this, false, (int) f, (int) c, (int) d2)) {
                            this.G = c;
                            this.H = d2;
                            this.C = true;
                            return false;
                        }
                    }
                    if (abs > this.F && 0.5f * abs > abs2) {
                        this.B = true;
                        i();
                        setScrollState(1);
                        this.G = f > 0.0f ? this.I + this.F : this.I - this.F;
                        this.H = d2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > this.F) {
                        this.C = true;
                    }
                    if (this.B && a(c)) {
                        by.d(this);
                        break;
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        return this.B;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z = false;
        if (this.Q) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.i == null || this.i.a() == 0) {
            return false;
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f311a.abortAnimation();
                this.z = false;
                ac_();
                float x = motionEvent.getX();
                this.I = x;
                this.G = x;
                float y = motionEvent.getY();
                this.J = y;
                this.H = y;
                this.K = bc.b(motionEvent, 0);
                break;
            case 1:
                if (this.B) {
                    VelocityTracker velocityTracker = this.L;
                    velocityTracker.computeCurrentVelocity(1000, this.N);
                    int a2 = (int) bu.a(velocityTracker, this.K);
                    this.z = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    dh j = j();
                    int i2 = j.f372b;
                    float f = ((scrollX / clientWidth) - j.e) / j.d;
                    if (Math.abs((int) (bc.c(motionEvent, bc.a(motionEvent, this.K)) - this.I)) > this.O && Math.abs(a2) > this.M) {
                        if (a2 <= 0) {
                            i2++;
                        }
                        i = i2;
                    } else {
                        i = (int) (i2 + f + (i2 >= this.j ? 0.4f : 0.6f));
                    }
                    if (this.f.size() > 0) {
                        i = Math.max(this.f.get(0).f372b, Math.min(i, this.f.get(this.f.size() - 1).f372b));
                    }
                    a(i, true, true, a2);
                    z = h();
                    break;
                }
                break;
            case 2:
                if (!this.B) {
                    int a3 = bc.a(motionEvent, this.K);
                    if (a3 == -1) {
                        z = h();
                        break;
                    } else {
                        float c = bc.c(motionEvent, a3);
                        float abs = Math.abs(c - this.G);
                        float d2 = bc.d(motionEvent, a3);
                        float abs2 = Math.abs(d2 - this.H);
                        if (abs > this.F && abs > abs2) {
                            this.B = true;
                            i();
                            this.G = c - this.I > 0.0f ? this.I + this.F : this.I - this.F;
                            this.H = d2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.B) {
                    z = a(bc.c(motionEvent, bc.a(motionEvent, this.K))) | false;
                    break;
                }
                break;
            case 3:
                if (this.B) {
                    a(this.j, true, 0, false);
                    z = h();
                    break;
                }
                break;
            case 5:
                int b2 = bc.b(motionEvent);
                this.G = bc.c(motionEvent, b2);
                this.K = bc.b(motionEvent, b2);
                break;
            case 6:
                a(motionEvent);
                this.G = bc.c(motionEvent, bc.a(motionEvent, this.K));
                break;
        }
        if (z) {
            by.d(this);
        }
        return true;
    }

    private boolean h() {
        this.K = -1;
        this.B = false;
        this.C = false;
        if (this.L != null) {
            this.L.recycle();
            this.L = null;
        }
        return this.R.c() | this.S.c();
    }

    private void i() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private boolean a(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        float f3 = this.G - f;
        this.G = f;
        float scrollX = getScrollX() + f3;
        int clientWidth = getClientWidth();
        float f4 = clientWidth * this.t;
        float f5 = clientWidth * this.u;
        dh dhVar = this.f.get(0);
        dh dhVar2 = this.f.get(this.f.size() - 1);
        if (dhVar.f372b != 0) {
            f4 = dhVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (dhVar2.f372b != this.i.a() - 1) {
            f2 = dhVar2.e * clientWidth;
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                r2 = this.R.a(Math.abs(f4 - scrollX) / clientWidth);
            }
        } else if (scrollX > f2) {
            r2 = z2 ? this.S.a(Math.abs(scrollX - f2) / clientWidth) : false;
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.G += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        c((int) f4);
        return r2;
    }

    private dh j() {
        int i;
        dh dhVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.p / clientWidth : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        dh dhVar2 = null;
        while (i3 < this.f.size()) {
            dh dhVar3 = this.f.get(i3);
            if (z || dhVar3.f372b == i2 + 1) {
                i = i3;
                dhVar = dhVar3;
            } else {
                dh dhVar4 = this.g;
                dhVar4.e = f2 + f3 + f;
                dhVar4.f372b = i2 + 1;
                dhVar4.d = this.i.b(dhVar4.f372b);
                i = i3 - 1;
                dhVar = dhVar4;
            }
            float f4 = dhVar.e;
            float f5 = dhVar.d + f4 + f;
            if (!z && scrollX < f4) {
                return dhVar2;
            }
            if (scrollX < f5 || i == this.f.size() - 1) {
                return dhVar;
            }
            f3 = f4;
            i2 = dhVar.f372b;
            z = false;
            f2 = dhVar.d;
            dhVar2 = dhVar;
            i3 = i + 1;
        }
        return dhVar2;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int a2 = by.a((View) this);
        if (a2 == 0 || (a2 == 1 && this.i != null && this.i.a() > 1)) {
            if (!this.R.a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.t * width);
                this.R.a(height, width);
                z = this.R.a(canvas) | false;
                canvas.restoreToCount(save);
            }
            if (!this.S.a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.u + 1.0f)) * width2);
                this.S.a(height2, width2);
                z |= this.S.a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.R.b();
            this.S.b();
        }
        if (z) {
            by.d(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.p > 0 && this.q != null && this.f.size() > 0 && this.i != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = this.p / width;
            dh dhVar = this.f.get(0);
            float f3 = dhVar.e;
            int size = this.f.size();
            int i = dhVar.f372b;
            int i2 = this.f.get(size - 1).f372b;
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                while (i4 > dhVar.f372b && i3 < size) {
                    i3++;
                    dhVar = this.f.get(i3);
                }
                if (i4 == dhVar.f372b) {
                    f = (dhVar.e + dhVar.d) * width;
                    f3 = dhVar.e + dhVar.d + f2;
                } else {
                    float b2 = this.i.b(i4);
                    f = (f3 + b2) * width;
                    f3 += b2 + f2;
                }
                if (this.p + f > scrollX) {
                    this.q.setBounds((int) f, this.r, (int) (this.p + f + 0.5f), this.s);
                    this.q.draw(canvas);
                }
                if (f > scrollX + width) {
                    return;
                }
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int b2 = bc.b(motionEvent);
        if (bc.b(motionEvent, b2) == this.K) {
            int i = b2 == 0 ? 1 : 0;
            this.G = bc.c(motionEvent, i);
            this.K = bc.b(motionEvent, i);
            if (this.L != null) {
                this.L.clear();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.y != z) {
            this.y = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.t)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.u));
    }

    private boolean a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && by.a(view, -i);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            r1 = 1
            r0 = 0
            boolean r2 = super.dispatchKeyEvent(r5)
            if (r2 != 0) goto L18
            int r2 = r5.getAction()
            if (r2 != 0) goto L15
            int r2 = r5.getKeyCode()
            switch(r2) {
                case 21: goto L1a;
                case 22: goto L21;
                case 61: goto L28;
                default: goto L15;
            }
        L15:
            r2 = r0
        L16:
            if (r2 == 0) goto L19
        L18:
            r0 = r1
        L19:
            return r0
        L1a:
            r2 = 17
            boolean r2 = r4.e(r2)
            goto L16
        L21:
            r2 = 66
            boolean r2 = r4.e(r2)
            goto L16
        L28:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r2 < r3) goto L15
            boolean r2 = android.support.v4.view.z.b(r5)
            if (r2 == 0) goto L3a
            r2 = 2
            boolean r2 = r4.e(r2)
            goto L16
        L3a:
            boolean r2 = android.support.v4.view.z.a(r5)
            if (r2 == 0) goto L15
            boolean r2 = r4.e(r1)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        if (r10 != 2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(int r10) {
        /*
            r9 = this;
            r1 = 0
            r8 = 66
            r7 = 17
            r4 = 1
            r3 = 0
            android.view.View r2 = r9.findFocus()
            if (r2 != r9) goto L3e
            r0 = r1
        Le:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r9, r0, r10)
            if (r1 == 0) goto Lbc
            if (r1 == r0) goto Lbc
            if (r10 != r7) goto La0
            android.graphics.Rect r2 = r9.h
            android.graphics.Rect r2 = r9.a(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r9.h
            android.graphics.Rect r3 = r9.a(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L9b
            if (r2 < r3) goto L9b
            boolean r0 = r9.c()
        L34:
            if (r0 == 0) goto L3d
            int r1 = android.view.SoundEffectConstants.getContantForFocusDirection(r10)
            r9.playSoundEffect(r1)
        L3d:
            return r0
        L3e:
            if (r2 == 0) goto Ld4
            android.view.ViewParent r0 = r2.getParent()
        L44:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto Ld7
            if (r0 != r9) goto L7b
            r0 = r4
        L4b:
            if (r0 != 0) goto Ld4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5.append(r0)
            android.view.ViewParent r0 = r2.getParent()
        L61:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L80
            java.lang.String r2 = " => "
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r2.append(r6)
            android.view.ViewParent r0 = r0.getParent()
            goto L61
        L7b:
            android.view.ViewParent r0 = r0.getParent()
            goto L44
        L80:
            java.lang.String r0 = "ViewPager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "arrowScroll tried to find focus based on non-child current focused view "
            r2.<init>(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r0, r2)
            r0 = r1
            goto Le
        L9b:
            boolean r0 = r1.requestFocus()
            goto L34
        La0:
            if (r10 != r8) goto Ld1
            android.graphics.Rect r2 = r9.h
            android.graphics.Rect r2 = r9.a(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r9.h
            android.graphics.Rect r3 = r9.a(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lb6
            if (r2 <= r3) goto Lcb
        Lb6:
            boolean r0 = r1.requestFocus()
            goto L34
        Lbc:
            if (r10 == r7) goto Lc0
            if (r10 != r4) goto Lc6
        Lc0:
            boolean r0 = r9.c()
            goto L34
        Lc6:
            if (r10 == r8) goto Lcb
            r0 = 2
            if (r10 != r0) goto Ld1
        Lcb:
            boolean r0 = r9.d()
            goto L34
        Ld1:
            r0 = r3
            goto L34
        Ld4:
            r0 = r2
            goto Le
        Ld7:
            r0 = r3
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.e(int):boolean");
    }

    private Rect a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    public boolean c() {
        if (this.j <= 0) {
            return false;
        }
        a(this.j - 1, true);
        return true;
    }

    public boolean d() {
        if (this.i == null || this.j >= this.i.a() - 1) {
            return false;
        }
        a(this.j + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        dh a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f372b == this.j) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        dh a2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f372b == this.j) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        dh a2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f372b == this.j && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        dh a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f372b == this.j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new di();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof di) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new di(getContext(), attributeSet);
    }
}
