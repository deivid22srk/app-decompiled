package com.google.android.play.a;

import android.os.HandlerThread;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class x extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Semaphore f6792a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(String str, Semaphore semaphore) {
        super(str, 10);
        this.f6792a = semaphore;
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        this.f6792a.release();
    }
}
