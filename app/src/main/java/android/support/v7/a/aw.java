package android.support.v7.a;

import android.support.v4.view.by;
import android.support.v4.view.eo;
import android.support.v4.view.ep;
import android.view.View;

/* loaded from: classes.dex */
final class aw extends ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f486a;

    aw(ap apVar) {
        this.f486a = apVar;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        by.c((View) this.f486a.r, 1.0f);
        this.f486a.u.a((eo) null);
        this.f486a.u = null;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void a(View view) {
        this.f486a.r.setVisibility(0);
        this.f486a.r.sendAccessibilityEvent(32);
        if (this.f486a.r.getParent() != null) {
            by.x((View) this.f486a.r.getParent());
        }
    }
}
