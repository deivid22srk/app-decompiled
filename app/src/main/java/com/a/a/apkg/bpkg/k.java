package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class k implements okio2.y {

    /* renamed from: a, reason: collision with root package name */
    int f961a;

    /* renamed from: b, reason: collision with root package name */
    byte f962b;
    int c;
    int d;
    short e;
    public final okio2.i f;

    public k(okio2.i iVar) {
        this.f = iVar;
    }

    @Override // okio2.y
    public final long a(okio2.f fVar, long j) {
        Logger logger;
        IOException c;
        IOException c2;
        Logger logger2;
        while (this.d == 0) {
            this.f.f(this.e);
            this.e = (short) 0;
            if ((this.f962b & 4) != 0) {
                return -1L;
            }
            int i = this.c;
            int a2 = j.a(this.f);
            this.d = a2;
            this.f961a = a2;
            byte g = (byte) (this.f.g() & 255);
            this.f962b = (byte) (this.f.g() & 255);
            logger = j.f959a;
            if (logger.isLoggable(Level.FINE)) {
                logger2 = j.f959a;
                logger2.fine(l.a(true, this.c, this.f961a, g, this.f962b));
            }
            this.c = this.f.i() & Integer.MAX_VALUE;
            if (g != 9) {
                c = j.c("%s != TYPE_CONTINUATION", Byte.valueOf(g));
                throw c;
            }
            if (this.c != i) {
                c2 = j.c("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw c2;
            }
        }
        long a3 = this.f.a(fVar, Math.min(j, this.d));
        if (a3 == -1) {
            return -1L;
        }
        this.d = (int) (this.d - a3);
        return a3;
    }

    @Override // okio2.y
    public final okio2.z a() {
        return this.f.a();
    }

    @Override // okio2.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
