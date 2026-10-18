package com.google.android.finsky.receivers;

import android.os.AsyncTask;
import java.util.List;

/* loaded from: classes.dex */
final class j extends AsyncTask<Void, Void, List<com.google.android.finsky.download.r>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f4481a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f4482b;

    j(h hVar, Runnable runnable) {
        this.f4482b = hVar;
        this.f4481a = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ void onPostExecute(java.util.List<com.google.android.finsky.download.r> r5) {
        /*
            r4 = this;
            r1 = 1
            java.util.List r5 = (java.util.List) r5
            com.google.android.finsky.receivers.h r0 = r4.f4482b
            com.google.android.finsky.receivers.h r2 = r4.f4482b
            com.google.android.finsky.b.a r2 = com.google.android.finsky.receivers.h.b(r2)
            java.util.List r2 = r2.a()
            com.google.android.finsky.receivers.h.a(r0, r2)
            if (r5 == 0) goto L43
            com.google.android.finsky.receivers.h r0 = r4.f4482b
            boolean r0 = com.google.android.finsky.receivers.h.d(r0)
            if (r0 == 0) goto L3e
            r0 = 0
            com.google.android.finsky.receivers.h r2 = r4.f4482b
            com.google.android.finsky.receivers.k r3 = new com.google.android.finsky.receivers.k
            r3.<init>(r4, r5)
            com.google.android.finsky.receivers.h.a(r2, r3)
        L27:
            if (r0 == 0) goto L3d
            com.google.android.finsky.receivers.h r0 = r4.f4482b
            com.google.android.finsky.receivers.h.e(r0)
            com.google.android.finsky.receivers.h r0 = r4.f4482b
            com.google.android.finsky.receivers.h.f(r0)
            com.google.android.finsky.receivers.h r0 = r4.f4482b
            com.google.android.finsky.receivers.h.a(r0, r1)
            java.lang.Runnable r0 = r4.f4481a
            r0.run()
        L3d:
            return
        L3e:
            com.google.android.finsky.receivers.h r0 = r4.f4482b
            com.google.android.finsky.receivers.h.b(r0, r5)
        L43:
            r0 = r1
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.receivers.j.onPostExecute(java.lang.Object):void");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ List<com.google.android.finsky.download.r> doInBackground(Void[] voidArr) {
        com.google.android.finsky.b.a aVar;
        com.google.android.finsky.download.w wVar;
        h.m("patches");
        h.m("copies");
        aVar = this.f4482b.d;
        aVar.f2060a.c();
        wVar = this.f4482b.f;
        return wVar.a();
    }
}
