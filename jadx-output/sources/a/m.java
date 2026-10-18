package a;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements y {

    /* renamed from: b, reason: collision with root package name */
    private final i f18b;
    private final Inflater c;
    private final n d;

    /* renamed from: a, reason: collision with root package name */
    private int f17a = 0;
    private final CRC32 e = new CRC32();

    public m(y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.c = new Inflater(true);
        this.f18b = o.a(yVar);
        this.d = new n(this.f18b, this.c);
    }

    @Override // a.y
    public final long a(f fVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f17a == 0) {
            this.f18b.a(10L);
            byte b2 = this.f18b.c().b(3L);
            boolean z = ((b2 >> 1) & 1) == 1;
            if (z) {
                a(this.f18b.c(), 0L, 10L);
            }
            a("ID1ID2", 8075, this.f18b.h());
            this.f18b.f(8L);
            if (((b2 >> 2) & 1) == 1) {
                this.f18b.a(2L);
                if (z) {
                    a(this.f18b.c(), 0L, 2L);
                }
                short j2 = this.f18b.c().j();
                this.f18b.a(j2);
                if (z) {
                    a(this.f18b.c(), 0L, j2);
                }
                this.f18b.f(j2);
            }
            if (((b2 >> 3) & 1) == 1) {
                long a2 = this.f18b.a((byte) 0);
                if (a2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    a(this.f18b.c(), 0L, 1 + a2);
                }
                this.f18b.f(1 + a2);
            }
            if (((b2 >> 4) & 1) == 1) {
                long a3 = this.f18b.a((byte) 0);
                if (a3 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    a(this.f18b.c(), 0L, 1 + a3);
                }
                this.f18b.f(1 + a3);
            }
            if (z) {
                a("FHCRC", this.f18b.j(), (short) this.e.getValue());
                this.e.reset();
            }
            this.f17a = 1;
        }
        if (this.f17a == 1) {
            long j3 = fVar.f10b;
            long a4 = this.d.a(fVar, j);
            if (a4 != -1) {
                a(fVar, j3, a4);
                return a4;
            }
            this.f17a = 2;
        }
        if (this.f17a == 2) {
            a("CRC", this.f18b.k(), (int) this.e.getValue());
            a("ISIZE", this.f18b.k(), this.c.getTotalOut());
            this.f17a = 3;
            if (!this.f18b.e()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // a.y
    public final z a() {
        return this.f18b.a();
    }

    @Override // a.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    private void a(f fVar, long j, long j2) {
        v vVar = fVar.f9a;
        while (j >= vVar.c - vVar.f33b) {
            j -= vVar.c - vVar.f33b;
            vVar = vVar.d;
        }
        while (j2 > 0) {
            int min = (int) Math.min(vVar.c - r1, j2);
            this.e.update(vVar.f32a, (int) (vVar.f33b + j), min);
            j2 -= min;
            vVar = vVar.d;
            j = 0;
        }
    }

    private static void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
