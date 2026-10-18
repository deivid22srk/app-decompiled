package com.google.android.play.drawer;

import android.view.View;

/* loaded from: classes.dex */
final class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f6862a;

    i(a aVar) {
        this.f6862a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u uVar;
        boolean z;
        uVar = this.f6862a.m;
        z = this.f6862a.h;
        uVar.a(!z);
        this.f6862a.b();
    }
}
