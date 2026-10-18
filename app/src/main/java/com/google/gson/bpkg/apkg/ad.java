package com.google.gson.bpkg.apkg;

import com.google.gson.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class ad extends com.google.gson.aj<Number> {
    ad() {
    }

    @Override // com.google.gson.aj
    public final /* bridge */ /* synthetic */ void a(com.google.gson.stream.f fVar, Number number) {
        fVar.a(number);
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Number a(com.google.gson.stream.a aVar) {
        com.google.gson.stream.e f = aVar.f();
        switch (f) {
            case NUMBER:
                return new com.google.gson.bpkg.s(aVar.i());
            case BOOLEAN:
            case STRING:
            default:
                throw new JsonSyntaxException("Expecting number, got: " + f);
            case NULL:
                aVar.k();
                return null;
        }
    }
}
