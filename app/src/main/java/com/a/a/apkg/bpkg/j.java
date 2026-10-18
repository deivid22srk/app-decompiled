package com.a.a.apkg.bpkg;

import java.io.IOException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class j implements as {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f959a = Logger.getLogger(l.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final okio2.j f960b = okio2.j.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    @Override // com.a.a.apkg.bpkg.as
    public final b a(okio2.i iVar, boolean z) {
        return new m(iVar, z);
    }

    @Override // com.a.a.apkg.bpkg.as
    public final d a(okio2.h hVar, boolean z) {
        return new n(hVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException c(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    public static /* synthetic */ int a(okio2.i iVar) {
        return ((iVar.g() & 255) << 16) | ((iVar.g() & 255) << 8) | (iVar.g() & 255);
    }

    public static /* synthetic */ int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s > i) {
            throw c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        }
        return (short) (i - s);
    }

    public static /* synthetic */ IllegalArgumentException b(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void a(okio2.h hVar, int i) {
        hVar.g((i >>> 16) & 255);
        hVar.g((i >>> 8) & 255);
        hVar.g(i & 255);
    }
}
