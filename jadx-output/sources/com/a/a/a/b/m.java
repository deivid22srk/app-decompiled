package com.a.a.a.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    final h f965a;

    /* renamed from: b, reason: collision with root package name */
    private final a.i f966b;
    private final k c;
    private final boolean d;

    m(a.i iVar, boolean z) {
        this.f966b = iVar;
        this.d = z;
        this.c = new k(this.f966b);
        this.f965a = new h(this.c);
    }

    @Override // com.a.a.a.b.b
    public final void a() {
        a.j jVar;
        Logger logger;
        a.j jVar2;
        IOException c;
        Logger logger2;
        if (!this.d) {
            a.i iVar = this.f966b;
            jVar = j.f960b;
            a.j c2 = iVar.c(jVar.f13b.length);
            logger = j.f959a;
            if (logger.isLoggable(Level.FINE)) {
                logger2 = j.f959a;
                logger2.fine(String.format("<< CONNECTION %s", c2.b()));
            }
            jVar2 = j.f960b;
            if (!jVar2.equals(c2)) {
                c = j.c("Expected a connection header but was %s", c2.a());
                throw c;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.a.a.a.b.b
    public final boolean a(c cVar) {
        IOException c;
        Logger logger;
        IOException c2;
        IOException c3;
        IOException c4;
        IOException c5;
        IOException c6;
        IOException c7;
        IOException c8;
        IOException c9;
        IOException c10;
        IOException c11;
        IOException c12;
        IOException c13;
        IOException c14;
        IOException c15;
        IOException c16;
        IOException c17;
        IOException c18;
        IOException c19;
        IOException c20;
        IOException c21;
        IOException c22;
        IOException c23;
        Logger logger2;
        try {
            this.f966b.a(9L);
            int a2 = j.a(this.f966b);
            if (a2 < 0 || a2 > 16384) {
                c = j.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
                throw c;
            }
            byte g = (byte) (this.f966b.g() & 255);
            byte g2 = (byte) (this.f966b.g() & 255);
            int i = this.f966b.i() & Integer.MAX_VALUE;
            logger = j.f959a;
            if (logger.isLoggable(Level.FINE)) {
                logger2 = j.f959a;
                logger2.fine(l.a(true, i, a2, g, g2));
            }
            switch (g) {
                case 0:
                    boolean z = (g2 & 1) != 0;
                    if (((g2 & 32) != 0) != false) {
                        c23 = j.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw c23;
                    }
                    short g3 = (g2 & 8) != 0 ? (short) (this.f966b.g() & 255) : (short) 0;
                    cVar.a(z, i, this.f966b, j.a(a2, g2, g3));
                    this.f966b.f(g3);
                    return true;
                case 1:
                    if (i == 0) {
                        c22 = j.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        throw c22;
                    }
                    boolean z2 = (g2 & 1) != 0;
                    short g4 = (g2 & 8) != 0 ? (short) (this.f966b.g() & 255) : (short) 0;
                    if ((g2 & 32) != 0) {
                        b();
                        a2 -= 5;
                    }
                    cVar.a(false, z2, i, a(j.a(a2, g2, g4), g4, g2, i), f.HTTP_20_HEADERS);
                    return true;
                case 2:
                    if (a2 != 5) {
                        c21 = j.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a2));
                        throw c21;
                    }
                    if (i == 0) {
                        c20 = j.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw c20;
                    }
                    b();
                    return true;
                case 3:
                    if (a2 != 4) {
                        c19 = j.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a2));
                        throw c19;
                    }
                    if (i == 0) {
                        c18 = j.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw c18;
                    }
                    int i2 = this.f966b.i();
                    a b2 = a.b(i2);
                    if (b2 == null) {
                        c17 = j.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i2));
                        throw c17;
                    }
                    cVar.a(i, b2);
                    return true;
                case 4:
                    if (i != 0) {
                        c16 = j.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw c16;
                    }
                    if ((g2 & 1) != 0) {
                        if (a2 == 0) {
                            return true;
                        }
                        c15 = j.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw c15;
                    }
                    if (a2 % 6 != 0) {
                        c14 = j.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a2));
                        throw c14;
                    }
                    y yVar = new y();
                    for (int i3 = 0; i3 < a2; i3 += 6) {
                        short h = this.f966b.h();
                        int i4 = this.f966b.i();
                        switch (h) {
                            case 1:
                            case 6:
                                break;
                            case 2:
                                if (i4 != 0 && i4 != 1) {
                                    c13 = j.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw c13;
                                }
                                break;
                            case 3:
                                h = 4;
                                break;
                            case 4:
                                h = 7;
                                if (i4 < 0) {
                                    c12 = j.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw c12;
                                }
                                break;
                            case 5:
                                if (i4 < 16384 || i4 > 16777215) {
                                    c11 = j.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                                    throw c11;
                                }
                                break;
                            default:
                                c10 = j.c("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(h));
                                throw c10;
                        }
                        yVar.a(h, 0, i4);
                    }
                    cVar.a(false, yVar);
                    if (yVar.a() < 0) {
                        return true;
                    }
                    h hVar = this.f965a;
                    int a3 = yVar.a();
                    hVar.c = a3;
                    hVar.d = a3;
                    hVar.a();
                    return true;
                case 5:
                    if (i == 0) {
                        c9 = j.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw c9;
                    }
                    short g5 = (g2 & 8) != 0 ? (short) (this.f966b.g() & 255) : (short) 0;
                    cVar.a(this.f966b.i() & Integer.MAX_VALUE, a(j.a(a2 - 4, g2, g5), g5, g2, i));
                    return true;
                case 6:
                    if (a2 != 8) {
                        c8 = j.c("TYPE_PING length != 8: %s", Integer.valueOf(a2));
                        throw c8;
                    }
                    if (i != 0) {
                        c7 = j.c("TYPE_PING streamId != 0", new Object[0]);
                        throw c7;
                    }
                    cVar.a((g2 & 1) != 0, this.f966b.i(), this.f966b.i());
                    return true;
                case 7:
                    if (a2 < 8) {
                        c6 = j.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a2));
                        throw c6;
                    }
                    if (i != 0) {
                        c5 = j.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw c5;
                    }
                    int i5 = this.f966b.i();
                    int i6 = this.f966b.i();
                    int i7 = a2 - 8;
                    if (a.b(i6) == null) {
                        c4 = j.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i6));
                        throw c4;
                    }
                    a.j jVar = a.j.f12a;
                    if (i7 > 0) {
                        jVar = this.f966b.c(i7);
                    }
                    cVar.a(i5, jVar);
                    return true;
                case 8:
                    if (a2 != 4) {
                        c3 = j.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a2));
                        throw c3;
                    }
                    long i8 = this.f966b.i() & 2147483647L;
                    if (i8 == 0) {
                        c2 = j.c("windowSizeIncrement was 0", Long.valueOf(i8));
                        throw c2;
                    }
                    cVar.a(i, i8);
                    return true;
                default:
                    this.f966b.f(a2);
                    return true;
            }
        } catch (IOException e) {
            return false;
        }
    }

    private List<e> a(int i, short s, byte b2, int i2) {
        e[] eVarArr;
        e[] eVarArr2;
        k kVar = this.c;
        this.c.d = i;
        kVar.f961a = i;
        this.c.e = s;
        this.c.f962b = b2;
        this.c.c = i2;
        h hVar = this.f965a;
        while (!hVar.f957b.e()) {
            int g = hVar.f957b.g() & 255;
            if (g == 128) {
                throw new IOException("index == 0");
            }
            if ((g & 128) == 128) {
                int a2 = hVar.a(g, 127) - 1;
                if (h.c(a2)) {
                    eVarArr = g.f954a;
                    hVar.f956a.add(eVarArr[a2]);
                } else {
                    eVarArr2 = g.f954a;
                    int a3 = hVar.a(a2 - eVarArr2.length);
                    if (a3 < 0 || a3 > hVar.e.length - 1) {
                        throw new IOException("Header index too large " + (a2 + 1));
                    }
                    hVar.f956a.add(hVar.e[a3]);
                }
            } else if (g != 64) {
                if ((g & 64) != 64) {
                    if ((g & 32) == 32) {
                        hVar.d = hVar.a(g, 31);
                        if (hVar.d < 0 || hVar.d > hVar.c) {
                            throw new IOException("Invalid dynamic table size update " + hVar.d);
                        }
                        hVar.a();
                    } else if (g == 16 || g == 0) {
                        hVar.f956a.add(new e(g.a(hVar.b()), hVar.b()));
                    } else {
                        hVar.f956a.add(new e(hVar.b(hVar.a(g, 15) - 1), hVar.b()));
                    }
                } else {
                    hVar.a(new e(hVar.b(hVar.a(g, 63) - 1), hVar.b()));
                }
            } else {
                hVar.a(new e(g.a(hVar.b()), hVar.b()));
            }
        }
        h hVar2 = this.f965a;
        ArrayList arrayList = new ArrayList(hVar2.f956a);
        hVar2.f956a.clear();
        return arrayList;
    }

    private void b() {
        this.f966b.i();
        this.f966b.g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f966b.close();
    }
}
