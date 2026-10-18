package com.google.android.finsky.detailspage;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class by {

    /* renamed from: a, reason: collision with root package name */
    private static final List<Class> f2570a = Arrays.asList(bm.class, i.class, es.class, eu.class, ca.class, az.class, eg.class, ag.class, f.class, t.class, Cdo.class, l.class, aw.class, b.class, a.class, cb.class, ed.class, al.class, dm.class, cs.class, db.class, du.class, bz.class, m.class, bg.class, bk.class, bi.class);

    /* renamed from: b, reason: collision with root package name */
    private static final List<Class> f2571b = Arrays.asList(bm.class, i.class, r.class, ca.class, az.class, eg.class, f.class, t.class, Cdo.class, l.class, aw.class, b.class, a.class, cb.class, ed.class, al.class, dm.class, cs.class, db.class, du.class, bz.class, m.class, bg.class, bk.class, bi.class);
    private static List<Class> c = Arrays.asList(bm.class, d.class, e.class, du.class, c.class);

    public static List<bd> a(Document document, boolean z) {
        if (a(document)) {
            return a(c);
        }
        return a(z ? f2571b : f2570a);
    }

    public static List<bd> a(Document document, boolean z, List<bd> list) {
        ArrayList arrayList = new ArrayList();
        if (a(document)) {
            return arrayList;
        }
        int indexOf = (z ? f2571b : f2570a).indexOf(bz.class);
        int length = document.o().length;
        for (int i = 0; i < length; i++) {
            aj ajVar = new aj();
            ajVar.f2537a = i;
            list.add(indexOf + i, ajVar);
            arrayList.add(ajVar);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(List<Class> list, List<bf> list2, Document document, boolean z, boolean z2) {
        if (!a(document)) {
            int indexOf = f2570a.indexOf(es.class);
            int indexOf2 = f2570a.indexOf(eu.class);
            int indexOf3 = f2570a.indexOf(ag.class);
            int indexOf4 = f2571b.indexOf(r.class);
            if (!z && z2) {
                s sVar = new s();
                sVar.f2669a = (et) list2.get(indexOf);
                sVar.c = (ev) list2.get(indexOf2);
                sVar.f2670b = (ah) list2.get(indexOf3);
                ArrayList a2 = com.google.android.finsky.utils.cz.a(Integer.valueOf(indexOf), Integer.valueOf(indexOf2), Integer.valueOf(indexOf3));
                Collections.sort(a2);
                Collections.reverse(a2);
                for (int i = 0; i < a2.size(); i++) {
                    int intValue = ((Integer) a2.get(i)).intValue();
                    list.remove(intValue);
                    list2.remove(intValue);
                }
                list2.add(indexOf4, sVar);
                list.add(indexOf4, r.class);
            }
            if (z && !z2) {
                s sVar2 = (s) list2.get(indexOf4);
                if (sVar2 == null) {
                    sVar2 = new s();
                }
                list.remove(indexOf4);
                list2.remove(indexOf4);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put(Integer.valueOf(indexOf), es.class);
                hashMap.put(Integer.valueOf(indexOf2), eu.class);
                hashMap.put(Integer.valueOf(indexOf3), ag.class);
                hashMap2.put(Integer.valueOf(indexOf), sVar2.f2669a);
                hashMap2.put(Integer.valueOf(indexOf2), sVar2.c);
                hashMap2.put(Integer.valueOf(indexOf3), sVar2.f2670b);
                ArrayList a3 = com.google.android.finsky.utils.cz.a(hashMap2.keySet());
                Collections.sort(a3);
                for (int i2 = 0; i2 < a3.size(); i2++) {
                    int intValue2 = ((Integer) a3.get(i2)).intValue();
                    list.add(intValue2, hashMap.get(Integer.valueOf(intValue2)));
                    list2.add(intValue2, hashMap2.get(Integer.valueOf(intValue2)));
                }
            }
        }
    }

    public static int a(int i, Document document, boolean z, boolean z2) {
        int i2 = 0;
        if (!a(document)) {
            if (!z && z2) {
                int i3 = i > f2570a.indexOf(es.class) ? i - 1 : i;
                if (i > f2570a.indexOf(eu.class)) {
                    i3--;
                }
                if (i > f2570a.indexOf(ag.class)) {
                    i3--;
                }
                if (i3 > f2571b.indexOf(r.class)) {
                    i3++;
                }
                return i3;
            }
            if (z && !z2) {
                if (i > f2571b.indexOf(r.class)) {
                    i--;
                }
                ArrayList a2 = com.google.android.finsky.utils.cz.a(Integer.valueOf(f2570a.indexOf(es.class)), Integer.valueOf(f2570a.indexOf(eu.class)), Integer.valueOf(f2570a.indexOf(ag.class)));
                Collections.sort(a2);
                while (true) {
                    int i4 = i2;
                    if (i4 < a2.size()) {
                        if (i > ((Integer) a2.get(i4)).intValue()) {
                            i++;
                        }
                        i2 = i4 + 1;
                    } else {
                        return i;
                    }
                }
            } else {
                return i;
            }
        } else {
            return i;
        }
    }

    private static boolean a(Document document) {
        return document.f1963a.g == 2 && document.ai();
    }

    public static List<bd> a(List<Class> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != bz.class) {
                try {
                    arrayList.add((bd) list.get(i).newInstance());
                } catch (Exception e) {
                    FinskyLog.e("Exception trying to instantiate module: " + e.getMessage(), new Object[0]);
                }
            }
        }
        return arrayList;
    }
}
