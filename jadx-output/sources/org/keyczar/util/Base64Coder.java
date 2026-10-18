package org.keyczar.util;

import org.keyczar.exceptions.Base64DecodingException;
import org.keyczar.i18n.Messages;

/* loaded from: classes.dex */
public class Base64Coder {
    private static final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
    private static final byte[] DECODE = new byte[128];
    private static final char[] WHITESPACE = {'\t', '\n', '\r', ' ', '\f'};

    static {
        for (int i = 0; i < DECODE.length; i++) {
            DECODE[i] = -1;
        }
        for (int i2 = 0; i2 < WHITESPACE.length; i2++) {
            DECODE[WHITESPACE[i2]] = -2;
        }
        for (int i3 = 0; i3 < ALPHABET.length; i3++) {
            DECODE[ALPHABET[i3]] = (byte) i3;
        }
    }

    private Base64Coder() {
    }

    @Deprecated
    public static byte[] decode(String str) {
        return decodeWebSafe(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] decodeWebSafe(java.lang.String r10) {
        /*
            r2 = 61
            r3 = 0
            char[] r6 = r10.toCharArray()
            int r0 = r6.length
            int r1 = r0 + (-1)
            char r1 = r6[r1]
            if (r1 != r2) goto L10
            int r0 = r0 + (-1)
        L10:
            int r1 = r0 + (-1)
            char r1 = r6[r1]
            if (r1 != r2) goto L18
            int r0 = r0 + (-1)
        L18:
            int r4 = r6.length
            r2 = r3
            r1 = r3
        L1b:
            if (r2 >= r4) goto L2a
            char r5 = r6[r2]
            boolean r5 = isWhiteSpace(r5)
            if (r5 == 0) goto L27
            int r1 = r1 + 1
        L27:
            int r2 = r2 + 1
            goto L1b
        L2a:
            int r7 = r0 - r1
            int r0 = r7 / 4
            int r2 = r7 % 4
            int r0 = r0 * 3
            switch(r2) {
                case 1: goto L6d;
                case 2: goto L82;
                case 3: goto L85;
                default: goto L35;
            }
        L35:
            byte[] r8 = new byte[r0]
            r5 = r3
            r0 = r3
            r2 = r3
            r4 = r3
        L3b:
            int r9 = r7 + r1
            if (r5 >= r9) goto L88
            char r9 = r6[r5]
            boolean r9 = isWhiteSpace(r9)
            if (r9 != 0) goto L52
            int r4 = r4 << 6
            char r9 = r6[r5]
            byte r9 = getByte(r9)
            r4 = r4 | r9
            int r2 = r2 + 1
        L52:
            r9 = 4
            if (r2 != r9) goto L6a
            int r2 = r0 + 1
            int r9 = r4 >> 16
            byte r9 = (byte) r9
            r8[r0] = r9
            int r9 = r2 + 1
            int r0 = r4 >> 8
            byte r0 = (byte) r0
            r8[r2] = r0
            int r0 = r9 + 1
            byte r2 = (byte) r4
            r8[r9] = r2
            r2 = r3
            r4 = r3
        L6a:
            int r5 = r5 + 1
            goto L3b
        L6d:
            org.keyczar.exceptions.Base64DecodingException r0 = new org.keyczar.exceptions.Base64DecodingException
            java.lang.String r1 = "Base64Coder.IllegalLength"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r2[r3] = r4
            java.lang.String r1 = org.keyczar.i18n.Messages.getString(r1, r2)
            r0.<init>(r1)
            throw r0
        L82:
            int r0 = r0 + 1
            goto L35
        L85:
            int r0 = r0 + 2
            goto L35
        L88:
            switch(r2) {
                case 2: goto L8c;
                case 3: goto L92;
                default: goto L8b;
            }
        L8b:
            return r8
        L8c:
            int r1 = r4 >> 4
            byte r1 = (byte) r1
            r8[r0] = r1
            goto L8b
        L92:
            int r1 = r0 + 1
            int r2 = r4 >> 10
            byte r2 = (byte) r2
            r8[r0] = r2
            int r0 = r4 >> 2
            byte r0 = (byte) r0
            r8[r1] = r0
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.keyczar.util.Base64Coder.decodeWebSafe(java.lang.String):byte[]");
    }

    public static byte[] decodeMime(String str) {
        return decodeWebSafe(str.replace('+', '-').replace('/', '_'));
    }

    @Deprecated
    public static String encode(byte[] bArr) {
        return encodeWebSafe(bArr);
    }

    public static String encodeWebSafe(byte[] bArr) {
        int i = 0;
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i2 = length * 4;
        switch (length2) {
            case 1:
                i2 += 2;
                break;
            case 2:
                i2 += 3;
                break;
        }
        char[] cArr = new char[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i5] & 255) << 8) | ((bArr[i] & 255) << 16);
            i = i6 + 1;
            int i8 = i7 | (bArr[i6] & 255);
            int i9 = i3 + 1;
            cArr[i3] = ALPHABET[(i8 >> 18) & 63];
            int i10 = i9 + 1;
            cArr[i9] = ALPHABET[(i8 >> 12) & 63];
            int i11 = i10 + 1;
            cArr[i10] = ALPHABET[(i8 >> 6) & 63];
            i3 = i11 + 1;
            cArr[i11] = ALPHABET[i8 & 63];
        }
        if (length2 > 0) {
            int i12 = i + 1;
            int i13 = (bArr[i] & 255) << 16;
            if (length2 == 2) {
                i13 |= (bArr[i12] & 255) << 8;
            }
            int i14 = i3 + 1;
            cArr[i3] = ALPHABET[(i13 >> 18) & 63];
            int i15 = i14 + 1;
            cArr[i14] = ALPHABET[(i13 >> 12) & 63];
            if (length2 == 2) {
                cArr[i15] = ALPHABET[(i13 >> 6) & 63];
            }
        }
        return new String(cArr);
    }

    public static String encodeMime(byte[] bArr, boolean z) {
        String replace = encodeWebSafe(bArr).replace('-', '+').replace('_', '/');
        switch (replace.length() % 4) {
            case 0:
                return replace;
            case 1:
            default:
                throw new RuntimeException("Bug in Base64 encoder");
            case 2:
                return replace + "==";
            case 3:
                return replace + "=";
        }
    }

    private static byte getByte(int i) {
        if (i < 0 || i > 127 || DECODE[i] == -1) {
            throw new Base64DecodingException(Messages.getString("Base64Coder.IllegalCharacter", Integer.valueOf(i)));
        }
        return DECODE[i];
    }

    private static boolean isWhiteSpace(int i) {
        return DECODE[i] == -2;
    }
}
