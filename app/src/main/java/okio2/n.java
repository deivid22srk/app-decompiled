package okio2;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class n implements y {

    /* renamed from: a, reason: collision with root package name */
    private final i f19a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f20b;
    private int c;
    private boolean d;

    public n(y yVar, Inflater inflater) {
        this(o.a(yVar), inflater);
    }

    n(i iVar, Inflater inflater) {
        if (iVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f19a = iVar;
        this.f20b = inflater;
    }

    @Override // okio2.y
    public final long a(f fVar, long j) {
        boolean b2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        do {
            b2 = b();
            try {
                v d = fVar.d(1);
                int inflate = this.f20b.inflate(d.f32a, d.c, 2048 - d.c);
                if (inflate > 0) {
                    d.c += inflate;
                    fVar.f10b += inflate;
                    return inflate;
                }
                if (this.f20b.finished() || this.f20b.needsDictionary()) {
                    c();
                    return -1L;
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!b2);
        throw new EOFException("source exhausted prematurely");
    }

    public final boolean b() {
        if (!this.f20b.needsInput()) {
            return false;
        }
        c();
        if (this.f20b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f19a.e()) {
            return true;
        }
        v vVar = this.f19a.c().f9a;
        this.c = vVar.c - vVar.f33b;
        this.f20b.setInput(vVar.f32a, vVar.f33b, this.c);
        return false;
    }

    private void c() {
        if (this.c != 0) {
            int remaining = this.c - this.f20b.getRemaining();
            this.c -= remaining;
            this.f19a.f(remaining);
        }
    }

    @Override // okio2.y
    public final z a() {
        return this.f19a.a();
    }

    @Override // okio2.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.d) {
            this.f20b.end();
            this.d = true;
            this.f19a.close();
        }
    }
}
