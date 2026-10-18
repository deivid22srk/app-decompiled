package com.google.android.finsky.download.inlineappinstaller.a;

import android.view.View;

/* loaded from: classes.dex */
final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2713a;

    f(e eVar) {
        this.f2713a = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.download.inlineappinstaller.a aVar = (com.google.android.finsky.download.inlineappinstaller.a) e.a(this.f2713a);
        aVar.c = true;
        aVar.b(false);
    }
}
