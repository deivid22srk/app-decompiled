package com.google.android.finsky.api.model;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.ag;
import com.google.android.finsky.protos.ea;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cy;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.dy;
import com.google.android.finsky.utils.gs;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class t extends r {
    private static Set<String> h = null;
    private static final String[] k = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public List<Document> f1990a;
    private final com.google.android.finsky.b.s c;
    private final com.google.android.finsky.g.h d;
    private final com.google.android.finsky.api.k e;
    private final com.google.android.finsky.b.x f;
    private List<w> g = null;
    private boolean i;
    private boolean j;

    public t(Context context, com.google.android.finsky.b.s sVar, com.google.android.finsky.g.h hVar, com.google.android.finsky.api.k kVar, com.google.android.finsky.b.x xVar, boolean z) {
        this.c = sVar;
        this.d = hVar;
        this.e = kVar;
        this.f = xVar;
        this.i = com.google.android.finsky.api.a.c(context);
        this.j = z;
    }

    public final void a(String str, Map<String, List<String>> map) {
        if (map.size() > 1) {
            List<String> list = map.get(str);
            List<String> list2 = list == null ? map.get(map.keySet().iterator().next()) : list;
            HashSet hashSet = new HashSet();
            for (String str2 : list2) {
                if (!com.google.android.finsky.b.l.a(str2)) {
                    com.google.android.finsky.b.t a2 = this.c.a(str2);
                    if (!(this.i || !(a2 == null || (a2.r & 1) == 0))) {
                        hashSet.add(str2);
                    }
                }
            }
            Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                List<String> value = it.next().getValue();
                if (value != list2) {
                    Iterator<String> it2 = value.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (!com.google.android.finsky.b.l.a(next)) {
                            com.google.android.finsky.b.t a3 = this.c.a(next);
                            if (!(this.i || !(a3 == null || (a3.r & 1) == 0))) {
                                if (hashSet.contains(next)) {
                                    it2.remove();
                                } else {
                                    hashSet.add(next);
                                }
                            }
                        }
                    }
                    if (value.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    private void a(Map<String, List<String>> map, u[] uVarArr) {
        String str;
        List<String> list;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            for (String str2 : entry.getValue()) {
                if (h == null || !h.contains(str2)) {
                    com.google.android.finsky.b.t a2 = this.c.a(str2);
                    if (a2 != null && (a2.r & 1) != 0) {
                        String[] a3 = a2.a();
                        if (a3.length != 0) {
                            int length = uVarArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    u uVar = uVarArr[i];
                                    for (String str3 : uVar.f1992b) {
                                        for (String str4 : a3) {
                                            if (str4.equals(str3)) {
                                                str = uVar.f1991a;
                                                break;
                                            }
                                        }
                                    }
                                    i++;
                                } else {
                                    str = null;
                                    break;
                                }
                            }
                            if (str != null && !str.equals(key) && (list = map.get(str)) != null && !list.contains(str2)) {
                                if (this.g == null) {
                                    this.g = new ArrayList();
                                }
                                this.g.add(new w(str2, str));
                            }
                        }
                    }
                }
            }
        }
    }

    private void b(Map<String, List<String>> map) {
        if (this.g != null) {
            for (w wVar : this.g) {
                FinskyLog.a("Add %s to check for potential auto-acquire by %s", wVar.f1995a, FinskyLog.a(wVar.f1996b));
                map.get(wVar.f1996b).add(wVar.f1995a);
            }
        }
    }

    private boolean a(String str, String str2) {
        if (this.g == null) {
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            w wVar = this.g.get(i);
            if (wVar.f1995a.equals(str) && wVar.f1996b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.finsky.api.model.r
    protected final void b() {
        if (this.f1990a != null) {
            FinskyLog.c("Unexpected repeat collation", new Object[0]);
        }
        Map<String, v> a2 = a(false);
        if (a2 != null) {
            this.f1990a = cz.a(a2.size());
            for (Map.Entry<String, v> entry : a2.entrySet()) {
                String key = entry.getKey();
                v value = entry.getValue();
                Document document = value.c;
                String str = document.E().w;
                boolean z = document.E().H;
                int i = z ? 1 : 0;
                com.google.android.finsky.b.t a3 = this.c.a(str);
                int i2 = a3 == null ? 0 : a3.r;
                if (i != (i2 & 1)) {
                    FinskyLog.a("Change varies-by-account for %s to %b", str, Boolean.valueOf(z));
                    if (a3 != null || i != 0) {
                        this.c.e(str, i | (i2 & (-2)));
                    }
                }
                ag E = document.E();
                String str2 = E.w;
                String[] strArr = E.J;
                com.google.android.finsky.b.t a4 = this.c.a(str2);
                String[] a5 = a4 == null ? k : a4.a();
                if (!Arrays.equals(strArr, a5)) {
                    FinskyLog.a("Change auto-acquire tags for %s from %s to %s", str2, jm.a(a5), jm.a(strArr));
                    if (a4 != null || strArr.length != 0) {
                        this.c.a(str2, strArr);
                    }
                }
                if (this.i || (document.E().H && value.d)) {
                    b(key, value.f1993a);
                } else {
                    b(key, null);
                }
                this.f1990a.add(document);
            }
            Map<String, v> a6 = a(true);
            if (a6 != null && a6.size() != 0) {
                for (Map.Entry<String, v> entry2 : a6.entrySet()) {
                    String key2 = entry2.getKey();
                    int i3 = entry2.getValue().f1994b;
                    String str3 = entry2.getValue().f1993a;
                    ea d = entry2.getValue().c.d(1);
                    if (d != null && d.w) {
                        FinskyLog.a("Skipping proposed auto-acquire - Unexpected checkoutFlowRequired=true for %s by %s", key2, FinskyLog.a(str3));
                        a(key2);
                    } else {
                        v vVar = a2.get(key2);
                        if (vVar != null && i3 > vVar.f1994b) {
                            FinskyLog.a("Proposed auto-acquire of %s by %s revealed higher version %d", key2, FinskyLog.a(str3), Integer.valueOf(i3));
                            v value2 = entry2.getValue();
                            Account a7 = com.google.android.finsky.api.a.a(value2.f1993a, FinskyApp.a());
                            if (cy.a(value2.c, this.d.a(a7))) {
                                FinskyLog.c("Skip auto-acquire of %s by %s because already owned", key2, FinskyLog.a(value2.f1993a));
                                a(key2);
                            } else {
                                gs.a(a7, value2.c, 1, null, null, false, false);
                                a(key2);
                            }
                            com.google.android.finsky.a.n nVar = new com.google.android.finsky.a.n();
                            nVar.c = vVar.f1994b;
                            nVar.f1490a = i3;
                            FinskyApp.a().f(vVar.f1993a).a(116, key2, "auto-acquire", 0, (String) null, nVar);
                            FinskyApp.a().f(str3).a(117, key2, "auto-acquire", 0, (String) null, nVar);
                        } else {
                            FinskyLog.a("Skipping proposed auto-acquire of %s by %s", key2, FinskyLog.a(str3));
                            a(key2);
                        }
                    }
                }
            }
        }
    }

    private static void a(String str) {
        if (h == null) {
            h = new HashSet();
        }
        h.add(str);
    }

    private Map<String, v> a(boolean z) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (f fVar : this.f1987b) {
            List<Document> b2 = fVar.b();
            if (b2 == null) {
                return null;
            }
            arrayList.addAll(fVar.c());
            String c = fVar.f1974a.c();
            for (Document document : b2) {
                String str = document.E().w;
                int i = document.E().e;
                v vVar = (v) hashMap.get(str);
                if (z == a(str, c)) {
                    if (vVar == null) {
                        hashMap.put(str, new v(c, i, document));
                    } else {
                        if (i != vVar.f1994b) {
                            vVar.d = true;
                        }
                        if (i > vVar.f1994b) {
                            vVar.f1994b = i;
                            vVar.f1993a = c;
                            vVar.c = document;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v vVar2 = (v) hashMap.get((String) it.next());
            if (vVar2 != null) {
                vVar2.d = true;
            }
        }
        return hashMap;
    }

    private void b(String str, String str2) {
        com.google.android.finsky.b.t a2 = this.c.a(str);
        if (!dy.a(a2 == null ? null : a2.p, str2)) {
            FinskyLog.a("Capture account %s for next update of %s", FinskyLog.a(str2), str);
            this.c.c(str, str2);
        }
    }

    public final void a(Map<String, List<String>> map) {
        ArrayList arrayList;
        List<com.google.android.finsky.g.a> e = this.d.e();
        if (e.size() > 1) {
            arrayList = null;
            for (com.google.android.finsky.g.a aVar : e) {
                String[] f = aVar.f();
                if (f != null && f.length > 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(new u(aVar.i.name, f));
                }
            }
        } else {
            arrayList = null;
        }
        u[] uVarArr = arrayList != null ? (u[]) arrayList.toArray(new u[arrayList.size()]) : null;
        if (uVarArr != null) {
            a(map, uVarArr);
            b(map);
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value.size() != 0) {
                int[] iArr = new int[value.size()];
                int size = value.size();
                for (int i = 0; i < size; i++) {
                    com.google.android.finsky.b.y a2 = this.f.a(value.get(i));
                    iArr[i] = a2 == null ? -1 : a2.c;
                }
                a(this.e.a(key), value, iArr, this.j);
            }
        }
    }
}
