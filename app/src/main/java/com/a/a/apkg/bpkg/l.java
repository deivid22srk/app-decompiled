package com.a.a.apkg.bpkg;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f963a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f964b = new String[64];
    public static final String[] c = new String[256];

    l() {
    }

    public static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String format = b2 < f963a.length ? f963a[b2] : String.format("0x%02x", Byte.valueOf(b2));
        if (b3 != 0) {
            switch (b2) {
                case 2:
                case 3:
                case 7:
                case 8:
                    str = c[b3];
                    break;
                case 4:
                case 6:
                    if (b3 != 1) {
                        str = c[b3];
                        break;
                    } else {
                        str = "ACK";
                        break;
                    }
                case 5:
                default:
                    str = b3 < f964b.length ? f964b[b3] : c[b3];
                    if (b2 == 5 && (b3 & 4) != 0) {
                        str = str.replace("HEADERS", "PUSH_PROMISE");
                        break;
                    } else if (b2 == 0 && (b3 & 32) != 0) {
                        str = str.replace("PRIORITY", "COMPRESSED");
                        break;
                    }
                    break;
            }
        } else {
            str = "";
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = format;
        objArr[4] = str;
        return String.format("%s 0x%08x %5d %-13s %s", objArr);
    }

    static {
        for (int i = 0; i < c.length; i++) {
            c[i] = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f964b[0] = "";
        f964b[1] = "END_STREAM";
        int[] iArr = {1};
        f964b[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            f964b[i3 | 8] = f964b[i3] + "|PADDED";
        }
        f964b[4] = "END_HEADERS";
        f964b[32] = "PRIORITY";
        f964b[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                f964b[i7 | i5] = f964b[i7] + '|' + f964b[i5];
                f964b[i7 | i5 | 8] = f964b[i7] + '|' + f964b[i5] + "|PADDED";
            }
        }
        for (int i8 = 0; i8 < f964b.length; i8++) {
            if (f964b[i8] == null) {
                f964b[i8] = c[i8];
            }
        }
    }
}
