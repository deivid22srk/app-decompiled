package android.support.v7.a;

import android.support.v4.view.ep;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

/* loaded from: classes.dex */
final class bs extends ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bq f519a;

    bs(bq bqVar) {
        this.f519a = bqVar;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        ActionBarContainer actionBarContainer;
        bq.d(this.f519a);
        actionBarContainer = this.f519a.q;
        actionBarContainer.requestLayout();
    }
}
