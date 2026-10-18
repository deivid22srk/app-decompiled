package com.a.a.apkg.apkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements okio2.y {

    /* renamed from: a, reason: collision with root package name */
    boolean f909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ okio2.i f910b;
    public final /* synthetic */ b c;
    public final /* synthetic */ okio2.h d;
    public final /* synthetic */ o e;

    public q(o oVar, okio2.i iVar, b bVar, okio2.h hVar) {
        this.e = oVar;
        this.f910b = iVar;
        this.c = bVar;
        this.d = hVar;
    }

    @Override // okio2.y
    public final long a(okio2.f fVar, long j) {
        try {
            long a2 = this.f910b.a(fVar, j);
            if (a2 == -1) {
                if (!this.f909a) {
                    this.f909a = true;
                    this.d.close();
                }
                return -1L;
            }
            fVar.a(this.d.c(), fVar.f10b - a2, a2);
            this.d.q();
            return a2;
        } catch (IOException e) {
            if (!this.f909a) {
                this.f909a = true;
            }
            throw e;
        }
    }

    @Override // okio2.y
    public final okio2.z a() {
        return this.f910b.a();
    }

    @Override // okio2.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f909a && !com.a.a.apkg.l.a((okio2.y) this, TimeUnit.MILLISECONDS)) {
            this.f909a = true;
        }
        this.f910b.close();
    }
}
