package android.support.v4.b;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
abstract class r<Params, Progress, Result> {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadFactory f251a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f252b = new LinkedBlockingQueue(10);
    public static final Executor c;
    private static x g;
    private static volatile Executor h;
    volatile y f = y.PENDING;
    private final AtomicBoolean i = new AtomicBoolean();
    final z<Params, Result> d = new t(this);
    final FutureTask<Result> e = new u(this, this.d);

    protected abstract Result a();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, f252b, f251a);
        c = threadPoolExecutor;
        h = threadPoolExecutor;
    }

    private static Handler c() {
        x xVar;
        synchronized (r.class) {
            if (g == null) {
                g = new x();
            }
            xVar = g;
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result c(Result result) {
        c().obtainMessage(1, new w(this, result)).sendToTarget();
        return result;
    }

    protected void a(Result result) {
    }

    protected static void b() {
    }

    protected void b(Result result) {
    }

    static /* synthetic */ void b(r rVar, Object obj) {
        if (rVar.i.get()) {
            return;
        }
        rVar.c(obj);
    }

    static /* synthetic */ void c(r rVar, Object obj) {
        if (rVar.e.isCancelled()) {
            rVar.b(obj);
        } else {
            rVar.a((r) obj);
        }
        rVar.f = y.FINISHED;
    }
}
