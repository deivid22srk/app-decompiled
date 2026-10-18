package com.a.a.a.a;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements a.y {

    /* renamed from: a, reason: collision with root package name */
    boolean f909a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.i f910b;
    final /* synthetic */ b c;
    final /* synthetic */ a.h d;
    final /* synthetic */ o e;

    public q(o oVar, a.i iVar, b bVar, a.h hVar) {
        this.e = oVar;
        this.f910b = iVar;
        this.c = bVar;
        this.d = hVar;
    }

    @Override // a.y
    public final long a(a.f fVar, long j) {
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

    @Override // a.y
    public final a.z a() {
        return this.f910b.a();
    }

    @Override // a.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f909a && !com.a.a.a.l.a((a.y) this, TimeUnit.MILLISECONDS)) {
            this.f909a = true;
        }
        this.f910b.close();
    }
}
