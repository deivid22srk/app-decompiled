package com.google.gson.bpkg.apkg;

import java.net.InetAddress;

/* loaded from: classes2.dex */
public final class ak extends com.google.gson.aj<InetAddress> {
    ak() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, InetAddress inetAddress) {
        InetAddress inetAddress2 = inetAddress;
        fVar.b(inetAddress2 == null ? null : inetAddress2.getHostAddress());
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ InetAddress a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return InetAddress.getByName(aVar.i());
    }
}
