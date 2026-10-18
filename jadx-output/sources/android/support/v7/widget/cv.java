package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class cv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cu f752a;

    cv(cu cuVar) {
        this.f752a = cuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f752a.l;
        if (view != null && view.getWindowToken() != null) {
            this.f752a.b();
        }
    }
}
