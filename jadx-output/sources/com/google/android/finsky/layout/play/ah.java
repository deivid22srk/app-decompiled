package com.google.android.finsky.layout.play;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ec;
import android.support.v7.widget.ed;
import android.support.v7.widget.ef;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class ah extends PlayRecyclerView implements com.google.android.finsky.adapters.ap {
    private final ef A;
    private final int q;
    boolean r;
    protected boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public ah(Context context) {
        this(context, null);
    }

    public ah(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = false;
        this.s = false;
        this.A = new ai(this);
        this.q = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        a(this.A);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(ec ecVar) {
        if (!(ecVar instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("Only LinearLayoutManager is supported");
        }
        if (((LinearLayoutManager) ecVar).i != 0) {
            throw new IllegalArgumentException("Only horizontal LinearLayoutManager is supported");
        }
        super.setLayoutManager(ecVar);
    }

    protected boolean j() {
        return true;
    }

    protected void k() {
    }

    protected void l() {
    }

    public void setLeadingGapForSnapping(int i) {
        if (this.x != i) {
            this.x = i;
            l();
        }
    }

    public int getLeadingGapForSnapping() {
        return this.x;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.r) {
            if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                return false;
            }
            this.r = false;
            return false;
        }
        a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final boolean b(int i, int i2) {
        int v;
        int i3 = 0;
        if (!j() || Math.abs(i) < this.q || getChildCount() <= 0) {
            return super.b(i, i2);
        }
        int i4 = android.support.v4.view.by.h(this) == 0 ? 1 : -1;
        int i5 = i * i4;
        b(i5 > 0);
        if (this.u != -1) {
            int i6 = this.v * i4;
            int i7 = i5 < 0 ? -1 : 1;
            int width = getWidth();
            int f = f(getChildAt(this.u));
            int b2 = b(f);
            int min = ((Math.min((i5 / 5) * i7, ((b2 > 1 ? 2 : 1) * width) - this.z) * i7) - i6) / f;
            if (min != 0 || i7 * i6 >= 0) {
                i7 = min;
            }
            ec layoutManager = getLayoutManager();
            int a2 = ec.a(getChildAt(this.u)) + i7;
            if (a2 <= 0) {
                i7 += 1 - a2;
            } else if (getTrailingSpacerCount() < 2 && a2 > (v = (layoutManager.v() - getTrailingSpacerCount()) - b2)) {
                i7 -= a2 - v;
                if (!this.w) {
                    i3 = getLeadingGapForSnapping() - ((width - getLeadingGapForSnapping()) - (b2 * f));
                }
            }
            i3 = i4 * ((i7 * f) + i6 + i3);
        }
        ((LinearLayoutManager) getLayoutManager()).a(new aj(this, i3));
        return true;
    }

    private void a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.y = (int) motionEvent.getX();
                break;
            case 1:
                this.z = Math.abs(((int) motionEvent.getX()) - this.y);
                break;
        }
    }

    public final void m() {
        this.s = false;
    }

    public void ab_() {
        this.s = true;
    }

    protected int getTrailingSpacerCount() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r11) {
        /*
            r10 = this;
            r2 = 1
            r3 = 0
            int r0 = android.support.v4.view.by.h(r10)
            if (r0 != 0) goto L65
            r1 = r2
        L9:
            int r5 = r10.getWidth()
            int r6 = r10.getChildCount()
            int r4 = r10.x
            r0 = -1
            r10.u = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r10.v = r0
            r10.w = r3
            if (r11 == 0) goto L9a
            android.support.v7.widget.dt r0 = r10.getAdapter()
            int r7 = r0.a()
            android.support.v7.widget.ec r0 = r10.getLayoutManager()
            android.support.v7.widget.LinearLayoutManager r0 = (android.support.v7.widget.LinearLayoutManager) r0
            int r0 = r0.o()
            int r7 = r7 + (-1)
            int r8 = r10.getTrailingSpacerCount()
            int r7 = r7 - r8
            int r7 = r0 - r7
            if (r7 <= 0) goto L9a
            int r0 = r10.getTrailingSpacerCount()
            int r0 = r6 - r0
            int r0 = r0 + (-1)
            android.view.View r0 = r10.getChildAt(r0)
            int r0 = f(r0)
            int r4 = r10.b(r0)
            int r8 = r4 * r0
            r0 = r3
            r4 = r3
        L54:
            if (r0 >= r7) goto L67
            int r9 = r6 + (-1)
            int r9 = r9 - r0
            android.view.View r9 = r10.getChildAt(r9)
            int r9 = f(r9)
            int r4 = r4 + r9
            int r0 = r0 + 1
            goto L54
        L65:
            r1 = r3
            goto L9
        L67:
            int r0 = r5 - r4
            int r0 = r0 - r8
            r10.w = r2
        L6c:
            if (r3 >= r6) goto L99
            android.view.View r2 = r10.getChildAt(r3)
            int r4 = r2.getWidth()
            if (r4 == 0) goto L8f
            if (r1 == 0) goto L92
            int r2 = r2.getLeft()
            int r2 = r2 - r0
        L7f:
            int r4 = java.lang.Math.abs(r2)
            int r7 = r10.v
            int r7 = java.lang.Math.abs(r7)
            if (r4 >= r7) goto L8f
            r10.v = r2
            r10.u = r3
        L8f:
            int r3 = r3 + 1
            goto L6c
        L92:
            int r2 = r2.getRight()
            int r2 = r2 + r0
            int r2 = r2 - r5
            goto L7f
        L99:
            return
        L9a:
            r0 = r4
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.layout.play.ah.b(boolean):void");
    }

    private static int f(View view) {
        ed edVar = (ed) view.getLayoutParams();
        return edVar.rightMargin + view.getWidth() + edVar.leftMargin;
    }

    private int b(int i) {
        return Math.max(1, (getWidth() - getLeadingGapForSnapping()) / i);
    }
}
