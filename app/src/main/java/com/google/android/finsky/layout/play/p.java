package com.google.android.finsky.layout.play;

import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pt;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pt f3507a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3508b;

    p(FinskyDrawerLayout finskyDrawerLayout, pt ptVar) {
        this.f3508b = finskyDrawerLayout;
        this.f3507a = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        com.google.android.finsky.navigationmanager.b bVar2;
        DfeToc dfeToc;
        FinskyDrawerLayout.b(this.f3508b, this.f3507a.f4268a);
        bVar = this.f3508b.o;
        bVar.w();
        bVar2 = this.f3508b.o;
        String str = this.f3507a.e;
        String str2 = this.f3507a.c;
        int i = this.f3507a.f4268a;
        dfeToc = this.f3508b.A;
        bVar2.b(str, str2, i, dfeToc);
    }
}
