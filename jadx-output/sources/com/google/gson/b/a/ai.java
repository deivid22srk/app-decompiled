package com.google.gson.b.a;

import java.net.URL;

/* loaded from: classes2.dex */
final class ai extends com.google.gson.aj<URL> {
    ai() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, URL url) {
        URL url2 = url;
        fVar.b(url2 == null ? null : url2.toExternalForm());
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ URL a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        String i = aVar.i();
        if ("null".equals(i)) {
            return null;
        }
        return new URL(i);
    }
}
