package com.google.android.play.search;

import android.view.View;

/* loaded from: classes.dex */
final class t implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f7056a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f7057b;

    t(r rVar, v vVar) {
        this.f7057b = rVar;
        this.f7056a = vVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f7057b.c == null) {
            return false;
        }
        l lVar = this.f7057b.c;
        v vVar = this.f7056a;
        boolean z = false;
        for (int size = lVar.f7047a.size() - 1; size >= 0; size--) {
            z |= lVar.f7047a.get(size).b(vVar);
        }
        return z;
    }
}
