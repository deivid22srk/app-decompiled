package com.google.android.finsky.layout.play;

import com.google.android.finsky.api.model.DfeToc;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3462a;

    c(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3462a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        com.google.android.finsky.navigationmanager.b bVar2;
        DfeToc dfeToc;
        DfeToc dfeToc2;
        this.f3462a.d(124);
        bVar = this.f3462a.o;
        bVar.w();
        bVar2 = this.f3462a.o;
        dfeToc = this.f3462a.A;
        String str = dfeToc.f1961a.z;
        dfeToc2 = this.f3462a.A;
        bVar2.a(str, dfeToc2);
    }
}
