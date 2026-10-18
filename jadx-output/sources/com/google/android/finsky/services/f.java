package com.google.android.finsky.services;

/* loaded from: classes.dex */
final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ContentSyncService f4620a;

    f(ContentSyncService contentSyncService) {
        this.f4620a = contentSyncService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.finsky.b.c cVar;
        com.google.android.finsky.b.k kVar;
        cVar = this.f4620a.d;
        kVar = this.f4620a.e;
        cVar.a(kVar);
    }
}
