package com.google.android.finsky.layout.play;

import com.google.android.finsky.api.model.DfeToc;

/* loaded from: classes.dex */
final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3499a;

    i(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3499a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        DfeToc dfeToc;
        FinskyDrawerLayout.b(this.f3499a, 3);
        bVar = this.f3499a.o;
        dfeToc = this.f3499a.A;
        bVar.a(dfeToc);
    }
}
