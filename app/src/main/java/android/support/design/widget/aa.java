package android.support.design.widget;

/* loaded from: classes.dex */
class aa extends u {
    private boolean n;

    aa(cd cdVar, ai aiVar) {
        super(cdVar, aiVar);
    }

    @Override // android.support.design.widget.ad
    boolean d() {
        return true;
    }

    @Override // android.support.design.widget.ad
    final void e() {
        float rotation = this.k.getRotation();
        if (this.f146a != null) {
            ah ahVar = this.f146a;
            float f = -rotation;
            if (ahVar.l != f) {
                ahVar.l = f;
                ahVar.invalidateSelf();
            }
        }
        if (this.d == null) {
            return;
        }
        e eVar = this.d;
        float f2 = -rotation;
        if (f2 == eVar.j) {
            return;
        }
        eVar.j = f2;
        eVar.invalidateSelf();
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void a(boolean z) {
        if (!this.n && this.k.getVisibility() == 0) {
            if (!android.support.v4.view.by.H(this.k) || this.k.isInEditMode()) {
                this.k.a(8, z);
            } else {
                this.k.animate().cancel();
                this.k.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200L).setInterpolator(a.c).setListener(new ab(this, z, null));
            }
        }
    }

    @Override // android.support.design.widget.u, android.support.design.widget.ad
    final void b(boolean z) {
        if (this.n || this.k.getVisibility() != 0) {
            if (android.support.v4.view.by.H(this.k) && !this.k.isInEditMode()) {
                this.k.animate().cancel();
                if (this.k.getVisibility() != 0) {
                    this.k.setAlpha(0.0f);
                    this.k.setScaleY(0.0f);
                    this.k.setScaleX(0.0f);
                }
                this.k.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200L).setInterpolator(a.d).setListener(new ac(this, z, null));
                return;
            }
            this.k.a(0, z);
            this.k.setAlpha(1.0f);
            this.k.setScaleY(1.0f);
            this.k.setScaleX(1.0f);
        }
    }
}
