package com.a.a.apkg.apkg;

import java.net.ProtocolException;

/* loaded from: classes.dex */
final class j implements okio2.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f903a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f904b;
    public long c;

    /* synthetic */ j(f fVar, long j, byte b2) {
        this(fVar, j);
    }

    public j(f fVar, long j) {
        this.f903a = fVar;
        this.c = j;
    }

    @Override // okio2.x
    public final okio2.z a() {
        okio2.h hVar;
        hVar = this.f903a.d;
        return hVar.a();
    }

    @Override // okio2.x
    public final void a_(okio2.f fVar, long j) {
        okio2.h hVar;
        if (this.f904b) {
            throw new IllegalStateException("closed");
        }
        com.a.a.apkg.l.a(fVar.f10b, j);
        if (j <= this.c) {
            hVar = this.f903a.d;
            hVar.a_(fVar, j);
            this.c -= j;
            return;
        }
        throw new ProtocolException("expected " + this.c + " bytes but received " + j);
    }

    @Override // okio2.x
    public final void b() {
        okio2.h hVar;
        if (!this.f904b) {
            hVar = this.f903a.d;
            hVar.b();
        }
    }

    @Override // okio2.x, java.io.Closeable, java.lang.AutoCloseable
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
