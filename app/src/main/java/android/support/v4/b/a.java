package android.support.v4.b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a<D> extends n<D> {

    /* renamed from: a, reason: collision with root package name */
    volatile a<D>.b f242a;

    /* renamed from: b, reason: collision with root package name */
    volatile a<D>.b f243b;
    long c;
    long d;
    Handler e;
    private final Executor f;

    public abstract D d();

    final class b extends r<Void, Void, D> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        boolean f246a;
        private final CountDownLatch g = new CountDownLatch(1);

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.support.v4.b.r
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public D a() {
            try {
                return (D) a.this.d();
            } catch (OperationCanceledException e) {
                if (!this.e.isCancelled()) {
                    throw e;
                }
                return null;
            }
        }

        @Override // android.support.v4.b.r
        protected final void a(D d) {
            try {
                a aVar = a.this;
                if (aVar.f242a != this) {
                    aVar.a(this, d);
                } else if (aVar.s) {
                    aVar.a((a) d);
                } else {
                    aVar.v = false;
                    aVar.d = SystemClock.uptimeMillis();
                    aVar.f242a = null;
                    aVar.b(d);
                }
            } finally {
                this.g.countDown();
            }
        }

        @Override // android.support.v4.b.r
        protected final void b(D d) {
            try {
                a.this.a(this, d);
            } finally {
                this.g.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f246a = false;
            a.this.c();
        }
    }

    public a(Context context) {
        this(context, r.c);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.d = -10000L;
        this.f = executor;
    }

    @Override // android.support.v4.b.n
    protected final void a() {
        super.a();
        j();
        this.f242a = new b();
        c();
    }

    @Override // android.support.v4.b.n
    protected final boolean b() {
        boolean z = false;
        if (this.f242a != null) {
            if (this.f243b != null) {
                if (this.f242a.f246a) {
                    this.f242a.f246a = false;
                    this.e.removeCallbacks(this.f242a);
                }
                this.f242a = null;
            } else if (this.f242a.f246a) {
                this.f242a.f246a = false;
                this.e.removeCallbacks(this.f242a);
                this.f242a = null;
            } else {
                z = this.f242a.e.cancel(false);
                if (z) {
                    this.f243b = this.f242a;
                    e();
                }
                this.f242a = null;
            }
        }
        return z;
    }

    public void a(D d) {
    }

    final void c() {
        if (this.f243b == null && this.f242a != null) {
            if (this.f242a.f246a) {
                this.f242a.f246a = false;
                this.e.removeCallbacks(this.f242a);
            }
            if (this.c > 0 && SystemClock.uptimeMillis() < this.d + this.c) {
                this.f242a.f246a = true;
                this.e.postAtTime(this.f242a, this.d + this.c);
                return;
            }
            a<D>.b bVar = this.f242a;
            Executor executor = this.f;
            if (bVar.f != y.PENDING) {
                switch (v.f256a[bVar.f.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    case 2:
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            }
            bVar.f = y.RUNNING;
            bVar.d.f261b = null;
            executor.execute(bVar.e);
        }
    }

    final void a(a<D>.b bVar, D d) {
        a((a<D>) d);
        if (this.f243b != bVar) {
            return;
        }
        if (this.v) {
            this.u = true;
        }
        this.d = SystemClock.uptimeMillis();
        this.f243b = null;
        if (this.p != null) {
            this.p.d();
        }
        c();
    }

    public void e() {
    }

    @Override // android.support.v4.b.n
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        if (this.f242a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f242a);
            printWriter.print(" waiting=");
            printWriter.println(this.f242a.f246a);
        }
        if (this.f243b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f243b);
            printWriter.print(" waiting=");
            printWriter.println(this.f243b.f246a);
        }
        if (this.c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            android.support.v4.h.t.a(this.c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            android.support.v4.h.t.a(this.d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
