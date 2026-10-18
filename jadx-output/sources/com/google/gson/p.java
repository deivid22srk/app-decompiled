package com.google.gson;

/* loaded from: classes2.dex */
final class p extends aj<Number> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f7856a;

    p(k kVar) {
        this.f7856a = kVar;
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            fVar.e();
        } else {
            k.a(number2.floatValue());
            fVar.a(number2);
        }
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
