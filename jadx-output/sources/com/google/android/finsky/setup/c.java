package com.google.android.finsky.setup;

import android.os.Bundle;
import com.android.vending.setup.RestoreConfig;

/* loaded from: classes.dex */
final class c extends com.android.vending.setup.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySetupService f4655a;

    c(PlaySetupService playSetupService) {
        this.f4655a = playSetupService;
    }

    @Override // com.android.vending.setup.a
    public final Bundle a() {
        Bundle c;
        c = this.f4655a.c();
        return c;
    }

    @Override // com.android.vending.setup.a
    public final void b() {
        PlaySetupService.b(this.f4655a);
    }

    @Override // com.android.vending.setup.a
    public final boolean c() {
        boolean d;
        d = this.f4655a.d();
        return d;
    }

    @Override // com.android.vending.setup.a
    public final Bundle a(String str) {
        return PlaySetupService.a(this.f4655a, str);
    }

    @Override // com.android.vending.setup.a
    public final Bundle a(RestoreConfig restoreConfig) {
        return PlaySetupService.a(restoreConfig);
    }

    @Override // com.android.vending.setup.a
    public final void d() {
        PlaySetupService.a();
    }

    @Override // com.android.vending.setup.a
    public final Bundle e() {
        return PlaySetupService.d(this.f4655a);
    }

    @Override // com.android.vending.setup.a
    public final void f() {
        PlaySetupService.e(this.f4655a);
    }
}
