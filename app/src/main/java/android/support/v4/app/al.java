package android.support.v4.app;

import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
final class al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f177a;

    al(aj ajVar) {
        this.f177a = ajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        view = this.f177a.c;
        android.support.v4.view.by.a(view, 0, (Paint) null);
    }
}
