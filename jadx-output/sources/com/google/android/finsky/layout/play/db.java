package com.google.android.finsky.layout.play;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.finsky.layout.InsetsFrameLayout;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    final dd f3487a;

    /* renamed from: b, reason: collision with root package name */
    final int f3488b;
    boolean c;
    boolean d;
    float e;
    float f;
    float g;
    float h;
    View i;
    MotionEvent j;
    boolean k;
    boolean l;
    private final int m;

    public db(dd ddVar, Context context) {
        this.f3487a = ddVar;
        this.f3488b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = InsetsFrameLayout.f3009a ? ik.d(context) : 0;
    }

    final void a(MotionEvent motionEvent) {
        float f = 0.0f;
        if (this.i != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            View view = this.i;
            float f2 = 0.0f;
            while (true) {
                float left = f2 - view.getLeft();
                float top = f - view.getTop();
                View view2 = (View) view.getParent();
                if (view2 != null) {
                    float scrollX = view2.getScrollX() + left;
                    float scrollY = view2.getScrollY() + top;
                    if (view2 == this.f3487a.a()) {
                        obtain.offsetLocation(scrollX, scrollY);
                        this.i.dispatchTouchEvent(obtain);
                        obtain.recycle();
                        return;
                    } else {
                        f2 = scrollX;
                        view = view2;
                        f = scrollY;
                    }
                } else {
                    return;
                }
            }
        }
    }

    final void b(MotionEvent motionEvent) {
        if (this.i != this.f3487a.b()) {
            if (this.i != null && this.j != null) {
                MotionEvent obtain = MotionEvent.obtain(this.j);
                obtain.setAction(3);
                a(obtain);
                obtain.recycle();
                if (this.i instanceof af) {
                    ((af) this.i).b();
                    this.i.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            this.i = this.f3487a.c();
            this.d = true;
            if (this.j != null) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                obtainNoHistory.setLocation(this.j.getX(), motionEvent.getY());
                a(this.j);
                this.j.recycle();
                this.j = null;
                a(obtainNoHistory);
                obtainNoHistory.recycle();
            }
        }
    }

    final void a() {
        boolean z;
        int top;
        ViewGroup c = this.f3487a.c();
        if ((c instanceof RecyclerView) && this.i != this.f3487a.b() && (this.i instanceof af)) {
            af afVar = (af) this.i;
            RecyclerView recyclerView = (RecyclerView) c;
            if (this.i == this.f3487a.d()) {
                View a2 = recyclerView.getLayoutManager().a(0);
                if (a2 != null && this.f3487a.a(a2) && (top = a2.getTop()) < 0) {
                    recyclerView.a(0, top);
                    return;
                }
                return;
            }
            int l = this.m + this.f3487a.l();
            int horizontalScrollerTop = afVar.getHorizontalScrollerTop();
            int horizontalScrollerBottom = afVar.getHorizontalScrollerBottom();
            for (View view = this.i; view != this.f3487a.a(); view = (View) view.getParent()) {
                if (view != null) {
                    horizontalScrollerTop += view.getTop();
                    horizontalScrollerBottom += view.getTop();
                } else {
                    return;
                }
            }
            int i = l - horizontalScrollerTop;
            int height = horizontalScrollerBottom - this.f3487a.a().getHeight();
            if (height >= 0) {
                z = height > (-i);
            } else if (i <= 0) {
                z = false;
                height = 0;
            } else if (horizontalScrollerTop < this.m) {
                height = Math.max(horizontalScrollerTop - this.m, height);
                z = true;
            } else {
                z = true;
                height = 0;
            }
            if (z) {
                this.k = true;
                this.f3487a.j();
            }
            if (height != 0) {
                if (!z) {
                    int m = this.f3487a.m();
                    if (m > l) {
                        if (m - l < height) {
                            this.f3487a.i();
                        }
                    } else if (m > this.m) {
                        this.f3487a.k();
                    }
                }
                this.l = true;
                recyclerView.a(new dc(this));
                recyclerView.a(0, height);
            }
        }
    }
}
