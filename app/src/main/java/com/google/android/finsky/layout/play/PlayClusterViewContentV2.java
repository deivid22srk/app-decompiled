package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.dt;
import android.support.v7.widget.eg;
import android.support.v7.widget.eq;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class PlayClusterViewContentV2 extends ah implements com.google.android.finsky.api.model.x, com.google.android.play.image.k {
    private int[] A;
    private com.google.android.finsky.layout.t B;
    private float C;
    private float D;
    private int E;
    private final boolean F;
    private boolean G;
    private List<com.google.android.play.image.j> H;
    private Handler I;
    private Runnable J;
    private boolean K;
    private int q;
    protected int t;
    protected int u;
    protected int v;
    protected com.google.android.finsky.layout.s w;
    protected int x;
    private LayoutInflater y;
    private boolean z;

    public PlayClusterViewContentV2(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayClusterViewContentV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.PlayClusterViewContent);
        this.u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.v = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        setLayoutManager(new LinearLayoutManager(0));
        a(new ck(this, 0 == true ? 1 : 0));
        int a2 = com.google.android.play.utils.e.a(context);
        this.F = a2 == 4 || a2 == 3 || a2 == 2;
        if (this.F) {
            this.I = new Handler(Looper.myLooper());
        }
    }

    public String getChildContentSourceId() {
        return this.w.a();
    }

    public com.google.android.finsky.layout.t getClusterContentConfigurator() {
        return this.B;
    }

    @Override // com.google.android.finsky.layout.play.ah, com.google.android.finsky.adapters.ap
    public final void ab_() {
        super.ab_();
        this.w = null;
        if (this.H != null) {
            Iterator<com.google.android.play.image.j> it = this.H.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.H.clear();
        }
        if (this.I != null && this.J != null) {
            this.I.removeCallbacks(this.J);
        }
        dt adapter = getAdapter();
        if (adapter instanceof cj) {
            cj cjVar = (cj) adapter;
            for (eq eqVar : (eq[]) cjVar.c.toArray(new eq[cjVar.c.size()])) {
                cjVar.a(eqVar);
            }
        }
    }

    @Override // com.google.android.finsky.layout.play.ah
    protected int getTrailingSpacerCount() {
        return ((cj) getAdapter()).c() - 1;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        this.H.remove(jVar);
    }

    public final boolean b(int i) {
        if (this.t == i) {
            return false;
        }
        this.t = i;
        requestLayout();
        return true;
    }

    private int getScrollPositionInternal() {
        int scrolledToItemPosition = getScrolledToItemPosition();
        if (scrolledToItemPosition >= 0) {
            return scrolledToItemPosition + 1;
        }
        return -1;
    }

    public final void a(com.google.android.finsky.layout.s sVar, com.google.android.finsky.layout.t tVar, int i, boolean z, eg egVar, Bundle bundle, int[] iArr) {
        super.m();
        this.w = sVar;
        this.C = tVar.a();
        this.x = Math.round(i / this.C);
        this.z = z;
        this.A = iArr;
        this.B = tVar;
        this.K = ((double) tVar.c()) > 0.0d;
        this.D = this.B.a(this.w);
        dt adapter = getAdapter();
        if (adapter == null) {
            setAdapter(new cj(this));
            setRecycledViewPool(egVar);
        } else {
            adapter.f774a.a();
            m_();
            a(0);
            this.G = false;
        }
        if (this.w instanceof com.google.android.finsky.layout.bs) {
            a(((com.google.android.finsky.layout.bs) this.w).e() + 1);
        }
        if (bundle != null) {
            this.G = true;
            a(bundle.getInt("PlayClusterViewContentV2.recyclerViewScrollPosition", -1));
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void a(int i) {
        if (i >= 0) {
            this.q = i;
            ((LinearLayoutManager) getLayoutManager()).a(i, getLeadingGapForSnapping());
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.w instanceof com.google.android.finsky.layout.bs) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            ((com.google.android.finsky.layout.bs) this.w).a(accessibilityEvent, linearLayoutManager.n() - 1, linearLayoutManager.o() - 1);
        }
    }

    public int getScrolledToItemPosition() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int n = linearLayoutManager.n();
        int i = 0;
        if (n != -1) {
            int o = linearLayoutManager.o();
            int i2 = -1;
            while (n <= o) {
                if (n > 0) {
                    View a2 = linearLayoutManager.a(n);
                    int leadingGapForSnapping = getLeadingGapForSnapping() + (a2.getWidth() / 2);
                    int left = leadingGapForSnapping - a2.getLeft();
                    int right = a2.getRight() - leadingGapForSnapping;
                    if (left >= 0 && right > 0) {
                        return n - 1;
                    }
                    int min = Math.min(Math.abs(left), Math.abs(right));
                    if (i2 < 0 || min < i) {
                        i2 = n;
                        i = min;
                    }
                }
                n++;
            }
            if (i2 > 0) {
                return i2 - 1;
            }
        }
        if (this.q > 0) {
            return this.q - 1;
        }
        return -1;
    }

    public final PlayHighlightsBannerItemView c(int i) {
        return (PlayHighlightsBannerItemView) getLayoutManager().a(i + 1);
    }

    protected int getLeadingItemGap() {
        return 0;
    }

    final int d(int i, int i2) {
        if (this.B.b() == 3) {
            return 0;
        }
        return getLeadingItemGap() * e(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i, int i2) {
        switch (this.B.b()) {
            case 0:
                return (int) ((i - (this.t * 2)) / (this.x + this.B.c()));
            case 1:
                return this.B.a(i2);
            case 2:
                int a2 = this.B.a(i2);
                int i3 = i - this.t;
                int i4 = i3 / a2;
                int d = this.w.d();
                int i5 = i3 - (i4 * a2);
                int c = (int) (a2 * this.B.c());
                if (i5 > c || d == i4) {
                    return a2;
                }
                return a2 - ((c - i5) / i4);
            default:
                throw new UnsupportedOperationException("Can only be called for fixed policy");
        }
    }

    @Override // com.google.android.finsky.layout.play.ah
    protected final void k() {
        super.k();
        this.q = getScrollPositionInternal();
    }

    protected int getPreloadRadius() {
        return (getChildCount() <= 2 || this.C == 0.0f) ? -1 : 1;
    }

    @Override // com.google.android.finsky.layout.play.ah
    protected final void l() {
        super.l();
        a(getScrollPositionInternal());
    }

    public final void a(Bundle bundle) {
        bundle.putInt("PlayClusterViewContentV2.recyclerViewScrollPosition", getScrollPositionInternal());
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        cj cjVar = (cj) getAdapter();
        if (this.w.X_()) {
            cj.a(cjVar, 1);
        } else {
            cj.a(cjVar, 0);
        }
    }

    @Override // com.google.android.finsky.layout.play.ah
    protected final boolean j() {
        return (this.B == null || this.B.b() == 3) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        int a2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.B == null) {
            setMeasuredDimension(size, i2);
            return;
        }
        this.E = this.B.b() != 3 ? e(size, size2) : 0;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            a2 = View.MeasureSpec.getSize(i2);
        } else {
            a2 = this.B.a(this.E, this.D);
        }
        setLeadingGapForSnapping(d(size, a2) + this.t);
        setMeasuredDimension(size, a2);
    }
}
