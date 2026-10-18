package com.a.a.apkg.apkg;

import com.a.a.ag;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f {
    public static final byte[] h = {13, 10};
    public static final byte[] i = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static final byte[] j = {48, 13, 10, 13, 10};

    /* renamed from: a, reason: collision with root package name */
    public final com.a.a.m f897a;

    /* renamed from: b, reason: collision with root package name */
    public final com.a.a.l f898b;
    public final okio2.i c;
    public final okio2.h d;
    int e = 0;
    int f = 0;
    public final Socket g;

    public static /* synthetic */ int e(f fVar) {
        fVar.f = 0;
        return 0;
    }

    public f(com.a.a.m mVar, com.a.a.l lVar, Socket socket) {
        this.f897a = mVar;
        this.f898b = lVar;
        this.g = socket;
        this.c = okio2.o.a(okio2.o.b(socket));
        this.d = okio2.o.a(okio2.o.a(socket));
    }

    public final void a(int i2, int i3) {
        if (i2 != 0) {
            this.c.a().a(i2, TimeUnit.MILLISECONDS);
        }
        if (i3 != 0) {
            this.d.a().a(i3, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        this.d.b();
    }

    public final boolean b() {
        try {
            int soTimeout = this.g.getSoTimeout();
            try {
                this.g.setSoTimeout(1);
                if (this.c.e()) {
                    return false;
                }
                this.g.setSoTimeout(soTimeout);
                return true;
            } finally {
                this.g.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException e) {
            return true;
        } catch (IOException e2) {
            return false;
        }
    }

    public final void a(com.a.a.t tVar, String str) {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.d.b(str).b("\r\n");
        int length = tVar.f1049a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            this.d.b(tVar.a(i2)).b(": ").b(tVar.b(i2)).b("\r\n");
        }
        this.d.b("\r\n");
        this.e = 1;
    }

    public final ag c() {
        ab a2;
        ag agVar;
        if (this.e != 1 && this.e != 3) {
            throw new IllegalStateException("state: " + this.e);
        }
        do {
            a2 = ab.a(this.c.m());
            agVar = new ag();
            agVar.f1015b = a2.f891a;
            agVar.c = a2.f892b;
            agVar.d = a2.c;
            com.a.a.u uVar = new com.a.a.u();
            a(uVar);
            uVar.a(u.d, a2.f891a.toString());
            agVar.a(uVar.a());
        } while (a2.f892b == 100);
        this.e = 4;
        return agVar;
    }

    public final void a(com.a.a.u uVar) {
        while (true) {
            String m = this.c.m();
            if (m.length() != 0) {
                com.a.a.apkg.a.f887b.a(uVar, m);
            } else {
                return;
            }
        }
    }

    public final okio2.y a(long j2) {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new k(this, j2);
    }
}
