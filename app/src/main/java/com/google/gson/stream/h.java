package com.google.gson.stream;

/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f7869a = new String[512];

    h() {
    }

    public final String a(char[] cArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 = (i3 * 31) + cArr[i4];
        }
        int i5 = ((i3 >>> 20) ^ (i3 >>> 12)) ^ i3;
        int length = (this.f7869a.length - 1) & (i5 ^ ((i5 >>> 7) ^ (i5 >>> 4)));
        String str = this.f7869a[length];
        if (str == null || str.length() != i2) {
            String str2 = new String(cArr, i, i2);
            this.f7869a[length] = str2;
            return str2;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            if (str.charAt(i6) != cArr[i + i6]) {
                String str3 = new String(cArr, i, i2);
                this.f7869a[length] = str3;
                return str3;
            }
        }
        return str;
    }
}
