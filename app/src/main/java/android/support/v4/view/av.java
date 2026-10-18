package android.support.v4.view;

import android.view.MenuItem;

/* loaded from: classes.dex */
final class av extends au {
    av() {
    }

    @Override // android.support.v4.view.au, android.support.v4.view.ax
    public final MenuItem a(MenuItem menuItem, ay ayVar) {
        return ayVar == null ? az.a(menuItem, null) : az.a(menuItem, new aw(this, ayVar));
    }

    @Override // android.support.v4.view.au, android.support.v4.view.ax
    public final boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @Override // android.support.v4.view.au, android.support.v4.view.ax
    public final boolean c(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Override // android.support.v4.view.au, android.support.v4.view.ax
    public final boolean d(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }
}
