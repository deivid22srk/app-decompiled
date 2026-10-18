package android.support.v7.a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.cz;
import android.support.v4.app.da;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ae extends android.support.v4.app.t implements da, af, h {
    private ag k;
    private int l = 0;
    private boolean m;

    @Override // android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        ag f = f();
        f.i();
        f.a(bundle);
        if (f.j() && this.l != 0) {
            setTheme(this.l);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.l = i;
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        f().c();
    }

    public final void a(Toolbar toolbar) {
        f().a(toolbar);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return f().b();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        f().a(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        f().a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().a(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().b(view, layoutParams);
    }

    @Override // android.support.v4.app.t, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f().a(configuration);
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onStop() {
        super.onStop();
        f().d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        f().e();
    }

    @Override // android.support.v4.app.t, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a a2 = f().a();
        if (menuItem.getItemId() == 16908332 && a2 != null && (a2.a() & 4) != 0) {
            return i();
        }
        return false;
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f().g();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        f().a(charSequence);
    }

    @Override // android.support.v4.app.t
    public final void c() {
        f().f();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        f().f();
    }

    @Override // android.support.v4.app.da
    public final Intent a_() {
        return android.support.v4.app.bb.a(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // android.support.v7.a.h
    public final g e() {
        return f().h();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.support.v4.app.t, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        f().b(bundle);
    }

    public final ag f() {
        if (this.k == null) {
            this.k = ag.a(this, this);
        }
        return this.k;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a a2;
        if (keyEvent.getKeyCode() == 19) {
            int action = keyEvent.getAction();
            if (action == 0) {
                if (keyEvent.hasModifiers(2) && (a2 = f().a()) != null && a2.e() && a2.i()) {
                    this.m = true;
                    return true;
                }
            } else if (action == 1 && this.m) {
                this.m = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    private boolean i() {
        Intent a2 = android.support.v4.app.bb.a(this);
        if (a2 != null) {
            if (android.support.v4.app.bb.a(this, a2)) {
                cz a3 = cz.a(this);
                Intent intent = null;
                if (this instanceof da) {
                    intent = a_();
                }
                Intent a4 = intent == null ? android.support.v4.app.bb.a(this) : intent;
                if (a4 != null) {
                    ComponentName component = a4.getComponent();
                    if (component == null) {
                        component = a4.resolveActivity(a3.f217a.getPackageManager());
                    }
                    a3.a(component);
                    a3.a(a4);
                }
                a3.a();
                try {
                    android.support.v4.app.a.a(this);
                } catch (IllegalStateException e) {
                    finish();
                }
            } else {
                android.support.v4.app.bb.b(this, a2);
            }
            return true;
        }
        return false;
    }
}
