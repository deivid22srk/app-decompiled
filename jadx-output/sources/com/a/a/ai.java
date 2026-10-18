package com.a.a;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    public final a f1016a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f1017b;
    public final InetSocketAddress c;
    final o d;
    final boolean e;

    public ai(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress, o oVar, boolean z) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        if (oVar == null) {
            throw new NullPointerException("connectionConfiguration == null");
        }
        this.f1016a = aVar;
        this.f1017b = proxy;
        this.c = inetSocketAddress;
        this.d = oVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return this.f1016a.equals(aiVar.f1016a) && this.f1017b.equals(aiVar.f1017b) && this.c.equals(aiVar.c) && this.d.equals(aiVar.d) && this.e == aiVar.e;
    }

    public final int hashCode() {
        return (this.e ? 1 : 0) + ((((((((this.f1016a.hashCode() + 527) * 31) + this.f1017b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31);
    }
}
