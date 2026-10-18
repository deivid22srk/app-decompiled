package com.google.gson.b.a;

import java.util.UUID;

/* loaded from: classes2.dex */
final class al extends com.google.gson.aj<UUID> {
    al() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, UUID uuid) {
        UUID uuid2 = uuid;
        fVar.b(uuid2 == null ? null : uuid2.toString());
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ UUID a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        return UUID.fromString(aVar.i());
    }
}
