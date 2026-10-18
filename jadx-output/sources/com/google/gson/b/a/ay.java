package com.google.gson.b.a;

/* loaded from: classes2.dex */
final class ay extends com.google.gson.aj<Boolean> {
    ay() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null) {
            fVar.e();
        } else {
            fVar.a(bool2.booleanValue());
        }
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Boolean a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        if (aVar.f() == com.google.gson.stream.e.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.i()));
        }
        return Boolean.valueOf(aVar.j());
    }
}
