package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
final class u extends p implements ActionProvider.VisibilityListener {
    android.support.v4.view.p e;
    final /* synthetic */ t f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, Context context, ActionProvider actionProvider) {
        super(tVar, context, actionProvider);
        this.f = tVar;
    }

    @Override // android.support.v4.view.n
    public final View a(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    @Override // android.support.v4.view.n
    public final boolean b() {
        return this.c.overridesItemVisibility();
    }

    @Override // android.support.v4.view.n
    public final boolean c() {
        return this.c.isVisible();
    }

    @Override // android.support.v4.view.n
    public final void a(android.support.v4.view.p pVar) {
        this.e = pVar;
        this.c.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        if (this.e != null) {
            this.e.a();
        }
    }
}
