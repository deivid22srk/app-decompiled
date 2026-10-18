package okio2;

import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class k implements x {

    /* renamed from: a, reason: collision with root package name */
    private final h f14a;

    /* renamed from: b, reason: collision with root package name */
    private final Deflater f15b;
    private boolean c;

    public k(x xVar, Deflater deflater) {
        this(o.a(xVar), deflater);
    }

    private k(h hVar, Deflater deflater) {
        if (hVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f14a = hVar;
        this.f15b = deflater;
    }

    @Override // okio2.x
    public final void a_(f fVar, long j) {
        ab.a(fVar.f10b, 0L, j);
        while (j > 0) {
            v vVar = fVar.f9a;
            int min = (int) Math.min(j, vVar.c - vVar.f33b);
            this.f15b.setInput(vVar.f32a, vVar.f33b, min);
            a(false);
            fVar.f10b -= min;
            vVar.f33b += min;
            if (vVar.f33b == vVar.c) {
                fVar.f9a = vVar.a();
                w.f34a.a(vVar);
            }
            j -= min;
        }
    }

    private void a(boolean z) {
        f c = this.f14a.c();
        while (true) {
            v d = c.d(1);
            int deflate = z ? this.f15b.deflate(d.f32a, d.c, 2048 - d.c, 2) : this.f15b.deflate(d.f32a, d.c, 2048 - d.c);
            if (deflate > 0) {
                d.c += deflate;
                c.f10b += deflate;
                this.f14a.q();
            } else if (this.f15b.needsInput()) {
                return;
            }
        }
    }

    @Override // okio2.x
    public final void b() {
        a(true);
        this.f14a.b();
    }

    @Override // okio2.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                this.f15b.finish();
                a(false);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f15b.end();
                th = th;
            } catch (Throwable th3) {
                th = th3;
                if (th != null) {
                    th = th;
                }
            }
            try {
                this.f14a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.c = true;
            if (th != null) {
                ab.a(th);
            }
        }
    }

    @Override // okio2.x
    public final z a() {
        return this.f14a.a();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f14a + ")";
    }
}
