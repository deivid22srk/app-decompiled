package com.google.android.play.headerlist;

import android.support.v4.view.dl;
import android.support.v4.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
final class a implements dl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayHeaderListLayout f6897a;

    a(PlayHeaderListLayout playHeaderListLayout) {
        this.f6897a = playHeaderListLayout;
    }

    @Override // android.support.v4.view.dl
    public final void b(int i) {
        dl dlVar;
        int i2;
        int i3;
        dl dlVar2;
        dlVar = this.f6897a.ap;
        if (dlVar != null) {
            dlVar2 = this.f6897a.ap;
            dlVar2.b(i);
        }
        if (i != 0) {
            i2 = this.f6897a.ak;
            if (i2 != 0) {
                i3 = this.f6897a.ak;
                if (i3 != 2) {
                    return;
                }
            }
            this.f6897a.a(true, true);
        }
    }

    @Override // android.support.v4.view.dl
    public final void a_(int i) {
        dl dlVar;
        dl dlVar2;
        this.f6897a.a();
        dlVar = this.f6897a.ap;
        if (dlVar != null) {
            dlVar2 = this.f6897a.ap;
            dlVar2.a_(i);
        }
    }

    @Override // android.support.v4.view.dl
    public final void a(int i, float f, int i2) {
        dl dlVar;
        dl dlVar2;
        SwipeRefreshLayout swipeRefreshLayout;
        int i3;
        SwipeRefreshLayout swipeRefreshLayout2;
        int unused;
        SwipeRefreshLayout unused2;
        if (this.f6897a.h != null) {
            int i4 = (f > 0.5f ? 1 : 0) + i;
            swipeRefreshLayout = this.f6897a.P;
            boolean z = swipeRefreshLayout.f413a;
            i3 = this.f6897a.ay;
            if (i4 != i3) {
                this.f6897a.ay = i4;
                l lVar = this.f6897a.h;
                unused = this.f6897a.ay;
                swipeRefreshLayout2 = this.f6897a.P;
                swipeRefreshLayout2.setRefreshing(false);
                l lVar2 = this.f6897a.h;
                unused2 = this.f6897a.P;
            }
            l lVar3 = this.f6897a.h;
        }
        dlVar = this.f6897a.ap;
        if (dlVar != null) {
            dlVar2 = this.f6897a.ap;
            dlVar2.a(i, f, i2);
        }
    }
}
