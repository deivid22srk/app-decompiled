package android.support.v4.b;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class s implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f253a = new AtomicInteger(1);

    s() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.f253a.getAndIncrement());
    }
}
