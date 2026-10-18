package com.google.android.play.search;

import android.view.View;

/* loaded from: classes.dex */
final class s implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f7054a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f7055b;

    s(r rVar, v vVar) {
        this.f7055b = rVar;
        this.f7054a = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f7055b.c == null) {
            return;
        }
        l lVar = this.f7055b.c;
        v vVar = this.f7054a;
        lVar.a(vVar.e, false);
        for (int size = lVar.f7047a.size() - 1; size >= 0; size--) {
            lVar.f7047a.get(size).a(vVar);
        }
    }
}
