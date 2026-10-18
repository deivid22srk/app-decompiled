package com.google.android.wallet.common.a;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f7247a = {'S', 'C', 'N', 'O', '1', '2', '3', 'D', 'Z', 'X', 'A', 'U', 'F', 'P', 'T', 'B', 'R'};

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet<Character> f7248b = new HashSet<>(f7247a.length);

    static {
        for (char c : f7247a) {
            f7248b.add(Character.valueOf(c));
        }
    }

    public static boolean a(char c) {
        return f7248b.contains(Character.valueOf(c));
    }

    public static char[] a() {
        return Arrays.copyOf(f7247a, f7247a.length);
    }

    public static int b() {
        return f7247a.length;
    }
}
