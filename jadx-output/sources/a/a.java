package a;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public class a extends z {

    /* renamed from: a, reason: collision with root package name */
    private static a f2a;
    private boolean e;
    private a f;
    private long g;

    public final void c() {
        if (this.e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long j = this.d;
        boolean z = this.c;
        if (j != 0 || z) {
            this.e = true;
            a(this, j, z);
        }
    }

    private static synchronized void a(a aVar, long j, boolean z) {
        synchronized (a.class) {
            if (f2a == null) {
                f2a = new a();
                new d().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                aVar.g = Math.min(j, aVar.f() - nanoTime) + nanoTime;
            } else if (j != 0) {
                aVar.g = nanoTime + j;
            } else if (z) {
                aVar.g = aVar.f();
            } else {
                throw new AssertionError();
            }
            long j2 = aVar.g - nanoTime;
            a aVar2 = f2a;
            while (aVar2.f != null && j2 >= aVar2.f.g - nanoTime) {
                aVar2 = aVar2.f;
            }
            aVar.f = aVar2.f;
            aVar2.f = aVar;
            if (aVar2 == f2a) {
                a.class.notify();
            }
        }
    }

    public final boolean d() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000b, code lost:
    
        r0.f = r3.f;
        r3.f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean a(a.a r3) {
        /*
            java.lang.Class<a.a> r1 = a.a.class
            monitor-enter(r1)
            a.a r0 = a.a.f2a     // Catch: java.lang.Throwable -> L1a
        L5:
            if (r0 == 0) goto L18
            a.a r2 = r0.f     // Catch: java.lang.Throwable -> L1a
            if (r2 != r3) goto L15
            a.a r2 = r3.f     // Catch: java.lang.Throwable -> L1a
            r0.f = r2     // Catch: java.lang.Throwable -> L1a
            r0 = 0
            r3.f = r0     // Catch: java.lang.Throwable -> L1a
            r0 = 0
        L13:
            monitor-exit(r1)
            return r0
        L15:
            a.a r0 = r0.f     // Catch: java.lang.Throwable -> L1a
            goto L5
        L18:
            r0 = 1
            goto L13
        L1a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a(a.a):boolean");
    }

    public void a() {
    }

    final void a(boolean z) {
        if (d() && z) {
            throw new InterruptedIOException("timeout");
        }
    }

    final IOException a(IOException iOException) {
        if (d()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            interruptedIOException.initCause(iOException);
            return interruptedIOException;
        }
        return iOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized a b() {
        a aVar = null;
        synchronized (a.class) {
            a aVar2 = f2a.f;
            if (aVar2 == null) {
                a.class.wait();
            } else {
                long nanoTime = aVar2.g - System.nanoTime();
                if (nanoTime > 0) {
                    long j = nanoTime / 1000000;
                    a.class.wait(j, (int) (nanoTime - (1000000 * j)));
                } else {
                    f2a.f = aVar2.f;
                    aVar2.f = null;
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }
}
