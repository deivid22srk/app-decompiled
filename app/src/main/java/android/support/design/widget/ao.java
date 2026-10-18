package android.support.design.widget;

import android.os.Handler;

/* loaded from: classes.dex */
final class ao implements av {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Snackbar f89a;

    ao(Snackbar snackbar) {
        this.f89a = snackbar;
    }

    @Override // android.support.design.widget.av
    public final void a() {
        Handler handler;
        if (ax.a().c(this.f89a.c)) {
            handler = Snackbar.d;
            handler.post(new ap(this));
        }
    }
}
