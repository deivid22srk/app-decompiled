package com.google.gson.b.a;

import com.google.gson.JsonSyntaxException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t<T> extends com.google.gson.aj<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f7805a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.b.t<T> f7806b;
    private final Map<String, u> c;

    /* synthetic */ t(r rVar, com.google.gson.b.t tVar, Map map, byte b2) {
        this(rVar, tVar, map);
    }

    private t(r rVar, com.google.gson.b.t<T> tVar, Map<String, u> map) {
        this.f7805a = rVar;
        this.f7806b = tVar;
        this.c = map;
    }

    @Override // com.google.gson.aj
    public final T a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        T a2 = this.f7806b.a();
        try {
            aVar.c();
            while (aVar.e()) {
                u uVar = this.c.get(aVar.h());
                if (uVar == null || !uVar.i) {
                    aVar.o();
                } else {
                    uVar.a(aVar, a2);
                }
            }
            aVar.d();
            return a2;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // com.google.gson.aj
    public final void a(com.google.gson.stream.f fVar, T t) {
        if (t == null) {
            fVar.e();
            return;
        }
        fVar.c();
        try {
            for (u uVar : this.c.values()) {
                if (uVar.h) {
                    fVar.a(uVar.g);
                    uVar.a(fVar, t);
                }
            }
            fVar.d();
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        }
    }
}
