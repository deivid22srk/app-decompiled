package com.google.gson.b.a;

import com.google.gson.JsonSyntaxException;

/* loaded from: classes2.dex */
final class bd extends com.google.gson.aj<Number> {
    bd() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Number a(com.google.gson.stream.a aVar) {
        return b(aVar);
    }

    @Override // com.google.gson.aj
    public final /* bridge */ /* synthetic */ void a(com.google.gson.stream.f fVar, Number number) {
        fVar.a(number);
    }

    private static Number b(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        try {
            return Integer.valueOf(aVar.n());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
