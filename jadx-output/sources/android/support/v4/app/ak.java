package android.support.v4.app;

import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
final class ak implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f176a;

    ak(aj ajVar) {
        this.f176a = ajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        view = this.f176a.c;
        android.support.v4.view.by.a(view, 2, (Paint) null);
    }
}
