package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
final class ae extends ac implements SubMenu {
    ae(Context context, android.support.v4.e.a.c cVar) {
        super(context, cVar);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        ((android.support.v4.e.a.c) this.d).setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((android.support.v4.e.a.c) this.d).setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        ((android.support.v4.e.a.c) this.d).setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((android.support.v4.e.a.c) this.d).setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        ((android.support.v4.e.a.c) this.d).setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        ((android.support.v4.e.a.c) this.d).clearHeader();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        ((android.support.v4.e.a.c) this.d).setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        ((android.support.v4.e.a.c) this.d).setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return a(((android.support.v4.e.a.c) this.d).getItem());
    }
}
