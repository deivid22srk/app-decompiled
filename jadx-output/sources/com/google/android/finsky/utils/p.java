package com.google.android.finsky.utils;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p {
    public static <T> List<T> a(T[] tArr) {
        return (tArr == null || tArr.length == 0) ? Collections.emptyList() : new q(tArr);
    }

    public static <T> T[] a(T[] tArr, int i) {
        if (i < 0 || i >= tArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), length));
        if (i != 0) {
            System.arraycopy(tArr, 0, tArr2, 0, i);
        }
        int i2 = length - i;
        if (i2 > 0) {
            System.arraycopy(tArr, i + 1, tArr2, i, i2);
        }
        return tArr2;
    }
}
