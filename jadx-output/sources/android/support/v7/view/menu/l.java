package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
final class l implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, y {

    /* renamed from: a, reason: collision with root package name */
    i f594a;

    /* renamed from: b, reason: collision with root package name */
    android.support.v7.a.ac f595b;
    g c;
    private y d;

    public l(i iVar) {
        this.f594a = iVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f595b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f595b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f594a.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f594a.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.f594a, true);
    }

    @Override // android.support.v7.view.menu.y
    public final void a(i iVar, boolean z) {
        if ((z || iVar == this.f594a) && this.f595b != null) {
            this.f595b.dismiss();
        }
        if (this.d != null) {
            this.d.a(iVar, z);
        }
    }

    @Override // android.support.v7.view.menu.y
    public final boolean a(i iVar) {
        if (this.d != null) {
            return this.d.a(iVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f594a.a((m) this.c.b().getItem(i), (x) null, 0);
    }
}
