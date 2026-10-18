package android.support.v7.a;

import android.view.View;
import android.widget.AbsListView;

/* loaded from: classes.dex */
final class t implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f539a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f540b;
    final /* synthetic */ p c;

    t(p pVar, View view, View view2) {
        this.c = pVar;
        this.f539a = view;
        this.f540b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        p.a(absListView, this.f539a, this.f540b);
    }
}
