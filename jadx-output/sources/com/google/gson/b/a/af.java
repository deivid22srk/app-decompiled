package com.google.gson.b.a;

/* loaded from: classes2.dex */
final class af extends com.google.gson.aj<String> {
    af() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, String str) {
        fVar.b(str);
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ String a(com.google.gson.stream.a aVar) {
        com.google.gson.stream.e f = aVar.f();
        if (f == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        if (f == com.google.gson.stream.e.BOOLEAN) {
            return Boolean.toString(aVar.j());
        }
        return aVar.i();
    }
}
