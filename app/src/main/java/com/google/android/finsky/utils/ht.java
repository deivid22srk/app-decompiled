package com.google.android.finsky.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ht {
    public static <T> Set<T> a(T... tArr) {
        HashSet hashSet = new HashSet(tArr.length);
        for (T t : tArr) {
            hashSet.add(t);
        }
        return hashSet;
    }

    public static <T> HashSet<T> a(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
