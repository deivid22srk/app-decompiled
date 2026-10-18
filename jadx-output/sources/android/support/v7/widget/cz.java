package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class cz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cy f756a;

    private cz(cy cyVar) {
        this.f756a = cyVar;
    }

    /* synthetic */ cz(cy cyVar, byte b2) {
        this(cyVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        view = this.f756a.d;
        view.getParent().requestDisallowInterceptTouchEvent(true);
    }
}
