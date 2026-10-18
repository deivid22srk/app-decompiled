package com.google.gson.b.a;

import com.google.gson.JsonIOException;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes2.dex */
final class aj extends com.google.gson.aj<URI> {
    aj() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ URI a(com.google.gson.stream.a aVar) {
        return b(aVar);
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, URI uri) {
        URI uri2 = uri;
        fVar.b(uri2 == null ? null : uri2.toASCIIString());
    }

    private static URI b(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        try {
            String i = aVar.i();
            if ("null".equals(i)) {
                return null;
            }
            return new URI(i);
        } catch (URISyntaxException e) {
            throw new JsonIOException(e);
        }
    }
}
