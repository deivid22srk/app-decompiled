package android.support.v7.widget;

/* loaded from: classes.dex */
final class fc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SearchView f813a;

    fc(SearchView searchView) {
        this.f813a = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f813a.updateFocusedState();
    }
}
