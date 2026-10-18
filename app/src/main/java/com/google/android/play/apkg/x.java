package com.google.android.play.apkg;

import android.os.HandlerThread;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class x extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Semaphore f6792a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(String str, Semaphore semaphore) {
        super(str, 10);
        this.f6792a = semaphore;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.f6792a.release();
    }
}
