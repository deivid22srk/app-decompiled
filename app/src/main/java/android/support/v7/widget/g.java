package android.support.v7.widget;

/* loaded from: classes.dex */
final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionBarOverlayLayout f840a;

    g(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f840a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionBarContainer actionBarContainer;
        android.support.v4.view.eo eoVar;
        this.f840a.i();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f840a;
        actionBarContainer = this.f840a.f;
        android.support.v4.view.dy c = android.support.v4.view.by.t(actionBarContainer).c(0.0f);
        eoVar = this.f840a.y;
        actionBarOverlayLayout.x = c.a(eoVar);
    }
}
