package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    final w f7850a;

    /* renamed from: b, reason: collision with root package name */
    final ac f7851b;
    private final ThreadLocal<Map<com.google.gson.c.a<?>, s<?>>> c;
    private final Map<com.google.gson.c.a<?>, aj<?>> d;
    private final List<ak> e;
    private final com.google.gson.b.f f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public k() {
        this(com.google.gson.b.o.f7831a, d.f7848a, Collections.emptyMap(), false, false, false, true, false, false, ae.f7761a, Collections.emptyList());
    }

    public k(com.google.gson.b.o oVar, j jVar, Map<Type, u<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ae aeVar, List<ak> list) {
        aj qVar;
        aj oVar2;
        aj pVar;
        this.c = new l(this);
        this.d = Collections.synchronizedMap(new HashMap());
        this.f7850a = new m(this);
        this.f7851b = new n(this);
        this.f = new com.google.gson.b.f(map);
        this.g = z;
        this.i = z3;
        this.h = z4;
        this.j = z5;
        com.google.gson.b.a.r rVar = new com.google.gson.b.a.r(this.f, jVar, oVar);
        com.google.gson.b.f fVar = new com.google.gson.b.f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.b.a.aa.v);
        arrayList.add(com.google.gson.b.a.aa.m);
        arrayList.add(com.google.gson.b.a.aa.g);
        arrayList.add(com.google.gson.b.a.aa.i);
        arrayList.add(com.google.gson.b.a.aa.k);
        Class cls = Long.TYPE;
        if (aeVar == ae.f7761a) {
            qVar = com.google.gson.b.a.aa.n;
        } else {
            qVar = new q(this);
        }
        arrayList.add(com.google.gson.b.a.aa.a(cls, Long.class, qVar));
        Class cls2 = Double.TYPE;
        if (z6) {
            oVar2 = com.google.gson.b.a.aa.p;
        } else {
            oVar2 = new o(this);
        }
        arrayList.add(com.google.gson.b.a.aa.a(cls2, Double.class, oVar2));
        Class cls3 = Float.TYPE;
        if (z6) {
            pVar = com.google.gson.b.a.aa.o;
        } else {
            pVar = new p(this);
        }
        arrayList.add(com.google.gson.b.a.aa.a(cls3, Float.class, pVar));
        arrayList.add(oVar);
        arrayList.add(com.google.gson.b.a.aa.r);
        arrayList.add(com.google.gson.b.a.aa.t);
        arrayList.add(com.google.gson.b.a.aa.x);
        arrayList.add(com.google.gson.b.a.aa.z);
        arrayList.add(com.google.gson.b.a.aa.a(BigDecimal.class, new com.google.gson.b.a.c()));
        arrayList.add(com.google.gson.b.a.aa.a(BigInteger.class, new com.google.gson.b.a.d()));
        arrayList.add(com.google.gson.b.a.aa.O);
        arrayList.add(com.google.gson.b.a.o.f7798a);
        arrayList.addAll(list);
        arrayList.add(new com.google.gson.b.a.e(fVar));
        arrayList.add(com.google.gson.b.a.aa.B);
        arrayList.add(com.google.gson.b.a.aa.D);
        arrayList.add(com.google.gson.b.a.aa.H);
        arrayList.add(com.google.gson.b.a.aa.M);
        arrayList.add(com.google.gson.b.a.aa.F);
        arrayList.add(com.google.gson.b.a.aa.d);
        arrayList.add(com.google.gson.b.a.g.f7789a);
        arrayList.add(com.google.gson.b.a.aa.K);
        arrayList.add(com.google.gson.b.a.x.f7809a);
        arrayList.add(com.google.gson.b.a.v.f7807a);
        arrayList.add(com.google.gson.b.a.aa.I);
        arrayList.add(new com.google.gson.b.a.m(fVar, z2));
        arrayList.add(com.google.gson.b.a.a.f7767a);
        arrayList.add(com.google.gson.b.a.aa.P);
        arrayList.add(com.google.gson.b.a.aa.f7770b);
        arrayList.add(rVar);
        this.e = Collections.unmodifiableList(arrayList);
    }

    public final <T> aj<T> a(com.google.gson.c.a<T> aVar) {
        aj<T> ajVar = (aj) this.d.get(aVar);
        if (ajVar == null) {
            Map<com.google.gson.c.a<?>, s<?>> map = this.c.get();
            s<?> sVar = map.get(aVar);
            if (sVar != null) {
                return sVar;
            }
            s<?> sVar2 = new s<>();
            map.put(aVar, sVar2);
            try {
                Iterator<ak> it = this.e.iterator();
                while (it.hasNext()) {
                    aj<T> a2 = it.next().a(this, aVar);
                    if (a2 != null) {
                        if (sVar2.f7858a != null) {
                            throw new AssertionError();
                        }
                        sVar2.f7858a = a2;
                        this.d.put(aVar, a2);
                        return a2;
                    }
                }
                throw new IllegalArgumentException("GSON cannot handle " + aVar);
            } finally {
                map.remove(aVar);
            }
        }
        return ajVar;
    }

    static {
        com.google.gson.b.q.f7835a = new r();
    }

    public final <T> aj<T> a(Class<T> cls) {
        return a((com.google.gson.c.a) com.google.gson.c.a.a((Class) cls));
    }

    public final String a(Object obj) {
        com.google.gson.stream.f a2;
        boolean z;
        boolean z2;
        boolean z3;
        if (obj == null) {
            z zVar = z.f7873a;
            StringWriter stringWriter = new StringWriter();
            try {
                a2 = a((Writer) stringWriter);
                z = a2.e;
                a2.e = true;
                z2 = a2.f;
                a2.f = this.h;
                z3 = a2.g;
                a2.g = this.g;
                try {
                    try {
                        com.google.gson.b.v.a(zVar, a2);
                        return stringWriter.toString();
                    } finally {
                    }
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            a2 = a((Writer) stringWriter2);
            aj a3 = a((com.google.gson.c.a) com.google.gson.c.a.a((Type) cls));
            z = a2.e;
            a2.e = true;
            z2 = a2.f;
            a2.f = this.h;
            z3 = a2.g;
            a2.g = this.g;
            try {
                try {
                    a3.a(a2, obj);
                    return stringWriter2.toString();
                } finally {
                }
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        }
    }

    private com.google.gson.stream.f a(Writer writer) {
        if (this.i) {
            writer.write(")]}'\n");
        }
        com.google.gson.stream.f fVar = new com.google.gson.stream.f(writer);
        if (this.j) {
            if ("  ".length() == 0) {
                fVar.c = null;
                fVar.d = ":";
            } else {
                fVar.c = "  ";
                fVar.d = ": ";
            }
        }
        fVar.g = this.g;
        return fVar;
    }

    public final String toString() {
        return "{serializeNulls:" + this.g + "factories:" + this.e + ",instanceCreators:" + this.f + "}";
    }

    public final <T> T a(String str, Class<T> cls) {
        Object a2;
        if (str == null) {
            a2 = null;
        } else {
            com.google.gson.stream.a aVar = new com.google.gson.stream.a(new StringReader(str));
            a2 = a(aVar, cls);
            if (a2 != null) {
                try {
                    if (aVar.f() != com.google.gson.stream.e.END_DOCUMENT) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e) {
                    throw new JsonSyntaxException(e);
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
            }
        }
        return (T) com.google.gson.b.u.a((Class) cls).cast(a2);
    }

    private <T> T a(com.google.gson.stream.a aVar, Type type) {
        boolean z = true;
        boolean z2 = aVar.f7860b;
        aVar.f7860b = true;
        try {
            try {
                try {
                    try {
                        aVar.f();
                        z = false;
                        return a((com.google.gson.c.a) com.google.gson.c.a.a(type)).a(aVar);
                    } catch (IOException e) {
                        throw new JsonSyntaxException(e);
                    }
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new JsonSyntaxException(e3);
                }
                aVar.f7860b = z2;
                return null;
            }
        } finally {
            aVar.f7860b = z2;
        }
    }

    static /* synthetic */ void a(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
        } else {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialDoubleValues() method.");
        }
    }
}
