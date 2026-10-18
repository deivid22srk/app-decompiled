package com.google.gson.bpkg.apkg;

/* loaded from: classes2.dex */
public final class ah extends com.google.gson.aj<StringBuffer> {
    ah() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, StringBuffer stringBuffer) {
        StringBuffer stringBuffer2 = stringBuffer;
        fVar.b(stringBuffer2 == null ? null : stringBuffer2.toString());
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ StringBuffer a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return new StringBuffer(aVar.i());
    }
}
