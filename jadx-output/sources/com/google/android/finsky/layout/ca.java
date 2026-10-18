package com.google.android.finsky.layout;

import android.view.View;

/* loaded from: classes.dex */
final class ca implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bz f3180a;

    ca(bz bzVar) {
        this.f3180a = bzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.activities.b.x xVar = this.f3180a.h;
        int i = this.f3180a.i;
        if (xVar.f1601a.containsKey(Integer.valueOf(i))) {
            com.google.android.finsky.activities.b.y yVar = xVar.f1601a.get(Integer.valueOf(i));
            yVar.a(yVar.d, true);
        }
        this.f3180a.a();
    }
}
