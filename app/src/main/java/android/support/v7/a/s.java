package android.support.v7.a;

import android.view.View;

/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f537a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f538b;
    final /* synthetic */ p c;

    s(p pVar, View view, View view2) {
        this.c = pVar;
        this.f537a = view;
        this.f538b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.c.w, this.f537a, this.f538b);
    }
}
