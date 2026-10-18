package com.google.android.finsky.layout.play;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.no;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3511a;

    r(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3511a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        this.f3511a.d(109);
        String j = FinskyApp.a().j();
        if (j != null) {
            bVar = this.f3511a.o;
            bVar.a(j, (no) null);
        } else {
            FinskyLog.e("Redeem chosen with no current account.", new Object[0]);
        }
    }
}
