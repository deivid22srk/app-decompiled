package android.support.design.widget;

import android.support.design.widget.Snackbar;
import android.support.v4.view.ep;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
final class ar extends ep {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Snackbar f92a;

    ar(Snackbar snackbar) {
        this.f92a = snackbar;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void a(View view) {
        AccessibilityManager accessibilityManager;
        Snackbar.SnackbarLayout snackbarLayout;
        accessibilityManager = this.f92a.g;
        if (!accessibilityManager.isEnabled()) {
            snackbarLayout = this.f92a.f69b;
            android.support.v4.view.by.c((View) snackbarLayout.f70a, 0.0f);
            android.support.v4.view.by.t(snackbarLayout.f70a).a(1.0f).a(180L).b(70L).b();
            if (snackbarLayout.f71b.getVisibility() != 0) {
                return;
            }
            android.support.v4.view.by.c((View) snackbarLayout.f71b, 0.0f);
            android.support.v4.view.by.t(snackbarLayout.f71b).a(1.0f).a(180L).b(70L).b();
        }
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        Snackbar.f(this.f92a);
    }
}
