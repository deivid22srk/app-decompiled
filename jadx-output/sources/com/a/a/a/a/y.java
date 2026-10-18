package com.a.a.a.a;

import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class y implements a.x {

    /* renamed from: a, reason: collision with root package name */
    public final a.f f919a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f920b;
    private final int c;

    public y(int i) {
        this.f919a = new a.f();
        this.c = i;
    }

    public y() {
        this(-1);
    }

    @Override // a.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f920b) {
            this.f920b = true;
            if (this.f919a.f10b < this.c) {
                throw new ProtocolException("content-length promised " + this.c + " bytes, but received " + this.f919a.f10b);
            }
        }
    }

    @Override // a.x
    public final void a_(a.f fVar, long j) {
        if (this.f920b) {
            throw new IllegalStateException("closed");
        }
        com.a.a.a.l.a(fVar.f10b, j);
        if (this.c != -1 && this.f919a.f10b > this.c - j) {
            throw new ProtocolException("exceeded content-length limit of " + this.c + " bytes");
        }
        this.f919a.a_(fVar, j);
    }

    @Override // a.x
    public final void b() {
    }

    @Override // a.x
    public final a.z a() {
        return a.z.f36b;
    }

    public final void a(a.x xVar) {
        a.f clone = this.f919a.clone();
        xVar.a_(clone, clone.f10b);
    }
}
