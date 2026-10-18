package com.google.android.wallet.nfc.apkg;

import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {
    public static final SparseIntArray x;
    public static final Pattern t = Pattern.compile("/");
    public static final Pattern u = Pattern.compile("^(?:[A-Z])(\\d{1,19})\\^([^\\^]{2,26})\\^(\\d{4}|\\^)(?:[0-9]{3}|\\^)(?:\\S*)$");
    public static final Pattern v = Pattern.compile("^(\\d{1,19})D(\\d{4}|=)(?:[0-9]{3}|=)(?:\\S*)F$");
    public static final Pattern w = Pattern.compile("^(\\d{1,19})D(\\d{4}|=)(?:[0-9]{3}|=)(?:\\S*)(?:[F]?)$");

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7368a = {111};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f7369b = {-124};
    public static final byte[] c = {-91};
    public static final byte[] d = {80};
    public static final byte[] e = {79};
    public static final byte[] f = {-97, 56};
    public static final byte[] g = {-120};
    public static final byte[] h = {-126};
    public static final byte[] i = {-108};
    public static final byte[] j = {119};
    public static final byte[] k = {Byte.MIN_VALUE};
    public static final byte[] l = {112};
    public static final byte[] m = {86};
    public static final byte[] n = {87};
    public static final byte[] o = {-97, 107};
    public static final byte[] p = {90};
    public static final byte[] q = {95, 32};
    public static final byte[] r = {95, 36};
    public static final byte[] s = {-97, 11};

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(19);
        x = sparseIntArray;
        sparseIntArray.append(a(f7368a), 1);
        x.append(a(f7369b), 1);
        x.append(a(c), 1);
        x.append(a(d), 2);
        x.append(a(e), 1);
        x.append(a(f), 1);
        x.append(a(g), 1);
        x.append(a(h), 1);
        x.append(a(i), 1);
        x.append(a(j), 1);
        x.append(a(k), 1);
        x.append(a(l), 1);
        x.append(a(m), 2);
        x.append(a(n), 1);
        x.append(a(o), 1);
        x.append(a(p), 3);
        x.append(a(q), 2);
        x.append(a(r), 3);
        x.append(a(s), 2);
    }

    public static int a(byte[] bArr) {
        int i2 = 0;
        for (byte b2 : bArr) {
            i2 = (i2 << 8) | b2;
        }
        return (bArr.length << 16) | i2;
    }

    public static String a(h hVar) {
        if (hVar == null) {
            return null;
        }
        switch (x.get(a(hVar.f7366a), 1)) {
            case 2:
                return com.google.android.wallet.common.util.d.b(hVar.f7367b);
            default:
                return com.google.android.wallet.common.util.d.a(hVar.f7367b);
        }
    }

    public static byte[] b(h hVar) {
        if (hVar == null) {
            return new byte[0];
        }
        List<g> a2 = com.google.android.wallet.nfc.apkg.i.a(hVar.f7367b, 0);
        int size = a2.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += com.google.android.wallet.common.util.d.a(a2.get(i3).f7365b);
        }
        byte[] bArr = new byte[i2 + 2];
        bArr[0] = -125;
        bArr[1] = (byte) i2;
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4 + 2] = 0;
        }
        return bArr;
    }

    public static byte[] a(f fVar) {
        h a2 = com.google.android.wallet.nfc.apkg.i.a(fVar);
        if (a2 == null) {
            return new byte[0];
        }
        if (Arrays.equals(a2.f7366a, j)) {
            h a3 = a(a2, i);
            return a3 == null ? new byte[0] : a3.f7367b;
        }
        if (Arrays.equals(a2.f7366a, k)) {
            return a2.f7367b.length < 2 ? new byte[0] : Arrays.copyOfRange(a2.f7367b, 2, a2.f7367b.length);
        }
        return new byte[0];
    }

    public static h a(h hVar, byte[] bArr) {
        if (!Arrays.equals(hVar.f7366a, bArr)) {
            int size = hVar.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                h a2 = a(hVar.c.get(i2), bArr);
                if (a2 != null) {
                    return a2;
                }
            }
            return null;
        }
        return hVar;
    }

    public static com.google.android.wallet.nfc.a c(h hVar) {
        int i2;
        int i3;
        String str;
        if (!Arrays.equals(hVar.f7366a, l)) {
            return null;
        }
        String str2 = "";
        String str3 = "";
        h a2 = a(hVar, p);
        if (a2 != null) {
            str2 = a(a2);
        }
        h a3 = a(hVar, q);
        if (a3 != null) {
            str3 = a(a(a3));
        }
        h a4 = a(hVar, s);
        if (a4 != null) {
            str3 = a(a(a4));
        }
        h a5 = a(hVar, r);
        if (a5 != null) {
            String a6 = a(a5);
            i3 = Integer.parseInt(a6.substring(2, 4));
            i2 = Integer.parseInt(a6.substring(0, 2));
        } else {
            i2 = 0;
            i3 = 0;
        }
        h a7 = a(hVar, m);
        if (a7 != null) {
            Matcher matcher = u.matcher(a(a7));
            if (matcher.find()) {
                str2 = matcher.group(1);
                str3 = a(matcher.group(2));
                String group = matcher.group(3);
                i3 = Integer.parseInt(group.substring(2, 4));
                i2 = Integer.parseInt(group.substring(0, 2));
            }
        }
        h a8 = a(hVar, o);
        if (a8 != null) {
            Matcher matcher2 = v.matcher(a(a8));
            if (matcher2.find()) {
                str2 = matcher2.group(1);
                String group2 = matcher2.group(2);
                i3 = Integer.parseInt(group2.substring(2, 4));
                i2 = Integer.parseInt(group2.substring(0, 2));
            }
        }
        h a9 = a(hVar, n);
        if (a9 != null) {
            Matcher matcher3 = w.matcher(a(a9));
            if (matcher3.find()) {
                String group3 = matcher3.group(1);
                String group4 = matcher3.group(2);
                i3 = Integer.parseInt(group4.substring(2, 4));
                i2 = Integer.parseInt(group4.substring(0, 2));
                str = group3;
                if (str3 == null || str != null || (i3 > 0 && i2 > 0)) {
                    return new com.google.android.wallet.nfc.a(str, i3, i2, str3);
                }
                return null;
            }
        }
        str = str2;
        if (str3 == null) {
        }
        return new com.google.android.wallet.nfc.a(str, i3, i2, str3);
    }

    public static String a(String str) {
        String replaceAll = t.matcher(str).replaceAll("");
        return TextUtils.getTrimmedLength(replaceAll) == 0 ? "" : replaceAll;
    }
}
