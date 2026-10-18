package com.deivid22srk.store;

import com.google.android.finsky.autoupdate.p;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.bpkg.a f1189a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ VendingBackupAgent f1190b;

    c(VendingBackupAgent vendingBackupAgent, com.google.android.finsky.bpkg.a aVar) {
        this.f1190b = vendingBackupAgent;
        this.f1189a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f1189a);
    }
}
