package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class bh extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public bj f3628a = null;

    /* renamed from: b, reason: collision with root package name */
    public bj[] f3629b = bj.b();
    public bi[] c = bi.b();
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public String[] h = com.google.protobuf.nano.e.f;
    public String[] i = com.google.protobuf.nano.e.f;
    public int[] j = com.google.protobuf.nano.e.f7878a;
    public io[] k = io.b();

    public bh() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3628a != null) {
            codedOutputByteBufferNano.b(3, this.f3628a);
        }
        if (this.f3629b != null && this.f3629b.length > 0) {
            for (int i = 0; i < this.f3629b.length; i++) {
                bj bjVar = this.f3629b[i];
                if (bjVar != null) {
                    codedOutputByteBufferNano.b(4, bjVar);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i2 = 0; i2 < this.c.length; i2++) {
                bi biVar = this.c[i2];
                if (biVar != null) {
                    codedOutputByteBufferNano.a(5, biVar);
                }
            }
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(10, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(11, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i3 = 0; i3 < this.h.length; i3++) {
                String str = this.h[i3];
                if (str != null) {
                    codedOutputByteBufferNano.a(20, str);
                }
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (int i4 = 0; i4 < this.j.length; i4++) {
                codedOutputByteBufferNano.a(31, this.j[i4]);
            }
        }
        if (this.i != null && this.i.length > 0) {
            for (int i5 = 0; i5 < this.i.length; i5++) {
                String str2 = this.i[i5];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(36, str2);
                }
            }
        }
        if (this.k != null && this.k.length > 0) {
            for (int i6 = 0; i6 < this.k.length; i6++) {
                io ioVar = this.k[i6];
                if (ioVar != null) {
                    codedOutputByteBufferNano.b(44, ioVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3628a != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.f3628a);
        }
        if (this.f3629b != null && this.f3629b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f3629b.length; i2++) {
                bj bjVar = this.f3629b[i2];
                if (bjVar != null) {
                    i += CodedOutputByteBufferNano.d(4, bjVar);
                }
            }
            a2 = i;
        }
        if (this.c != null && this.c.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.c.length; i4++) {
                bi biVar = this.c[i4];
                if (biVar != null) {
                    i3 += CodedOutputByteBufferNano.c(5, biVar);
                }
            }
            a2 = i3;
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.h.length; i7++) {
                String str = this.h[i7];
                if (str != null) {
                    i6++;
                    i5 += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i5 + (i6 * 2);
        }
        if (this.j != null && this.j.length > 0) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.j.length; i9++) {
                i8 += CodedOutputByteBufferNano.b(this.j[i9]);
            }
            a2 = a2 + i8 + (this.j.length * 2);
        }
        if (this.i != null && this.i.length > 0) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < this.i.length; i12++) {
                String str2 = this.i[i12];
                if (str2 != null) {
                    i11++;
                    i10 += CodedOutputByteBufferNano.a(str2);
                }
            }
            a2 = a2 + i10 + (i11 * 2);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i13 = 0; i13 < this.k.length; i13++) {
                io ioVar = this.k[i13];
                if (ioVar != null) {
                    a2 += CodedOutputByteBufferNano.d(44, ioVar);
                }
            }
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        int i;
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 26:
                    if (this.f3628a == null) {
                        this.f3628a = new bj();
                    }
                    aVar.a(this.f3628a);
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.f3629b == null ? 0 : this.f3629b.length;
                    bj[] bjVarArr = new bj[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3629b, 0, bjVarArr, 0, length);
                    }
                    while (length < bjVarArr.length - 1) {
                        bjVarArr[length] = new bj();
                        aVar.a(bjVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bjVarArr[length] = new bj();
                    aVar.a(bjVarArr[length]);
                    this.f3629b = bjVarArr;
                    break;
                case 43:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 43);
                    int length2 = this.c == null ? 0 : this.c.length;
                    bi[] biVarArr = new bi[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, biVarArr, 0, length2);
                    }
                    while (length2 < biVarArr.length - 1) {
                        biVarArr[length2] = new bi();
                        aVar.a(biVarArr[length2], 5);
                        aVar.a();
                        length2++;
                    }
                    biVarArr[length2] = new bi();
                    aVar.a(biVarArr[length2], 5);
                    this.c = biVarArr;
                    break;
                case 82:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 90:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 162:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 162);
                    int length3 = this.h == null ? 0 : this.h.length;
                    String[] strArr = new String[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.h, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = aVar.c();
                        aVar.a();
                        length3++;
                    }
                    strArr[length3] = aVar.c();
                    this.h = strArr;
                    break;
                case 248:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 248);
                    int[] iArr = new int[b5];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b5) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int e = aVar.e();
                        switch (e) {
                            case 0:
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
                            case 13:
                            case 100:
                                i = i3 + 1;
                                iArr[i3] = e;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length4 = this.j == null ? 0 : this.j.length;
                        if (length4 == 0 && i3 == iArr.length) {
                            this.j = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length4 + i3];
                            if (length4 != 0) {
                                System.arraycopy(this.j, 0, iArr2, 0, length4);
                            }
                            System.arraycopy(iArr, 0, iArr2, length4, i3);
                            this.j = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 250:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 0:
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
                            case 13:
                            case 100:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length5 = this.j == null ? 0 : this.j.length;
                        int[] iArr3 = new int[i4 + length5];
                        if (length5 != 0) {
                            System.arraycopy(this.j, 0, iArr3, 0, length5);
                        }
                        while (aVar.i() > 0) {
                            int e2 = aVar.e();
                            switch (e2) {
                                case 0:
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
                                case 13:
                                case 100:
                                    iArr3[length5] = e2;
                                    length5++;
                                    break;
                            }
                        }
                        this.j = iArr3;
                    }
                    aVar.d(c);
                    break;
                case 290:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 290);
                    int length6 = this.i == null ? 0 : this.i.length;
                    String[] strArr2 = new String[b6 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.i, 0, strArr2, 0, length6);
                    }
                    while (length6 < strArr2.length - 1) {
                        strArr2[length6] = aVar.c();
                        aVar.a();
                        length6++;
                    }
                    strArr2[length6] = aVar.c();
                    this.i = strArr2;
                    break;
                case 354:
                    int b7 = com.google.protobuf.nano.e.b(aVar, 354);
                    int length7 = this.k == null ? 0 : this.k.length;
                    io[] ioVarArr = new io[b7 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.k, 0, ioVarArr, 0, length7);
                    }
                    while (length7 < ioVarArr.length - 1) {
                        ioVarArr[length7] = new io();
                        aVar.a(ioVarArr[length7]);
                        aVar.a();
                        length7++;
                    }
                    ioVarArr[length7] = new io();
                    aVar.a(ioVarArr[length7]);
                    this.k = ioVarArr;
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
