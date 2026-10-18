package android.support.v7.a;

import android.support.v4.view.by;
import android.support.v4.view.ep;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* loaded from: classes.dex */
final class br extends ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bq f518a;

    br(bq bqVar) {
        this.f518a = bqVar;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        boolean z;
        ActionBarContainer actionBarContainer;
        ActionBarContainer actionBarContainer2;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        View view2;
        View view3;
        ActionBarContainer actionBarContainer3;
        z = this.f518a.C;
        if (z) {
            view2 = this.f518a.t;
            if (view2 != null) {
                view3 = this.f518a.t;
                by.b(view3, 0.0f);
                actionBarContainer3 = this.f518a.q;
                by.b((View) actionBarContainer3, 0.0f);
            }
        }
        actionBarContainer = this.f518a.q;
        actionBarContainer.setVisibility(8);
        actionBarContainer2 = this.f518a.q;
        actionBarContainer2.setTransitioning(false);
        bq.d(this.f518a);
        bq bqVar = this.f518a;
        if (bqVar.c != null) {
            bqVar.c.a(bqVar.f517b);
            bqVar.f517b = null;
            bqVar.c = null;
        }
        actionBarOverlayLayout = this.f518a.p;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout2 = this.f518a.p;
            by.x(actionBarOverlayLayout2);
        }
    }
}
