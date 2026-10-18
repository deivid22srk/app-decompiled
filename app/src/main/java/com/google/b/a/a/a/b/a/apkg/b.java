package com.google.b.a.a.a.b.a.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7559a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f7560b = 0;
    public byte[] c = com.google.protobuf.nano.e.h;
    public String d = "";
    public c e = null;
    public String f = "";
    public f[] g = f.b();
    public int h = 0;
    public String i = "";
    public String[] j = com.google.protobuf.nano.e.f;
    public String[] k = com.google.protobuf.nano.e.f;
    public boolean l = false;
    public String m = "";
    public int[] n = com.google.protobuf.nano.e.f7878a;
    public int[] o = com.google.protobuf.nano.e.f7878a;
    public int p = 0;
    public boolean q = false;
    public String r = "";
    public int[] s = com.google.protobuf.nano.e.f7878a;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.j != null && this.j.length > 0) {
            for (int i = 0; i < this.j.length; i++) {
                String str = this.j[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(4, str);
                }
            }
        }
        if (this.l) {
            codedOutputByteBufferNano.a(5, this.l);
        }
        if (!this.f7559a.equals("")) {
            codedOutputByteBufferNano.a(6, this.f7559a);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(7, this.e);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i2 = 0; i2 < this.k.length; i2++) {
                String str2 = this.k[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(9, str2);
                }
            }
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.a(10, this.m);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.a(11, this.i);
        }
        if (this.n != null && this.n.length > 0) {
            for (int i3 = 0; i3 < this.n.length; i3++) {
                codedOutputByteBufferNano.a(12, this.n[i3]);
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(13, this.d);
        }
        if (this.o != null && this.o.length > 0) {
            for (int i4 = 0; i4 < this.o.length; i4++) {
                codedOutputByteBufferNano.a(14, this.o[i4]);
            }
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(15, this.f);
        }
        if (this.p != 0) {
            codedOutputByteBufferNano.a(20, this.p);
        }
        if (this.g != null && this.g.length > 0) {
            for (int i5 = 0; i5 < this.g.length; i5++) {
                f fVar = this.g[i5];
                if (fVar != null) {
                    codedOutputByteBufferNano.b(21, fVar);
                }
            }
        }
        if (this.f7560b != 0) {
            codedOutputByteBufferNano.a(25, this.f7560b);
        }
        if (!Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(26, this.c);
        }
        if (this.s != null && this.s.length > 0) {
            int i6 = 0;
            for (int i7 = 0; i7 < this.s.length; i7++) {
                i6 += CodedOutputByteBufferNano.b(this.s[i7]);
            }
            codedOutputByteBufferNano.d(242);
            codedOutputByteBufferNano.d(i6);
            for (int i8 = 0; i8 < this.s.length; i8++) {
                codedOutputByteBufferNano.d(this.s[i8]);
            }
        }
        if (this.h != 0) {
            codedOutputByteBufferNano.a(32, this.h);
        }
        if (this.q) {
            codedOutputByteBufferNano.a(34, this.q);
        }
        if (!this.r.equals("")) {
            codedOutputByteBufferNano.a(35, this.r);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.j == null || this.j.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.j.length; i4++) {
                String str = this.j[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.l) {
            i += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (!this.f7559a.equals("")) {
            i += CodedOutputByteBufferNano.b(6, this.f7559a);
        }
        if (this.e != null) {
            i += CodedOutputByteBufferNano.d(7, this.e);
        }
        if (this.k != null && this.k.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.k.length; i7++) {
                String str2 = this.k[i7];
                if (str2 != null) {
                    i6++;
                    i5 += CodedOutputByteBufferNano.a(str2);
                }
            }
            i = i + i5 + (i6 * 1);
        }
        if (!this.m.equals("")) {
            i += CodedOutputByteBufferNano.b(10, this.m);
        }
        if (!this.i.equals("")) {
            i += CodedOutputByteBufferNano.b(11, this.i);
        }
        if (this.n != null && this.n.length > 0) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.n.length; i9++) {
                i8 += CodedOutputByteBufferNano.b(this.n[i9]);
            }
            i = i + i8 + (this.n.length * 1);
        }
        if (!this.d.equals("")) {
            i += CodedOutputByteBufferNano.b(13, this.d);
        }
        if (this.o != null && this.o.length > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.o.length; i11++) {
                i10 += CodedOutputByteBufferNano.b(this.o[i11]);
            }
            i = i + i10 + (this.o.length * 1);
        }
        if (!this.f.equals("")) {
            i += CodedOutputByteBufferNano.b(15, this.f);
        }
        if (this.p != 0) {
            i += CodedOutputByteBufferNano.c(20, this.p);
        }
        if (this.g != null && this.g.length > 0) {
            int i12 = i;
            for (int i13 = 0; i13 < this.g.length; i13++) {
                f fVar = this.g[i13];
                if (fVar != null) {
                    i12 += CodedOutputByteBufferNano.d(21, fVar);
                }
            }
            i = i12;
        }
        if (this.f7560b != 0) {
            i += CodedOutputByteBufferNano.c(25, this.f7560b);
        }
        if (!Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            i += CodedOutputByteBufferNano.b(26, this.c);
        }
        if (this.s != null && this.s.length > 0) {
            int i14 = 0;
            for (int i15 = 0; i15 < this.s.length; i15++) {
                i14 += CodedOutputByteBufferNano.b(this.s[i15]);
            }
            i = i + i14 + 2 + CodedOutputByteBufferNano.e(i14);
        }
        if (this.h != 0) {
            i += CodedOutputByteBufferNano.c(32, this.h);
        }
        if (this.q) {
            i += CodedOutputByteBufferNano.c(34) + 1;
        }
        if (!this.r.equals("")) {
            return i + CodedOutputByteBufferNano.b(35, this.r);
        }
        return i;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        int i;
        int i2;
        int i3;
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.j == null ? 0 : this.j.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.j, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.j = strArr;
                    break;
                case 40:
                    this.l = aVar.b();
                    break;
                case 50:
                    this.f7559a = aVar.c();
                    break;
                case 58:
                    if (this.e == null) {
                        this.e = new c();
                    }
                    aVar.a(this.e);
                    break;
                case 74:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 74);
                    int length2 = this.k == null ? 0 : this.k.length;
                    String[] strArr2 = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.k, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr2[length2] = aVar.c();
                    this.k = strArr2;
                    break;
                case 82:
                    this.m = aVar.c();
                    break;
                case 90:
                    this.i = aVar.c();
                    break;
                case 96:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 96);
                    int[] iArr = new int[b4];
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < b4) {
                        if (i4 != 0) {
                            aVar.a();
                        }
                        int e = aVar.e();
                        switch (e) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                i3 = i5 + 1;
                                iArr[i5] = e;
                                break;
                            default:
                                i3 = i5;
                                break;
                        }
                        i4++;
                        i5 = i3;
                    }
                    if (i5 != 0) {
                        int length3 = this.n == null ? 0 : this.n.length;
                        if (length3 == 0 && i5 == iArr.length) {
                            this.n = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length3 + i5];
                            if (length3 != 0) {
                                System.arraycopy(this.n, 0, iArr2, 0, length3);
                            }
                            System.arraycopy(iArr, 0, iArr2, length3, i5);
                            this.n = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 98:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i6 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                i6++;
                                break;
                        }
                    }
                    if (i6 != 0) {
                        aVar.e(j);
                        int length4 = this.n == null ? 0 : this.n.length;
                        int[] iArr3 = new int[i6 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.n, 0, iArr3, 0, length4);
                        }
                        while (aVar.i() > 0) {
                            int e2 = aVar.e();
                            switch (e2) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                    iArr3[length4] = e2;
                                    length4++;
                                    break;
                            }
                        }
                        this.n = iArr3;
                    }
                    aVar.d(c);
                    break;
                case 106:
                    this.d = aVar.c();
                    break;
                case 112:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 112);
                    int[] iArr4 = new int[b5];
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < b5) {
                        if (i7 != 0) {
                            aVar.a();
                        }
                        int e3 = aVar.e();
                        switch (e3) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                i2 = i8 + 1;
                                iArr4[i8] = e3;
                                break;
                            default:
                                i2 = i8;
                                break;
                        }
                        i7++;
                        i8 = i2;
                    }
                    if (i8 != 0) {
                        int length5 = this.o == null ? 0 : this.o.length;
                        if (length5 == 0 && i8 == iArr4.length) {
                            this.o = iArr4;
                            break;
                        } else {
                            int[] iArr5 = new int[length5 + i8];
                            if (length5 != 0) {
                                System.arraycopy(this.o, 0, iArr5, 0, length5);
                            }
                            System.arraycopy(iArr4, 0, iArr5, length5, i8);
                            this.o = iArr5;
                            break;
                        }
                    } else {
                        break;
                    }
                case 114:
                    int c2 = aVar.c(aVar.e());
                    int j2 = aVar.j();
                    int i9 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                i9++;
                                break;
                        }
                    }
                    if (i9 != 0) {
                        aVar.e(j2);
                        int length6 = this.o == null ? 0 : this.o.length;
                        int[] iArr6 = new int[i9 + length6];
                        if (length6 != 0) {
                            System.arraycopy(this.o, 0, iArr6, 0, length6);
                        }
                        while (aVar.i() > 0) {
                            int e4 = aVar.e();
                            switch (e4) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                    iArr6[length6] = e4;
                                    length6++;
                                    break;
                            }
                        }
                        this.o = iArr6;
                    }
                    aVar.d(c2);
                    break;
                case 122:
                    this.f = aVar.c();
                    break;
                case 160:
                    int e5 = aVar.e();
                    switch (e5) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.p = e5;
                            break;
                    }
                case 170:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 170);
                    int length7 = this.g == null ? 0 : this.g.length;
                    f[] fVarArr = new f[b6 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.g, 0, fVarArr, 0, length7);
                    }
                    while (length7 < fVarArr.length - 1) {
                        fVarArr[length7] = new f();
                        aVar.a(fVarArr[length7]);
                        aVar.a();
                        length7++;
                    }
                    fVarArr[length7] = new f();
                    aVar.a(fVarArr[length7]);
                    this.g = fVarArr;
                    break;
                case 200:
                    this.f7560b = aVar.e();
                    break;
                case 210:
                    this.c = aVar.d();
                    break;
                case 240:
                    int b7 = com.google.protobuf.nano.e.b(aVar, 240);
                    int[] iArr7 = new int[b7];
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < b7) {
                        if (i10 != 0) {
                            aVar.a();
                        }
                        int e6 = aVar.e();
                        switch (e6) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                i = i11 + 1;
                                iArr7[i11] = e6;
                                break;
                            default:
                                i = i11;
                                break;
                        }
                        i10++;
                        i11 = i;
                    }
                    if (i11 != 0) {
                        int length8 = this.s == null ? 0 : this.s.length;
                        if (length8 == 0 && i11 == iArr7.length) {
                            this.s = iArr7;
                            break;
                        } else {
                            int[] iArr8 = new int[length8 + i11];
                            if (length8 != 0) {
                                System.arraycopy(this.s, 0, iArr8, 0, length8);
                            }
                            System.arraycopy(iArr7, 0, iArr8, length8, i11);
                            this.s = iArr8;
                            break;
                        }
                    } else {
                        break;
                    }
                case 242:
                    int c3 = aVar.c(aVar.e());
                    int j3 = aVar.j();
                    int i12 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                i12++;
                                break;
                        }
                    }
                    if (i12 != 0) {
                        aVar.e(j3);
                        int length9 = this.s == null ? 0 : this.s.length;
                        int[] iArr9 = new int[i12 + length9];
                        if (length9 != 0) {
                            System.arraycopy(this.s, 0, iArr9, 0, length9);
                        }
                        while (aVar.i() > 0) {
                            int e7 = aVar.e();
                            switch (e7) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    iArr9[length9] = e7;
                                    length9++;
                                    break;
                            }
                        }
                        this.s = iArr9;
                    }
                    aVar.d(c3);
                    break;
                case 256:
                    this.h = aVar.e();
                    break;
                case 272:
                    this.q = aVar.b();
                    break;
                case 282:
                    this.r = aVar.c();
                    break;
                default:
                    if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
