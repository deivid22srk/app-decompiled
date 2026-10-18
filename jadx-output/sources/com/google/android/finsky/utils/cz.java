package com.google.android.finsky.utils;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class cz {
    public static <T> ArrayList<T> a(int i) {
        return new ArrayList<>(i);
    }

    public static <T> ArrayList<T> a(T... tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static <T> ArrayList<T> a(Collection<T> collection) {
        return new ArrayList<>(collection);
    }
}
