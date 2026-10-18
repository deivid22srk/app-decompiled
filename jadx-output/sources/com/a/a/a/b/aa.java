package com.a.a.a.b;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
final class aa implements b {

    /* renamed from: a, reason: collision with root package name */
    private final a.i f925a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f926b;
    private final s c;

    aa(a.i iVar, boolean z) {
        this.f925a = iVar;
        this.c = new s(this.f925a);
        this.f926b = z;
    }

    @Override // com.a.a.a.b.b
    public final void a() {
    }

    @Override // com.a.a.a.b.b
    public final boolean a(c cVar) {
        try {
            int i = this.f925a.i();
            int i2 = this.f925a.i();
            int i3 = ((-16777216) & i2) >>> 24;
            int i4 = 16777215 & i2;
            if ((Integer.MIN_VALUE & i) != 0) {
                int i5 = (2147418112 & i) >>> 16;
                int i6 = i & 65535;
                if (i5 != 3) {
                    throw new ProtocolException("version != 3: " + i5);
                }
                switch (i6) {
                    case 1:
                        int i7 = this.f925a.i();
                        this.f925a.i();
                        int i8 = i7 & Integer.MAX_VALUE;
                        this.f925a.h();
                        cVar.a((i3 & 2) != 0, (i3 & 1) != 0, i8, this.c.a(i4 - 10), f.SPDY_SYN_STREAM);
                        return true;
                    case 2:
                        cVar.a(false, (i3 & 1) != 0, this.f925a.i() & Integer.MAX_VALUE, this.c.a(i4 - 4), f.SPDY_REPLY);
                        return true;
                    case 3:
                        if (i4 != 8) {
                            throw a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i4));
                        }
                        int i9 = this.f925a.i() & Integer.MAX_VALUE;
                        int i10 = this.f925a.i();
                        a a2 = a.a(i10);
                        if (a2 == null) {
                            throw a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i10));
                        }
                        cVar.a(i9, a2);
                        return true;
                    case 4:
                        a(cVar, i3, i4);
                        return true;
                    case 5:
                    default:
                        this.f925a.f(i4);
                        return true;
                    case 6:
                        if (i4 != 4) {
                            throw a("TYPE_PING length: %d != 4", Integer.valueOf(i4));
                        }
                        int i11 = this.f925a.i();
                        cVar.a(this.f926b == ((i11 & 1) == 1), i11, 0);
                        return true;
                    case 7:
                        if (i4 != 8) {
                            throw a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i4));
                        }
                        int i12 = this.f925a.i() & Integer.MAX_VALUE;
                        int i13 = this.f925a.i();
                        if (a.c(i13) == null) {
                            throw a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i13));
                        }
                        cVar.a(i12, a.j.f12a);
                        return true;
                    case 8:
                        cVar.a(false, false, this.f925a.i() & Integer.MAX_VALUE, this.c.a(i4 - 4), f.SPDY_HEADERS);
                        return true;
                    case 9:
                        if (i4 != 8) {
                            throw a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i4));
                        }
                        int i14 = this.f925a.i() & Integer.MAX_VALUE;
                        long i15 = this.f925a.i() & Integer.MAX_VALUE;
                        if (i15 == 0) {
                            throw a("windowSizeIncrement was 0", Long.valueOf(i15));
                        }
                        cVar.a(i14, i15);
                        return true;
                }
            }
            cVar.a((i3 & 1) != 0, i & Integer.MAX_VALUE, this.f925a, i4);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private void a(c cVar, int i, int i2) {
        int i3 = this.f925a.i();
        if (i2 != (i3 * 8) + 4) {
            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        y yVar = new y();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.f925a.i();
            yVar.a(i5 & 16777215, ((-16777216) & i5) >>> 24, this.f925a.i());
        }
        cVar.a((i & 1) != 0, yVar);
    }

    private static IOException a(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.f975b.close();
    }
}
