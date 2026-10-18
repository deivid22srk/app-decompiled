package android.support.v7.a;

import android.view.Window;

/* loaded from: classes.dex */
final class ax implements android.support.v7.view.menu.y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f487a;

    private ax(ap apVar) {
        this.f487a = apVar;
    }

    /* synthetic */ ax(ap apVar, byte b2) {
        this(apVar);
    }

    @Override // android.support.v7.view.menu.y
    public final boolean a(android.support.v7.view.menu.i iVar) {
        Window.Callback callback = this.f487a.c.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, iVar);
            return true;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.y
    public final void a(android.support.v7.view.menu.i iVar, boolean z) {
        this.f487a.b(iVar);
    }
}
