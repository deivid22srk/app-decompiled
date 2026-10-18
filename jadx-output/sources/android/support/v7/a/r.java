package android.support.v7.a;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

/* loaded from: classes.dex */
final class r implements android.support.v4.widget.aq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f535a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f536b;
    final /* synthetic */ p c;

    r(p pVar, View view, View view2) {
        this.c = pVar;
        this.f535a = view;
        this.f536b = view2;
    }

    @Override // android.support.v4.widget.aq
    public final void a(NestedScrollView nestedScrollView) {
        p.a(nestedScrollView, this.f535a, this.f536b);
    }
}
