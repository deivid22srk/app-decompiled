package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class gg implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final android.support.v7.view.menu.a f847a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gf f848b;

    gg(gf gfVar) {
        this.f848b = gfVar;
        this.f847a = new android.support.v7.view.menu.a(this.f848b.f845a.getContext(), this.f848b.f846b);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f848b.c != null && this.f848b.d) {
            this.f848b.c.onMenuItemSelected(0, this.f847a);
        }
    }
}
