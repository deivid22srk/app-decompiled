package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

@TargetApi(14)
/* loaded from: classes.dex */
public class o extends e<android.support.v4.e.a.b> implements MenuItem {
    public Method e;

    o(Context context, android.support.v4.e.a.b bVar) {
        super(context, bVar);
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((android.support.v4.e.a.b) this.d).getItemId();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((android.support.v4.e.a.b) this.d).getGroupId();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((android.support.v4.e.a.b) this.d).getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((android.support.v4.e.a.b) this.d).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((android.support.v4.e.a.b) this.d).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((android.support.v4.e.a.b) this.d).getTitle();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((android.support.v4.e.a.b) this.d).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((android.support.v4.e.a.b) this.d).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((android.support.v4.e.a.b) this.d).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((android.support.v4.e.a.b) this.d).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((android.support.v4.e.a.b) this.d).getIcon();
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((android.support.v4.e.a.b) this.d).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((android.support.v4.e.a.b) this.d).getIntent();
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        ((android.support.v4.e.a.b) this.d).setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        ((android.support.v4.e.a.b) this.d).setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((android.support.v4.e.a.b) this.d).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        ((android.support.v4.e.a.b) this.d).setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((android.support.v4.e.a.b) this.d).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((android.support.v4.e.a.b) this.d).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((android.support.v4.e.a.b) this.d).isCheckable();
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((android.support.v4.e.a.b) this.d).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((android.support.v4.e.a.b) this.d).isChecked();
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((android.support.v4.e.a.b) this.d).setVisible(z);
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((android.support.v4.e.a.b) this.d).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((android.support.v4.e.a.b) this.d).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((android.support.v4.e.a.b) this.d).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((android.support.v4.e.a.b) this.d).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return a(((android.support.v4.e.a.b) this.d).getSubMenu());
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((android.support.v4.e.a.b) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new s(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((android.support.v4.e.a.b) this.d).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((android.support.v4.e.a.b) this.d).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((android.support.v4.e.a.b) this.d).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new q(view);
        }
        ((android.support.v4.e.a.b) this.d).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((android.support.v4.e.a.b) this.d).setActionView(i);
        View actionView = ((android.support.v4.e.a.b) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((android.support.v4.e.a.b) this.d).setActionView(new q(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((android.support.v4.e.a.b) this.d).getActionView();
        if (!(actionView instanceof q)) {
            return actionView;
        }
        return (View) ((q) actionView).f599a;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((android.support.v4.e.a.b) this.d).a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        android.support.v4.view.n a2 = ((android.support.v4.e.a.b) this.d).a();
        if (a2 instanceof p) {
            return ((p) a2).c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((android.support.v4.e.a.b) this.d).expandActionView();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((android.support.v4.e.a.b) this.d).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((android.support.v4.e.a.b) this.d).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((android.support.v4.e.a.b) this.d).a(onActionExpandListener != null ? new r(this, onActionExpandListener) : null);
        return this;
    }

    p a(ActionProvider actionProvider) {
        return new p(this, this.f586a, actionProvider);
    }
}
