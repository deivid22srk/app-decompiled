package okio2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static final z f36b = new aa();

    /* renamed from: a, reason: collision with root package name */
    private long f37a;
    public boolean c;
    long d;

    public z a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.d = timeUnit.toNanos(j);
        return this;
    }

    public final long f() {
        if (this.c) {
            return this.f37a;
        }
        throw new IllegalStateException("No deadline");
    }

    public z a(long j) {
        this.c = true;
        this.f37a = j;
        return this;
    }

    public void g() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        if (this.c && System.nanoTime() > this.f37a) {
            throw new IOException("deadline reached");
        }
    }
}
