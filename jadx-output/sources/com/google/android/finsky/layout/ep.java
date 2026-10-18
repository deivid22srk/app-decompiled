package com.google.android.finsky.layout;

import android.support.v7.widget.RecyclerView;

/* loaded from: classes.dex */
final class ep implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ em f3273a;

    ep(em emVar) {
        this.f3273a = emVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cu cuVar;
        TabBubbleView tabBubbleView;
        RecyclerView recyclerView;
        android.support.v7.widget.ef efVar;
        cuVar = this.f3273a.u;
        tabBubbleView = this.f3273a.s;
        cuVar.c.remove(tabBubbleView);
        cuVar.d.add(tabBubbleView);
        if (!cuVar.e) {
            cuVar.e = true;
            cuVar.f3208b.getViewTreeObserver().addOnPreDrawListener(cuVar);
        }
        recyclerView = this.f3273a.c;
        efVar = this.f3273a.f3270b;
        recyclerView.b(efVar);
    }
}
