package com.a.a.apkg.apkg;

import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class y implements okio2.x {

    /* renamed from: a, reason: collision with root package name */
    public final okio2.f f919a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f920b;
    public final int c;

    public y(int i) {
        this.f919a = new okio2.f();
        this.c = i;
    }

    public y() {
        this(-1);
    }

    @Override // okio2.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f920b) {
            this.f920b = true;
            if (this.f919a.f10b < this.c) {
                throw new ProtocolException("content-length promised " + this.c + " bytes, but received " + this.f919a.f10b);
            }
        }
    }

    @Override // okio2.x
    public final void a_(okio2.f fVar, long j) {
        if (this.f920b) {
            throw new IllegalStateException("closed");
        }
        com.a.a.apkg.l.a(fVar.f10b, j);
        if (this.c != -1 && this.f919a.f10b > this.c - j) {
            throw new ProtocolException("exceeded content-length limit of " + this.c + " bytes");
        }
        this.f919a.a_(fVar, j);
    }

    @Override // okio2.x
    public final void b() {
    }

    @Override // okio2.x
    public final okio2.z a() {
        return okio2.z.f36b;
    }

    public final void a(okio2.x xVar) {
        okio2.f clone = this.f919a.clone();
        xVar.a_(clone, clone.f10b);
    }
}
