package com.google.gson.bpkg.apkg;

/* loaded from: classes2.dex */
public final class bf extends com.google.gson.aj<Number> {
    bf() {
    }

    @Override // com.google.gson.aj
    public final /* bridge */ /* synthetic */ void a(com.google.gson.stream.f fVar, Number number) {
        fVar.a(number);
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Number a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return Float.valueOf((float) aVar.l());
    }
}
