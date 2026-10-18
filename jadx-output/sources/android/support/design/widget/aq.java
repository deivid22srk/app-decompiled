package android.support.design.widget;

import android.support.design.widget.Snackbar;

/* loaded from: classes.dex */
final class aq implements aw {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Snackbar f91a;

    aq(Snackbar snackbar) {
        this.f91a = snackbar;
    }

    @Override // android.support.design.widget.aw
    public final void a() {
        Snackbar.SnackbarLayout snackbarLayout;
        this.f91a.b();
        snackbarLayout = this.f91a.f69b;
        snackbarLayout.setOnLayoutChangeListener(null);
    }
}
