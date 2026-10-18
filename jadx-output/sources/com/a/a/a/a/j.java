package com.a.a.a.a;

import java.net.ProtocolException;

/* loaded from: classes.dex */
final class j implements a.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f903a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f904b;
    private long c;

    /* synthetic */ j(f fVar, long j, byte b2) {
        this(fVar, j);
    }

    private j(f fVar, long j) {
        this.f903a = fVar;
        this.c = j;
    }

    @Override // a.x
    public final a.z a() {
        a.h hVar;
        hVar = this.f903a.d;
        return hVar.a();
    }

    @Override // a.x
    public final void a_(a.f fVar, long j) {
        a.h hVar;
        if (this.f904b) {
            throw new IllegalStateException("closed");
        }
        com.a.a.a.l.a(fVar.f10b, j);
        if (j <= this.c) {
            hVar = this.f903a.d;
            hVar.a_(fVar, j);
            this.c -= j;
            return;
        }
        throw new ProtocolException("expected " + this.c + " bytes but received " + j);
    }

    @Override // a.x
    public final void b() {
        a.h hVar;
        if (!this.f904b) {
            hVar = this.f903a.d;
            hVar.b();
        }
    }

    @Override // a.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f904b) {
            this.f904b = true;
            if (this.c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            this.f903a.e = 3;
        }
    }
}
