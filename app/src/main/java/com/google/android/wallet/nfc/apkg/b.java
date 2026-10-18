package com.google.android.wallet.nfc.apkg;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7356a = {"A0000000041010", "A00000000401", "A0000000042010", "A0000000042203", "A0000000043010", "A0000000044010", "A0000000045010", "A0000000043060", "A0000000050001", "A0000000101030", "A0000000031010", "A0000000032020", "A0000000032010", "A0000000033010", "A0000000034010", "A0000000035010", "A0000000038010", "A0000000039010", "A0000", "A000000025", "A00000006510"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7357b = {"315041592E5359532E4444463031", "325041592E5359532E4444463031"};

    public static c a(String str) {
        d dVar = new d((byte) -92);
        dVar.f7360b = (byte) 4;
        return dVar.a(com.google.android.wallet.common.util.d.a(str)).a((byte) 0).a();
    }

    public static c a(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length == 0) {
            bArr = com.google.android.wallet.common.util.d.a(z ? "830B0000000000000000000000" : "8300");
        }
        d dVar = new d((byte) -88);
        dVar.f7359a = Byte.MIN_VALUE;
        return dVar.a(bArr).a((byte) 0).a();
    }

    public static c a(byte b2, byte b3) {
        return a(b2, b3, (byte) 0);
    }

    public static c a(byte b2, byte b3, byte b4) {
        d dVar = new d((byte) -78);
        dVar.f7360b = b2;
        dVar.c = (byte) ((b3 << 3) | 4);
        return dVar.a(b4).a();
    }

    public static boolean a(f fVar, byte[] bArr) {
        if (((fVar.d >>> 4) & 15) != bArr[0]) {
            return false;
        }
        if (bArr.length >= 2 && (fVar.d & 15) != bArr[1]) {
            return false;
        }
        if (bArr.length < 3 || ((fVar.e >>> 4) & 15) == bArr[2]) {
            return bArr.length != 4 || (fVar.e & 15) == bArr[3];
        }
        return false;
    }
}
