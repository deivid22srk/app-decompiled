package com.google.android.finsky.widget.consumption;

import android.util.SparseIntArray;
import com.google.android.finsky.services.ConsumptionAppDoc;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.cz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final long f5192a = com.google.android.finsky.c.d.bN.b().longValue();

    /* renamed from: b, reason: collision with root package name */
    private static final long f5193b = com.google.android.finsky.c.d.bO.b().longValue();
    private static final long c = com.google.android.finsky.c.d.bP.b().longValue();
    private static final SparseIntArray d = com.google.android.finsky.widget.s.b(com.google.android.finsky.c.d.bT.b());
    private static final SparseIntArray e = com.google.android.finsky.widget.s.b(com.google.android.finsky.c.d.bU.b());
    private static final float f = com.google.android.finsky.c.d.bR.b().floatValue();
    private static final SparseIntArray g = com.google.android.finsky.widget.s.b(com.google.android.finsky.c.d.bS.b());
    private static final float h = com.google.android.finsky.c.d.bQ.b().floatValue();
    private static final boolean i = com.google.android.finsky.c.d.bV.b().booleanValue();
    private static final Comparator<ConsumptionAppDoc> j = new q();

    public static List<ConsumptionAppDocList> a(List<ConsumptionAppDocList> list, int i2, long j2) {
        int i3;
        float f2;
        int i4;
        long j3;
        ConsumptionAppDocList consumptionAppDocList;
        int min = Math.min(i2, list.size());
        HashMap hashMap = new HashMap();
        ConsumptionAppDocList consumptionAppDocList2 = null;
        long j4 = 0;
        for (ConsumptionAppDocList consumptionAppDocList3 : list) {
            int i5 = consumptionAppDocList3.f5167a;
            ArrayList arrayList = new ArrayList(consumptionAppDocList3);
            Collections.sort(arrayList, j);
            int i6 = 0;
            float f3 = 0.0f;
            float f4 = d.get(i5, d.get(0));
            int i7 = 0;
            long j5 = j2 - f5193b;
            long j6 = j2 - c;
            Iterator it = arrayList.iterator();
            long j7 = 0;
            long j8 = 0;
            while (true) {
                i3 = i6;
                f2 = f3;
                float f5 = f4;
                i4 = i7;
                if (!it.hasNext()) {
                    break;
                }
                ConsumptionAppDoc consumptionAppDoc = (ConsumptionAppDoc) it.next();
                long j9 = consumptionAppDoc.c;
                if (j9 - j7 < f5192a) {
                    Object[] objArr = {consumptionAppDoc.d, Long.valueOf(f5192a)};
                } else if (j9 > j5) {
                    i3++;
                    f2 += f5;
                    f5 *= f;
                } else if (j9 > j6) {
                    i4++;
                }
                i7 = i4;
                f4 = f5;
                f3 = f2;
                i6 = i3;
                j8 = Math.max(j8, j9);
                j7 = j9;
            }
            int i8 = e.get(i5, e.get(0));
            int i9 = 0;
            if (consumptionAppDocList3.size() > 0) {
                i9 = g.get(i5, g.get(0));
            }
            int i10 = i8 * i4;
            int i11 = ((int) f2) + i10 + i9;
            FinskyLog.b("Score for backend %d: %d (shorttermscore=%.3g,midtermscore=%d,hascontentscore=%d,shorttermcount=%d,midtermcount=%d,totalcount=%d)", Integer.valueOf(i5), Integer.valueOf(i11), Float.valueOf(f2), Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(consumptionAppDocList3.size()));
            s sVar = new s((byte) 0);
            sVar.f5195a = i11;
            sVar.f5196b = j8;
            hashMap.put(consumptionAppDocList3, Integer.valueOf(sVar.f5195a));
            if (sVar.f5196b > j4) {
                consumptionAppDocList = consumptionAppDocList3;
                j3 = sVar.f5196b;
            } else {
                j3 = j4;
                consumptionAppDocList = consumptionAppDocList2;
            }
            consumptionAppDocList2 = consumptionAppDocList;
            j4 = j3;
        }
        ArrayList arrayList2 = new ArrayList(list);
        Collections.sort(arrayList2, new r(hashMap));
        return a(arrayList2, min, hashMap, consumptionAppDocList2);
    }

    private static List<ConsumptionAppDocList> a(List<ConsumptionAppDocList> list, int i2, Map<ConsumptionAppDocList, Integer> map, ConsumptionAppDocList consumptionAppDocList) {
        ArrayList a2 = cz.a(i2);
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            ConsumptionAppDocList consumptionAppDocList2 = list.get(i3);
            int intValue = map.get(consumptionAppDocList2).intValue();
            i4 += intValue;
            if (i4 != 0) {
                if (i3 > 1 && intValue / i4 < h) {
                    new Object[1][0] = Integer.valueOf(consumptionAppDocList2.f5167a);
                    break;
                }
                a2.add(consumptionAppDocList2);
                i3++;
                z |= consumptionAppDocList2 == consumptionAppDocList;
            } else {
                break;
            }
        }
        if (i && !z && consumptionAppDocList != null) {
            if (a2.size() == i2) {
                a2.remove(a2.size() - 1);
            }
            a2.add(consumptionAppDocList);
        }
        return a2;
    }
}
