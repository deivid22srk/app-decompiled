package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sr extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public sq[] f4398a = sq.b();

    /* renamed from: b, reason: collision with root package name */
    public String f4399b = "";
    public boolean c = false;
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public long h = 0;
    public boolean i = false;
    public long j = 0;
    public boolean k = false;
    public String[] l = com.google.protobuf.nano.e.f;
    public pz[] m = pz.b();
    public ss[] n = ss.b();
    public String[] o = com.google.protobuf.nano.e.f;
    public String[] p = com.google.protobuf.nano.e.f;

    public sr() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4398a != null && this.f4398a.length > 0) {
            for (int i = 0; i < this.f4398a.length; i++) {
                sq sqVar = this.f4398a[i];
                if (sqVar != null) {
                    codedOutputByteBufferNano.b(1, sqVar);
                }
            }
        }
        if (this.c || !this.f4399b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4399b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || this.h != 0) {
            codedOutputByteBufferNano.b(5, this.h);
        }
        if (this.k || this.j != 0) {
            codedOutputByteBufferNano.b(6, this.j);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i2 = 0; i2 < this.l.length; i2++) {
                String str = this.l[i2];
                if (str != null) {
                    codedOutputByteBufferNano.a(7, str);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            for (int i3 = 0; i3 < this.m.length; i3++) {
                pz pzVar = this.m[i3];
                if (pzVar != null) {
                    codedOutputByteBufferNano.b(8, pzVar);
                }
            }
        }
        if (this.n != null && this.n.length > 0) {
            for (int i4 = 0; i4 < this.n.length; i4++) {
                ss ssVar = this.n[i4];
                if (ssVar != null) {
                    codedOutputByteBufferNano.b(9, ssVar);
                }
            }
        }
        if (this.o != null && this.o.length > 0) {
            for (int i5 = 0; i5 < this.o.length; i5++) {
                String str2 = this.o[i5];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(10, str2);
                }
            }
        }
        if (this.p != null && this.p.length > 0) {
            for (int i6 = 0; i6 < this.p.length; i6++) {
                String str3 = this.p[i6];
                if (str3 != null) {
                    codedOutputByteBufferNano.a(11, str3);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4398a != null && this.f4398a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4398a.length; i2++) {
                sq sqVar = this.f4398a[i2];
                if (sqVar != null) {
                    i += CodedOutputByteBufferNano.d(1, sqVar);
                }
            }
            a2 = i;
        }
        if (this.c || !this.f4399b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4399b);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.i || this.h != 0) {
            a2 += CodedOutputByteBufferNano.e(5, this.h);
        }
        if (this.k || this.j != 0) {
            a2 += CodedOutputByteBufferNano.e(6, this.j);
        }
        if (this.l != null && this.l.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.l.length; i5++) {
                String str = this.l[i5];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i3 + (i4 * 1);
        }
        if (this.m != null && this.m.length > 0) {
            int i6 = a2;
            for (int i7 = 0; i7 < this.m.length; i7++) {
                pz pzVar = this.m[i7];
                if (pzVar != null) {
                    i6 += CodedOutputByteBufferNano.d(8, pzVar);
                }
            }
            a2 = i6;
        }
        if (this.n != null && this.n.length > 0) {
            int i8 = a2;
            for (int i9 = 0; i9 < this.n.length; i9++) {
                ss ssVar = this.n[i9];
                if (ssVar != null) {
                    i8 += CodedOutputByteBufferNano.d(9, ssVar);
                }
            }
            a2 = i8;
        }
        if (this.o != null && this.o.length > 0) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < this.o.length; i12++) {
                String str2 = this.o[i12];
                if (str2 != null) {
                    i11++;
                    i10 += CodedOutputByteBufferNano.a(str2);
                }
            }
            a2 = a2 + i10 + (i11 * 1);
        }
        if (this.p != null && this.p.length > 0) {
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < this.p.length; i15++) {
                String str3 = this.p[i15];
                if (str3 != null) {
                    i14++;
                    i13 += CodedOutputByteBufferNano.a(str3);
                }
            }
            return a2 + i13 + (i14 * 1);
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f4398a == null ? 0 : this.f4398a.length;
                    sq[] sqVarArr = new sq[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4398a, 0, sqVarArr, 0, length);
                    }
                    while (length < sqVarArr.length - 1) {
                        sqVarArr[length] = new sq();
                        aVar.a(sqVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    sqVarArr[length] = new sq();
                    aVar.a(sqVarArr[length]);
                    this.f4398a = sqVarArr;
                    break;
                case 18:
                    this.f4399b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 40:
                    this.h = aVar.f();
                    this.i = true;
                    break;
                case 48:
                    this.j = aVar.f();
                    this.k = true;
                    break;
                case 58:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length2 = this.l == null ? 0 : this.l.length;
                    String[] strArr = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.l, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr[length2] = aVar.c();
                    this.l = strArr;
                    break;
                case 66:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 66);
                    int length3 = this.m == null ? 0 : this.m.length;
                    pz[] pzVarArr = new pz[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.m, 0, pzVarArr, 0, length3);
                    }
                    while (length3 < pzVarArr.length - 1) {
                        pzVarArr[length3] = new pz();
                        aVar.a(pzVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    pzVarArr[length3] = new pz();
                    aVar.a(pzVarArr[length3]);
                    this.m = pzVarArr;
                    break;
                case 74:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 74);
                    int length4 = this.n == null ? 0 : this.n.length;
                    ss[] ssVarArr = new ss[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.n, 0, ssVarArr, 0, length4);
                    }
                    while (length4 < ssVarArr.length - 1) {
                        ssVarArr[length4] = new ss();
                        aVar.a(ssVarArr[length4]);
                        aVar.a();
                        length4++;
                    }
                    ssVarArr[length4] = new ss();
                    aVar.a(ssVarArr[length4]);
                    this.n = ssVarArr;
                    break;
                case 82:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 82);
                    int length5 = this.o == null ? 0 : this.o.length;
                    String[] strArr2 = new String[b6 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.o, 0, strArr2, 0, length5);
                    }
                    while (length5 < strArr2.length - 1) {
                        strArr2[length5] = aVar.c();
                        aVar.a();
                        length5++;
                    }
                    strArr2[length5] = aVar.c();
                    this.o = strArr2;
                    break;
                case 90:
                    int b7 = com.google.protobuf.nano.e.b(aVar, 90);
                    int length6 = this.p == null ? 0 : this.p.length;
                    String[] strArr3 = new String[b7 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.p, 0, strArr3, 0, length6);
                    }
                    while (length6 < strArr3.length - 1) {
                        strArr3[length6] = aVar.c();
                        aVar.a();
                        length6++;
                    }
                    strArr3[length6] = aVar.c();
                    this.p = strArr3;
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
