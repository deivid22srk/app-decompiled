package com.google.android.finsky.layout.play;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.FinskyTabStrip;
import com.google.android.finsky.utils.ik;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.search.PlaySearchToolbar;

/* loaded from: classes.dex */
public class FinskyHeaderListLayout extends PlayHeaderListLayout implements com.google.android.finsky.layout.bt {

    /* renamed from: a, reason: collision with root package name */
    public View f3293a;
    private View l;
    private ViewGroup m;
    private int n;
    private x o;
    private com.google.android.finsky.layout.ad p;
    private final dd q;
    private View r;
    private final boolean s;
    private final db t;
    private int u;
    private int v;
    private boolean w;

    public static int a(Context context, int i) {
        return PlayHeaderListLayout.a(context, i, PlaySearchToolbar.a(context));
    }

    public FinskyHeaderListLayout(Context context) {
        this(context, null);
    }

    public FinskyHeaderListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = new w(this);
        this.w = true;
        this.t = new db(this.q, context);
        this.s = context.getResources().getBoolean(R.bool.use_wide_layout);
    }

    @Override // com.google.android.play.headerlist.PlayHeaderListLayout
    public final void a(com.google.android.play.headerlist.g gVar) {
        super.a(gVar);
        this.o = (x) gVar;
        this.f3293a = this.o.f3518b;
        this.l = findViewById(R.id.background_container);
        this.m = (ViewGroup) findViewById(R.id.controls_container);
        this.p = this.o.q();
    }

    public void setActionBarTitleColor(int i) {
        this.u = i;
        Toolbar toolbar = getToolbar();
        if (toolbar != null) {
            a(toolbar, this.v);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.headerlist.PlayHeaderListLayout
    public final void a(Toolbar toolbar, float f) {
        this.v = Math.max(0, Math.min(255, Math.round(255.0f * f)));
        toolbar.setTitleTextColor(android.support.v4.c.a.b(this.u, this.v));
    }

    public void setBackgroundViewForTouchPassthrough(View view) {
        this.r = view;
    }

    public void setShouldUseScrollLocking(boolean z) {
        this.w = z;
    }

    @Override // com.google.android.finsky.layout.bt
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 == false) goto L12;
     */
    @Override // com.google.android.play.headerlist.PlayHeaderListLayout, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.play.FinskyHeaderListLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r2 == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    @Override // com.google.android.play.headerlist.PlayHeaderListLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r8 = 0
            r1 = 1
            r0 = 0
            boolean r2 = r9.w
            if (r2 == 0) goto L10
            com.google.android.finsky.layout.play.db r2 = r9.t
            android.view.View r3 = r2.i
            if (r3 != 0) goto L18
            r2 = r0
        Le:
            if (r2 != 0) goto L16
        L10:
            boolean r2 = super.onTouchEvent(r10)
            if (r2 == 0) goto L17
        L16:
            r0 = r1
        L17:
            return r0
        L18:
            float r3 = r10.getX()
            float r4 = r10.getY()
            r2.a(r10)
            int r5 = r10.getAction()
            switch(r5) {
                case 1: goto L87;
                case 2: goto L30;
                case 3: goto L9b;
                default: goto L2a;
            }
        L2a:
            r2.e = r3
            r2.f = r4
            r2 = r1
            goto Le
        L30:
            boolean r5 = r2.c
            if (r5 != 0) goto L2a
            boolean r5 = r2.d
            if (r5 != 0) goto L2a
            float r5 = r2.g
            float r6 = r2.e
            float r6 = r3 - r6
            float r6 = java.lang.Math.abs(r6)
            float r5 = r5 + r6
            r2.g = r5
            float r5 = r2.h
            float r6 = r2.f
            float r6 = r4 - r6
            float r6 = java.lang.Math.abs(r6)
            float r5 = r5 + r6
            r2.h = r5
            float r5 = r2.g
            float r6 = r2.h
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L77
            float r5 = r2.g
            int r6 = r2.f3488b
            float r6 = (float) r6
            r7 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 * r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L2a
            r2.c = r1
            r2.a()
            android.view.MotionEvent r5 = r2.j
            if (r5 == 0) goto L2a
            android.view.MotionEvent r5 = r2.j
            r5.recycle()
            r2.j = r8
            goto L2a
        L77:
            float r5 = r2.h
            int r6 = r2.f3488b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L2a
            r2.b(r10)
            r2.a(r10)
            goto L2a
        L87:
            boolean r5 = r2.c
            if (r5 != 0) goto L9b
            boolean r5 = r2.d
            if (r5 != 0) goto L9b
            float r5 = r2.g
            int r6 = r2.f3488b
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L9b
            r2.a()
        L9b:
            r2.i = r8
            boolean r5 = r2.k
            if (r5 == 0) goto L2a
            r2.k = r0
            boolean r5 = r2.l
            if (r5 != 0) goto L2a
            com.google.android.finsky.layout.play.dd r5 = r2.f3487a
            r5.h()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.play.FinskyHeaderListLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.n = (size - Math.min(size, this.s ? ik.b(getResources()) : size)) / 2;
    }

    @Override // com.google.android.play.headerlist.PlayHeaderListLayout
    public final int a(ViewGroup viewGroup) {
        return (viewGroup.getChildCount() != 0 || this.o == null) ? super.a(viewGroup) : this.o.p();
    }

    @Override // com.google.android.play.headerlist.PlayHeaderListLayout
    public float getFloatingHeaderElevation() {
        return super.getFloatingHeaderElevation();
    }

    public FinskyTabStrip getTabStrip() {
        return (FinskyTabStrip) findViewById(R.id.pager_tab_strip);
    }
}
