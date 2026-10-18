package android.support.v7.a;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
class aj extends android.support.v7.view.n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f478a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ah ahVar, Window.Callback callback) {
        super(callback);
        this.f478a = ahVar;
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f478a.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f478a.a(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof android.support.v7.view.menu.i)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        android.support.v7.view.menu.i iVar = menu instanceof android.support.v7.view.menu.i ? (android.support.v7.view.menu.i) menu : null;
        if (i == 0 && iVar == null) {
            return false;
        }
        if (iVar != null) {
            iVar.k = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (iVar == null) {
            return onPreparePanel;
        }
        iVar.k = false;
        return onPreparePanel;
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f478a.d(i);
        return true;
    }

    @Override // android.support.v7.view.n, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        this.f478a.c(i);
    }
}
