package android.support.v7.a;

import android.view.Menu;

/* loaded from: classes.dex */
final class bh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f503a;

    bh(bg bgVar) {
        this.f503a = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg bgVar = this.f503a;
        Menu k = bgVar.k();
        android.support.v7.view.menu.i iVar = k instanceof android.support.v7.view.menu.i ? (android.support.v7.view.menu.i) k : null;
        if (iVar != null) {
            iVar.d();
        }
        try {
            k.clear();
            if (!bgVar.c.onCreatePanelMenu(0, k) || !bgVar.c.onPreparePanel(0, null, k)) {
                k.clear();
            }
        } finally {
            if (iVar != null) {
                iVar.e();
            }
        }
    }
}
