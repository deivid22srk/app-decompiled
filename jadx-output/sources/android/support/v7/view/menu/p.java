package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
class p extends android.support.v4.view.n {
    final ActionProvider c;
    final /* synthetic */ o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, Context context, ActionProvider actionProvider) {
        super(context);
        this.d = oVar;
        this.c = actionProvider;
    }

    @Override // android.support.v4.view.n
    public final View a() {
        return this.c.onCreateActionView();
    }

    @Override // android.support.v4.view.n
    public final boolean d() {
        return this.c.onPerformDefaultAction();
    }

    @Override // android.support.v4.view.n
    public final boolean e() {
        return this.c.hasSubMenu();
    }

    @Override // android.support.v4.view.n
    public final void a(SubMenu subMenu) {
        this.c.onPrepareSubMenu(this.d.a(subMenu));
    }
}
