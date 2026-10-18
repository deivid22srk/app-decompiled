package com.a.a.apkg.apkg;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class i extends g {
    public final /* synthetic */ f c;
    public int d;
    public boolean e;
    public final o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(f fVar, o oVar) {
        super(fVar, (byte) 0);
        this.c = fVar;
        this.d = -1;
        this.e = true;
        this.f = oVar;
    }

    @Override // okio2.y
    public final long a(okio2.f fVar, long j) {
        okio2.i iVar;
        okio2.i iVar2;
        okio2.i iVar3;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.f899a) {
            throw new IllegalStateException("closed");
        }
        if (!this.e) {
            return -1L;
        }
        if (this.d == 0 || this.d == -1) {
            if (this.d != -1) {
                iVar2 = this.c.c;
                iVar2.m();
            }
            iVar = this.c.c;
            String m = iVar.m();
            int indexOf = m.indexOf(";");
            if (indexOf != -1) {
                m = m.substring(0, indexOf);
            }
            try {
                this.d = Integer.parseInt(m.trim(), 16);
                if (this.d == 0) {
                    this.e = false;
                    com.a.a.u uVar = new com.a.a.u();
                    this.c.a(uVar);
                    this.f.a(uVar.a());
                    a(true);
                }
                if (!this.e) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException("Expected a hex chunk size but was " + m);
            }
        }
        iVar3 = this.c.c;
        long a2 = iVar3.a(fVar, Math.min(j, this.d));
        if (a2 == -1) {
            b();
            throw new IOException("unexpected end of stream");
        }
        this.d = (int) (this.d - a2);
        return a2;
    }

    @Override // okio2.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f899a) {
            if (this.e && !com.a.a.apkg.l.a((okio2.y) this, TimeUnit.MILLISECONDS)) {
                b();
            }
            this.f899a = true;
        }
    }
}
