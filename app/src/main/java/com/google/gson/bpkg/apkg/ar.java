package com.google.gson.bpkg.apkg;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ar extends com.google.gson.aj<com.google.gson.y> {
    ar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.aj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.gson.y a(com.google.gson.stream.a aVar) {
        switch (aVar.f()) {
            case NUMBER:
                return new com.google.gson.ab(new com.google.gson.bpkg.s(aVar.i()));
            case BOOLEAN:
                return new com.google.gson.ab(Boolean.valueOf(aVar.j()));
            case STRING:
                return new com.google.gson.ab(aVar.i());
            case NULL:
                aVar.k();
                return com.google.gson.z.f7873a;
            case BEGIN_ARRAY:
                com.google.gson.v vVar = new com.google.gson.v();
                aVar.a();
                while (aVar.e()) {
                    vVar.a(a(aVar));
                }
                aVar.b();
                return vVar;
            case BEGIN_OBJECT:
                com.google.gson.aa aaVar = new com.google.gson.aa();
                aVar.c();
                while (aVar.e()) {
                    aaVar.a(aVar.h(), a(aVar));
                }
                aVar.d();
                return aaVar;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.aj
    public void a(com.google.gson.stream.f fVar, com.google.gson.y yVar) {
        if (yVar == null || (yVar instanceof com.google.gson.z)) {
            fVar.e();
            return;
        }
        if (yVar instanceof com.google.gson.ab) {
            com.google.gson.ab g = yVar.g();
            if (g.f7760a instanceof Number) {
                fVar.a(g.a());
                return;
            } else if (g.f7760a instanceof Boolean) {
                fVar.a(g.f());
                return;
            } else {
                fVar.b(g.b());
                return;
            }
        }
        if (yVar instanceof com.google.gson.v) {
            fVar.a();
            if (yVar instanceof com.google.gson.v) {
                Iterator<com.google.gson.y> it = ((com.google.gson.v) yVar).iterator();
                while (it.hasNext()) {
                    a(fVar, it.next());
                }
                fVar.b();
                return;
            }
            throw new IllegalStateException("This is not a JSON Array.");
        }
        if (yVar instanceof com.google.gson.aa) {
            fVar.c();
            if (yVar instanceof com.google.gson.aa) {
                for (Map.Entry<String, com.google.gson.y> entry : ((com.google.gson.aa) yVar).h()) {
                    fVar.a(entry.getKey());
                    a(fVar, entry.getValue());
                }
                fVar.d();
                return;
            }
            throw new IllegalStateException("Not a JSON Object: " + yVar);
        }
        throw new IllegalArgumentException("Couldn't write " + yVar.getClass());
    }
}
