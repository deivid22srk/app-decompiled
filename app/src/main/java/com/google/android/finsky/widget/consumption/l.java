package com.google.android.finsky.widget.consumption;

import android.util.SparseIntArray;
import com.google.android.finsky.utils.bg;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][][] f5185a = {new int[0][], new int[][]{new int[]{0}}, new int[][]{new int[]{0, 1}, new int[]{1, 0}}, new int[][]{new int[]{0, 1, 2}, new int[]{0, 2, 1}, new int[]{1, 0, 2}, new int[]{2, 0, 1}}, new int[][]{new int[]{0, 1, 2, 3}, new int[]{0, 1, 3, 2}, new int[]{0, 2, 1, 3}, new int[]{0, 2, 3, 1}, new int[]{0, 3, 1, 2}, new int[]{0, 3, 2, 1}, new int[]{1, 0, 3, 2}, new int[]{1, 0, 2, 3}, new int[]{1, 2, 3, 0}, new int[]{1, 2, 0, 3}, new int[]{1, 3, 2, 0}, new int[]{1, 3, 0, 2}, new int[]{2, 0, 1, 3}, new int[]{2, 0, 3, 1}, new int[]{2, 1, 0, 3}, new int[]{2, 1, 3, 0}, new int[]{2, 3, 0, 1}, new int[]{2, 3, 1, 0}, new int[]{3, 0, 2, 1}, new int[]{3, 0, 1, 2}, new int[]{3, 1, 2, 0}, new int[]{3, 1, 0, 2}, new int[]{3, 2, 1, 0}, new int[]{3, 2, 0, 1}}};

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5186b = false;
    private static Map<String, int[]> c = new HashMap();
    private static SparseIntArray d;
    private static SparseIntArray e;
    private static SparseIntArray f;
    private static SparseIntArray g;

    private static synchronized void a() {
        synchronized (l.class) {
            if (!f5186b) {
                f = com.google.android.finsky.widget.s.b(bg.Y.a());
                g = com.google.android.finsky.widget.s.b(bg.Z.a());
                d = com.google.android.finsky.widget.s.b(bg.aa.a());
                e = com.google.android.finsky.widget.s.b(bg.ab.a());
                f5186b = true;
            }
        }
    }

    public static m a(List<ConsumptionAppDocList> list) {
        int[] iArr;
        int i;
        a();
        int size = list.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = list.get(i2).f5167a;
        }
        if (size == 0) {
            return new m(new ConsumptionAppDocList[0], 0);
        }
        if (size == 1) {
            return new m((ConsumptionAppDocList[]) list.toArray(new ConsumptionAppDocList[1]), 0);
        }
        int[] a2 = a(iArr2);
        boolean z = a2 != null;
        if (z) {
            iArr = a2;
        } else {
            int i3 = -1;
            int[] iArr3 = new int[size];
            iArr = new int[size];
            int[][] iArr4 = f5185a[size];
            int length = iArr4.length;
            int i4 = 0;
            while (i4 < length) {
                int[] iArr5 = iArr4[i4];
                for (int i5 = 0; i5 < iArr5.length; i5++) {
                    iArr3[i5] = iArr2[iArr5[i5]];
                }
                int i6 = 0;
                if (size == 3) {
                    i6 = a(iArr2, iArr3);
                }
                int i7 = 0;
                int i8 = 0;
                while (i8 < size) {
                    int a3 = a(iArr3[i8], m.a(size, i8, i6)) + i7;
                    i8++;
                    i7 = a3;
                }
                Object[] objArr = {Arrays.toString(iArr3), Integer.valueOf(i7)};
                if (i7 > i3) {
                    System.arraycopy(iArr3, 0, iArr, 0, size);
                    i = i7;
                } else {
                    i = i3;
                }
                i4++;
                i3 = i;
            }
        }
        int a4 = size == 3 ? a(iArr2, iArr) : 0;
        if (!z) {
            a(iArr2, iArr, a4);
        }
        ConsumptionAppDocList[] consumptionAppDocListArr = new ConsumptionAppDocList[size];
        int i9 = 0;
        while (true) {
            int i10 = i9;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                Iterator<ConsumptionAppDocList> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ConsumptionAppDocList next = it.next();
                        if (next.f5167a == i11) {
                            consumptionAppDocListArr[i10] = next;
                            break;
                        }
                    }
                }
                i9 = i10 + 1;
            } else {
                Object[] objArr2 = {Arrays.toString(iArr), Integer.valueOf(a4)};
                return new m(consumptionAppDocListArr, a4);
            }
        }
    }

    private static int a(int[] iArr, int[] iArr2) {
        return iArr[0] == iArr2[0] ? 0 : 1;
    }

    private static synchronized int[] a(int[] iArr) {
        int[] iArr2;
        synchronized (l.class) {
            iArr2 = c.get(b(iArr));
        }
        return iArr2;
    }

    private static synchronized void a(int[] iArr, int[] iArr2, int i) {
        synchronized (l.class) {
            c.put(b(iArr), iArr2);
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                b(iArr2[i2], m.a(iArr.length, i2, i));
            }
            bg.Y.a((com.google.android.finsky.cpkg.o<String>) com.google.android.finsky.widget.s.a(f));
            bg.Z.a((com.google.android.finsky.cpkg.o<String>) com.google.android.finsky.widget.s.a(g));
            bg.aa.a((com.google.android.finsky.cpkg.o<String>) com.google.android.finsky.widget.s.a(d));
            bg.ab.a((com.google.android.finsky.cpkg.o<String>) com.google.android.finsky.widget.s.a(e));
        }
    }

    private static String b(int[] iArr) {
        return Arrays.toString(iArr) + "/0";
    }

    private static synchronized int a(int i, int i2) {
        int i3;
        synchronized (l.class) {
            i3 = (i2 & 4) != 0 ? f.get(i, 0) + 0 : 0;
            if ((i2 & 8) != 0) {
                i3 += g.get(i, 0);
            }
            if ((i2 & 1) != 0) {
                i3 += d.get(i, 0);
            }
            if ((i2 & 2) != 0) {
                i3 += e.get(i, 0);
            }
        }
        return i3;
    }

    private static synchronized void b(int i, int i2) {
        synchronized (l.class) {
            if ((i2 & 4) != 0) {
                a(f, g, i);
            }
            if ((i2 & 8) != 0) {
                a(g, f, i);
            }
            if ((i2 & 1) != 0) {
                a(d, e, i);
            }
            if ((i2 & 2) != 0) {
                a(e, d, i);
            }
        }
    }

    private static void a(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, int i) {
        sparseIntArray.put(i, Math.min(sparseIntArray.get(i, 0) + 1, 10));
        sparseIntArray2.put(i, Math.max(sparseIntArray2.get(i, 0) - 1, 0));
    }
}
