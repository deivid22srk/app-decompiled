package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class bi extends com.google.protobuf.nano.c {
    private static volatile bi[] u;

    /* renamed from: a, reason: collision with root package name */
    public String f3630a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3631b = false;
    public String c = "";
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public String[] g = com.google.protobuf.nano.e.f;
    public boolean h = false;
    public boolean i = false;
    public bj j = null;
    public bj[] k = bj.b();
    public bj[] l = bj.b();
    public bj m = null;
    public String[] n = com.google.protobuf.nano.e.f;
    public String[] o = com.google.protobuf.nano.e.f;
    public String p = "";
    public boolean q = false;
    public io r = null;
    public String s = "";
    public boolean t = false;

    public static bi[] b() {
        if (u == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (u == null) {
                    u = new bi[0];
                }
            }
        }
        return u;
    }

    public bi() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3631b || !this.f3630a.equals("")) {
            codedOutputByteBufferNano.a(6, this.f3630a);
        }
        if (this.q || !this.p.equals("")) {
            codedOutputByteBufferNano.a(7, this.p);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(15, this.c);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i = 0; i < this.k.length; i++) {
                bj bjVar = this.k[i];
                if (bjVar != null) {
                    codedOutputByteBufferNano.b(16, bjVar);
                }
            }
        }
        if (this.l != null && this.l.length > 0) {
            for (int i2 = 0; i2 < this.l.length; i2++) {
                bj bjVar2 = this.l[i2];
                if (bjVar2 != null) {
                    codedOutputByteBufferNano.b(17, bjVar2);
                }
            }
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(18, this.m);
        }
        if (this.n != null && this.n.length > 0) {
            for (int i3 = 0; i3 < this.n.length; i3++) {
                String str = this.n[i3];
                if (str != null) {
                    codedOutputByteBufferNano.a(19, str);
                }
            }
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(29, this.e);
        }
        if (this.i || this.h) {
            codedOutputByteBufferNano.a(32, this.h);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(33, this.j);
        }
        if (this.o != null && this.o.length > 0) {
            for (int i4 = 0; i4 < this.o.length; i4++) {
                String str2 = this.o[i4];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(35, str2);
                }
            }
        }
        if (this.r != null) {
            codedOutputByteBufferNano.b(43, this.r);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(45, this.s);
        }
        if (this.g != null && this.g.length > 0) {
            for (int i5 = 0; i5 < this.g.length; i5++) {
                String str3 = this.g[i5];
                if (str3 != null) {
                    codedOutputByteBufferNano.a(48, str3);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3631b || !this.f3630a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.f3630a);
        }
        if (this.q || !this.p.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.p);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(15, this.c);
        }
        if (this.k != null && this.k.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.k.length; i2++) {
                bj bjVar = this.k[i2];
                if (bjVar != null) {
                    i += CodedOutputByteBufferNano.d(16, bjVar);
                }
            }
            a2 = i;
        }
        if (this.l != null && this.l.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.l.length; i4++) {
                bj bjVar2 = this.l[i4];
                if (bjVar2 != null) {
                    i3 += CodedOutputByteBufferNano.d(17, bjVar2);
                }
            }
            a2 = i3;
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(18, this.m);
        }
        if (this.n != null && this.n.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.n.length; i7++) {
                String str = this.n[i7];
                if (str != null) {
                    i6++;
                    i5 += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i5 + (i6 * 2);
        }
        if (this.e != 0 || this.f) {
            a2 += CodedOutputByteBufferNano.c(29, this.e);
        }
        if (this.i || this.h) {
            a2 += CodedOutputByteBufferNano.c(32) + 1;
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(33, this.j);
        }
        if (this.o != null && this.o.length > 0) {
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < this.o.length; i10++) {
                String str2 = this.o[i10];
                if (str2 != null) {
                    i9++;
                    i8 += CodedOutputByteBufferNano.a(str2);
                }
            }
            a2 = a2 + i8 + (i9 * 2);
        }
        if (this.r != null) {
            a2 += CodedOutputByteBufferNano.d(43, this.r);
        }
        if (this.t || !this.s.equals("")) {
            a2 += CodedOutputByteBufferNano.b(45, this.s);
        }
        if (this.g != null && this.g.length > 0) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < this.g.length; i13++) {
                String str3 = this.g[i13];
                if (str3 != null) {
                    i12++;
                    i11 += CodedOutputByteBufferNano.a(str3);
                }
            }
            return a2 + i11 + (i12 * 2);
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
                case 50:
                    this.f3630a = aVar.c();
                    this.f3631b = true;
                    break;
                case 58:
                    this.p = aVar.c();
                    this.q = true;
                    break;
                case 122:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 130:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 130);
                    int length = this.k == null ? 0 : this.k.length;
                    bj[] bjVarArr = new bj[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, bjVarArr, 0, length);
                    }
                    while (length < bjVarArr.length - 1) {
                        bjVarArr[length] = new bj();
                        aVar.a(bjVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bjVarArr[length] = new bj();
                    aVar.a(bjVarArr[length]);
                    this.k = bjVarArr;
                    break;
                case 138:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 138);
                    int length2 = this.l == null ? 0 : this.l.length;
                    bj[] bjVarArr2 = new bj[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.l, 0, bjVarArr2, 0, length2);
                    }
                    while (length2 < bjVarArr2.length - 1) {
                        bjVarArr2[length2] = new bj();
                        aVar.a(bjVarArr2[length2]);
                        aVar.a();
                        length2++;
                    }
                    bjVarArr2[length2] = new bj();
                    aVar.a(bjVarArr2[length2]);
                    this.l = bjVarArr2;
                    break;
                case 146:
                    if (this.m == null) {
                        this.m = new bj();
                    }
                    aVar.a(this.m);
                    break;
                case 154:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 154);
                    int length3 = this.n == null ? 0 : this.n.length;
                    String[] strArr = new String[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.n, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = aVar.c();
                        aVar.a();
                        length3++;
                    }
                    strArr[length3] = aVar.c();
                    this.n = strArr;
                    break;
                case 232:
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
                            this.e = e;
                            this.f = true;
                            break;
                    }
                case 256:
                    this.h = aVar.b();
                    this.i = true;
                    break;
                case 266:
                    if (this.j == null) {
                        this.j = new bj();
                    }
                    aVar.a(this.j);
                    break;
                case 282:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 282);
                    int length4 = this.o == null ? 0 : this.o.length;
                    String[] strArr2 = new String[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.o, 0, strArr2, 0, length4);
                    }
                    while (length4 < strArr2.length - 1) {
                        strArr2[length4] = aVar.c();
                        aVar.a();
                        length4++;
                    }
                    strArr2[length4] = aVar.c();
                    this.o = strArr2;
                    break;
                case 346:
                    if (this.r == null) {
                        this.r = new io();
                    }
                    aVar.a(this.r);
                    break;
                case 362:
                    this.s = aVar.c();
                    this.t = true;
                    break;
                case 386:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 386);
                    int length5 = this.g == null ? 0 : this.g.length;
                    String[] strArr3 = new String[b6 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.g, 0, strArr3, 0, length5);
                    }
                    while (length5 < strArr3.length - 1) {
                        strArr3[length5] = aVar.c();
                        aVar.a();
                        length5++;
                    }
                    strArr3[length5] = aVar.c();
                    this.g = strArr3;
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
