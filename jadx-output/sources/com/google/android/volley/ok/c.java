package com.google.android.volley.ok;

import android.content.Context;
import com.a.a.a.l;
import com.a.a.k;
import com.a.a.o;
import com.a.a.p;
import com.a.a.y;
import com.android.volley.a.m;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import org.apache.http.ProtocolVersion;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    private static final o f7212a = new p(o.f1041a).a(k.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, k.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, k.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, k.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, k.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, k.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, k.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, k.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA, k.TLS_ECDHE_RSA_WITH_RC4_128_SHA, k.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, k.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, k.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, k.TLS_RSA_WITH_AES_128_GCM_SHA256, k.TLS_RSA_WITH_AES_128_CBC_SHA, k.TLS_RSA_WITH_AES_256_CBC_SHA, k.TLS_RSA_WITH_RC4_128_SHA).a();

    /* renamed from: b, reason: collision with root package name */
    private static final List<o> f7213b = Arrays.asList(f7212a, o.c);
    private static final ProtocolVersion c = new ProtocolVersion("HTTP", 1, 0);
    private static final ProtocolVersion d = new ProtocolVersion("HTTP", 1, 1);
    private static final ProtocolVersion e = new ProtocolVersion("HTTP", 2, 0);
    private static final ProtocolVersion f = new ProtocolVersion("SPD", 3, 1);
    private e g;
    private boolean h;
    private i i;
    private UrlRewriter j;

    public c(Context context, y yVar, UrlRewriter urlRewriter, i iVar, boolean z) {
        this.h = com.google.android.a.d.a(context.getContentResolver(), "http_stats", false);
        this.j = urlRewriter;
        this.i = this.h ? new a() : iVar;
        if (z) {
            yVar.i.add(new com.google.android.volley.ok.a.a());
        }
        yVar.g = l.a(f7213b);
        this.g = new e(yVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    @Override // com.android.volley.a.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.apache.http.HttpResponse a(com.android.volley.l<?> r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.volley.ok.c.a(com.android.volley.l, java.util.Map):org.apache.http.HttpResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterruptedIOException b(InterruptedIOException interruptedIOException) {
        if ("timeout".equals(interruptedIOException.getMessage())) {
            return new SocketTimeoutException();
        }
        return interruptedIOException;
    }
}
