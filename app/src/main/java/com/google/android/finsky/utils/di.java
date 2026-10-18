package com.google.android.finsky.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    private static long f4826a;

    /* renamed from: b, reason: collision with root package name */
    private static List<String> f4827b = new ArrayList();

    public static void a(List<String> list) {
        f4827b.addAll(list);
    }

    public static boolean a(long j) {
        return j < f4826a;
    }

    public static void a(com.google.android.finsky.api.b bVar) {
        f4826a = System.currentTimeMillis();
        Iterator<String> it = f4827b.iterator();
        while (it.hasNext()) {
            bVar.b(it.next());
        }
        f4827b.clear();
    }
}
