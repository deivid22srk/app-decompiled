package android.support.design.widget;

import android.support.design.widget.Snackbar;
import android.support.v4.view.ep;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
final class at extends ep {

    /* renamed from: a, reason: collision with root package name */
    boolean f94a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f95b;
    final /* synthetic */ Snackbar c;

    at(Snackbar snackbar, int i) {
        this.c = snackbar;
        this.f95b = i;
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void a(View view) {
        AccessibilityManager accessibilityManager;
        Snackbar.SnackbarLayout snackbarLayout;
        accessibilityManager = this.c.g;
        if (!accessibilityManager.isEnabled()) {
            snackbarLayout = this.c.f69b;
            android.support.v4.view.by.c((View) snackbarLayout.f70a, 1.0f);
            android.support.v4.view.by.t(snackbarLayout.f70a).a(0.0f).a(180L).b(0L).b();
            if (snackbarLayout.f71b.getVisibility() != 0) {
                return;
            }
            android.support.v4.view.by.c((View) snackbarLayout.f71b, 1.0f);
            android.support.v4.view.by.t(snackbarLayout.f71b).a(0.0f).a(180L).b(0L).b();
        }
    }

    @Override // android.support.v4.view.ep, android.support.v4.view.eo
    public final void b(View view) {
        this.c.c();
    }
}
