package com.google.android.wallet.nfc.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {
    public static h a(f fVar) {
        if (fVar.c.length == 0) {
            return null;
        }
        return b(fVar.c, 0).get(0);
    }

    private static List<h> b(byte[] bArr, int i) {
        int a2;
        if (i >= bArr.length) {
            return new LinkedList();
        }
        byte b2 = bArr[i];
        boolean z = (b2 & 32) != 0;
        int i2 = ((b2 + 1) & 31) == 0 ? i + 2 : i + 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        byte b3 = bArr[i2];
        int i3 = i2 + 1;
        if (b3 == -127) {
            i3 = i2 + 2;
        } else if (b3 == -126) {
            i3 = i2 + 3;
        }
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, i3);
        if (copyOfRange2.length == 1) {
            a2 = com.google.android.wallet.common.util.d.a(copyOfRange2[0]);
        } else if (copyOfRange2.length == 2) {
            a2 = com.google.android.wallet.common.util.d.a(copyOfRange2[1]);
        } else {
            a2 = com.google.android.wallet.common.util.d.a(copyOfRange2[2]) | (com.google.android.wallet.common.util.d.a(copyOfRange2[1]) << 8);
        }
        byte[] copyOfRange3 = Arrays.copyOfRange(bArr, i3, i3 + a2);
        List<h> b4 = b(bArr, a2 + i3);
        b4.add(0, new h(copyOfRange, copyOfRange3, z ? b(copyOfRange3, 0) : new ArrayList()));
        return b4;
    }

    static List<g> a(byte[] bArr, int i) {
        if (i >= bArr.length) {
            return new LinkedList();
        }
        int i2 = ((bArr[i] + 1) & 31) == 0 ? i + 2 : i + 1;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        byte b2 = bArr[i2];
        List<g> a2 = a(bArr, i2 + 1);
        a2.add(0, new g(copyOfRange, b2));
        return a2;
    }
}
