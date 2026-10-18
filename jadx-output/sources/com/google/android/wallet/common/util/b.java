package com.google.android.wallet.common.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class b {
    public static boolean a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static <T> T[] a(T[] tArr, T t) {
        T[] tArr2;
        if (tArr == null && t == null) {
            throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
        }
        if (tArr == null) {
            tArr2 = (T[]) ((Object[]) Array.newInstance(t.getClass(), 1));
        } else {
            tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        }
        tArr2[tArr2.length - 1] = t;
        return tArr2;
    }

    public static Integer[] a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static char[] a(List<Character> list) {
        int size = list.size();
        char[] cArr = new char[size];
        for (int i = 0; i < size; i++) {
            cArr[i] = list.get(i).charValue();
        }
        return cArr;
    }
}
