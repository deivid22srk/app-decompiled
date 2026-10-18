package com.android.a.a;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    final EnumSet<e> f1066a;

    /* renamed from: b, reason: collision with root package name */
    final EnumSet<e> f1067b;
    private final String c;
    private final EnumSet<e> d;
    private final EnumMap<e, String> e;
    private final Map<String, e[]> f;
    private final EnumMap<e, Integer> g;
    private final String h;

    /* synthetic */ ah(ai aiVar, byte b2) {
        this(aiVar);
    }

    private ah(ai aiVar) {
        this.e = new EnumMap<>(e.class);
        this.f = new HashMap();
        this.g = new EnumMap<>(e.class);
        this.c = aiVar.f1068a;
        this.f1066a = EnumSet.copyOf((EnumSet) aiVar.c);
        this.f1067b = EnumSet.copyOf((EnumSet) aiVar.d);
        this.d = EnumSet.copyOf((EnumSet) aiVar.f1069b);
        this.e.putAll(aiVar.e);
        this.f.putAll(aiVar.f);
        this.g.putAll(aiVar.g);
        this.h = aiVar.h;
    }

    final boolean a(e eVar) {
        return this.f1066a.contains(eVar);
    }

    final e[] a(String str) {
        if (str == null) {
            throw new RuntimeException("regionCode cannot be null.");
        }
        return this.f.get(str);
    }
}
