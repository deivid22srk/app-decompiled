package com.google.android.finsky.layout.play;

import android.support.v4.app.Fragment;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.activities.gv;
import com.google.android.finsky.api.model.DfeToc;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3506a;

    o(FinskyDrawerLayout finskyDrawerLayout) {
        this.f3506a = finskyDrawerLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.navigationmanager.b bVar;
        com.google.android.finsky.navigationmanager.b bVar2;
        DfeToc dfeToc;
        this.f3506a.d(133);
        bVar = this.f3506a.o;
        bVar.w();
        bVar2 = this.f3506a.o;
        dfeToc = this.f3506a.A;
        if (!bVar2.k()) {
            return;
        }
        String str = dfeToc.f1961a.n;
        if (bVar2.a(dfeToc, 13)) {
            return;
        }
        bVar2.j();
        bVar2.a(1, str, (Fragment) gv.a(str, bVar2.f3538a.getString(R.string.entertainment), 13, dfeToc), false, new View[0]);
    }
}
