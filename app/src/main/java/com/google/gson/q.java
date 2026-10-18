package com.google.gson;

/* loaded from: classes2.dex */
final class q extends aj<Number> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f7857a;

    q(k kVar) {
        this.f7857a = kVar;
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            fVar.e();
        } else {
            fVar.b(number2.toString());
        }
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Number a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return Long.valueOf(aVar.m());
    }
}
