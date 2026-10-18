package com.google.gson.b.a;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
final class an implements com.google.gson.ak {
    an() {
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.c.a<T> aVar) {
        if (aVar.f7846a != Timestamp.class) {
            return null;
        }
        return new ao(this, kVar.a((Class) Date.class));
    }
}
