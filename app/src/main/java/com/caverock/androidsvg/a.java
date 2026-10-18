package com.caverock.androidsvg;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private g f1263a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1264b = false;

    public a(g gVar) {
        this.f1263a = null;
        this.f1263a = gVar;
    }

    static boolean a(List<g> list, g gVar) {
        for (g gVar2 : list) {
            if (gVar2 == g.all || gVar2 == gVar) {
                return true;
            }
        }
        return false;
    }

    static List<g> a(e eVar) {
        ArrayList arrayList = new ArrayList();
        while (!eVar.c()) {
            try {
                arrayList.add(g.valueOf(eVar.b(',')));
                if (!eVar.e()) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    private static void c(e eVar) {
        int i = 0;
        while (!eVar.c()) {
            int intValue = eVar.h().intValue();
            if (intValue != 59 || i != 0) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    final i b(e eVar) {
        i iVar = new i();
        while (!eVar.c()) {
            if (!eVar.a("<!--") && !eVar.a("-->")) {
                if (!eVar.a('@')) {
                    if (!a(iVar, eVar)) {
                        break;
                    }
                } else {
                    String a2 = eVar.a();
                    eVar.d();
                    if (a2 == null) {
                        throw new SAXException("Invalid '@' rule in <style> element");
                    }
                    if (!this.f1264b && a2.equals("media")) {
                        List<g> a3 = a(eVar);
                        if (!eVar.a('{')) {
                            throw new SAXException("Invalid @media rule: missing rule set");
                        }
                        eVar.d();
                        if (a(a3, this.f1263a)) {
                            this.f1264b = true;
                            iVar.a(b(eVar));
                            this.f1264b = false;
                        } else {
                            b(eVar);
                        }
                        if (!eVar.a('}')) {
                            throw new SAXException("Invalid @media rule: expected '}' at end of rule set");
                        }
                    } else {
                        Log.w("AndroidSVG CSSParser", String.format("Ignoring @%s rule", a2));
                        c(eVar);
                    }
                    eVar.d();
                }
            }
        }
        return iVar;
    }

    private static aw d(e eVar) {
        aw awVar = new aw();
        do {
            String a2 = eVar.a();
            eVar.d();
            if (!eVar.a(':')) {
                break;
            }
            eVar.d();
            String b2 = eVar.b();
            if (b2 == null) {
                break;
            }
            eVar.d();
            if (eVar.a('!')) {
                eVar.d();
                if (!eVar.a("important")) {
                    throw new SAXException("Malformed rule set in <style> element: found unexpected '!'");
                }
                eVar.d();
            }
            eVar.a(';');
            cw.a(awVar, a2, b2);
            eVar.d();
            if (eVar.a('}')) {
                return awVar;
            }
        } while (!eVar.c());
        throw new SAXException("Malformed rule set in <style> element");
    }

    static boolean a(j jVar, int i, List<bj> list, int i2, bl blVar) {
        while (true) {
            k a2 = jVar.a(i);
            if (!a(a2, list, i2, blVar)) {
                return false;
            }
            if (a2.f1379a == f.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i2 >= 0) {
                    if (a(jVar, i - 1, list, i2)) {
                        return true;
                    }
                    i2--;
                }
                return false;
            }
            if (a2.f1379a == f.CHILD) {
                return a(jVar, i - 1, list, i2);
            }
            int a3 = a(list, i2, blVar);
            if (a3 <= 0) {
                return false;
            }
            i--;
            blVar = (bl) blVar.v.a().get(a3 - 1);
        }
    }

    private static boolean a(j jVar, int i, List<bj> list, int i2) {
        while (true) {
            k a2 = jVar.a(i);
            bl blVar = (bl) list.get(i2);
            if (!a(a2, list, i2, blVar)) {
                return false;
            }
            if (a2.f1379a == f.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i2 > 0) {
                    i2--;
                    if (a(jVar, i - 1, list, i2)) {
                        return true;
                    }
                }
                return false;
            }
            if (a2.f1379a == f.CHILD) {
                i--;
                i2--;
            } else {
                int a3 = a(list, i2, blVar);
                if (a3 <= 0) {
                    return false;
                }
                return a(jVar, i - 1, list, i2, (bl) blVar.v.a().get(a3 - 1));
            }
        }
    }

    private static int a(List<bj> list, int i, bl blVar) {
        if (i >= 0 && list.get(i) == blVar.v) {
            int i2 = 0;
            Iterator<bn> it = blVar.v.a().iterator();
            while (true) {
                int i3 = i2;
                if (!it.hasNext()) {
                    return -1;
                }
                if (it.next() != blVar) {
                    i2 = i3 + 1;
                } else {
                    return i3;
                }
            }
        }
        return -1;
    }

    static boolean a(k kVar, List<bj> list, int i, bl blVar) {
        if (kVar.f1380b != null) {
            if (kVar.f1380b.equalsIgnoreCase("G")) {
                if (!(blVar instanceof ad)) {
                    return false;
                }
            } else if (!kVar.f1380b.equals(blVar.getClass().getSimpleName().toLowerCase(Locale.US))) {
                return false;
            }
        }
        if (kVar.c != null) {
            for (c cVar : kVar.c) {
                if (cVar.f1321a == "id") {
                    if (!cVar.c.equals(blVar.p)) {
                        return false;
                    }
                } else {
                    if (cVar.f1321a == "class" && blVar.t != null && blVar.t.contains(cVar.c)) {
                    }
                    return false;
                }
            }
        }
        if (kVar.d != null) {
            Iterator<String> it = kVar.d.iterator();
            while (it.hasNext()) {
                if (it.next().equals("first-child") && a(list, i, blVar) == 0) {
                }
                return false;
            }
        }
        return true;
    }

    private static boolean a(i iVar, e eVar) {
        ArrayList arrayList;
        if (eVar.c()) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(1);
            j jVar = new j();
            while (!eVar.c() && eVar.a(jVar)) {
                if (eVar.e()) {
                    arrayList2.add(jVar);
                    jVar = new j();
                }
            }
            if (!jVar.b()) {
                arrayList2.add(jVar);
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        if (!eVar.a('{')) {
            throw new SAXException("Malformed rule block in <style> element: missing '{'");
        }
        eVar.d();
        aw d = d(eVar);
        eVar.d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iVar.a(new h((j) it.next(), d));
        }
        return true;
    }
}
