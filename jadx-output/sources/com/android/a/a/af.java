package com.android.a.a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public final class af {
    private static final aq c = new ar(as.DATA).a(new c().a()).a();
    private static final e[] d = {e.COUNTRY, e.ADMIN_AREA, e.LOCALITY, e.DEPENDENT_LOCALITY};

    /* renamed from: a, reason: collision with root package name */
    String f1062a;

    /* renamed from: b, reason: collision with root package name */
    public String f1063b;
    private aa e;

    af(aa aaVar, String str, String str2) {
        be.a(aaVar, "null data not allowed");
        this.f1062a = str;
        this.f1063b = str2;
        aq a2 = a(new c().a("ZZ").a());
        be.a(aaVar.b(a2.toString()), "require data for default country key: " + a2);
        this.e = aaVar;
    }

    static aq a(a aVar) {
        return new ar(as.DATA).a(aVar).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(aq aqVar, Queue<String> queue, ab abVar) {
        be.a(aqVar, "Null key not allowed");
        be.a(queue, "Null subkeys not allowed");
        aa aaVar = this.e;
        ag agVar = new ag(this, aqVar, abVar, queue);
        be.a(aqVar, "Null lookup key not allowed");
        aaVar.f1058b.a(aqVar, aaVar.f1057a.get(aqVar.toString()), agVar);
    }

    final boolean a(String str) {
        if (str == null) {
            return true;
        }
        return be.c(this.e.b(a(new c().a(this.f1063b).a()).toString()).b(d.LANG)) == null || be.b(str).equals(be.b(str));
    }

    private static String[] b(String str) {
        return (str == null || str.length() == 0) ? new String[0] : str.split("~");
    }

    private String a(aq aqVar, String str) {
        for (av avVar : a(aqVar)) {
            if (avVar.a(str)) {
                return avVar.f1087a;
            }
        }
        return null;
    }

    private aq b(aq aqVar) {
        be.a(aqVar);
        if (aqVar.f1078a != as.DATA) {
            throw new RuntimeException("Only DATA keyType is supported");
        }
        String[] split = aqVar.toString().split("/");
        if (split.length >= 2) {
            StringBuilder sb = new StringBuilder(split[0]);
            int i = 1;
            while (true) {
                if (i >= split.length) {
                    break;
                }
                String str = null;
                if (i == 1 && split[i].contains("--")) {
                    String[] split2 = split[i].split("--");
                    split[i] = split2[0];
                    str = split2[1];
                }
                String a2 = a(new ar(sb.toString()).a(), split[i]);
                if (a2 == null) {
                    while (i < split.length) {
                        sb.append("/").append(split[i]);
                        i++;
                    }
                } else {
                    sb.append("/").append(a2);
                    if (str != null) {
                        sb.append("--").append(str);
                    }
                    i++;
                }
            }
            return new ar(sb.toString()).a();
        }
        return aqVar;
    }

    final void a(a aVar, ab abVar) {
        be.a(aVar.f1055a, "null country not allowed");
        LinkedList linkedList = new LinkedList();
        for (e eVar : d) {
            String a2 = aVar.a(eVar);
            if (a2 == null) {
                break;
            }
            linkedList.add(a2);
        }
        if (linkedList.size() == 0) {
            throw new RuntimeException("Need at least country level info");
        }
        a(c, linkedList, abVar);
    }

    final List<av> a(aq aqVar) {
        at atVar;
        int i = 0;
        if (aqVar.f1078a == as.EXAMPLES) {
            throw new RuntimeException("example key not allowed for getting region data");
        }
        be.a(aqVar, "null regionKey not allowed");
        aq b2 = b(aqVar);
        ArrayList arrayList = new ArrayList();
        if (b2.equals(c)) {
            String[] b3 = b(this.e.b(b2.toString()).b(d.COUNTRIES));
            while (i < b3.length) {
                arrayList.add(new aw().a(b3[i]).b(b3[i]).a());
                i++;
            }
            return arrayList;
        }
        k a2 = this.e.a(b2.toString());
        if (a2 != null) {
            String[] b4 = b(a2.b(d.SUB_KEYS));
            if (this.f1062a != null && be.a(this.f1062a)) {
                atVar = at.LATIN;
            } else {
                atVar = at.LOCAL;
            }
            String[] b5 = atVar == at.LOCAL ? b(a2.b(d.SUB_NAMES)) : b(a2.b(d.SUB_LNAMES));
            while (i < b4.length) {
                arrayList.add(new aw().a(b4[i]).b(i < b5.length ? b5[i] : b4[i]).a());
                i++;
            }
        }
        return arrayList;
    }

    static /* synthetic */ aq a(af afVar, aq aqVar, String str) {
        String[] split = aqVar.toString().split("/");
        String b2 = afVar.f1062a == null ? null : be.b(afVar.f1062a);
        String str2 = aqVar.toString() + "/" + str;
        return new ar((split.length != 1 || b2 == null || afVar.a(b2)) ? str2 : str2 + "--" + b2.toString()).a();
    }
}
