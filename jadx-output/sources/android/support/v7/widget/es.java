package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
final class es extends android.support.v4.view.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ er f798b;

    es(er erVar) {
        this.f798b = erVar;
    }

    @Override // android.support.v4.view.a
    public final void a(View view, android.support.v4.view.a.j jVar) {
        super.a(view, jVar);
        if (!this.f798b.a() && this.f798b.f797b.getLayoutManager() != null) {
            this.f798b.f797b.getLayoutManager().a(view, jVar);
        }
    }

    @Override // android.support.v4.view.a
    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.f798b.a() || this.f798b.f797b.getLayoutManager() == null) {
            return false;
        }
        ec layoutManager = this.f798b.f797b.getLayoutManager();
        eh ehVar = layoutManager.q.f627a;
        en enVar = layoutManager.q.n;
        return false;
    }
}
