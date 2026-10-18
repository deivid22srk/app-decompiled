package com.google.android.play.drawer;

import android.view.View;

/* loaded from: classes.dex */
final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f6852a;

    b(a aVar) {
        this.f6852a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar;
        boolean z;
        uVar = this.f6852a.m;
        z = this.f6852a.h;
        uVar.a(!z);
        this.f6852a.b();
    }
}
