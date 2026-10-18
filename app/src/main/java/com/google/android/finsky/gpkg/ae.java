package com.google.android.finsky.gpkg;

import android.os.Handler;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class ae implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ac f2792a;

    ae(ac acVar) {
        this.f2792a = acVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ag agVar;
        ag agVar2;
        long j;
        Handler handler;
        ag agVar3;
        agVar = this.f2792a.f2789b.j;
        if (agVar != null) {
            agVar2 = this.f2792a.f2789b.j;
            if (agVar2.f2794b != null) {
                handler = this.f2792a.f2789b.f;
                agVar3 = this.f2792a.f2789b.j;
                handler.post(agVar3.f2794b);
            }
            this.f2792a.f2789b.j = null;
            x xVar = this.f2792a.f2789b;
            j = x.d;
            xVar.a(j);
            return;
        }
        FinskyLog.e("Expected pending replication request.", new Object[0]);
    }
}
