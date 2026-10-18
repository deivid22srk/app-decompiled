package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f858a;

    /* renamed from: b, reason: collision with root package name */
    private q f859b;

    public n(k kVar, q qVar) {
        this.f858a = kVar;
        this.f859b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.support.v7.view.menu.i iVar = this.f858a.c;
        if (iVar.f593b != null) {
            iVar.f593b.a(iVar);
        }
        View view = (View) this.f858a.g;
        if (view != null && view.getWindowToken() != null && this.f859b.b()) {
            this.f858a.o = this.f859b;
        }
        this.f858a.q = null;
    }
}
