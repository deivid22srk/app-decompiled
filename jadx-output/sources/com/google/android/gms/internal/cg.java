package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import org.keyczar.Keyczar;

@gw
/* loaded from: classes.dex */
public final class cg {
    public static int a(String str) {
        byte[] bytes;
        int i;
        int i2 = 0;
        try {
            bytes = str.getBytes(Keyczar.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i3 = (length & (-4)) + 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = ((bytes[i4] & 255) | ((bytes[i4 + 1] & 255) << 8) | ((bytes[i4 + 2] & 255) << 16) | (bytes[i4 + 3] << 24)) * (-862048943);
            int i7 = i5 ^ (((i6 >>> 17) | (i6 << 15)) * 461845907);
            i4 += 4;
            i5 = (-430675100) + (((i7 >>> 19) | (i7 << 13)) * 5);
        }
        switch (length & 3) {
            case 3:
                i2 = (bytes[i3 + 2] & 255) << 16;
            case 2:
                i2 |= (bytes[i3 + 1] & 255) << 8;
            case 1:
                int i8 = ((bytes[i3] & 255) | i2) * (-862048943);
                i = (((i8 >>> 17) | (i8 << 15)) * 461845907) ^ i5;
                break;
            default:
                i = i5;
                break;
        }
        int i9 = i ^ length;
        int i10 = (i9 ^ (i9 >>> 16)) * (-2048144789);
        int i11 = (i10 ^ (i10 >>> 13)) * (-1028477387);
        return i11 ^ (i11 >>> 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (((r9 >= 65382 && r9 <= 65437) || (r9 >= 65441 && r9 <= 65500)) != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] b(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cg.b(java.lang.String):java.lang.String[]");
    }
}
