package android.support.v7.a;

import android.view.Menu;
import android.view.Window;

/* loaded from: classes.dex */
final class bc implements android.support.v7.view.menu.y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f495a;

    private bc(ap apVar) {
        this.f495a = apVar;
    }

    /* synthetic */ bc(ap apVar, byte b2) {
        this(apVar);
    }

    @Override // android.support.v7.view.menu.y
    public final void a(android.support.v7.view.menu.i iVar, boolean z) {
        bb a2;
        android.support.v7.view.menu.i k = iVar.k();
        boolean z2 = k != iVar;
        ap apVar = this.f495a;
        if (z2) {
            iVar = k;
        }
        a2 = apVar.a((Menu) iVar);
        if (a2 != null) {
            if (z2) {
                this.f495a.a(a2.f493a, a2, k);
                this.f495a.a(a2, true);
            } else {
                this.f495a.a(a2, z);
            }
        }
    }

    @Override // android.support.v7.view.menu.y
    public final boolean a(android.support.v7.view.menu.i iVar) {
        Window.Callback callback;
        if (iVar == null && this.f495a.i && (callback = this.f495a.c.getCallback()) != null && !this.f495a.o) {
            callback.onMenuOpened(108, iVar);
            return true;
        }
        return true;
    }
}
