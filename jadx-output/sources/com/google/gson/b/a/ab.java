package com.google.gson.b.a;

/* loaded from: classes2.dex */
final class ab extends com.google.gson.aj<Class> {
    ab() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Class cls) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Class a(com.google.gson.stream.a aVar) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }
}
