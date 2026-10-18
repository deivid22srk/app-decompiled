package com.google.android.finsky.receivers;

import android.os.Handler;

/* loaded from: classes.dex */
final class q extends com.google.android.finsky.installer.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f4492a;

    q(h hVar) {
        this.f4492a = hVar;
    }

    @Override // com.google.android.finsky.installer.k
    public final void a(String str) {
    }

    @Override // com.google.android.finsky.installer.k
    public final void b(String str) {
        Handler handler;
        handler = this.f4492a.k;
        handler.post(new r(this, str));
    }
}
