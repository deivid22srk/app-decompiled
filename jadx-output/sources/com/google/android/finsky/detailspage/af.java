package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.layout.HeroGraphicView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class af extends android.support.v4.app.cy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f2534a;

    af(z zVar) {
        this.f2534a = zVar;
    }

    @Override // android.support.v4.app.cy
    public final void a(List<String> list, List<View> list2) {
        if (this.f2534a.R == null) {
            Iterator<View> it = list2.iterator();
            while (it.hasNext()) {
                it.next().setAlpha(0.0f);
            }
        }
        HeroGraphicView heroGraphicView = this.f2534a.al;
    }

    @Override // android.support.v4.app.cy
    public final void a() {
        HeroGraphicView heroGraphicView = this.f2534a.al;
    }
}
