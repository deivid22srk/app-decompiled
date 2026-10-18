package com.google.android.finsky.setup;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.jm;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class e implements Callable<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySetupService f4658a;

    e(PlaySetupService playSetupService) {
        this.f4658a = playSetupService;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        String str;
        String str2;
        String str3;
        str = this.f4658a.d;
        if (str != null) {
            com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
            str2 = this.f4658a.d;
            fVar.k(str2);
            str3 = this.f4658a.d;
            if (jm.a(fVar.i(str3))) {
                return false;
            }
        }
        return true;
    }
}
