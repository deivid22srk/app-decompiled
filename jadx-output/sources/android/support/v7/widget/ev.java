package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class ev implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f803a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eu f804b;

    ev(eu euVar, View view) {
        this.f804b = euVar;
        this.f803a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f804b.smoothScrollTo(this.f803a.getLeft() - ((this.f804b.getWidth() - this.f803a.getWidth()) / 2), 0);
        this.f804b.f801a = null;
    }
}
