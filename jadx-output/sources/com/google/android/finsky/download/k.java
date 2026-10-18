package com.google.android.finsky.download;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class k extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f2718a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(j jVar, Handler handler) {
        super(handler);
        this.f2718a = jVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        j.a(this.f2718a);
    }
}
