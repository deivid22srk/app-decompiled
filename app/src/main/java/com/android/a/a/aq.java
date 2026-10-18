package com.android.a.a;

import java.util.Map;

/* loaded from: classes.dex */
public final class aq {

    /* renamed from: b, reason: collision with root package name */
    private static final e[] f1077b = {e.COUNTRY, e.ADMIN_AREA, e.LOCALITY, e.DEPENDENT_LOCALITY};

    /* renamed from: a, reason: collision with root package name */
    final as f1078a;
    private final at c;
    private final Map<e, String> d;
    private final String e;
    private final String f;

    /* synthetic */ aq(ar arVar, byte b2) {
        this(arVar);
    }

    private aq(ar arVar) {
        this.f1078a = arVar.f1079a;
        this.c = arVar.f1080b;
        this.d = arVar.c;
        this.f = arVar.d;
        this.e = b();
    }

    final aq a(e eVar) {
        boolean z = false;
        if (this.f1078a != as.DATA) {
            throw new RuntimeException("Only support getting parent keys for the data key type.");
        }
        ar arVar = new ar(this);
        boolean z2 = false;
        for (e eVar2 : f1077b) {
            if (z2 && arVar.c.containsKey(eVar2)) {
                arVar.c.remove(eVar2);
            }
            if (eVar2 == eVar) {
                if (!arVar.c.containsKey(eVar2)) {
                    return null;
                }
                z = true;
                z2 = true;
            }
        }
        if (!z) {
            return null;
        }
        arVar.d = this.f;
        arVar.f1080b = this.c;
        return arVar.a();
    }

    private String b() {
        StringBuilder sb = new StringBuilder(this.f1078a.name().toLowerCase());
        if (this.f1078a == as.DATA) {
            for (e eVar : f1077b) {
                if (!this.d.containsKey(eVar)) {
                    break;
                }
                if (eVar == e.COUNTRY && this.f != null) {
                    sb.append("/").append(this.d.get(eVar)).append("--").append(this.f);
                } else {
                    sb.append("/").append(this.d.get(eVar));
                }
            }
        } else if (this.d.containsKey(e.COUNTRY)) {
            sb.append("/").append(this.d.get(e.COUNTRY)).append("/").append(this.c.name().toLowerCase()).append("/_default");
        }
        return sb.toString();
    }

    public final String toString() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((aq) obj).toString().equals(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    static boolean a(String str) {
        for (as asVar : as.values()) {
            if (str.startsWith(asVar.name().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
