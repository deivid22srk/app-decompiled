package android.support.v7.widget;

import android.view.View;

/* loaded from: classes.dex */
final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v7.view.b f779a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ActionBarContextView f780b;

    e(ActionBarContextView actionBarContextView, android.support.v7.view.b bVar) {
        this.f780b = actionBarContextView;
        this.f779a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f779a.c();
    }
}
