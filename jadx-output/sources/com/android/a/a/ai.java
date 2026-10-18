package com.android.a.a;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    String f1068a = "addressform";

    /* renamed from: b, reason: collision with root package name */
    final EnumSet<e> f1069b = EnumSet.noneOf(e.class);
    final EnumSet<e> c = EnumSet.noneOf(e.class);
    final EnumSet<e> d = EnumSet.noneOf(e.class);
    final EnumMap<e, String> e = new EnumMap<>(e.class);
    final Map<String, e[]> f = new HashMap();
    final EnumMap<e, Integer> g = new EnumMap<>(e.class);
    String h = new u().f1129a;

    public final ai a(e eVar) {
        if (eVar == null) {
            throw new RuntimeException("AddressField field cannot be null.");
        }
        this.c.add(eVar);
        this.f1069b.remove(eVar);
        return this;
    }

    public final ah a() {
        return new ah(this, (byte) 0);
    }
}
