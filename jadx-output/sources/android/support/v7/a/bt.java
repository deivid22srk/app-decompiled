package android.support.v7.a;

import android.support.v4.view.eq;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

/* loaded from: classes.dex */
final class bt implements eq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bq f520a;

    bt(bq bqVar) {
        this.f520a = bqVar;
    }

    @Override // android.support.v4.view.eq
    public final void a() {
        ActionBarContainer actionBarContainer;
        actionBarContainer = this.f520a.q;
        ((View) actionBarContainer.getParent()).invalidate();
    }
}
