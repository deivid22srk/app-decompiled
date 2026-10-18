package com.google.android.finsky.receivers;

/* loaded from: classes.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ClearCacheReceiver f4473a;

    c(ClearCacheReceiver clearCacheReceiver) {
        this.f4473a = clearCacheReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        System.exit(0);
    }
}
