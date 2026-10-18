package com.google.android.wallet.common.bpkg.a;

import com.google.android.wallet.analytics.e;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f7266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f7267b;

    c(b bVar, e eVar) {
        this.f7267b = bVar;
        this.f7266a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7267b.f7265b) {
            return;
        }
        this.f7267b.f7265b = true;
        a.a(this.f7266a, -1);
    }
}
