package com.google.android.finsky.activities;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.finsky.layout.play.PlayClusterViewContentV2;

/* loaded from: classes.dex */
final class ax extends android.support.v7.widget.eb {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.finsky.adapters.s f1561a;

    public ax(com.google.android.finsky.adapters.s sVar) {
        this.f1561a = sVar;
    }

    @Override // android.support.v7.widget.eb
    public final void a(Rect rect, View view) {
        boolean z;
        int i;
        boolean z2;
        if (view instanceof PlayClusterViewContentV2) {
            z = true;
            z2 = true;
            i = 0;
        } else {
            int i2 = this.f1561a.j;
            int c = RecyclerView.c(view);
            if (!this.f1561a.f(c)) {
                z = true;
                i = i2;
                z2 = true;
            } else if ((c - this.f1561a.i) % 2 == 0) {
                z = false;
                i = i2;
                z2 = true;
            } else {
                z = true;
                i = i2;
                z2 = false;
            }
        }
        int i3 = z2 ? i : 0;
        if (!z) {
            i = 0;
        }
        rect.set(i3, 0, i, 0);
    }
}
