package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f223a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f224b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ n d;
    final /* synthetic */ boolean e;
    final /* synthetic */ Fragment f;
    final /* synthetic */ Fragment g;
    final /* synthetic */ i h;

    k(i iVar, View view, Object obj, ArrayList arrayList, n nVar, boolean z, Fragment fragment, Fragment fragment2) {
        this.h = iVar;
        this.f223a = view;
        this.f224b = obj;
        this.c = arrayList;
        this.d = nVar;
        this.e = z;
        this.f = fragment;
        this.g = fragment2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f223a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f224b != null) {
            aq.a(this.f224b, (ArrayList<View>) this.c);
            this.c.clear();
            android.support.v4.h.a a2 = i.a(this.h, this.d, this.e, this.f);
            aq.a(this.f224b, this.d.d, a2, this.c);
            i.a(this.h, a2, this.d);
            i.a(this.f, this.g, this.e, a2);
            return true;
        }
        return true;
    }
}
