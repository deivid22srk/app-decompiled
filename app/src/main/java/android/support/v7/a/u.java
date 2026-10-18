package android.support.v7.a;

import android.view.View;

/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f541a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f542b;
    final /* synthetic */ p c;

    u(p pVar, View view, View view2) {
        this.c = pVar;
        this.f541a = view;
        this.f542b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.c.f, this.f541a, this.f542b);
    }
}
