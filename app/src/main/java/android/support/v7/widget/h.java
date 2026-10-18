package android.support.v7.widget;

/* loaded from: classes.dex */
final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionBarOverlayLayout f856a;

    h(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f856a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarContainer actionBarContainer;
        ActionBarContainer actionBarContainer2;
        android.support.v4.view.eo eoVar;
        this.f856a.i();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f856a;
        actionBarContainer = this.f856a.f;
        android.support.v4.view.dy t = android.support.v4.view.by.t(actionBarContainer);
        actionBarContainer2 = this.f856a.f;
        android.support.v4.view.dy c = t.c(-actionBarContainer2.getHeight());
        eoVar = this.f856a.y;
        actionBarOverlayLayout.x = c.a(eoVar);
    }
}
