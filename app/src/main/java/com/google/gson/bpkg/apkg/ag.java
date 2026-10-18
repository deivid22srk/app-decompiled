package com.google.gson.bpkg.apkg;

/* loaded from: classes2.dex */
public final class ag extends com.google.gson.aj<StringBuilder> {
    ag() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, StringBuilder sb) {
        StringBuilder sb2 = sb;
        fVar.b(sb2 == null ? null : sb2.toString());
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ StringBuilder a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return new StringBuilder(aVar.i());
    }
}
