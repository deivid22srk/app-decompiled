package com.google.android.finsky.layout.play;

import android.graphics.Rect;
import android.support.v7.widget.eb;
import android.view.View;

/* loaded from: classes.dex */
final class ck extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayClusterViewContentV2 f3470a;

    private ck(PlayClusterViewContentV2 playClusterViewContentV2) {
        this.f3470a = playClusterViewContentV2;
    }

    /* synthetic */ ck(PlayClusterViewContentV2 playClusterViewContentV2, byte b2) {
        this(playClusterViewContentV2);
    }

    @Override // android.support.v7.widget.eb
    public final void a(Rect rect, View view) {
        Object tag = view.getTag();
        if (tag == null || !"tagIsSpacer".equals(tag)) {
            int b2 = this.f3470a.B.b(this.f3470a.w.a_(view), this.f3470a.D, this.f3470a.E);
            rect.set(0, b2, 0, b2);
        }
    }
}
