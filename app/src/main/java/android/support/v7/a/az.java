package android.support.v7.a;

import android.support.v4.view.by;
import android.support.v4.view.eo;
import android.support.v4.view.ep;
import android.view.View;

/* loaded from: classes.dex */
final class az extends ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ay f490a;

    az(ay ayVar) {
        this.f490a = ayVar;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        this.f490a.f488a.r.setVisibility(8);
        if (this.f490a.f488a.s != null) {
            this.f490a.f488a.s.dismiss();
        } else if (this.f490a.f488a.r.getParent() instanceof View) {
            by.x((View) this.f490a.f488a.r.getParent());
        }
        this.f490a.f488a.r.removeAllViews();
        this.f490a.f488a.u.a((eo) null);
        this.f490a.f488a.u = null;
    }
}
