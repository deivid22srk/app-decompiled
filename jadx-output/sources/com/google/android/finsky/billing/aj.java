package com.google.android.finsky.billing;

import com.google.android.finsky.protos.sa;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class aj implements com.android.volley.t<sa[]> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f2162a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ai f2163b;

    aj(ai aiVar, Runnable runnable) {
        this.f2163b = aiVar;
        this.f2162a = runnable;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(sa[] saVarArr) {
        sa[] saVarArr2 = saVarArr;
        k.a(saVarArr2);
        FinskyLog.a("Received and stored %d billing countries.", Integer.valueOf(saVarArr2.length));
        if (this.f2162a == null) {
            return;
        }
        this.f2162a.run();
    }
}
