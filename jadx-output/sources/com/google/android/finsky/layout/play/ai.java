package com.google.android.finsky.layout.play;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ef;

/* loaded from: classes.dex */
final class ai extends ef {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f3395a;

    ai(ah ahVar) {
        this.f3395a = ahVar;
    }

    @Override // android.support.v7.widget.ef
    public final void a(RecyclerView recyclerView, int i) {
        boolean z;
        int i2;
        if (this.f3395a.j() && !this.f3395a.s) {
            if (i != 2) {
                this.f3395a.b(true);
            }
            boolean z2 = i == 0;
            if (z2) {
                z = this.f3395a.t;
                if (!z) {
                    ah ahVar = this.f3395a;
                    i2 = this.f3395a.v;
                    ahVar.a(i2, 0);
                }
            }
            this.f3395a.t = z2;
            if (z2) {
                this.f3395a.k();
            }
            super.a(recyclerView, i);
        }
    }
}
