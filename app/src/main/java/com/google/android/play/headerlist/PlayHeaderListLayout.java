package com.google.android.play.headerlist;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.by;
import android.support.v4.view.dh;
import android.support.v4.view.dl;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.bp;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.dt;
import android.support.v7.widget.ef;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.ScaleAnimation;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.play.widget.ScrollProxyView;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class PlayHeaderListLayout extends FrameLayout implements bp {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f6888a;

    /* renamed from: b, reason: collision with root package name */
    static final boolean f6889b;
    private static Map<View, Integer> n;
    private View A;
    private TextView B;
    private TextView C;
    private com.google.android.play.bpkg.a D;
    private PlayHeaderStatusBarUnderlay E;
    private Toolbar F;
    private ViewGroup G;
    private int H;
    private int I;
    private View J;
    private View K;
    private int L;
    private com.google.android.play.bpkg.a M;
    private ViewPager N;
    private ViewGroup O;
    private SwipeRefreshLayout P;
    private com.google.android.play.bpkg.a Q;
    private ScrollProxyView R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private float aD;
    private boolean aE;
    private Runnable aF;
    private boolean aG;
    private ObjectAnimator aH;
    private i aI;
    private boolean aJ;
    private boolean aK;
    private boolean aL;
    private final n aM;
    private final p aN;
    private final u aO;
    private final float aP;
    private SavedState aQ;
    private Map<String, ObjectAnimator> aR;
    private final Runnable aS;
    private final Runnable aT;
    private final Runnable aU;
    private int aa;
    private boolean ab;
    private int ac;
    private float ad;
    private int ae;
    private int af;
    private Drawable ag;
    private int ah;
    private int ai;
    private boolean aj;
    private int ak;
    private boolean al;
    private int am;
    private int an;
    private boolean ao;
    private dl ap;
    private Drawable aq;
    private CharSequence ar;
    private int as;
    private float at;
    private boolean au;
    private float av;
    private int aw;
    private boolean ax;
    private int ay;
    private boolean az;
    public PlayHeaderListTabStrip c;
    AbsListView.OnScrollListener d;
    ef e;
    x f;
    j g;
    l h;
    public int i;
    public boolean j;
    int k;
    private final Handler l;
    private final dl m;
    private FrameLayout o;
    private com.google.android.play.bpkg.a p;
    private View q;
    private com.google.android.play.bpkg.a r;
    private View s;
    private com.google.android.play.bpkg.a t;
    private ViewGroup u;
    private com.google.android.play.bpkg.a v;
    private View w;
    private com.google.android.play.bpkg.a x;
    private FrameLayout y;
    private com.google.android.play.bpkg.a z;

    static /* synthetic */ Runnable g(PlayHeaderListLayout playHeaderListLayout) {
        playHeaderListLayout.aF = null;
        return null;
    }

    static {
        f6888a = Build.VERSION.SDK_INT > 10;
        f6889b = Build.VERSION.SDK_INT >= 21;
        n = new WeakHashMap();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new m();

        /* renamed from: a, reason: collision with root package name */
        final boolean f6890a;

        /* synthetic */ SavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        SavedState(Parcelable parcelable, PlayHeaderListLayout playHeaderListLayout) {
            super(parcelable);
            this.f6890a = playHeaderListLayout.aG;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6890a = parcel.readByte() == 1;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6890a ? 1 : 0);
        }

        public String toString() {
            return String.format(Locale.US, "lastSnapControlsWasDown: %s", Boolean.valueOf(this.f6890a));
        }
    }

    public static int a(Context context, int i, int i2) {
        return a(context, i) + 0 + i2;
    }

    public PlayHeaderListLayout(Context context) {
        this(context, null);
    }

    public PlayHeaderListLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHeaderListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new Handler();
        this.m = new a(this);
        this.ai = 0;
        this.ay = -1;
        this.aA = true;
        this.aD = 0.5f;
        this.aE = true;
        this.aM = new n(this);
        this.aN = new p(this);
        this.aO = new u(this);
        this.aR = new HashMap();
        this.aS = new b(this);
        this.aT = new c(this);
        this.aU = new d(this);
        this.aP = context.getResources().getDisplayMetrics().density * 20.0f;
    }

    @SuppressLint({"newapi"})
    public void a(g gVar) {
        this.ad = gVar.d();
        this.T = gVar.b();
        this.S = gVar.m();
        this.U = com.google.android.play.k.play_header_spacer;
        this.U = this.U == 0 ? com.google.android.play.k.play_header_spacer : this.U;
        this.V = false;
        this.W = gVar.l();
        this.aa = gVar.t();
        this.ab = gVar.r() == 1;
        this.ai = gVar.k();
        this.aj = gVar.f() == 0;
        this.ak = gVar.o();
        this.an = gVar.j();
        this.al = gVar.e();
        this.ao = f6889b && gVar.g();
        this.am = f6888a ? gVar.n() : 1;
        this.ae = 0;
        this.af = 0;
        this.aJ = gVar.s();
        LayoutInflater from = LayoutInflater.from(getContext());
        PlayHeaderListTabStrip a2 = gVar.a(getContext(), from);
        from.inflate(com.google.android.play.l.play_header_list_layout_gb, this);
        this.o = (FrameLayout) findViewById(com.google.android.play.k.background_container);
        this.p = new com.google.android.play.bpkg.a(this.o);
        this.p.a();
        this.q = findViewById(com.google.android.play.k.alt_play_background);
        this.r = new com.google.android.play.bpkg.a(this.q);
        this.K = findViewById(com.google.android.play.k.alt_play_colored_background);
        this.s = findViewById(com.google.android.play.k.content_container);
        this.t = new com.google.android.play.bpkg.a(this.s);
        this.ag = new ColorDrawable(gVar.c.getResources().getColor(com.google.android.play.h.play_main_background));
        this.u = (ViewGroup) findViewById(com.google.android.play.k.controls_container);
        this.J = findViewById(com.google.android.play.k.colored_background);
        this.v = new com.google.android.play.bpkg.a(this.u);
        this.v.a();
        this.w = findViewById(com.google.android.play.k.header_shadow);
        this.x = new com.google.android.play.bpkg.a(this.w);
        this.y = (FrameLayout) findViewById(com.google.android.play.k.hero_container);
        this.z = new com.google.android.play.bpkg.a(this.y);
        this.z.a();
        this.A = findViewById(com.google.android.play.k.tab_bar);
        this.c = (PlayHeaderListTabStrip) findViewById(com.google.android.play.k.pager_tab_strip);
        if (a2 != null) {
            PlayHeaderListTabStrip playHeaderListTabStrip = this.c;
            ViewGroup.LayoutParams layoutParams = playHeaderListTabStrip.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) playHeaderListTabStrip.getParent();
            int indexOfChild = viewGroup.indexOfChild(playHeaderListTabStrip);
            viewGroup.removeViewAt(indexOfChild);
            viewGroup.addView(a2, indexOfChild, layoutParams);
            View childAt = playHeaderListTabStrip.getChildAt(0);
            playHeaderListTabStrip.removeViewAt(0);
            a2.addView(childAt);
            a2.getSubViewReferences();
            this.c = a2;
        }
        this.c.setExternalOnPageChangeListener(this.m);
        this.c.setTabsBackgroundResource(com.google.android.play.j.play_header_list_tab_high_contrast_bg);
        this.B = (TextView) findViewById(com.google.android.play.k.tab_bar_title);
        this.ac = gVar.c();
        this.ah = 0;
        setControlsContainerHeight(this.ac - this.ah);
        if (!this.aJ) {
            n();
        }
        if (this.V) {
            this.F = (Toolbar) from.inflate(com.google.android.play.l.play_header_list_toolbar, getToolbarContainer(), false);
            getToolbarContainer().addView(this.F);
            setSupportActionBar(this.F);
        } else {
            this.F = (Toolbar) ((Activity) getContext()).getWindow().findViewById(com.google.android.play.k.action_bar);
        }
        this.H = gVar.a(getContext());
        this.G = getToolbarContainer();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.G.getLayoutParams();
        layoutParams2.gravity = 48;
        this.G.setLayoutParams(layoutParams2);
        this.M = new com.google.android.play.bpkg.a(this.G);
        this.M.a();
        this.C = (TextView) findViewById(com.google.android.play.k.play_header_banner);
        this.D = new com.google.android.play.bpkg.a(this.C);
        if (this.ao) {
            this.E = (PlayHeaderStatusBarUnderlay) findViewById(com.google.android.play.k.play_header_status_bar_underlay);
            this.E.setVisibility(0);
            this.E.setOutlineProvider(null);
            this.E.a(gVar.h(), gVar.i());
            this.C.setBackground(null);
        }
        this.P = (SwipeRefreshLayout) findViewById(com.google.android.play.k.swipe_refresh_layout);
        this.Q = new com.google.android.play.bpkg.a(this.P);
        this.P.setOnRefreshListener(this);
        this.R = (ScrollProxyView) findViewById(com.google.android.play.k.scroll_proxy);
        setPullToRefreshEnabled(false);
        if (f6888a) {
            gVar.a(this.y);
            gVar.a(from, this.o);
        } else if (!this.al) {
            gVar.a(from, this.o);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.s;
        gVar.b(from, viewGroup2);
        if (viewGroup2.getChildCount() == 1) {
            View childAt2 = viewGroup2.getChildAt(0);
            int indexOfChild2 = indexOfChild(this.s);
            removeViewAt(indexOfChild2);
            viewGroup2.removeViewAt(0);
            addView(childAt2, indexOfChild2);
            this.s = childAt2;
            this.t = new com.google.android.play.bpkg.a(this.s);
        }
        if (f6888a) {
            this.L = ((int) getResources().getDisplayMetrics().density) * 2;
            this.M.c(this.L);
        }
        f();
        g();
        if (Build.VERSION.SDK_INT >= 14) {
            this.u.setOnHoverListener(new e(this));
        }
        if (this.al) {
            setControlsBackground$4eb43225(this.aq);
        }
        this.D.c(-getBannerHeight());
        if (this.ao) {
            a(false);
        } else if (f6888a) {
            this.M.a(-this.L);
        }
        setBannerFraction(this.at);
        c(false);
        l();
        h();
    }

    public final void a(int i, int i2) {
        if (this.E != null) {
            this.E.a(i, i2);
            this.E.invalidate();
        }
    }

    public void setAlwaysUseFloatingBackground(boolean z) {
        this.al = z;
        if (this.al) {
            setControlsBackground$4eb43225(this.aq);
        } else {
            setControlsBackground$4eb43225(null);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.aQ = savedState;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h();
        a();
        boolean z2 = this.aQ != null;
        if (this.aQ != null && this.O != null) {
            b(false);
            this.aG = this.aQ.f6890a;
            a(this.aG, false);
            i();
            d(false);
            this.aQ = null;
            this.az = false;
        }
        if (!z2) {
            if (z) {
                this.k = 2;
            }
            if (this.ax) {
                b(true);
                this.ax = false;
            }
        }
        switch (this.k) {
            case 1:
                d(false);
                break;
            case 2:
                d(true);
                break;
        }
        if (z) {
            m();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        if (this.aL) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            boolean onInterceptTouchEvent = this.P.onInterceptTouchEvent(obtain);
            obtain.recycle();
            if (!onInterceptTouchEvent) {
                return onInterceptTouchEvent;
            }
            com.google.android.play.bpkg.a aVar = this.Q;
            if (aVar.f6812a != null && Build.VERSION.SDK_INT >= 11) {
                f = aVar.f6812a.getAlpha();
            } else {
                f = aVar.f6813b;
            }
            if (f < 1.0f) {
                this.Q.a(1.0f);
                return onInterceptTouchEvent;
            }
            return onInterceptTouchEvent;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.aL) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        boolean onTouchEvent = this.P.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }

    @Override // android.view.View
    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        int i = this.as;
        this.as = Math.max(systemWindowInsetTop, i);
        if (!this.ao) {
            return super.onApplyWindowInsets(windowInsets);
        }
        if (this.as != i) {
            a(true);
        }
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    private static void a(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    private void a(boolean z) {
        if (this.ao) {
            ((FrameLayout.LayoutParams) this.E.getLayoutParams()).height = this.as + this.C.getLayoutParams().height;
            PlayHeaderStatusBarUnderlay playHeaderStatusBarUnderlay = this.E;
            int i = this.as;
            if (f6889b && playHeaderStatusBarUnderlay.f6895a != i) {
                playHeaderStatusBarUnderlay.f6895a = i;
                playHeaderStatusBarUnderlay.invalidate();
            }
            this.E.requestLayout();
            this.r.a(this.as);
            this.t.a(this.as);
            this.v.a(-1);
            this.u.setClipToPadding(false);
            a(this.u, this.as);
            setControlsContainerHeight(this.I);
            this.M.a(-this.L);
            if (this.V) {
                a(this.G, this.as);
            }
            if (z) {
                i();
            }
        }
    }

    public void setPullToRefreshProvider(l lVar) {
        if (this.P == null) {
            throw new IllegalStateException("Cannot initialize pull to refresh before HeaderListLayout has been configured");
        }
        this.P.setRefreshing(false);
        this.Q.a(1.0f);
        this.Q.c(0.0f);
        this.h = lVar;
        a();
        View findViewById = findViewById(com.google.android.play.k.swipe_refresh_layout_parent);
        findViewById.setVisibility(this.h != null ? 0 : 8);
        if (this.h != null) {
            a(findViewById, 0);
            setPullToRefreshEnabled(this.aw == 0);
        } else {
            setPullToRefreshEnabled(false);
        }
    }

    public SwipeRefreshLayout getSwipeRefreshLayout() {
        return this.P;
    }

    public void setFloatingControlsBackground(Drawable drawable) {
        setFloatingControlsBackground$4eb43225(drawable);
    }

    public final void setFloatingControlsBackground$4eb43225(Drawable drawable) {
        this.aq = drawable;
        if ((this.u != null && this.aB) || this.al) {
            setControlsBackground$4eb43225(this.aq);
        }
    }

    public void setSingleTabTitle(CharSequence charSequence) {
        this.B.setText(charSequence);
    }

    public void setSingleTabTitle(int i) {
        this.B.setText(i);
    }

    public void setSingleTabContentDescription(CharSequence charSequence) {
        this.B.setContentDescription(charSequence);
    }

    public void setOnPageChangeListener(dl dlVar) {
        this.ap = dlVar;
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.d = onScrollListener;
    }

    public void setOnScrollListener(ef efVar) {
        this.e = efVar;
    }

    public void setOnScrollListener(x xVar) {
        this.f = xVar;
    }

    public void setOnLayoutChangedListener(j jVar) {
        this.g = jVar;
    }

    public void setOnTabSelectedListener(k kVar) {
        this.c.setOnTabSelectedListener(kVar);
    }

    private void setBannerText$609c24db(CharSequence charSequence) {
        this.l.removeCallbacks(this.aU);
        this.aF = null;
        this.ar = charSequence;
        if (charSequence == null) {
            setBannerVisible$25decb5(false);
        } else {
            this.C.setText(charSequence);
            setBannerVisible$25decb5(true);
        }
    }

    public void setBannerText(CharSequence charSequence) {
        setBannerText$609c24db(charSequence);
    }

    public void setBannerOnClickListener(View.OnClickListener onClickListener) {
        this.C.setOnClickListener(onClickListener);
    }

    public CharSequence getBannerText() {
        return this.ar;
    }

    public final boolean b() {
        return this.ao && this.E.c;
    }

    public int getStatusBarHeight() {
        if (this.ao) {
            return this.as;
        }
        return 0;
    }

    public int getHeaderLockMode() {
        return this.i;
    }

    public void setHeaderShadowMode(int i) {
        if (this.an != i) {
            this.an = i;
            i();
        }
    }

    public void setHeaderMode(int i) {
        if (this.ak != i) {
            this.ak = i;
            i();
        }
    }

    public void setBackgroundParallaxRatio(float f) {
        if (this.ad != f) {
            this.ad = f;
            i();
        }
    }

    public void setContentProtectionMode(int i) {
        boolean z = i == 1;
        if (this.ab != z) {
            this.ab = z;
            g();
            i();
        }
    }

    public final void b(int i, int i2) {
        boolean z;
        if (this.aa != i) {
            this.aa = i;
            f();
            z = true;
        } else {
            z = false;
        }
        if (i2 != this.ac) {
            this.ac = i2;
            setControlsContainerHeight(this.ac - this.ah);
            if (!this.aJ) {
                n();
            }
            z = true;
        }
        if (z) {
            d(true);
        }
        c(false);
        i();
    }

    public int getTabMode() {
        return this.aa;
    }

    public int getHeaderHeight() {
        return this.ac;
    }

    public float getVisibleHeaderHeight() {
        if (this.aB) {
            return getNonScrollingFloatingHeaderHeight() + (getScrollingFloatingHeaderHeight() * this.av);
        }
        return getContentPosition() - this.ah;
    }

    public final boolean c() {
        return this.aB || this.al;
    }

    private void setSupportActionBar(Toolbar toolbar) {
        ((android.support.v7.a.e) getContext()).a(toolbar);
    }

    protected final void setActionBarTitleAlpha(float f) {
        if (this.aD != f) {
            this.aD = f;
            a(this.F, f);
        }
    }

    public void a(Toolbar toolbar, float f) {
        int max = (Math.max(0, Math.min(255, Math.round(255.0f * f))) << 24) | 16777215;
        toolbar.setTitleTextColor(max);
        toolbar.setSubtitleTextColor(max);
    }

    protected final float getActionBarTitleAlpha() {
        return this.aD;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.aK) {
            return;
        }
        this.aK = true;
        Integer num = n.get(this.F);
        n.put(this.F, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
        h();
        m();
        if (this.aj) {
            setActionBarTitleAlpha(0.0f);
        } else {
            setActionBarTitleAlpha(1.0f);
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d();
        super.onDetachedFromWindow();
    }

    public final void d() {
        if (this.aK) {
            this.aK = false;
            Integer valueOf = Integer.valueOf(n.get(this.F) == null ? 0 : r0.intValue() - 1);
            if (valueOf.intValue() == 0) {
                n.remove(this.F);
            } else {
                n.put(this.F, valueOf);
            }
            c((ViewGroup) null);
            this.l.removeCallbacksAndMessages(null);
            if (!this.V && valueOf.intValue() == 0) {
                this.M.c(0.0f);
                this.M.a(0);
            }
            this.aF = null;
        }
    }

    private boolean c(ViewGroup viewGroup) {
        if (this.O == viewGroup) {
            return this.O != null;
        }
        boolean z = this.O != null;
        if (this.O != null) {
            if (this.O instanceof ListView) {
                ((ListView) this.O).setOnScrollListener(null);
                this.aM.a(true);
            } else if (this.O instanceof RecyclerView) {
                ((RecyclerView) this.O).setOnScrollListener(null);
                this.aN.a(true);
            } else if (this.O instanceof w) {
                this.aO.a(true);
            }
            this.az = true;
        }
        this.O = viewGroup;
        if (this.O == null) {
            return false;
        }
        boolean z2 = this.az;
        if (!this.az) {
            this.az = this.O.isLayoutRequested();
        }
        if (this.O instanceof ListView) {
            ((ListView) this.O).setOnScrollListener(this.aM);
        } else if (this.O instanceof RecyclerView) {
            ((RecyclerView) this.O).setOnScrollListener(this.aN);
        }
        this.az = z2;
        if (z) {
            d(true);
        }
        if (this.h != null) {
            if (this.W) {
                this.N.getCurrentItem();
            }
            this.aL = true;
            return true;
        }
        this.aL = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        c(c(1));
    }

    private int b(int i) {
        int currentItem = this.N.getCurrentItem();
        if (i == 0) {
            currentItem--;
        }
        if (i == 2) {
            return currentItem + 1;
        }
        return currentItem;
    }

    public ViewGroup getCurrentListView() {
        return c(1);
    }

    private ViewGroup c(int i) {
        View view;
        if (this.N == null && i == 1) {
            return a(this.s.findViewById(this.T));
        }
        int b2 = b(i);
        if (this.N != null && this.N.getAdapter() != null && b2 >= 0 && b2 < this.N.getAdapter().a()) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.N.getChildCount()) {
                    view = null;
                    break;
                }
                View childAt = this.N.getChildAt(i2);
                dh a2 = this.N.a(childAt);
                Integer valueOf = a2 == null ? null : Integer.valueOf(a2.f372b);
                if (valueOf != null && valueOf.intValue() == b2) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        } else {
            view = null;
        }
        if (view != null) {
            return a(view.findViewById(this.T));
        }
        return null;
    }

    private static ViewGroup a(View view) {
        if (view == null || (view instanceof ListView) || (view instanceof RecyclerView) || (view instanceof w)) {
            return (ViewGroup) view;
        }
        throw new IllegalStateException("Found a view that isn't a ListView or a RecyclerView or a PlayScrollableContentView implementation");
    }

    private float getContentPosition() {
        return this.aw == -1 ? this.ah : Math.max(this.ah, this.ac - this.aw);
    }

    private float getFullFloatingHeaderHeight() {
        return getActionBarHeight() + getVisibleTabBarHeight();
    }

    private float getNonScrollingFloatingHeaderHeight() {
        switch (this.ak) {
            case 1:
                return 0.0f + getVisibleTabBarHeight();
            case 2:
                return 0.0f + getActionBarHeight();
            case 3:
                return 0.0f + getVisibleTabBarHeight() + getActionBarHeight();
            default:
                return 0.0f;
        }
    }

    private float getScrollingFloatingHeaderHeight() {
        switch (this.ak) {
            case 0:
                return getVisibleTabBarHeight() + getActionBarHeight();
            case 1:
                return getActionBarHeight();
            case 2:
                return getVisibleTabBarHeight();
            case 3:
                return 0.0f;
            default:
                throw new IllegalStateException();
        }
    }

    private float getVisibleTabBarHeight() {
        return a(getContext(), this.aa);
    }

    public int getActionBarHeight() {
        return this.H;
    }

    public float getActionBarTranslationY() {
        return this.M.b();
    }

    public float getControlsContainerTranslationY() {
        return this.v.b();
    }

    public float getControlsContainerTranslatedTop() {
        com.google.android.play.bpkg.a aVar = this.v;
        if (aVar.f6812a == null) {
            return 0.0f;
        }
        int top = aVar.f6812a.getTop();
        if (Build.VERSION.SDK_INT >= 11) {
            return aVar.f6812a.getTranslationY() + top;
        }
        if (aVar.e) {
            return top;
        }
        return aVar.c + top;
    }

    public float getFloatingHeaderElevation() {
        return getResources().getDimensionPixelSize(com.google.android.play.i.play_header_list_floating_elevation);
    }

    private static int a(Context context, int i) {
        switch (i) {
            case 0:
            case 1:
                return context.getResources().getDimensionPixelSize(com.google.android.play.i.play_header_list_tab_strip_height);
            case 2:
                return 0;
            default:
                throw new IllegalStateException();
        }
    }

    public int getTabBarHeight() {
        return a(getContext(), this.aa);
    }

    public int getBannerHeight() {
        return getResources().getDimensionPixelSize(com.google.android.play.i.play_header_list_banner_height);
    }

    private void f() {
        switch (this.aa) {
            case 0:
                this.A.setVisibility(0);
                this.B.setVisibility(4);
                this.c.setVisibility(0);
                return;
            case 1:
                this.A.setVisibility(0);
                this.B.setVisibility(0);
                this.c.setVisibility(4);
                return;
            case 2:
                this.A.setVisibility(4);
                this.B.setVisibility(0);
                this.c.setVisibility(0);
                return;
            default:
                throw new IllegalStateException("Unexpected tab mode: " + this.aa);
        }
    }

    private void g() {
        if (this.ab) {
            this.K.setBackgroundDrawable(this.ag);
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(8);
        }
    }

    private void h() {
        ViewPager viewPager;
        if (this.W && this.N == null && (viewPager = (ViewPager) this.s.findViewById(this.S)) != null) {
            setViewPager(viewPager);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        this.N = viewPager;
        this.c.setViewPager(viewPager);
    }

    private View d(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getId() == this.U) {
                return childAt;
            }
        }
        return null;
    }

    public final int b(ViewGroup viewGroup) {
        View d;
        if (viewGroup instanceof ListView) {
            ListView listView = (ListView) viewGroup;
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int childCount = listView.getChildCount();
            if (firstVisiblePosition != 0 || childCount <= 0) {
                return -1;
            }
            return -listView.getChildAt(0).getTop();
        }
        if ((!(viewGroup instanceof RecyclerView) && !(viewGroup instanceof w)) || (d = d(viewGroup)) == null) {
            return -1;
        }
        return -d.getTop();
    }

    public int a(ViewGroup viewGroup) {
        View d = d(viewGroup);
        if (d == null) {
            return -1;
        }
        return d.getBottom();
    }

    private void i() {
        float f;
        float min;
        float f2;
        boolean z = true;
        int bannerHeight = getBannerHeight();
        int statusBarHeight = getStatusBarHeight();
        float f3 = this.at * (bannerHeight + statusBarHeight);
        this.D.c(f3 - bannerHeight);
        float max = Math.max(0.0f, f3 - statusBarHeight);
        this.t.c(max);
        float contentPosition = getContentPosition();
        float scrollingFloatingHeaderHeight = getScrollingFloatingHeaderHeight();
        if (this.aB) {
            f = (-this.ac) + getNonScrollingFloatingHeaderHeight() + (this.av * scrollingFloatingHeaderHeight) + this.ah + max;
        } else {
            f = (contentPosition - this.ac) + max;
        }
        this.v.c(f + 1.0f);
        this.x.c(f);
        if (this.ao) {
            PlayHeaderStatusBarUnderlay playHeaderStatusBarUnderlay = this.E;
            boolean z2 = this.aB;
            boolean z3 = contentPosition - ((float) this.ah) < scrollingFloatingHeaderHeight;
            if (f6889b) {
                boolean z4 = playHeaderStatusBarUnderlay.c;
                playHeaderStatusBarUnderlay.c = z2 || z3;
                int round = Math.round(f3);
                if (playHeaderStatusBarUnderlay.c && playHeaderStatusBarUnderlay.f6895a > round) {
                    round = playHeaderStatusBarUnderlay.f6895a;
                }
                if (f3 >= 1.0f || z2) {
                    playHeaderStatusBarUnderlay.a(round);
                    playHeaderStatusBarUnderlay.a(1, false);
                } else {
                    int i = playHeaderStatusBarUnderlay.c ? 1 : 2;
                    if (playHeaderStatusBarUnderlay.f6896b != i) {
                        if (!playHeaderStatusBarUnderlay.c && z4) {
                            round = playHeaderStatusBarUnderlay.f6895a;
                        }
                        playHeaderStatusBarUnderlay.a(round);
                        if (round == 0) {
                            playHeaderStatusBarUnderlay.a(2, false);
                        } else {
                            playHeaderStatusBarUnderlay.a(i, true);
                        }
                    }
                }
            }
        }
        if (this.ak != 0 && this.ak != 1) {
            min = max;
        } else if (this.aB) {
            min = max - ((1.0f - this.av) * scrollingFloatingHeaderHeight);
        } else {
            min = Math.min(max, (((contentPosition - this.ah) + max) - getVisibleTabBarHeight()) - getActionBarHeight());
        }
        this.M.c(this.L + min);
        if (f6888a) {
            float measuredHeight = this.y.getMeasuredHeight();
            float f4 = ((this.ac - measuredHeight) - this.ah) * 0.5f;
            switch (this.ai) {
                case 0:
                case 1:
                    boolean z5 = f + f4 >= min + ((float) getActionBarHeight());
                    if (this.aA != z5) {
                        this.aA = z5;
                        a(this.aA ? 1.0f : 0.0f, true);
                        break;
                    }
                    break;
                case 2:
                    float max2 = Math.max(0.0f, (f + measuredHeight) / measuredHeight);
                    this.aA = max2 > 0.0f;
                    a(max2, false);
                    break;
            }
        }
        if (this.ab) {
            if (this.O != null) {
                int a2 = a(this.O);
                if (a2 != -1) {
                    f2 = a2 + max;
                } else if (!this.aB) {
                    f2 = this.ac + max;
                }
                this.r.c(f2);
            }
            f2 = max;
            this.r.c(f2);
        }
        if (this.aw == -1) {
            this.o.setVisibility(4);
        } else {
            if (this.o.getVisibility() == 4) {
                this.o.setVisibility(0);
            } else {
                z = false;
            }
            float max3 = Math.max((-this.o.getMeasuredHeight()) / this.ad, ((-this.aw) * this.ad) + max);
            this.p.c(max3);
            float measuredHeight2 = (max3 + this.o.getMeasuredHeight()) - max;
            if (z && measuredHeight2 > this.aP) {
                this.p.a(0.0f);
                this.p.b(1.0f);
            }
        }
        m();
        if (this.g != null) {
            this.g.a();
        }
    }

    final void a(int i, int i2, int i3) {
        boolean z;
        PlayHeaderListLayout playHeaderListLayout;
        if (this.h != null) {
            setPullToRefreshEnabled(i3 == 0);
        }
        if (!this.az || i != 0) {
            this.aw = i3;
            switch (i) {
                case 0:
                    z = true;
                    playHeaderListLayout = this;
                    break;
                case 1:
                    if (i2 > 0.0f) {
                        z = false;
                        playHeaderListLayout = this;
                        break;
                    } else {
                        z = true;
                        playHeaderListLayout = this;
                        break;
                    }
            }
            playHeaderListLayout.aE = z;
            if (!j() && this.aB) {
                float scrollingFloatingHeaderHeight = getScrollingFloatingHeaderHeight();
                if (scrollingFloatingHeaderHeight == 0.0f) {
                    this.av = 1.0f;
                } else if (this.i == 0) {
                    this.av -= i2 / scrollingFloatingHeaderHeight;
                } else if (this.i == 2) {
                    float contentPosition = getContentPosition() - this.ah;
                    float nonScrollingFloatingHeaderHeight = getNonScrollingFloatingHeaderHeight();
                    if (contentPosition <= nonScrollingFloatingHeaderHeight) {
                        a(false, true);
                    } else {
                        this.j = false;
                        k();
                        if (i2 >= 0 || this.av > 0.0f) {
                            this.av -= i2 / scrollingFloatingHeaderHeight;
                        } else {
                            this.av = (contentPosition - nonScrollingFloatingHeaderHeight) / scrollingFloatingHeaderHeight;
                        }
                    }
                }
                this.av = Math.min(1.0f, Math.max(0.0f, this.av));
            }
            i();
            if (i2 == 0) {
                this.k = 1;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean e(ViewGroup viewGroup) {
        int count;
        if (viewGroup != 0) {
            if (viewGroup instanceof ListView) {
                ListAdapter adapter = ((ListView) viewGroup).getAdapter();
                count = adapter == null ? 0 : adapter.getCount();
            } else if (viewGroup instanceof RecyclerView) {
                dt adapter2 = ((RecyclerView) viewGroup).getAdapter();
                count = adapter2 == null ? 0 : adapter2.a();
            } else if (viewGroup instanceof w) {
                Adapter a2 = ((w) viewGroup).a();
                count = a2 == null ? 0 : a2.getCount();
            } else {
                throw new IllegalStateException("Unexpected listview type: " + viewGroup);
            }
            if (count > 1) {
                if (viewGroup.getChildCount() > 1) {
                    return true;
                }
                if (viewGroup.getChildCount() == 1 && viewGroup.getChildAt(0).getId() != this.U) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    final void a(int i) {
        boolean z = true;
        this.l.removeCallbacks(this.aS);
        this.l.removeCallbacks(this.aT);
        if (i == 0) {
            float contentPosition = getContentPosition() - this.ah;
            boolean z2 = contentPosition > 0.0f;
            if (this.aE) {
                z2 = z2 || getVisibleHeaderHeight() >= ((float) getActionBarHeight()) * 0.5f;
            }
            if (this.i != 0) {
                if (this.i != 2) {
                    z = false;
                } else if (!z2 || contentPosition <= getNonScrollingFloatingHeaderHeight()) {
                    z = false;
                }
            }
            if (z) {
                this.aG = z2;
                this.l.postDelayed(z2 ? this.aT : this.aS, 50L);
            }
            d(false);
        }
    }

    public boolean getHeroElementVisible() {
        return this.aA;
    }

    public boolean getLastSnapControlsWasDown() {
        return this.aG;
    }

    private void a(float f, boolean z) {
        if (z) {
            switch (this.ai) {
                case 0:
                    com.google.android.play.bpkg.a aVar = this.z;
                    if (aVar.f6812a == null) {
                        aVar.d = f;
                        break;
                    } else if (Build.VERSION.SDK_INT >= 12) {
                        aVar.f6812a.animate().scaleX(f).scaleY(f).setDuration(100L);
                        break;
                    } else {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(aVar.d, f, aVar.d, f);
                        scaleAnimation.setDuration(100L);
                        scaleAnimation.setFillAfter(true);
                        if (Build.VERSION.SDK_INT < 12) {
                            scaleAnimation.setAnimationListener(new com.google.android.play.bpkg.c(aVar, f));
                        }
                        aVar.f6812a.startAnimation(scaleAnimation);
                        break;
                    }
                case 1:
                case 2:
                    this.z.b(f);
                    break;
            }
        }
        switch (this.ai) {
            case 0:
                com.google.android.play.bpkg.a aVar2 = this.z;
                if (aVar2.f6812a == null) {
                    aVar2.d = f;
                    break;
                } else if (Build.VERSION.SDK_INT < 11) {
                    if (aVar2.d != f) {
                        aVar2.d = f;
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(aVar2.d, aVar2.d, aVar2.d, aVar2.d);
                        scaleAnimation2.setDuration(0L);
                        scaleAnimation2.setFillAfter(true);
                        aVar2.f6812a.startAnimation(scaleAnimation2);
                        break;
                    }
                } else {
                    aVar2.f6812a.setScaleX(f);
                    aVar2.f6812a.setScaleY(f);
                    break;
                }
                break;
            case 1:
            case 2:
                this.z.a(f);
                break;
        }
    }

    @TargetApi(11)
    public final void a(boolean z, boolean z2) {
        if (this.ak != 3) {
            this.l.removeCallbacks(this.aS);
            this.l.removeCallbacks(this.aT);
            float visibleHeaderHeight = getVisibleHeaderHeight();
            float nonScrollingFloatingHeaderHeight = getNonScrollingFloatingHeaderHeight();
            float fullFloatingHeaderHeight = getFullFloatingHeaderHeight();
            if (z) {
                nonScrollingFloatingHeaderHeight -= 1.0f;
            } else if (getContentPosition() - this.ah <= nonScrollingFloatingHeaderHeight) {
                if (this.i == 2) {
                    if (!this.j) {
                        this.j = true;
                    } else {
                        return;
                    }
                }
                fullFloatingHeaderHeight += 1.0f;
            } else {
                return;
            }
            if (visibleHeaderHeight > nonScrollingFloatingHeaderHeight && visibleHeaderHeight < fullFloatingHeaderHeight) {
                float f = z ? 1.0f : 0.0f;
                this.aG = z;
                if (!this.aB) {
                    b(true, z2);
                }
                if (z2) {
                    k();
                    if (Build.VERSION.SDK_INT >= 11) {
                        this.aH = a("floatingFraction", getFloatingFraction(), f).setDuration(200L);
                        this.aH.start();
                        return;
                    } else {
                        this.aI = new i(this, getFloatingFraction(), f);
                        this.aI.setDuration(200L);
                        startAnimation(this.aI);
                        return;
                    }
                }
                setFloatingFraction$254d549(f);
            }
        }
    }

    @TargetApi(11)
    private void k() {
        if (this.aH != null) {
            this.aH.cancel();
            this.aH = null;
        }
        if (this.aI != null) {
            this.aI.cancel();
            if (this.aI == getAnimation()) {
                clearAnimation();
            }
            this.aI = null;
        }
    }

    protected void setFloatingFraction(float f) {
        setFloatingFraction$254d549(f);
    }

    private void setFloatingFraction$254d549(float f) {
        if (this.aB && this.av != f) {
            this.av = f;
            i();
            d(false);
        }
    }

    protected final float getFloatingFraction() {
        if (this.aB) {
            return this.av;
        }
        return 0.0f;
    }

    private void b(boolean z, boolean z2) {
        if (this.aB != z) {
            this.j = false;
            if (z) {
                float visibleHeaderHeight = getVisibleHeaderHeight() - getNonScrollingFloatingHeaderHeight();
                float scrollingFloatingHeaderHeight = getScrollingFloatingHeaderHeight();
                if (scrollingFloatingHeaderHeight == 0.0f || this.i == 1) {
                    this.av = 1.0f;
                } else {
                    this.av = Math.max(0.0f, Math.min(1.0f, visibleHeaderHeight / scrollingFloatingHeaderHeight));
                }
            } else {
                this.av = 0.0f;
            }
            this.aB = z;
            if (!this.al) {
                if (this.aB) {
                    setControlsBackground$4eb43225(this.aq);
                } else {
                    setControlsBackground$4eb43225(new ColorDrawable(0));
                }
            }
            if (this.aj) {
                float f = this.aB ? 1.0f : 0.0f;
                if (!z2) {
                    setActionBarTitleAlpha(f);
                } else if (f != getActionBarTitleAlpha()) {
                    if (Build.VERSION.SDK_INT >= 11) {
                        a("actionBarTitleAlpha", getActionBarTitleAlpha(), f).setDuration(200L).start();
                    } else {
                        f fVar = new f(this, getActionBarTitleAlpha(), f);
                        fVar.setDuration(200L);
                        startAnimation(fVar);
                    }
                }
            }
            m();
            c(z2);
            l();
        }
    }

    private void c(boolean z) {
        boolean z2;
        if (this.aa == 0) {
            switch (this.am) {
                case 1:
                    z2 = true;
                    break;
                case 2:
                    z2 = false;
                    break;
                default:
                    z2 = this.aB;
                    break;
            }
            this.c.a(z2, z);
        }
    }

    private void l() {
        boolean z;
        switch (this.ae) {
            case 1:
                if (!this.aB && !this.al) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            case 2:
                if (!this.aB && !this.al) {
                    z = true;
                    break;
                } else {
                    z = false;
                    break;
                }
                break;
            case 3:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        boolean z2 = this.af == 0;
        PlayHeaderListTabStrip playHeaderListTabStrip = this.c;
        if (playHeaderListTabStrip.e == z) {
            return;
        }
        playHeaderListTabStrip.e = z;
        int childCount = playHeaderListTabStrip.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            TextView textView = (TextView) playHeaderListTabStrip.d.getChildAt(i);
            playHeaderListTabStrip.a(textView, playHeaderListTabStrip.e);
            if (z2) {
                textView.setBackgroundResource(playHeaderListTabStrip.e ? playHeaderListTabStrip.f : 0);
            }
        }
    }

    private void setControlsBackground$4eb43225(Drawable drawable) {
        this.J.setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void m() {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        switch (this.an) {
            case 1:
                if (!this.aB || getVisibleHeaderHeight() <= 0.0f) {
                    z2 = false;
                    break;
                }
                break;
            case 2:
                z2 = z3;
                break;
            case 3:
                if (getVisibleHeaderHeight() <= 0.0f) {
                    z2 = false;
                    break;
                }
                break;
            default:
                if ((this.aB || this.al) && getVisibleHeaderHeight() > 0.0f) {
                    if (this.o.getVisibility() != 0) {
                        z = false;
                    } else {
                        z = getMeasuredHeight() == 0 || !(this.aB || this.al) || Math.max(0.0f, Math.max(0.0f, ((float) this.o.getMeasuredHeight()) + this.p.b()) - getVisibleHeaderHeight()) > 0.0f;
                    }
                    if (!z) {
                        z3 = true;
                    }
                }
                z2 = z3;
                break;
        }
        setHeaderShadowVisible(z2);
    }

    @TargetApi(21)
    private void setHeaderShadowVisible(boolean z) {
        if (this.aC != z) {
            this.aC = z;
            if (this.aJ) {
                boolean z2 = z && ((double) getFloatingFraction()) > 0.25d;
                float floatingHeaderElevation = z ? getFloatingHeaderElevation() : 0.0f;
                int i = z ? 150 : 0;
                int i2 = z2 ? 100 : 0;
                this.v.a(floatingHeaderElevation, i, i2);
                this.M.a(floatingHeaderElevation, i, i2);
                this.C.animate().z(floatingHeaderElevation).setStartDelay(i2).setDuration(i);
                if (this.ao) {
                    this.E.animate().z(floatingHeaderElevation).setStartDelay(i2).setDuration(i);
                    return;
                }
                return;
            }
            this.w.setVisibility(z ? 0 : 4);
        }
    }

    public ViewGroup getToolbarContainer() {
        if (this.G != null) {
            return this.G;
        }
        if (this.V) {
            ViewGroup viewGroup = (ViewGroup) findViewById(com.google.android.play.k.toolbar_container);
            viewGroup.setVisibility(0);
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) ((Activity) getContext()).getWindow().findViewById(com.google.android.play.k.action_bar_container);
        if (!f6888a) {
            findViewById(com.google.android.play.k.toolbar_container).setMinimumHeight(getActionBarHeight());
            return viewGroup2;
        }
        return viewGroup2;
    }

    public Toolbar getToolbar() {
        return this.F;
    }

    private void d(boolean z) {
        boolean z2;
        if (this.N != null) {
            if (z) {
                z2 = d(1);
                if (!z2) {
                    this.az = false;
                }
            } else {
                z2 = false;
            }
            if (d(0) | z2 | d(2)) {
                this.k = z2 ? 2 : 1;
            } else {
                this.k = 0;
            }
        }
    }

    private boolean d(int i) {
        int b2;
        if (this.N == null || this.N.getAdapter() == null || (b2 = b(i)) < 0 || b2 >= this.N.getAdapter().a()) {
            return false;
        }
        ViewGroup c = c(i);
        boolean z = i == 1;
        if (!e(c)) {
            return true;
        }
        int a2 = a(c);
        if (a2 == -1) {
            if (this.aB) {
                return false;
            }
            this.az = true;
            if (c instanceof ListView) {
                ((ListView) c).setSelectionFromTop(0, 0);
            } else if (c instanceof RecyclerView) {
                ((RecyclerView) c).a(0);
            }
            this.az = false;
            return true;
        }
        int desiredContentTop = a2 - getDesiredContentTop();
        if (this.aB && desiredContentTop < 0) {
            return false;
        }
        if (Math.abs(desiredContentTop) > 0 && by.b((View) c, desiredContentTop)) {
            this.az = true;
            if (c instanceof ListView) {
                ListView listView = (ListView) c;
                if (Build.VERSION.SDK_INT >= 19) {
                    listView.scrollListBy(desiredContentTop);
                } else {
                    listView.smoothScrollBy(desiredContentTop, 0);
                }
            } else if (c instanceof RecyclerView) {
                ((RecyclerView) c).scrollBy(0, desiredContentTop);
            }
            this.az = false;
            if (!z) {
                return false;
            }
            this.ax = true;
            return false;
        }
        if (!z) {
            return false;
        }
        b(true);
        return false;
    }

    private int getDesiredContentTop() {
        return ((int) (this.aB && (this.ak == 0 || this.ak == 2) ? getFullFloatingHeaderHeight() : getVisibleHeaderHeight())) + this.ah;
    }

    private void setBannerVisible$25decb5(boolean z) {
        int bannerHeight;
        int i = 0;
        if (z != this.au) {
            this.au = z;
            if (!f6888a) {
                this.C.setVisibility(z ? 0 : 8);
                bannerHeight = z ? getBannerHeight() : 0;
            } else {
                a("bannerFraction", getBannerFraction(), z ? 1.0f : 0.0f).setDuration(200L).start();
                bannerHeight = 0;
                i = z ? getBannerHeight() : 0;
            }
            com.google.android.play.bpkg.a aVar = this.t;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.f6812a.getLayoutParams();
            int i2 = marginLayoutParams.topMargin;
            int i3 = marginLayoutParams.bottomMargin;
            marginLayoutParams.topMargin = bannerHeight;
            marginLayoutParams.bottomMargin = i;
            if (aVar.e && Build.VERSION.SDK_INT < 11) {
                marginLayoutParams.topMargin += aVar.c;
            }
            if (i2 == marginLayoutParams.topMargin && i3 == marginLayoutParams.bottomMargin) {
                return;
            }
            aVar.f6812a.setLayoutParams(marginLayoutParams);
        }
    }

    protected void setBannerFraction(float f) {
        if (f != this.at) {
            this.at = f;
            i();
        }
    }

    protected final float getBannerFraction() {
        return this.at;
    }

    private void setControlsContainerHeight(int i) {
        this.I = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.u.getLayoutParams();
        layoutParams.height = this.as + i;
        this.u.setLayoutParams(layoutParams);
    }

    private void n() {
        setHeaderShadowTopMargin((this.ac - this.ah) + this.as);
    }

    private void setHeaderShadowTopMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams.setMargins(0, i, 0, 0);
        this.w.setLayoutParams(layoutParams);
    }

    @TargetApi(11)
    private ObjectAnimator a(String str, float f, float f2) {
        ObjectAnimator objectAnimator = this.aR.get(str);
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, str, f, f2);
        this.aR.put(str, ofFloat);
        return ofFloat;
    }

    private void setPullToRefreshEnabled(boolean z) {
        if (z != (this.R.getScrollY() == 0)) {
            this.R.scrollTo(0, z ? 0 : 1);
        }
    }

    public void setBannerText(int i) {
        if (i == 0) {
            setBannerText((CharSequence) null);
        } else {
            setBannerText$609c24db(getResources().getText(i));
        }
    }

    private boolean j() {
        float fullFloatingHeaderHeight;
        boolean z;
        if (this.aw == -1) {
            z = true;
        } else {
            float f = this.ac - this.ah;
            if (this.aB) {
                fullFloatingHeaderHeight = (f - getFullFloatingHeaderHeight()) + 1.0f;
            } else {
                fullFloatingHeaderHeight = f - (this.i == 1 ? getFullFloatingHeaderHeight() : getNonScrollingFloatingHeaderHeight());
            }
            z = this.aw >= Math.round(fullFloatingHeaderHeight);
        }
        if (z == this.aB) {
            return false;
        }
        b(z, true);
        return true;
    }

    private void b(boolean z) {
        if (e(this.O)) {
            this.aw = b(this.O);
            if (this.h != null) {
                setPullToRefreshEnabled(this.aw == 0);
            }
            j();
            if (z) {
                i();
            }
        }
    }
}
