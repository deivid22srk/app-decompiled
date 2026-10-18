package com.a.a.a.b;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ac implements Closeable {
    static final /* synthetic */ boolean k;
    private static final ExecutorService l;

    /* renamed from: a, reason: collision with root package name */
    public final com.a.a.aa f929a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f930b;
    long c;
    long d;
    public final y e;
    final y f;
    final as g;
    final Socket h;
    public final d i;
    final al j;
    private final q m;
    private final Map<Integer, ao> n;
    private final String o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private final ExecutorService t;
    private Map<Integer, v> u;
    private final w v;
    private int w;
    private boolean x;
    private final Set<Integer> y;

    static {
        k = !ac.class.desiredAssertionStatus();
        l = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.a.a.a.l.b("OkHttp SpdyConnection"));
    }

    public /* synthetic */ ac(ak akVar, byte b2) {
        this(akVar);
    }

    static /* synthetic */ boolean h(ac acVar) {
        acVar.x = true;
        return true;
    }

    static /* synthetic */ boolean i(ac acVar) {
        acVar.r = true;
        return true;
    }

    private ac(ak akVar) {
        byte b2 = 0;
        this.n = new HashMap();
        this.s = System.nanoTime();
        this.c = 0L;
        this.e = new y();
        this.f = new y();
        this.x = false;
        this.y = new LinkedHashSet();
        this.f929a = akVar.d;
        this.v = akVar.e;
        this.f930b = akVar.f;
        this.m = akVar.c;
        this.q = akVar.f ? 1 : 2;
        if (akVar.f && this.f929a == com.a.a.aa.HTTP_2) {
            this.q += 2;
        }
        this.w = akVar.f ? 1 : 2;
        if (akVar.f) {
            this.e.a(7, 0, 16777216);
        }
        this.o = akVar.f938a;
        if (this.f929a == com.a.a.aa.HTTP_2) {
            this.g = new j();
            this.t = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.a.a.a.l.b(String.format("OkHttp %s Push Observer", this.o)));
            this.f.a(7, 0, 65535);
            this.f.a(5, 0, 16384);
        } else if (this.f929a == com.a.a.aa.SPDY_3) {
            this.g = new z();
            this.t = null;
        } else {
            throw new AssertionError(this.f929a);
        }
        this.d = this.f.b();
        this.h = akVar.f939b;
        this.i = this.g.a(a.o.a(a.o.a(akVar.f939b)), this.f930b);
        this.j = new al(this, b2);
        new Thread(this.j).start();
    }

    final synchronized ao a(int i) {
        return this.n.get(Integer.valueOf(i));
    }

    final synchronized ao b(int i) {
        ao remove;
        remove = this.n.remove(Integer.valueOf(i));
        if (remove != null && this.n.isEmpty()) {
            a(true);
        }
        return remove;
    }

    private synchronized void a(boolean z) {
        this.s = z ? System.nanoTime() : Long.MAX_VALUE;
    }

    public final synchronized boolean a() {
        return this.s != Long.MAX_VALUE;
    }

    public final synchronized long b() {
        return this.s;
    }

    public final ao a(List<e> list, boolean z) {
        int i;
        ao aoVar;
        boolean z2 = z ? false : true;
        synchronized (this.i) {
            synchronized (this) {
                if (this.r) {
                    throw new IOException("shutdown");
                }
                i = this.q;
                this.q += 2;
                aoVar = new ao(i, this, z2, false, list);
                if (aoVar.a()) {
                    this.n.put(Integer.valueOf(i), aoVar);
                    a(false);
                }
            }
            this.i.a(z2, i, list);
        }
        if (!z) {
            this.i.b();
        }
        return aoVar;
    }

    public final void a(int i, boolean z, a.f fVar, long j) {
        int min;
        if (j == 0) {
            this.i.a(z, i, fVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.d <= 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.d), this.i.c());
                this.d -= min;
            }
            j -= min;
            this.i.a(z && j == 0, i, fVar, min);
        }
    }

    final void a(int i, a aVar) {
        l.submit(new ad(this, "OkHttp %s stream %d", new Object[]{this.o, Integer.valueOf(i)}, i, aVar));
    }

    final void b(int i, a aVar) {
        this.i.a(i, aVar);
    }

    final void a(int i, long j) {
        l.submit(new ae(this, "OkHttp Window Update %s stream %d", new Object[]{this.o, Integer.valueOf(i)}, i, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized v c(int i) {
        return this.u != null ? this.u.remove(Integer.valueOf(i)) : null;
    }

    public final void c() {
        this.i.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(a.NO_ERROR, a.CANCEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.a.a.a.b.a r13, com.a.a.a.b.a r14) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.b.ac.a(com.a.a.a.b.a, com.a.a.a.b.a):void");
    }

    static /* synthetic */ void a(ac acVar, boolean z, int i, int i2, v vVar) {
        synchronized (acVar.i) {
            if (vVar != null) {
                if (vVar.f979b != -1) {
                    throw new IllegalStateException();
                }
                vVar.f979b = System.nanoTime();
            }
            acVar.i.a(z, i, i2);
        }
    }

    static /* synthetic */ boolean a(ac acVar, int i) {
        return acVar.f929a == com.a.a.aa.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    static /* synthetic */ void a(ac acVar, int i, a.i iVar, int i2, boolean z) {
        a.f fVar = new a.f();
        iVar.a(i2);
        iVar.a(fVar, i2);
        if (fVar.f10b != i2) {
            throw new IOException(fVar.f10b + " != " + i2);
        }
        acVar.t.submit(new ai(acVar, "OkHttp %s Push Data[%s]", new Object[]{acVar.o, Integer.valueOf(i)}, i, fVar, i2, z));
    }

    static /* synthetic */ void a(ac acVar, int i, List list) {
        synchronized (acVar) {
            if (acVar.y.contains(Integer.valueOf(i))) {
                acVar.a(i, a.PROTOCOL_ERROR);
            } else {
                acVar.y.add(Integer.valueOf(i));
                acVar.t.submit(new ag(acVar, "OkHttp %s Push Request[%s]", new Object[]{acVar.o, Integer.valueOf(i)}, i, list));
            }
        }
    }
}
