package com.google.gson.bpkg.apkg;

import com.google.gson.JsonSyntaxException;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class d extends com.google.gson.aj<BigInteger> {
    @Override // com.google.gson.aj
    public final /* synthetic */ BigInteger a(com.google.gson.stream.a aVar) {
        return b(aVar);
    }

    @Override // com.google.gson.aj
    public final /* bridge */ /* synthetic */ void a(com.google.gson.stream.f fVar, BigInteger bigInteger) {
        fVar.a(bigInteger);
    }

    public static BigInteger b(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        try {
            return new BigInteger(aVar.i());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }
}
