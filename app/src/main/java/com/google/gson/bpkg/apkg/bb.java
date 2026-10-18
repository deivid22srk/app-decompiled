package com.google.gson.bpkg.apkg;

import com.google.gson.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class bb extends com.google.gson.aj<Number> {
    bb() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Number a(com.google.gson.stream.a aVar) {
        return b(aVar);
    }

    @Override // com.google.gson.aj
    public final /* bridge */ /* synthetic */ void a(com.google.gson.stream.f fVar, Number number) {
        fVar.a(number);
    }

    public static Number b(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        try {
            return Byte.valueOf((byte) aVar.n());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
