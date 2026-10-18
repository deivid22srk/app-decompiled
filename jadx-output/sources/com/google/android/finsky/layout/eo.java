package com.google.android.finsky.layout;

import android.support.v7.widget.RecyclerView;

/* loaded from: classes.dex */
final class eo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ em f3272a;

    eo(em emVar) {
        this.f3272a = emVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TabBubbleView tabBubbleView;
        int i;
        TabBubbleView tabBubbleView2;
        TabBubbleView tabBubbleView3;
        TabBubbleView tabBubbleView4;
        RecyclerView recyclerView;
        tabBubbleView = this.f3272a.s;
        int measuredHeight = tabBubbleView.getMeasuredHeight();
        i = this.f3272a.w;
        int i2 = measuredHeight - i;
        if (em.a(this.f3272a, i2)) {
            tabBubbleView2 = this.f3272a.s;
            tabBubbleView2.setVisibility(0);
            tabBubbleView3 = this.f3272a.s;
            tabBubbleView3.a();
            em.f(this.f3272a);
            this.f3272a.d.g(i2);
            if (em.f3269a) {
                tabBubbleView4 = this.f3272a.s;
                recyclerView = this.f3272a.c;
                tabBubbleView4.setAccessibilityTraversalBefore(recyclerView.getId());
            }
        }
    }
}
