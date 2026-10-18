package com.android.a.a;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    as f1079a;

    /* renamed from: b, reason: collision with root package name */
    at f1080b;
    Map<e, String> c;
    String d;

    public ar(as asVar) {
        this.f1080b = at.LOCAL;
        this.c = new EnumMap(e.class);
        this.f1079a = asVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    ar(aq aqVar) {
        as asVar;
        at atVar;
        String str;
        e[] eVarArr;
        Map map;
        Map map2;
        this.f1080b = at.LOCAL;
        this.c = new EnumMap(e.class);
        asVar = aqVar.f1078a;
        this.f1079a = asVar;
        atVar = aqVar.c;
        this.f1080b = atVar;
        str = aqVar.f;
        this.d = str;
        eVarArr = aq.f1077b;
        for (e eVar : eVarArr) {
            map = aqVar.d;
            if (map.containsKey(eVar)) {
                Map<e, String> map3 = this.c;
                map2 = aqVar.d;
                map3.put(eVar, map2.get(eVar));
            } else {
                return;
            }
        }
    }

    ar(String str) {
        e[] eVarArr;
        String c;
        e[] eVarArr2;
        e[] eVarArr3;
        this.f1080b = at.LOCAL;
        this.c = new EnumMap(e.class);
        String[] split = str.split("/");
        if (!split[0].equals(as.DATA.name().toLowerCase()) && !split[0].equals(as.EXAMPLES.name().toLowerCase())) {
            throw new RuntimeException("Wrong key type: " + split[0]);
        }
        int length = split.length;
        eVarArr = aq.f1077b;
        if (length > eVarArr.length + 1) {
            throw new RuntimeException("input key '" + str + "' deeper than supported hierarchy");
        }
        if (split[0].equals("data")) {
            this.f1079a = as.DATA;
            if (split.length > 1) {
                String c2 = be.c(split[1]);
                if (c2.contains("--")) {
                    String[] split2 = c2.split("--");
                    if (split2.length != 2) {
                        throw new RuntimeException("Wrong format: Substring should be country code--language code");
                    }
                    c2 = split2[0];
                    this.d = split2[1];
                }
                Map<e, String> map = this.c;
                eVarArr3 = aq.f1077b;
                map.put(eVarArr3[0], c2);
            }
            if (split.length > 2) {
                for (int i = 2; i < split.length && (c = be.c(split[i])) != null; i++) {
                    Map<e, String> map2 = this.c;
                    eVarArr2 = aq.f1077b;
                    map2.put(eVarArr2[i - 1], c);
                }
                return;
            }
            return;
        }
        if (split[0].equals("examples")) {
            this.f1079a = as.EXAMPLES;
            if (split.length > 1) {
                this.c.put(e.COUNTRY, split[1]);
            }
            if (split.length > 2) {
                String str2 = split[2];
                if (str2.equals("local")) {
                    this.f1080b = at.LOCAL;
                } else if (str2.equals("latin")) {
                    this.f1080b = at.LATIN;
                } else {
                    throw new RuntimeException("Script type has to be either latin or local.");
                }
            }
            if (split.length > 3 && !split[3].equals("_default")) {
                this.d = split[3];
            }
        }
    }

    public final aq a() {
        return new aq(this, (byte) 0);
    }

    public final ar a(a aVar) {
        this.d = aVar.k;
        if (this.d != null && be.a(this.d)) {
            this.f1080b = at.LATIN;
        }
        if (aVar.f1055a != null) {
            this.c.put(e.COUNTRY, aVar.f1055a);
            if (aVar.d != null) {
                this.c.put(e.ADMIN_AREA, aVar.d);
                if (aVar.e != null) {
                    this.c.put(e.LOCALITY, aVar.e);
                    if (aVar.f != null) {
                        this.c.put(e.DEPENDENT_LOCALITY, aVar.f);
                    }
                }
            }
        }
        return this;
    }
}
