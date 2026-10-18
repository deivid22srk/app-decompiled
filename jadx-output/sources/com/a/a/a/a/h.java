package com.a.a.a.a;

/* loaded from: classes.dex */
final class h implements a.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f901a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f902b;
    private boolean c;

    private h(f fVar) {
        this.f901a = fVar;
        this.f902b = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 10};
    }

    /* synthetic */ h(f fVar, byte b2) {
        this(fVar);
    }

    @Override // a.x
    public final a.z a() {
        a.h hVar;
        hVar = this.f901a.d;
        return hVar.a();
    }

    @Override // a.x
    public final void a_(a.f fVar, long j) {
        a.h hVar;
        a.h hVar2;
        byte[] bArr;
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            a(j);
            hVar = this.f901a.d;
            hVar.a_(fVar, j);
            hVar2 = this.f901a.d;
            bArr = f.h;
            hVar2.b(bArr);
        }
    }

    @Override // a.x
    public final synchronized void b() {
        a.h hVar;
        if (!this.c) {
            hVar = this.f901a.d;
            hVar.b();
        }
    }

    @Override // a.x, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        a.h hVar;
        byte[] bArr;
        if (!this.c) {
            this.c = true;
            hVar = this.f901a.d;
            bArr = f.j;
            hVar.b(bArr);
            this.f901a.e = 3;
        }
    }

    private void a(long j) {
        byte[] bArr;
        a.h hVar;
        int i = 16;
        do {
            byte[] bArr2 = this.f902b;
            i--;
            bArr = f.i;
            bArr2[i] = bArr[(int) (15 & j)];
            j >>>= 4;
        } while (j != 0);
        hVar = this.f901a.d;
        hVar.c(this.f902b, i, this.f902b.length - i);
    }
}
