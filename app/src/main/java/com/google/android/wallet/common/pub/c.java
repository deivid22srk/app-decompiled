package com.google.android.wallet.common.pub;

import com.google.android.wallet.ui.common.bj;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f7290a;

    c(a aVar) {
        this.f7290a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bj.a(this.f7290a.c, this.f7290a.c.getTitle());
    }
}
