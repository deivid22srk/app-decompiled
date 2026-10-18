package com.google.android.play.search;

import android.content.Context;
import android.text.SpannableString;

/* loaded from: classes.dex */
public final class d extends aj {
    public d(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        r0 = r1 + 1;
        r7[r1] = new com.google.android.play.search.c(r6, r3, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.play.search.c[] a(java.lang.String r12) {
        /*
            r11 = 34
            r10 = 32
            r9 = 9
            r4 = 0
            int r5 = r12.length()
            char[] r6 = r12.toCharArray()
            com.google.android.play.search.c[] r7 = new com.google.android.play.search.c[r5]
            r1 = r4
            r3 = r4
        L13:
            if (r3 >= r5) goto L47
        L15:
            if (r3 >= r5) goto L26
            char r0 = r6[r3]
            if (r0 == r10) goto L23
            char r0 = r6[r3]
            if (r0 == r9) goto L23
            char r0 = r6[r3]
            if (r0 != r11) goto L26
        L23:
            int r3 = r3 + 1
            goto L15
        L26:
            r2 = r3
        L27:
            if (r2 >= r5) goto L39
            char r0 = r6[r2]
            if (r0 == r10) goto L39
            char r0 = r6[r2]
            if (r0 == r9) goto L39
            char r0 = r6[r2]
            if (r0 == r11) goto L39
            int r0 = r2 + 1
            r2 = r0
            goto L27
        L39:
            if (r3 == r2) goto L4d
            int r0 = r1 + 1
            com.google.android.play.search.c r8 = new com.google.android.play.search.c
            r8.<init>(r6, r3, r2)
            r7[r1] = r8
        L44:
            r1 = r0
            r3 = r2
            goto L13
        L47:
            com.google.android.play.search.c[] r0 = new com.google.android.play.search.c[r1]
            java.lang.System.arraycopy(r7, r4, r0, r4, r1)
            return r0
        L4d:
            r0 = r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.search.d.a(java.lang.String):com.google.android.play.search.c[]");
    }

    @Override // com.google.android.play.search.aj
    protected final /* synthetic */ CharSequence a(String str, String str2, int i, int i2) {
        boolean z;
        int i3;
        c[] a2 = a(str.toLowerCase());
        c[] a3 = a(str2);
        a aVar = new a(a2, a3);
        c[] cVarArr = aVar.f7021a;
        c[] cVarArr2 = aVar.f7022b;
        int length = cVarArr.length;
        int length2 = cVarArr2.length;
        int[][] iArr = aVar.d;
        int[][] iArr2 = aVar.c;
        for (int i4 = 1; i4 <= length; i4++) {
            c cVar = cVarArr[i4 - 1];
            for (int i5 = 1; i5 <= length2; i5++) {
                c cVar2 = cVarArr2[i5 - 1];
                int length3 = cVar.length();
                if (length3 <= cVar2.length()) {
                    int i6 = cVar.f7037b;
                    int i7 = cVar2.f7037b;
                    char[] cArr = cVar.f7036a;
                    char[] cArr2 = cVar2.f7036a;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length3) {
                            if (Character.toLowerCase(cArr[i6 + i8]) == Character.toLowerCase(cArr2[i7 + i8])) {
                                i8++;
                            } else {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                }
                int i9 = z ? 0 : 1;
                int i10 = iArr[i4 - 1][i5] + 1;
                int i11 = 0;
                int i12 = iArr[i4][i5 - 1];
                if (i12 + 1 < i10) {
                    i10 = i12 + 1;
                    i11 = 1;
                }
                int i13 = iArr[i4 - 1][i5 - 1];
                if (i13 + i9 < i10) {
                    i10 = i13 + i9;
                    i3 = i9 == 0 ? 3 : 2;
                } else {
                    i3 = i11;
                }
                iArr[i4][i5] = i10;
                iArr2[i4][i5] = i3;
            }
        }
        int length4 = a3.length;
        int[] iArr3 = new int[length4];
        int length5 = aVar.f7022b.length;
        b[] bVarArr = new b[length5];
        int length6 = aVar.f7021a.length;
        int[][] iArr4 = aVar.c;
        while (length5 > 0) {
            int i14 = iArr4[length6][length5];
            switch (i14) {
                case 0:
                    length6--;
                    break;
                case 1:
                    length5--;
                    bVarArr[length5] = new b(i14, length6);
                    break;
                case 2:
                case 3:
                    length5--;
                    length6--;
                    bVarArr[length5] = new b(i14, length6);
                    break;
            }
        }
        for (int i15 = 0; i15 < length4; i15++) {
            if (bVarArr[i15].f7034a == 3) {
                iArr3[i15] = bVarArr[i15].f7035b;
            } else {
                iArr3[i15] = -1;
            }
        }
        SpannableString spannableString = new SpannableString(str2);
        int length7 = iArr3.length;
        for (int i16 = 0; i16 < length7; i16++) {
            c cVar3 = a3[i16];
            int i17 = 0;
            int i18 = iArr3[i16];
            if (i18 >= 0) {
                i17 = a2[i18].length();
            }
            a(i2, spannableString, cVar3.f7037b + i17, cVar3.c);
            a(i, spannableString, cVar3.f7037b, i17 + cVar3.f7037b);
        }
        return spannableString;
    }
}
