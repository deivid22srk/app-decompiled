package com.google.android.play.headerlist;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.dt;
import android.support.v7.widget.dv;
import android.support.v7.widget.ef;

/* loaded from: classes.dex */
public final class p extends ef {

    /* renamed from: a, reason: collision with root package name */
    final PlayHeaderListLayout f6909a;

    /* renamed from: b, reason: collision with root package name */
    protected int f6910b;
    private int c = -1;
    private final dv d = new q(this);
    private dt<?> e;

    public p(PlayHeaderListLayout playHeaderListLayout) {
        this.f6909a = playHeaderListLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.c = -1;
        if (z) {
            a((dt<?>) null);
        }
        this.f6910b = 0;
    }

    private void a(dt<?> dtVar) {
        if (this.e != dtVar) {
            if (this.e != null) {
                this.e.b(this.d);
            }
            this.e = dtVar;
            if (this.e != null) {
                this.e.a(this.d);
            }
            a(false);
        }
    }

    @Override // android.support.v7.widget.ef
    public final void a(RecyclerView recyclerView, int i) {
        a((dt<?>) recyclerView.getAdapter());
        this.f6910b = i;
        this.f6909a.a(i);
        if (this.f6909a.e != null) {
            this.f6909a.e.a(recyclerView, i);
        }
    }

    @Override // android.support.v7.widget.ef
    public final void a(RecyclerView recyclerView, int i, int i2) {
        a((dt<?>) recyclerView.getAdapter());
        int b2 = this.f6909a.b(recyclerView);
        if (b2 == -1) {
            if (i2 == 0) {
                this.c = -1;
            } else if (this.c != -1) {
                this.c += i2;
            }
        } else {
            this.c = b2;
        }
        this.f6909a.a(this.f6910b, i2, recyclerView.getChildCount() == 0 ? 0 : this.c);
        if (this.f6909a.e != null) {
            this.f6909a.e.a(recyclerView, i, i2);
        }
    }
}
