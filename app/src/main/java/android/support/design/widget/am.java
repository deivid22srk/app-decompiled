package android.support.design.widget;

import android.os.Handler;

/* loaded from: classes.dex */
final class am implements az {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Snackbar f87a;

    am(Snackbar snackbar) {
        this.f87a = snackbar;
    }

    @Override // android.support.design.widget.az
    public final void a() {
        Handler handler;
        Handler handler2;
        handler = Snackbar.d;
        handler2 = Snackbar.d;
        handler.sendMessage(handler2.obtainMessage(0, this.f87a));
    }

    @Override // android.support.design.widget.az
    public final void a(int i) {
        Handler handler;
        Handler handler2;
        handler = Snackbar.d;
        handler2 = Snackbar.d;
        handler.sendMessage(handler2.obtainMessage(1, i, 0, this.f87a));
    }
}
