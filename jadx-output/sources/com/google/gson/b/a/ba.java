package com.google.gson.b.a;

/* loaded from: classes2.dex */
final class ba extends com.google.gson.aj<Boolean> {
    ba() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Boolean bool) {
        Boolean bool2 = bool;
        fVar.b(bool2 == null ? "null" : bool2.toString());
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Boolean a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return Boolean.valueOf(aVar.i());
    }
}
