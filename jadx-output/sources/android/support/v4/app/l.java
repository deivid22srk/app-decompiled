package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
final class l implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f225a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f226b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ i e;

    l(i iVar, View view, n nVar, int i, Object obj) {
        this.e = iVar;
        this.f225a = view;
        this.f226b = nVar;
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f225a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.e.a(this.f226b, this.c, this.d);
        return true;
    }
}
