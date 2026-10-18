package com.google.android.wallet.common.util;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f7295a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            str = String.format("0%s", str);
            length++;
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) | Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + 0) * 2];
        for (int i = 0; i < length + 0; i++) {
            int i2 = bArr[i + 0] & 255;
            cArr[i * 2] = f7295a[i2 >> 4];
            cArr[(i * 2) + 1] = f7295a[i2 & 15];
        }
        return new String(cArr);
    }

    public static int a(byte b2) {
        return b2 & 255;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append((char) (b2 & 255));
        }
        return sb.toString();
    }
}
