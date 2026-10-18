package com.google.gson.bpkg.apkg;

import com.google.gson.JsonIOException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m implements com.google.gson.ak {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7794a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.bpkg.f f7795b;

    public m(com.google.gson.bpkg.f fVar, boolean z) {
        this.f7795b = fVar;
        this.f7794a = z;
    }

    public static <T> com.google.gson.y a(com.google.gson.aj<T> ajVar, T t) {
        try {
            k kVar = new k();
            kVar.e = true;
            ajVar.a(kVar, t);
            if (!kVar.f7792a.isEmpty()) {
                throw new IllegalStateException("Expected one JSON element but was " + kVar.f7792a);
            }
            return kVar.f7793b;
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    @Override // com.google.gson.ak
    public final <T> com.google.gson.aj<T> a(com.google.gson.k kVar, com.google.gson.cpkg.a<T> aVar) {
        Type type = aVar.f7847b;
        if (!Map.class.isAssignableFrom(aVar.f7846a)) {
            return null;
        }
        Type[] b2 = com.google.gson.bpkg.b.b(type, com.google.gson.bpkg.b.b(type));
        Type type2 = b2[0];
        return new n(this, kVar, b2[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? aa.f : kVar.a((com.google.gson.cpkg.a) com.google.gson.cpkg.a.a(type2)), b2[1], kVar.a((com.google.gson.cpkg.a) com.google.gson.cpkg.a.a(b2[1])), this.f7795b.a(aVar));
    }
}
