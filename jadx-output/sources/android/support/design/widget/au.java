package android.support.design.widget;

import android.support.design.widget.Snackbar;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class au extends be<Snackbar.SnackbarLayout> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Snackbar f96a;

    au(Snackbar snackbar) {
        this.f96a = snackbar;
    }

    @Override // android.support.design.widget.be
    public final boolean b(View view) {
        return view instanceof Snackbar.SnackbarLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.design.widget.be, android.support.design.widget.i
    public boolean a(CoordinatorLayout coordinatorLayout, Snackbar.SnackbarLayout snackbarLayout, MotionEvent motionEvent) {
        az azVar;
        az azVar2;
        if (coordinatorLayout.a(snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    ax a2 = ax.a();
                    azVar2 = this.f96a.c;
                    a2.a(azVar2);
                    break;
                case 1:
                case 3:
                    ax a3 = ax.a();
                    azVar = this.f96a.c;
                    a3.b(azVar);
                    break;
            }
        }
        return super.a(coordinatorLayout, (CoordinatorLayout) snackbarLayout, motionEvent);
    }
}
