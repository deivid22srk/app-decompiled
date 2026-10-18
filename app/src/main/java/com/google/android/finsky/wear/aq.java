package com.google.android.finsky.wear;

import com.google.android.finsky.utils.jm;

/* loaded from: classes.dex */
final class aq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5092a;

    aq(WearSupportService wearSupportService) {
        this.f5092a = wearSupportService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] f = d.f();
        ar arVar = new ar(this, f);
        jm.a(new c(this.f5092a, f, arVar), new Void[0]);
        jm.a(new j(this.f5092a, f, arVar), new Void[0]);
    }
}
