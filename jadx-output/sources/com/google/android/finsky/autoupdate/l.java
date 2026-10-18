package com.google.android.finsky.autoupdate;

import com.google.android.finsky.autoupdate.ReschedulerUsingBroadcast;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f2042a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReschedulerUsingBroadcast.AutoUpdateRecheckForBroadcast f2043b;

    l(ReschedulerUsingBroadcast.AutoUpdateRecheckForBroadcast autoUpdateRecheckForBroadcast, n nVar) {
        this.f2043b = autoUpdateRecheckForBroadcast;
        this.f2042a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (!com.google.android.finsky.f.a.a().b()) {
            h.a((u) new m(this), true);
        } else {
            ReschedulerUsingBroadcast.a(n.GEARHEAD);
            h.a(Integer.valueOf(this.f2042a.ordinal()), true);
        }
        ReschedulerUsingBroadcast.AutoUpdateRecheckForBroadcast autoUpdateRecheckForBroadcast = this.f2043b;
        i = this.f2043b.f2028a;
        autoUpdateRecheckForBroadcast.stopSelf(i);
    }
}
