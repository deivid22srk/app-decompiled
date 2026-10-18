package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements android.support.v4.view.bi, android.support.v4.view.bs {
    private static final Interpolator ao;
    private static final boolean q;
    private static final Class<?>[] r;
    private final ArrayList<ee> A;
    private ee B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private final boolean J;
    private final AccessibilityManager K;
    private List<Object> L;
    private int M;
    private int N;
    private int O;
    private VelocityTracker P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private final int V;
    private final int W;

    /* renamed from: a, reason: collision with root package name */
    final eh f627a;
    private float aa;
    private final ep ab;
    private ef ac;
    private List<ef> ad;
    private dy ae;
    private boolean af;
    private er ag;
    private dw ah;
    private final int[] ai;
    private final android.support.v4.view.bj aj;
    private final int[] ak;
    private final int[] al;
    private final int[] am;
    private Runnable an;
    private final gk ap;

    /* renamed from: b, reason: collision with root package name */
    af f628b;
    public bn c;
    final gi d;
    public ec e;
    boolean f;
    public boolean g;
    boolean h;
    android.support.v4.widget.ad i;
    android.support.v4.widget.ad j;
    android.support.v4.widget.ad k;
    android.support.v4.widget.ad l;
    dx m;
    final en n;
    boolean o;
    boolean p;
    private final ej s;
    private SavedState t;
    private boolean u;
    private final Runnable v;
    private final Rect w;
    private dt x;
    private ei y;
    private final ArrayList<eb> z;

    static /* synthetic */ boolean c(RecyclerView recyclerView) {
        recyclerView.F = true;
        return true;
    }

    static /* synthetic */ boolean e(RecyclerView recyclerView) {
        recyclerView.af = false;
        return false;
    }

    static /* synthetic */ boolean s(RecyclerView recyclerView) {
        recyclerView.I = true;
        return true;
    }

    static {
        q = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        r = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        ao = new dp();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        byte b2 = 0;
        this.s = new ej(this, b2);
        this.f627a = new eh(this);
        this.d = new gi();
        this.v = new dn(this);
        this.w = new Rect();
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.E = 0;
        this.h = false;
        this.M = 0;
        this.m = new bt();
        this.N = 0;
        this.O = -1;
        this.aa = Float.MIN_VALUE;
        this.ab = new ep(this);
        this.n = new en();
        this.o = false;
        this.p = false;
        this.ae = new ea(this, b2);
        this.af = false;
        this.ai = new int[2];
        this.ak = new int[2];
        this.al = new int[2];
        this.am = new int[2];
        this.an = new Cdo(this);
        this.ap = new dq(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        this.J = Build.VERSION.SDK_INT >= 16;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.U = viewConfiguration.getScaledTouchSlop();
        this.V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.W = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(android.support.v4.view.by.a((View) this) == 2);
        this.m.h = this.ae;
        this.f628b = new af(new ds(this));
        this.c = new bn(new dr(this));
        if (android.support.v4.view.by.e(this) == 0) {
            android.support.v4.view.by.c((View) this, 1);
        }
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new er(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.d.b.RecyclerView, i, 0);
            String string = obtainStyledAttributes.getString(android.support.v7.d.b.RecyclerView_layoutManager);
            obtainStyledAttributes.recycle();
            if (string != null) {
                String trim = string.trim();
                if (trim.length() != 0) {
                    if (trim.charAt(0) == '.') {
                        str = context.getPackageName() + trim;
                    } else {
                        str = trim.contains(".") ? trim : RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = classLoader.loadClass(str).asSubclass(ec.class);
                        try {
                            Constructor constructor2 = asSubclass.getConstructor(r);
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                            constructor = constructor2;
                        } catch (NoSuchMethodException e) {
                            try {
                                constructor = asSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e2) {
                                e2.initCause(e);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((ec) constructor.newInstance(objArr));
                    } catch (ClassCastException e3) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                    } catch (ClassNotFoundException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                    } catch (IllegalAccessException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                    } catch (InstantiationException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                    } catch (InvocationTargetException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                    }
                }
            }
        }
        this.aj = new android.support.v4.view.bj(this);
        setNestedScrollingEnabled(true);
    }

    public er getCompatAccessibilityDelegate() {
        return this.ag;
    }

    public void setAccessibilityDelegateCompat(er erVar) {
        this.ag = erVar;
        android.support.v4.view.by.a(this, this.ag);
    }

    public void setHasFixedSize(boolean z) {
        this.D = z;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.u) {
            l();
        }
        this.u = z;
        super.setClipToPadding(z);
        if (this.f) {
            requestLayout();
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.U = android.support.v4.view.cq.a(viewConfiguration);
                return;
            default:
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        this.U = viewConfiguration.getScaledTouchSlop();
    }

    public void setAdapter(dt dtVar) {
        setLayoutFrozen(false);
        if (this.x != null) {
            this.x.b(this.s);
        }
        if (this.m != null) {
            this.m.d();
        }
        if (this.e != null) {
            this.e.b(this.f627a);
            this.e.a(this.f627a);
        }
        this.f627a.a();
        this.f628b.a();
        dt dtVar2 = this.x;
        this.x = dtVar;
        if (dtVar != null) {
            dtVar.a(this.s);
        }
        eh ehVar = this.f627a;
        dt dtVar3 = this.x;
        ehVar.a();
        eg c = ehVar.c();
        if (dtVar2 != null) {
            c.b();
        }
        if (c.c == 0) {
            c.f783a.clear();
        }
        if (dtVar3 != null) {
            c.a();
        }
        this.n.f = true;
        z();
        requestLayout();
    }

    public dt getAdapter() {
        return this.x;
    }

    public void setRecyclerListener(ei eiVar) {
        this.y = eiVar;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.e != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public void setLayoutManager(ec ecVar) {
        if (ecVar != this.e) {
            b();
            if (this.e != null) {
                if (this.C) {
                    this.e.b(this, this.f627a);
                }
                this.e.b((RecyclerView) null);
            }
            this.f627a.a();
            bn bnVar = this.c;
            bo boVar = bnVar.f707b;
            while (true) {
                boVar.f708a = 0L;
                if (boVar.f709b == null) {
                    break;
                } else {
                    boVar = boVar.f709b;
                }
            }
            for (int size = bnVar.c.size() - 1; size >= 0; size--) {
                bnVar.f706a.d(bnVar.c.get(size));
                bnVar.c.remove(size);
            }
            bnVar.f706a.b();
            this.e = ecVar;
            if (ecVar != null) {
                if (ecVar.q != null) {
                    throw new IllegalArgumentException("LayoutManager " + ecVar + " is already attached to a RecyclerView: " + ecVar.q);
                }
                this.e.b(this);
                if (this.C) {
                    this.e.s = true;
                }
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.t != null) {
            SavedState.a(savedState, this.t);
        } else if (this.e != null) {
            savedState.f629a = this.e.h();
        } else {
            savedState.f629a = null;
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        this.t = (SavedState) parcelable;
        super.onRestoreInstanceState(this.t.getSuperState());
        if (this.e != null && this.t.f629a != null) {
            this.e.a(this.t.f629a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void a(eq eqVar) {
        View view = eqVar.f795a;
        boolean z = view.getParent() == this;
        this.f627a.b(a(view));
        if (eqVar.n()) {
            this.c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (z) {
            bn bnVar = this.c;
            int a2 = bnVar.f706a.a(view);
            if (a2 < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            bnVar.f707b.a(a2);
            bnVar.a(view);
            return;
        }
        this.c.a(view, -1, true);
    }

    public ec getLayoutManager() {
        return this.e;
    }

    public eg getRecycledViewPool() {
        return this.f627a.c();
    }

    public void setRecycledViewPool(eg egVar) {
        eh ehVar = this.f627a;
        if (ehVar.f != null) {
            ehVar.f.b();
        }
        ehVar.f = egVar;
        if (egVar == null) {
            return;
        }
        eg egVar2 = ehVar.f;
        ehVar.h.getAdapter();
        egVar2.a();
    }

    public void setViewCacheExtension(eo eoVar) {
        this.f627a.g = eoVar;
    }

    public void setItemViewCacheSize(int i) {
        eh ehVar = this.f627a;
        ehVar.e = i;
        for (int size = ehVar.c.size() - 1; size >= 0 && ehVar.c.size() > i; size--) {
            ehVar.c(size);
        }
    }

    public int getScrollState() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (i != this.N) {
            this.N = i;
            if (i != 2) {
                k();
            }
            if (this.ac != null) {
                this.ac.a(this, i);
            }
            if (this.ad == null) {
                return;
            }
            for (int size = this.ad.size() - 1; size >= 0; size--) {
                this.ad.get(size).a(this, i);
            }
        }
    }

    public void setChildDrawingOrderCallback(dw dwVar) {
        if (dwVar != this.ah) {
            this.ah = dwVar;
            setChildrenDrawingOrderEnabled(this.ah != null);
        }
    }

    @Deprecated
    public void setOnScrollListener(ef efVar) {
        this.ac = efVar;
    }

    public final void a(ef efVar) {
        if (this.ad == null) {
            this.ad = new ArrayList();
        }
        this.ad.add(efVar);
    }

    public final void b(ef efVar) {
        if (this.ad != null) {
            this.ad.remove(efVar);
        }
    }

    public void a(int i) {
        if (!this.g) {
            b();
            if (this.e == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                this.e.b(i);
                awakenScrollBars();
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        if (this.e == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.g) {
            boolean i3 = this.e.i();
            boolean j = this.e.j();
            if (i3 || j) {
                if (!i3) {
                    i = 0;
                }
                if (!j) {
                    i2 = 0;
                }
                a(i, i2, (MotionEvent) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean z = false;
        if (this.f) {
            if (this.h) {
                android.support.v4.os.f.a("RV FullInvalidate");
                u();
                android.support.v4.os.f.a();
                return;
            }
            if (this.f628b.d()) {
                if (this.f628b.a(4) && !this.f628b.a(11)) {
                    android.support.v4.os.f.a("RV PartialInvalidate");
                    a();
                    this.f628b.b();
                    if (!this.F) {
                        int a2 = this.c.a();
                        int i = 0;
                        while (true) {
                            if (i < a2) {
                                eq b2 = b(this.c.b(i));
                                if (b2 != null && !b2.b() && b2.s()) {
                                    z = true;
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        if (z) {
                            u();
                        } else {
                            this.f628b.c();
                        }
                    }
                    a(true);
                    android.support.v4.os.f.a();
                    return;
                }
                if (this.f628b.d()) {
                    android.support.v4.os.f.a("RV FullInvalidate");
                    u();
                    android.support.v4.os.f.a();
                }
            }
        }
    }

    private boolean a(int i, int i2, MotionEvent motionEvent) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        j();
        if (this.x != null) {
            a();
            o();
            android.support.v4.os.f.a("RV Scroll");
            if (i != 0) {
                i5 = this.e.a(i, this.f627a, this.n);
                i3 = i - i5;
            }
            if (i2 != 0) {
                i6 = this.e.b(i2, this.f627a, this.n);
                i4 = i2 - i6;
            }
            android.support.v4.os.f.a();
            A();
            p();
            a(false);
        }
        int i7 = i4;
        int i8 = i5;
        int i9 = i6;
        if (!this.z.isEmpty()) {
            invalidate();
        }
        if (dispatchNestedScroll(i8, i9, i3, i7, this.ak)) {
            this.S -= this.ak[0];
            this.T -= this.ak[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.ak[0], this.ak[1]);
            }
            int[] iArr = this.am;
            iArr[0] = iArr[0] + this.ak[0];
            int[] iArr2 = this.am;
            iArr2[1] = iArr2[1] + this.ak[1];
        } else if (android.support.v4.view.by.a((View) this) != 2) {
            if (motionEvent != null) {
                float x = motionEvent.getX();
                float f = i3;
                float y = motionEvent.getY();
                float f2 = i7;
                boolean z = false;
                if (f < 0.0f) {
                    c();
                    if (this.i.a((-f) / getWidth(), 1.0f - (y / getHeight()))) {
                        z = true;
                    }
                } else if (f > 0.0f) {
                    d();
                    if (this.k.a(f / getWidth(), y / getHeight())) {
                        z = true;
                    }
                }
                if (f2 < 0.0f) {
                    e();
                    if (this.j.a((-f2) / getHeight(), x / getWidth())) {
                        z = true;
                    }
                } else if (f2 > 0.0f) {
                    f();
                    if (this.l.a(f2 / getHeight(), 1.0f - (x / getWidth()))) {
                        z = true;
                    }
                }
                if (z || f != 0.0f || f2 != 0.0f) {
                    android.support.v4.view.by.d(this);
                }
            }
            d(i, i2);
        }
        if (i8 != 0 || i9 != 0) {
            c(i8, i9);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i8 == 0 && i9 == 0) ? false : true;
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeHorizontalScrollOffset() {
        if (this.e != null && this.e.i()) {
            return this.e.a(this.n);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeHorizontalScrollExtent() {
        if (this.e != null && this.e.i()) {
            return this.e.c(this.n);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeHorizontalScrollRange() {
        if (this.e != null && this.e.i()) {
            return this.e.e(this.n);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeVerticalScrollOffset() {
        if (this.e != null && this.e.j()) {
            return this.e.b(this.n);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeVerticalScrollExtent() {
        if (this.e != null && this.e.j()) {
            return this.e.d(this.n);
        }
        return 0;
    }

    @Override // android.view.View, android.support.v4.view.bs
    public int computeVerticalScrollRange() {
        if (this.e != null && this.e.j()) {
            return this.e.f(this.n);
        }
        return 0;
    }

    final void a() {
        this.E++;
        if (this.E == 1 && !this.g) {
            this.F = false;
        }
    }

    final void a(boolean z) {
        if (this.E <= 0) {
            this.E = 1;
        }
        if (!z) {
            this.F = false;
        }
        if (this.E == 1) {
            if (z && this.F && !this.g && this.e != null && this.x != null) {
                u();
            }
            if (!this.g) {
                this.F = false;
            }
        }
        this.E--;
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.g) {
            a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.g = z;
                if (this.F && this.e != null && this.x != null) {
                    requestLayout();
                }
                this.F = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.g = z;
            this.G = true;
            b();
        }
    }

    public final void a(int i, int i2) {
        if (this.e == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.g) {
            if (!this.e.i()) {
                i = 0;
            }
            int i3 = this.e.j() ? i2 : 0;
            if (i != 0 || i3 != 0) {
                this.ab.a(i, i3);
            }
        }
    }

    public boolean b(int i, int i2) {
        if (this.e == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.g) {
            return false;
        }
        boolean i3 = this.e.i();
        boolean j = this.e.j();
        if (!i3 || Math.abs(i) < this.V) {
            i = 0;
        }
        if (!j || Math.abs(i2) < this.V) {
            i2 = 0;
        }
        if ((i == 0 && i2 == 0) || dispatchNestedPreFling(i, i2)) {
            return false;
        }
        boolean z = i3 || j;
        dispatchNestedFling(i, i2, z);
        if (!z) {
            return false;
        }
        int max = Math.max(-this.W, Math.min(i, this.W));
        int max2 = Math.max(-this.W, Math.min(i2, this.W));
        ep epVar = this.ab;
        epVar.d.setScrollState(2);
        epVar.f794b = 0;
        epVar.f793a = 0;
        epVar.c.a(max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE);
        epVar.a();
        return true;
    }

    public final void b() {
        setScrollState(0);
        k();
    }

    private void k() {
        this.ab.b();
        if (this.e != null) {
            this.e.w();
        }
    }

    public int getMinFlingVelocity() {
        return this.V;
    }

    public int getMaxFlingVelocity() {
        return this.W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        boolean z = false;
        if (this.i != null && !this.i.a() && i > 0) {
            z = this.i.c();
        }
        if (this.k != null && !this.k.a() && i < 0) {
            z |= this.k.c();
        }
        if (this.j != null && !this.j.a() && i2 > 0) {
            z |= this.j.c();
        }
        if (this.l != null && !this.l.a() && i2 < 0) {
            z |= this.l.c();
        }
        if (z) {
            android.support.v4.view.by.d(this);
        }
    }

    final void c() {
        if (this.i == null) {
            this.i = new android.support.v4.widget.ad(getContext());
            if (this.u) {
                this.i.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.i.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    final void d() {
        if (this.k == null) {
            this.k = new android.support.v4.widget.ad(getContext());
            if (this.u) {
                this.k.a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.k.a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    final void e() {
        if (this.j == null) {
            this.j = new android.support.v4.widget.ad(getContext());
            if (this.u) {
                this.j.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.j.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    final void f() {
        if (this.l == null) {
            this.l = new android.support.v4.widget.ad(getContext());
            if (this.u) {
                this.l.a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.l.a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void l() {
        this.l = null;
        this.j = null;
        this.k = null;
        this.i = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View a2 = this.e.a(view, i);
        if (a2 == null) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
            if (findNextFocus == null && this.x != null && this.e != null && !q() && !this.g) {
                a();
                findNextFocus = this.e.a(view, i, this.f627a, this.n);
                a(false);
            }
            return findNextFocus == null ? super.focusSearch(view, i) : findNextFocus;
        }
        return a2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        ec ecVar = this.e;
        if (!((ecVar.r != null && ecVar.r.k) || q()) && view2 != null) {
            this.w.set(0, 0, view2.getWidth(), view2.getHeight());
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof ed) {
                ed edVar = (ed) layoutParams;
                if (!edVar.e) {
                    Rect rect = edVar.d;
                    this.w.left -= rect.left;
                    this.w.right += rect.right;
                    this.w.top -= rect.top;
                    Rect rect2 = this.w;
                    rect2.bottom = rect.bottom + rect2.bottom;
                }
            }
            offsetDescendantRectToMyCoords(view2, this.w);
            offsetRectIntoDescendantCoords(view, this.w);
            requestChildRectangleOnScreen(view, this.w, !this.f);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        int min;
        ec ecVar = this.e;
        int r2 = ecVar.r();
        int s = ecVar.s();
        int size = View.MeasureSpec.getSize(ecVar.v) - ecVar.t();
        int size2 = View.MeasureSpec.getSize(ecVar.w) - ecVar.u();
        int left = view.getLeft() + rect.left;
        int top = view.getTop() + rect.top;
        int width = left + rect.width();
        int height = top + rect.height();
        int min2 = Math.min(0, left - r2);
        int min3 = Math.min(0, top - s);
        int max = Math.max(0, width - size);
        int max2 = Math.max(0, height - size2);
        if (android.support.v4.view.by.h(ecVar.q) == 1) {
            if (max == 0) {
                max = Math.max(min2, width - size);
            }
            min = max;
        } else {
            min = min2 != 0 ? min2 : Math.min(left - r2, max);
        }
        int min4 = min3 != 0 ? min3 : Math.min(top - s, max2);
        if (min != 0 || min4 != 0) {
            if (z) {
                scrollBy(min, min4);
            } else {
                a(min, min4);
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = 0;
        this.C = true;
        this.f = false;
        if (this.e != null) {
            this.e.s = true;
        }
        this.af = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.m != null) {
            this.m.d();
        }
        this.f = false;
        b();
        this.C = false;
        if (this.e != null) {
            this.e.b(this, this.f627a);
        }
        removeCallbacks(this.an);
        gj.b();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.C;
    }

    final void a(String str) {
        if (q()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            }
            throw new IllegalStateException(str);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.g) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.B = null;
        }
        int size = this.A.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            ee eeVar = this.A.get(i);
            if (!eeVar.a() || action == 3) {
                i++;
            } else {
                this.B = eeVar;
                z = true;
                break;
            }
        }
        if (z) {
            n();
            return true;
        }
        if (this.e == null) {
            return false;
        }
        boolean i2 = this.e.i();
        boolean j = this.e.j();
        if (this.P == null) {
            this.P = VelocityTracker.obtain();
        }
        this.P.addMovement(motionEvent);
        int a2 = android.support.v4.view.bc.a(motionEvent);
        int b2 = android.support.v4.view.bc.b(motionEvent);
        switch (a2) {
            case 0:
                if (this.G) {
                    this.G = false;
                }
                this.O = android.support.v4.view.bc.b(motionEvent, 0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.S = x;
                this.Q = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.T = y;
                this.R = y;
                if (this.N == 2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                }
                int[] iArr = this.am;
                this.am[1] = 0;
                iArr[0] = 0;
                int i3 = i2 ? 1 : 0;
                if (j) {
                    i3 |= 2;
                }
                startNestedScroll(i3);
                break;
            case 1:
                this.P.clear();
                stopNestedScroll();
                break;
            case 2:
                int a3 = android.support.v4.view.bc.a(motionEvent, this.O);
                if (a3 < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int c = (int) (android.support.v4.view.bc.c(motionEvent, a3) + 0.5f);
                int d = (int) (android.support.v4.view.bc.d(motionEvent, a3) + 0.5f);
                if (this.N != 1) {
                    int i4 = c - this.Q;
                    int i5 = d - this.R;
                    if (!i2 || Math.abs(i4) <= this.U) {
                        z2 = false;
                    } else {
                        this.S = ((i4 < 0 ? -1 : 1) * this.U) + this.Q;
                        z2 = true;
                    }
                    if (j && Math.abs(i5) > this.U) {
                        this.T = this.R + ((i5 >= 0 ? 1 : -1) * this.U);
                        z2 = true;
                    }
                    if (z2) {
                        setScrollState(1);
                        break;
                    }
                }
                break;
            case 3:
                n();
                break;
            case 5:
                this.O = android.support.v4.view.bc.b(motionEvent, b2);
                int c2 = (int) (android.support.v4.view.bc.c(motionEvent, b2) + 0.5f);
                this.S = c2;
                this.Q = c2;
                int d2 = (int) (android.support.v4.view.bc.d(motionEvent, b2) + 0.5f);
                this.T = d2;
                this.R = d2;
                break;
            case 6:
                a(motionEvent);
                break;
        }
        return this.N == 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            this.A.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void m() {
        if (this.P != null) {
            this.P.clear();
        }
        stopNestedScroll();
        boolean c = this.i != null ? this.i.c() : false;
        if (this.j != null) {
            c |= this.j.c();
        }
        if (this.k != null) {
            c |= this.k.c();
        }
        if (this.l != null) {
            c |= this.l.c();
        }
        if (!c) {
            return;
        }
        android.support.v4.view.by.d(this);
    }

    private void n() {
        m();
        setScrollState(0);
    }

    private void a(MotionEvent motionEvent) {
        int b2 = android.support.v4.view.bc.b(motionEvent);
        if (android.support.v4.view.bc.b(motionEvent, b2) == this.O) {
            int i = b2 == 0 ? 1 : 0;
            this.O = android.support.v4.view.bc.b(motionEvent, i);
            int c = (int) (android.support.v4.view.bc.c(motionEvent, i) + 0.5f);
            this.S = c;
            this.Q = c;
            int d = (int) (android.support.v4.view.bc.d(motionEvent, i) + 0.5f);
            this.T = d;
            this.R = d;
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.e != null && !this.g && (android.support.v4.view.bc.d(motionEvent) & 2) != 0 && motionEvent.getAction() == 8) {
            float f = this.e.j() ? -android.support.v4.view.bc.e(motionEvent, 9) : 0.0f;
            float e = this.e.i() ? android.support.v4.view.bc.e(motionEvent, 10) : 0.0f;
            if (f != 0.0f || e != 0.0f) {
                float scrollFactor = getScrollFactor();
                a((int) (e * scrollFactor), (int) (f * scrollFactor), motionEvent);
            }
        }
        return false;
    }

    private float getScrollFactor() {
        if (this.aa == Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.aa = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            } else {
                return 0.0f;
            }
        }
        return this.aa;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (this.e == null) {
            e(i, i2);
            return;
        }
        z = this.e.t;
        if (z) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.e.d(i, i2);
            if (!z2 && this.x != null) {
                if (this.n.f792b == 1) {
                    v();
                }
                this.e.b(i, i2);
                this.n.k = true;
                w();
                this.e.c(i, i2);
                if (this.e.m()) {
                    this.e.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.n.k = true;
                    w();
                    this.e.c(i, i2);
                    return;
                }
                return;
            }
            return;
        }
        if (this.D) {
            this.e.d(i, i2);
            return;
        }
        if (this.I) {
            a();
            t();
            if (!this.n.i) {
                this.f628b.e();
                this.n.g = false;
            } else {
                this.n.g = true;
            }
            this.I = false;
            a(false);
        }
        if (this.x != null) {
            this.n.c = this.x.a();
        } else {
            this.n.c = 0;
        }
        a();
        this.e.d(i, i2);
        a(false);
        this.n.g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
            case 1073741824:
                break;
            default:
                size = android.support.v4.view.by.r(this);
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
            case 1073741824:
                break;
            default:
                size2 = android.support.v4.view.by.s(this);
                break;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            l();
        }
    }

    public void setItemAnimator(dx dxVar) {
        if (this.m != null) {
            this.m.d();
            this.m.h = null;
        }
        this.m = dxVar;
        if (this.m != null) {
            this.m.h = this.ae;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.M++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.M--;
        if (this.M <= 0) {
            this.M = 0;
            int i = this.H;
            this.H = 0;
            if (i == 0 || !g()) {
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            android.support.v4.view.apkg.a.a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    final boolean g() {
        return this.K != null && this.K.isEnabled();
    }

    private boolean q() {
        return this.M > 0;
    }

    public dx getItemAnimator() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (!this.af && this.C) {
            android.support.v4.view.by.a(this, this.an);
            this.af = true;
        }
    }

    private boolean s() {
        return this.m != null && this.e.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r3 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t() {
        /*
            r5 = this;
            r2 = 1
            r1 = 0
            boolean r0 = r5.h
            if (r0 == 0) goto L13
            android.support.v7.widget.af r0 = r5.f628b
            r0.a()
            r5.z()
            android.support.v7.widget.ec r0 = r5.e
            r0.b()
        L13:
            boolean r0 = r5.s()
            if (r0 == 0) goto L63
            android.support.v7.widget.af r0 = r5.f628b
            r0.b()
        L1e:
            boolean r0 = r5.o
            if (r0 != 0) goto L26
            boolean r0 = r5.p
            if (r0 == 0) goto L69
        L26:
            r0 = r2
        L27:
            android.support.v7.widget.en r4 = r5.n
            boolean r3 = r5.f
            if (r3 == 0) goto L6b
            android.support.v7.widget.dx r3 = r5.m
            if (r3 == 0) goto L6b
            boolean r3 = r5.h
            if (r3 != 0) goto L3f
            if (r0 != 0) goto L3f
            android.support.v7.widget.ec r3 = r5.e
            boolean r3 = android.support.v7.widget.ec.b(r3)
            if (r3 == 0) goto L6b
        L3f:
            boolean r3 = r5.h
            if (r3 == 0) goto L49
            android.support.v7.widget.dt r3 = r5.x
            boolean r3 = r3.f775b
            if (r3 == 0) goto L6b
        L49:
            r3 = r2
        L4a:
            r4.h = r3
            android.support.v7.widget.en r3 = r5.n
            android.support.v7.widget.en r4 = r5.n
            boolean r4 = r4.h
            if (r4 == 0) goto L6d
            if (r0 == 0) goto L6d
            boolean r0 = r5.h
            if (r0 != 0) goto L6d
            boolean r0 = r5.s()
            if (r0 == 0) goto L6d
        L60:
            r3.i = r2
            return
        L63:
            android.support.v7.widget.af r0 = r5.f628b
            r0.e()
            goto L1e
        L69:
            r0 = r1
            goto L27
        L6b:
            r3 = r1
            goto L4a
        L6d:
            r2 = r1
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.t():void");
    }

    private void u() {
        dz dzVar;
        gj c;
        if (this.x == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.e == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.n.k = false;
        o();
        if (this.n.f792b == 1) {
            v();
            this.e.c(this);
            w();
        } else {
            af afVar = this.f628b;
            if (!((afVar.f649b.isEmpty() || afVar.f648a.isEmpty()) ? false : true) && View.MeasureSpec.getSize(this.e.v) == getWidth() && View.MeasureSpec.getSize(this.e.w) == getHeight()) {
                this.e.c(this);
            } else {
                this.e.c(this);
                w();
            }
        }
        this.n.a(4);
        a();
        this.n.f792b = 1;
        if (this.n.h) {
            int a2 = this.c.a();
            for (int i = 0; i < a2; i++) {
                eq b2 = b(this.c.b(i));
                if (!b2.b()) {
                    long b3 = b(b2);
                    dz a3 = new dz().a(b2);
                    eq a4 = this.d.f852b.a(b3);
                    if (a4 == null || a4.b()) {
                        gi giVar = this.d;
                        gj gjVar = giVar.f851a.get(b2);
                        if (gjVar == null) {
                            gjVar = gj.a();
                            giVar.f851a.put(b2, gjVar);
                        }
                        gjVar.c = a3;
                        gjVar.f853a |= 8;
                    } else {
                        gi giVar2 = this.d;
                        int a5 = giVar2.f851a.a(a4);
                        if (a5 < 0 || (c = giVar2.f851a.c(a5)) == null || (c.f853a & 4) == 0) {
                            dzVar = null;
                        } else {
                            c.f853a &= -5;
                            dz dzVar2 = c.f854b;
                            if (c.f853a == 0) {
                                giVar2.f851a.d(a5);
                                gj.a(c);
                            }
                            dzVar = dzVar2;
                        }
                        if (dzVar == null) {
                            int a6 = this.c.a();
                            for (int i2 = 0; i2 < a6; i2++) {
                                eq b4 = b(this.c.b(i2));
                                if (b4 != b2 && b(b4) == b3) {
                                    if (this.x != null && this.x.f775b) {
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + b4 + " \n View Holder 2:" + b2);
                                    }
                                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + b4 + " \n View Holder 2:" + b2);
                                }
                            }
                            Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + a4 + " cannot be found but it is necessary for " + b2);
                        } else {
                            a4.a(false);
                            if (a4 != b2) {
                                a4.g = b2;
                                a(a4);
                                this.f627a.b(a4);
                                b2.a(false);
                                b2.h = a4;
                            }
                            if (this.m.a(a4, b2, dzVar, a3)) {
                                r();
                            }
                        }
                    }
                }
            }
            this.d.a(this.ap);
        }
        this.e.a(this.f627a);
        this.n.d = this.n.c;
        this.h = false;
        this.n.h = false;
        this.n.i = false;
        ec.c(this.e);
        if (this.f627a.f786b != null) {
            this.f627a.f786b.clear();
        }
        a(false);
        this.d.a();
        if (f(this.ai[0], this.ai[1])) {
            c(0, 0);
        }
        p();
    }

    private void v() {
        int i;
        this.n.a(1);
        this.n.k = false;
        a();
        this.d.a();
        o();
        t();
        this.n.j = this.n.h && this.p;
        this.p = false;
        this.o = false;
        this.n.g = this.n.i;
        this.n.c = this.x.a();
        int[] iArr = this.ai;
        int a2 = this.c.a();
        if (a2 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
        } else {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = 0;
            while (i4 < a2) {
                eq b2 = b(this.c.b(i4));
                if (!b2.b()) {
                    i = b2.c();
                    if (i < i2) {
                        i2 = i;
                    }
                    if (i > i3) {
                        i4++;
                        i2 = i2;
                        i3 = i;
                    }
                }
                i = i3;
                i4++;
                i2 = i2;
                i3 = i;
            }
            iArr[0] = i2;
            iArr[1] = i3;
        }
        if (this.n.h) {
            int a3 = this.c.a();
            for (int i5 = 0; i5 < a3; i5++) {
                eq b3 = b(this.c.b(i5));
                if (!b3.b() && (!b3.j() || this.x.f775b)) {
                    dx.d(b3);
                    b3.p();
                    this.d.a(b3, new dz().a(b3));
                    if (this.n.j && b3.s() && !b3.m() && !b3.b() && !b3.j()) {
                        this.d.a(b(b3), b3);
                    }
                }
            }
        }
        if (!this.n.i) {
            y();
        } else {
            int b4 = this.c.b();
            for (int i6 = 0; i6 < b4; i6++) {
                eq b5 = b(this.c.c(i6));
                if (!b5.b() && b5.c == -1) {
                    b5.c = b5.f796b;
                }
            }
            boolean z = this.n.f;
            this.n.f = false;
            this.e.c(this.f627a, this.n);
            this.n.f = z;
            for (int i7 = 0; i7 < this.c.a(); i7++) {
                eq b6 = b(this.c.b(i7));
                if (!b6.b()) {
                    gj gjVar = this.d.f851a.get(b6);
                    if (!((gjVar == null || (gjVar.f853a & 4) == 0) ? false : true)) {
                        dx.d(b6);
                        boolean a4 = b6.a(8192);
                        b6.p();
                        dz a5 = new dz().a(b6);
                        if (a4) {
                            a(b6, a5);
                        } else {
                            gi giVar = this.d;
                            gj gjVar2 = giVar.f851a.get(b6);
                            if (gjVar2 == null) {
                                gjVar2 = gj.a();
                                giVar.f851a.put(b6, gjVar2);
                            }
                            gjVar2.f853a |= 2;
                            gjVar2.f854b = a5;
                        }
                    }
                }
            }
            y();
        }
        p();
        a(false);
        this.n.f792b = 2;
    }

    private void w() {
        a();
        o();
        this.n.a(6);
        this.f628b.e();
        this.n.c = this.x.a();
        this.n.e = 0;
        this.n.g = false;
        this.e.c(this.f627a, this.n);
        this.n.f = false;
        this.t = null;
        this.n.h = this.n.h && this.m != null;
        this.n.f792b = 4;
        p();
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(eq eqVar, dz dzVar) {
        eqVar.a(0, 8192);
        if (this.n.j && eqVar.s() && !eqVar.m() && !eqVar.b()) {
            this.d.a(b(eqVar), eqVar);
        }
        this.d.a(eqVar, dzVar);
    }

    private boolean f(int i, int i2) {
        int c;
        int a2 = this.c.a();
        if (a2 == 0) {
            return (i == 0 && i2 == 0) ? false : true;
        }
        for (int i3 = 0; i3 < a2; i3++) {
            eq b2 = b(this.c.b(i3));
            if (!b2.b() && ((c = b2.c()) < i || c > i2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        eq b2 = b(view);
        if (b2 != null) {
            if (b2.n()) {
                b2.i();
            } else if (!b2.b()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + b2);
            }
        }
        f(view);
        super.removeDetachedView(view, z);
    }

    private long b(eq eqVar) {
        return this.x.f775b ? eqVar.d : eqVar.f796b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.support.v4.os.f.a("RV OnLayout");
        u();
        android.support.v4.os.f.a();
        this.f = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.E == 0 && !this.g) {
            super.requestLayout();
        } else {
            this.F = true;
        }
    }

    private void x() {
        int b2 = this.c.b();
        for (int i = 0; i < b2; i++) {
            ((ed) this.c.c(i).getLayoutParams()).e = true;
        }
        eh ehVar = this.f627a;
        int size = ehVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ed edVar = (ed) ehVar.c.get(i2).f795a.getLayoutParams();
            if (edVar != null) {
                edVar.e = true;
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        boolean z2 = false;
        super.draw(canvas);
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            this.z.get(i).b(canvas, this);
        }
        if (this.i == null || this.i.a()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.u ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate(paddingBottom + (-getHeight()), 0.0f);
            z = this.i != null && this.i.a(canvas);
            canvas.restoreToCount(save);
        }
        if (this.j != null && !this.j.a()) {
            int save2 = canvas.save();
            if (this.u) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            z |= this.j != null && this.j.a(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.k != null && !this.k.a()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.u ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            z |= this.k != null && this.k.a(canvas);
            canvas.restoreToCount(save3);
        }
        if (this.l != null && !this.l.a()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.u) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            if (this.l != null && this.l.a(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.m == null || this.z.size() <= 0 || !this.m.b()) ? z : true) {
            android.support.v4.view.by.d(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            this.z.get(i).a(canvas, this);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ed) && this.e.a((ed) layoutParams);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.e == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        }
        return this.e.f();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.e == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        }
        return this.e.a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.e == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        }
        return this.e.a(layoutParams);
    }

    private void y() {
        int b2 = this.c.b();
        for (int i = 0; i < b2; i++) {
            eq b3 = b(this.c.c(i));
            if (!b3.b()) {
                b3.a();
            }
        }
        eh ehVar = this.f627a;
        int size = ehVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ehVar.c.get(i2).a();
        }
        int size2 = ehVar.f785a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ehVar.f785a.get(i3).a();
        }
        if (ehVar.f786b == null) {
            return;
        }
        int size3 = ehVar.f786b.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ehVar.f786b.get(i4).a();
        }
    }

    final void a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b2 = this.c.b();
        for (int i4 = 0; i4 < b2; i4++) {
            eq b3 = b(this.c.c(i4));
            if (b3 != null && !b3.b()) {
                if (b3.f796b >= i3) {
                    b3.a(-i2, z);
                    this.n.f = true;
                } else if (b3.f796b >= i) {
                    b3.b(8);
                    b3.a(-i2, z);
                    b3.f796b = i - 1;
                    this.n.f = true;
                }
            }
        }
        eh ehVar = this.f627a;
        int i5 = i + i2;
        for (int size = ehVar.c.size() - 1; size >= 0; size--) {
            eq eqVar = ehVar.c.get(size);
            if (eqVar != null) {
                if (eqVar.f796b >= i5) {
                    eqVar.a(-i2, z);
                } else if (eqVar.f796b >= i) {
                    eqVar.b(8);
                    ehVar.c(size);
                }
            }
        }
        requestLayout();
    }

    private void z() {
        int b2 = this.c.b();
        for (int i = 0; i < b2; i++) {
            eq b3 = b(this.c.c(i));
            if (b3 != null && !b3.b()) {
                b3.b(6);
            }
        }
        x();
        eh ehVar = this.f627a;
        if (ehVar.h.x != null && ehVar.h.x.f775b) {
            int size = ehVar.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                eq eqVar = ehVar.c.get(i2);
                if (eqVar != null) {
                    eqVar.b(6);
                    eqVar.a((Object) null);
                }
            }
            return;
        }
        ehVar.b();
    }

    public final eq a(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return b(view);
    }

    static eq b(View view) {
        if (view == null) {
            return null;
        }
        return ((ed) view.getLayoutParams()).c;
    }

    public static int c(View view) {
        eq b2 = b(view);
        if (b2 != null) {
            return b2.d();
        }
        return -1;
    }

    public static int d(View view) {
        eq b2 = b(view);
        if (b2 != null) {
            return b2.c();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    final Rect e(View view) {
        ed edVar = (ed) view.getLayoutParams();
        if (!edVar.e) {
            return edVar.d;
        }
        Rect rect = edVar.d;
        rect.set(0, 0, 0, 0);
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            this.w.set(0, 0, 0, 0);
            this.z.get(i).a(this.w, view);
            rect.left += this.w.left;
            rect.top += this.w.top;
            rect.right += this.w.right;
            rect.bottom += this.w.bottom;
        }
        edVar.e = false;
        return rect;
    }

    final void c(int i, int i2) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        if (this.ac != null) {
            this.ac.a(this, i, i2);
        }
        if (this.ad != null) {
            for (int size = this.ad.size() - 1; size >= 0; size--) {
                this.ad.get(size).a(this, i, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        int a2 = this.c.a();
        for (int i = 0; i < a2; i++) {
            View b2 = this.c.b(i);
            eq a3 = a(b2);
            if (a3 != null && a3.h != null) {
                View view = a3.h.f795a;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(View view) {
        b(view);
        if (this.L != null) {
            for (int size = this.L.size() - 1; size >= 0; size--) {
                this.L.get(size);
            }
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.aj.a(z);
    }

    @Override // android.view.View, android.support.v4.view.bi
    public boolean isNestedScrollingEnabled() {
        return this.aj.f351a;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.aj.a(i);
    }

    @Override // android.view.View, android.support.v4.view.bi
    public void stopNestedScroll() {
        this.aj.b();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.aj.a();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.aj.a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.aj.a(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.aj.a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.aj.a(f, f2);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new ek();

        /* renamed from: a, reason: collision with root package name */
        Parcelable f629a;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f629a = parcel.readParcelable(ec.class.getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f629a, 0);
        }

        static /* synthetic */ void a(SavedState savedState, SavedState savedState2) {
            savedState.f629a = savedState2.f629a;
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        return this.ah == null ? super.getChildDrawingOrder(i, i2) : this.ah.a();
    }

    public final void a(eb ebVar) {
        if (this.e != null) {
            this.e.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.z.isEmpty()) {
            setWillNotDraw(false);
        }
        this.z.add(ebVar);
        x();
        requestLayout();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (q()) {
            int b2 = accessibilityEvent != null ? android.support.v4.view.apkg.a.b(accessibilityEvent) : 0;
            this.H = (b2 != 0 ? b2 : 0) | this.H;
            r0 = 1;
        }
        if (r0 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    static /* synthetic */ void a(RecyclerView recyclerView, eq eqVar, dz dzVar, dz dzVar2) {
        recyclerView.a(eqVar);
        eqVar.a(false);
        if (!recyclerView.m.a(eqVar, dzVar, dzVar2)) {
            return;
        }
        recyclerView.r();
    }

    static /* synthetic */ void b(RecyclerView recyclerView, eq eqVar, dz dzVar, dz dzVar2) {
        eqVar.a(false);
        if (!recyclerView.m.b(eqVar, dzVar, dzVar2)) {
            return;
        }
        recyclerView.r();
    }

    static /* synthetic */ void a(RecyclerView recyclerView, View view) {
        b(view);
        if (recyclerView.L == null) {
            return;
        }
        for (int size = recyclerView.L.size() - 1; size >= 0; size--) {
            recyclerView.L.get(size);
        }
    }

    static /* synthetic */ void n(RecyclerView recyclerView) {
        if (recyclerView.h) {
            return;
        }
        recyclerView.h = true;
        int b2 = recyclerView.c.b();
        for (int i = 0; i < b2; i++) {
            eq b3 = b(recyclerView.c.c(i));
            if (b3 != null && !b3.b()) {
                b3.b(512);
            }
        }
        eh ehVar = recyclerView.f627a;
        int size = ehVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            eq eqVar = ehVar.c.get(i2);
            if (eqVar != null) {
                eqVar.b(512);
            }
        }
    }

    static /* synthetic */ boolean a(RecyclerView recyclerView, eq eqVar) {
        return recyclerView.m == null || recyclerView.m.a(eqVar, eqVar.p());
    }

    static /* synthetic */ int b(RecyclerView recyclerView, eq eqVar) {
        if (eqVar.a(524) || !eqVar.l()) {
            return -1;
        }
        af afVar = recyclerView.f628b;
        int i = eqVar.f796b;
        int size = afVar.f648a.size();
        for (int i2 = 0; i2 < size; i2++) {
            ah ahVar = afVar.f648a.get(i2);
            switch (ahVar.f650a) {
                case 1:
                    if (ahVar.f651b <= i) {
                        i += ahVar.d;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (ahVar.f651b > i) {
                        continue;
                    } else {
                        if (ahVar.f651b + ahVar.d > i) {
                            return -1;
                        }
                        i -= ahVar.d;
                        break;
                    }
                case 8:
                    if (ahVar.f651b == i) {
                        i = ahVar.d;
                        break;
                    } else {
                        if (ahVar.f651b < i) {
                            i--;
                        }
                        if (ahVar.d <= i) {
                            i++;
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
        return i;
    }

    static /* synthetic */ void c(RecyclerView recyclerView, int i) {
        if (recyclerView.e == null) {
            return;
        }
        recyclerView.e.b(i);
        recyclerView.awakenScrollBars();
    }

    static /* synthetic */ boolean c(RecyclerView recyclerView, View view) {
        boolean z;
        recyclerView.a();
        bn bnVar = recyclerView.c;
        int a2 = bnVar.f706a.a(view);
        if (a2 == -1) {
            bnVar.b(view);
            z = true;
        } else if (bnVar.f707b.c(a2)) {
            bnVar.f707b.d(a2);
            bnVar.b(view);
            bnVar.f706a.a(a2);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eq b2 = b(view);
            recyclerView.f627a.b(b2);
            recyclerView.f627a.a(b2);
        }
        recyclerView.a(z ? false : true);
        return z;
    }
}
