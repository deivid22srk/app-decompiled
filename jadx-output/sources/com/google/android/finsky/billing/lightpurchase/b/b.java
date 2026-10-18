package com.google.android.finsky.billing.lightpurchase.b;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f2317a;

    b(a aVar) {
        this.f2317a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2317a.ai != null) {
            this.f2317a.u();
            a.b(this.f2317a);
            this.f2317a.b((f<?>) this.f2317a.ai);
            return;
        }
        FinskyLog.c("Current fragment null.", new Object[0]);
    }
}
