package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
class au implements ax {
    au() {
    }

    @Override // android.support.v4.view.ax
    public boolean b(MenuItem menuItem) {
        return false;
    }

    @Override // android.support.v4.view.ax
    public boolean c(MenuItem menuItem) {
        return false;
    }

    @Override // android.support.v4.view.ax
    public boolean d(MenuItem menuItem) {
        return false;
    }

    @Override // android.support.v4.view.ax
    public MenuItem a(MenuItem menuItem, ay ayVar) {
        return menuItem;
    }

    @Override // android.support.v4.view.ax
    public final void a(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    @Override // android.support.v4.view.ax
    public final MenuItem a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    @Override // android.support.v4.view.ax
    public final MenuItem b(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @Override // android.support.v4.view.ax
    public final View a(MenuItem menuItem) {
        return menuItem.getActionView();
    }
}
