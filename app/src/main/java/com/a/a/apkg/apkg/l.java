package com.a.a.apkg.apkg;

/* loaded from: classes.dex */
final class l extends g {
    public final /* synthetic */ f c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar) {
        super(fVar, (byte) 0);
        this.c = fVar;
    }

    /* synthetic */ l(f fVar, byte b2) {
        this(fVar);
    }

    @Override // a.y
    public final long a(okio2.f fVar, long j) {
        okio2.i iVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f899a) {
            throw new IllegalStateException("closed");
        }
        if (this.d) {
            return -1L;
        }
        iVar = this.c.c;
        long a2 = iVar.a(fVar, j);
        if (a2 != -1) {
            return a2;
        }
        this.d = true;
        a(false);
        return -1L;
    }

    @Override // a.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f899a) {
            if (!this.d) {
                b();
            }
            this.f899a = true;
        }
    }
}
