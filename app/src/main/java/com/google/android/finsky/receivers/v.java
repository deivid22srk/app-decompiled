package com.google.android.finsky.receivers;

import android.net.Uri;

/* loaded from: classes.dex */
final class v implements aj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Uri f4500a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f4501b;

    v(u uVar, Uri uri) {
        this.f4501b = uVar;
        this.f4500a = uri;
    }

    @Override // com.google.android.finsky.receivers.aj
    public final void a(com.google.android.finsky.download.b bVar) {
        com.google.android.finsky.download.w wVar;
        bVar.a(this.f4500a);
        wVar = this.f4501b.t;
        wVar.f(bVar);
    }
}
