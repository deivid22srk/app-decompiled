package com.google.android.volley;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;

/* loaded from: classes.dex */
final class i extends j implements LayeredSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ GoogleHttpClient f7205a;
    private LayeredSocketFactory c;

    /* synthetic */ i(GoogleHttpClient googleHttpClient, LayeredSocketFactory layeredSocketFactory, byte b2) {
        this(googleHttpClient, layeredSocketFactory);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i(GoogleHttpClient googleHttpClient, LayeredSocketFactory layeredSocketFactory) {
        super(googleHttpClient, layeredSocketFactory, (byte) 0);
        this.f7205a = googleHttpClient;
        this.c = layeredSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.c.createSocket(socket, str, i, z);
    }
}
