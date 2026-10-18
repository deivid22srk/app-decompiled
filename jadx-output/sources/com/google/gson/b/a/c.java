package com.google.gson.b.a;

import com.google.gson.JsonSyntaxException;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class c extends com.google.gson.aj<BigDecimal> {
    @Override // com.google.gson.aj
    public final /* synthetic */ BigDecimal a(com.google.gson.stream.a aVar) {
        return b(aVar);
    }

    @Override // com.google.gson.aj
    public final /* bridge */ /* synthetic */ void a(com.google.gson.stream.f fVar, BigDecimal bigDecimal) {
        fVar.a(bigDecimal);
    }

    private static BigDecimal b(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        try {
            return new BigDecimal(aVar.i());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
