package com.google.gson.b.a;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
final class ao extends com.google.gson.aj<Timestamp> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.gson.aj f7771a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an f7772b;

    ao(an anVar, com.google.gson.aj ajVar) {
        this.f7772b = anVar;
        this.f7771a = ajVar;
    }

    @Override // com.google.gson.aj
    public final /* bridge */ /* synthetic */ void a(com.google.gson.stream.f fVar, Timestamp timestamp) {
        this.f7771a.a(fVar, timestamp);
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Timestamp a(com.google.gson.stream.a aVar) {
        Date date = (Date) this.f7771a.a(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
