package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ea implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<View> f381a;

    /* renamed from: b, reason: collision with root package name */
    dy f382b;
    final /* synthetic */ dz c;

    /* synthetic */ ea(dz dzVar, dy dyVar, View view, byte b2) {
        this(dzVar, dyVar, view);
    }

    private ea(dz dzVar, dy dyVar, View view) {
        this.c = dzVar;
        this.f381a = new WeakReference<>(view);
        this.f382b = dyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f381a.get();
        if (view == null) {
            return;
        }
        this.c.c(this.f382b, view);
    }
}
