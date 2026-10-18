package com.google.android.finsky.layout.play;

import android.util.SparseArray;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<List<as>> f3417a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray<List<as>> f3418b = new SparseArray<>();

    static {
        ArrayList arrayList = new ArrayList();
        as a2 = new as(4, 3).a(as.k, 0, 0).a(as.k, 2, 0);
        a2.f = true;
        a2.e = true;
        arrayList.add(0, a2);
        as a3 = new as(4, 3).a(as.k, 0, 0).a(as.k, 2, 0);
        a3.f = true;
        a3.e = true;
        arrayList.add(1, a3);
        as b2 = new as(4, 2).b(as.l, 0, 0);
        b2.g = as.k;
        arrayList.add(2, b2);
        as b3 = new as(4, 2).b(as.l, 0, 0);
        b3.g = as.k;
        arrayList.add(3, b3);
        as a4 = new as(4, 3).a(as.k, 0, 0).a(as.k, 2, 0);
        a4.f = true;
        a4.e = true;
        a4.g = as.k;
        arrayList.add(4, a4);
        f3417a.append(0, arrayList);
        ArrayList arrayList2 = new ArrayList();
        as a5 = new as(6, 3).a(as.k, 0, 0).a(as.k, 2, 0).a(as.k, 4, 0);
        a5.f = true;
        a5.e = true;
        arrayList2.add(0, a5);
        as a6 = new as(6, 3).a(as.m, 0, 0).a(as.k, 4, 0);
        a6.g = as.k;
        arrayList2.add(1, a6);
        as a7 = new as(6, 3).a(as.m, 0, 0).a(as.k, 4, 0);
        a7.g = as.k;
        arrayList2.add(2, a7);
        as a8 = new as(6, 3).a(as.m, 0, 0).a(as.k, 4, 0);
        a8.g = as.k;
        arrayList2.add(3, a8);
        as a9 = new as(6, 3).a(as.m, 0, 0).a(as.k, 4, 0);
        a9.g = as.k;
        arrayList2.add(3, a9);
        f3417a.append(1, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        as a10 = new as(6, 3).a(as.k, 0, 0).a(as.k, 2, 0).a(as.k, 4, 0);
        a10.f = true;
        a10.e = true;
        arrayList3.add(0, a10);
        as a11 = new as(6, 3).a(as.m, 0, 0).a(as.k, 4, 0);
        a11.g = as.k;
        arrayList3.add(1, a11);
        as a12 = new as(6, 6).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 0, 3).a(as.k, 2, 3).a(as.k, 4, 3);
        a12.g = as.k;
        arrayList3.add(2, a12);
        as a13 = new as(6, 6).a(as.n, 0, 0).a(as.k, 4, 0).a(as.k, 4, 3);
        a13.g = as.k;
        arrayList3.add(3, a13);
        as a14 = new as(6, 6).a(as.n, 0, 0).a(as.k, 4, 0).a(as.k, 4, 3);
        a14.g = as.k;
        arrayList3.add(3, a14);
        f3417a.append(2, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        as a15 = new as(8, 3).a(as.k, 0, 0).a(as.k, 2, 0).a(as.k, 4, 0).a(as.k, 6, 0);
        a15.f = true;
        a15.e = true;
        arrayList4.add(0, a15);
        as a16 = new as(8, 3).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0);
        a16.g = as.k;
        arrayList4.add(1, a16);
        as a17 = new as(8, 3).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0);
        a17.g = as.k;
        arrayList4.add(2, a17);
        as a18 = new as(8, 3).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0);
        a18.g = as.k;
        arrayList4.add(3, a18);
        as a19 = new as(8, 3).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0);
        a19.g = as.k;
        arrayList4.add(3, a19);
        f3417a.append(3, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        as a20 = new as(8, 3).a(as.k, 0, 0).a(as.k, 2, 0).a(as.k, 4, 0).a(as.k, 6, 0);
        a20.f = true;
        a20.e = true;
        arrayList5.add(0, a20);
        as a21 = new as(8, 3).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0);
        a21.g = as.k;
        arrayList5.add(1, a21);
        as b4 = new as(8, 6).a(as.n, 0, 0).b(as.l, 4, 0).b(as.l, 4, 2).b(as.l, 4, 4);
        b4.g = as.k;
        arrayList5.add(2, b4);
        as a22 = new as(8, 6).a(as.n, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0).a(as.k, 4, 3).a(as.k, 6, 3);
        a22.g = as.k;
        arrayList5.add(3, a22);
        as b5 = new as(8, 8).a(as.n, 0, 0).a(as.n, 4, 0).b(as.l, 0, 6).b(as.l, 4, 6);
        b5.g = as.k;
        arrayList5.add(4, b5);
        f3417a.append(4, arrayList5);
        ArrayList arrayList6 = new ArrayList();
        as a23 = new as(10, 3).a(as.k, 0, 0).a(as.k, 2, 0).a(as.k, 4, 0).a(as.k, 6, 0).a(as.k, 8, 0);
        a23.f = true;
        a23.e = true;
        arrayList6.add(0, a23);
        as a24 = new as(10, 3).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0).a(as.k, 8, 0);
        a24.g = as.k;
        arrayList6.add(1, a24);
        as a25 = new as(10, 3).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0).a(as.k, 8, 0);
        a25.g = as.k;
        arrayList6.add(2, a25);
        as a26 = new as(10, 3).a(as.m, 0, 0).a(as.k, 4, 0).a(as.k, 6, 0).a(as.k, 8, 0);
        a26.g = as.k;
        arrayList6.add(3, a26);
        as a27 = new as(10, 3).a(as.m, 0, 0).a(as.m, 4, 0).a(as.k, 8, 0);
        a27.g = as.k;
        arrayList6.add(4, a27);
        f3417a.append(5, arrayList6);
        ArrayList arrayList7 = new ArrayList();
        as a28 = new as(4, 4).a(as.p, 0, 0).a(as.p, 2, 0);
        a28.f = true;
        a28.e = true;
        arrayList7.add(0, a28);
        as a29 = new as(4, 4).a(as.p, 0, 0).a(as.p, 2, 0);
        a29.f = true;
        a29.e = true;
        arrayList7.add(1, a29);
        as b6 = new as(4, 2).b(as.q, 0, 0);
        b6.g = as.p;
        arrayList7.add(2, b6);
        as b7 = new as(4, 2).b(as.q, 0, 0);
        b7.g = as.p;
        arrayList7.add(3, b7);
        as a30 = new as(4, 4).a(as.p, 0, 0).a(as.p, 2, 0);
        a30.f = true;
        a30.e = true;
        arrayList7.add(4, a30);
        f3418b.append(0, arrayList7);
        ArrayList arrayList8 = new ArrayList();
        as a31 = new as(6, 4).a(as.p, 0, 0).a(as.p, 2, 0).a(as.p, 4, 0);
        a31.f = true;
        a31.e = true;
        arrayList8.add(0, a31);
        as a32 = new as(6, 4).a(as.r, 0, 0).a(as.p, 4, 0);
        a32.g = as.p;
        arrayList8.add(1, a32);
        as a33 = new as(6, 4).a(as.r, 0, 0).a(as.p, 4, 0);
        a33.g = as.p;
        arrayList8.add(2, a33);
        as a34 = new as(6, 4).a(as.r, 0, 0).a(as.p, 4, 0);
        a34.g = as.p;
        arrayList8.add(3, a34);
        as a35 = new as(6, 4).a(as.r, 0, 0).a(as.p, 4, 0);
        a35.g = as.p;
        arrayList8.add(4, a35);
        f3418b.append(1, arrayList8);
        ArrayList arrayList9 = new ArrayList();
        as a36 = new as(6, 4).a(as.p, 0, 0).a(as.p, 2, 0).a(as.p, 4, 0);
        a36.f = true;
        a36.e = true;
        arrayList9.add(0, a36);
        as a37 = new as(6, 8).a(as.s, 0, 0).a(as.p, 0, 4).a(as.p, 2, 4).a(as.p, 4, 4);
        a37.g = as.p;
        arrayList9.add(1, a37);
        as a38 = new as(6, 8).a(as.s, 0, 0).a(as.p, 0, 4).a(as.p, 2, 4).a(as.p, 4, 4);
        a38.g = as.p;
        arrayList9.add(2, a38);
        as a39 = new as(6, 8).a(as.s, 0, 0).a(as.p, 0, 4).a(as.p, 2, 4).a(as.p, 4, 4);
        a39.g = as.p;
        arrayList9.add(3, a39);
        as a40 = new as(6, 8).a(as.s, 0, 0).a(as.p, 0, 4).a(as.p, 2, 4).a(as.p, 4, 4);
        a40.g = as.p;
        arrayList9.add(4, a40);
        f3418b.append(2, arrayList9);
        ArrayList arrayList10 = new ArrayList();
        as a41 = new as(8, 4).a(as.p, 0, 0).a(as.p, 2, 0).a(as.p, 4, 0).a(as.p, 6, 0);
        a41.f = true;
        a41.e = true;
        arrayList10.add(0, a41);
        as a42 = new as(8, 4).a(as.r, 0, 0).a(as.p, 4, 0).a(as.p, 6, 0);
        a42.g = as.p;
        arrayList10.add(1, a42);
        as a43 = new as(8, 4).a(as.r, 0, 0).a(as.p, 4, 0).a(as.p, 6, 0);
        a43.g = as.p;
        arrayList10.add(2, a43);
        as a44 = new as(8, 4).a(as.r, 0, 0).a(as.p, 4, 0).a(as.p, 6, 0);
        a44.g = as.p;
        arrayList10.add(3, a44);
        as a45 = new as(8, 4).a(as.r, 0, 0).a(as.p, 4, 0).a(as.p, 6, 0);
        a45.g = as.p;
        arrayList10.add(4, a45);
        f3418b.append(3, arrayList10);
        ArrayList arrayList11 = new ArrayList();
        as a46 = new as(8, 4).a(as.p, 0, 0).a(as.p, 2, 0).a(as.p, 4, 0).a(as.p, 6, 0);
        a46.f = true;
        a46.e = true;
        arrayList11.add(0, a46);
        as a47 = new as(8, 4).a(as.r, 0, 0).a(as.p, 4, 0).a(as.p, 6, 0);
        a47.g = as.p;
        arrayList11.add(1, a47);
        as b8 = new as(8, 8).a(as.t, 0, 0).b(as.q, 4, 0).b(as.q, 4, 2).b(as.q, 4, 4).b(as.q, 4, 6);
        b8.g = as.p;
        arrayList11.add(2, b8);
        as a48 = new as(8, 8).a(as.t, 0, 0).a(as.p, 4, 0).a(as.p, 6, 0).a(as.p, 4, 4).a(as.p, 6, 4);
        a48.g = as.p;
        arrayList11.add(3, a48);
        as b9 = new as(8, 8).a(as.t, 0, 0).b(as.q, 4, 0).b(as.q, 4, 2).b(as.q, 4, 4).b(as.q, 4, 6);
        b9.g = as.p;
        arrayList11.add(4, b9);
        f3418b.append(4, arrayList11);
        ArrayList arrayList12 = new ArrayList();
        as a49 = new as(10, 4).a(as.p, 0, 0).a(as.p, 2, 0).a(as.p, 4, 0).a(as.p, 6, 0).a(as.p, 8, 0);
        a49.f = true;
        a49.e = true;
        arrayList12.add(0, a49);
        as a50 = new as(10, 4).a(as.s, 0, 0).a(as.p, 6, 0).a(as.p, 8, 0);
        a50.g = as.p;
        arrayList12.add(1, a50);
        as b10 = new as(10, 4).a(as.s, 0, 0).b(as.q, 6, 0).b(as.q, 6, 2);
        b10.g = as.p;
        arrayList12.add(2, b10);
        as a51 = new as(10, 4).a(as.s, 0, 0).a(as.p, 6, 0).a(as.p, 8, 0);
        a51.g = as.p;
        arrayList12.add(3, a51);
        as b11 = new as(10, 4).a(as.s, 0, 0).b(as.q, 6, 0).b(as.q, 6, 2);
        b11.g = as.p;
        arrayList12.add(4, b11);
        f3418b.append(5, arrayList12);
    }

    public static int a(int i, boolean z) {
        switch (i) {
            case 2:
                break;
            case 3:
                if (!z) {
                    break;
                }
                break;
            case 4:
                if (z) {
                }
                break;
            case 5:
                break;
            default:
                FinskyLog.e("Unsupported number of columns %d", Integer.valueOf(i));
                break;
        }
        return 0;
    }

    public static as a(int i, int i2, boolean z, int i3) {
        return ((as.b(i) > 1.0f ? 1 : (as.b(i) == 1.0f ? 0 : -1)) == 0 ? f3417a : f3418b).get(a(i2, z)).get(i3);
    }
}
