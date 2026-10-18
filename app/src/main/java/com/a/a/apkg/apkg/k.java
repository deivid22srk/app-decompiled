package com.a.a.apkg.apkg;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class k extends g {
    public final /* synthetic */ f c;
    public long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, long j) {
        super(fVar, (byte) 0);
        this.c = fVar;
        this.d = j;
        if (this.d == 0) {
            a(true);
        }
    }

    @Override // okio2.y
    public final long a(okio2.f fVar, long j) {
        okio2.i iVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f899a) {
            throw new IllegalStateException("closed");
        }
        if (this.d == 0) {
            return -1L;
        }
        iVar = this.c.c;
        long a2 = iVar.a(fVar, Math.min(this.d, j));
        if (a2 == -1) {
            b();
            throw new ProtocolException("unexpected end of stream");
        }
        this.d -= a2;
        if (this.d == 0) {
            a(true);
        }
        return a2;
    }

    @Override // okio2.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f899a) {
            if (this.d != 0 && !com.a.a.apkg.l.a((okio2.y) this, TimeUnit.MILLISECONDS)) {
                b();
            }
            this.f899a = true;
        }
    }
}
