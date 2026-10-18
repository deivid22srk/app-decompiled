package com.google.b.a.a.a.b.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.a.j f7565a = null;

    /* renamed from: b, reason: collision with root package name */
    public e f7566b = null;
    public f[] c = f.b();
    public com.google.b.a.a.a.b.a.b.p[] d = com.google.b.a.a.a.b.a.b.p.b();
    public int e = -1;
    public int f = 0;
    public int[] g = com.google.protobuf.nano.e.f7878a;
    public int[] h = com.google.protobuf.nano.e.f7878a;
    public int i = 0;
    public i[] j = i.b();
    public String k = "";
    public String l = "";
    public h[] m = h.b();

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7565a != null) {
            codedOutputByteBufferNano.b(1, this.f7565a);
        }
        if (this.f7566b != null) {
            codedOutputByteBufferNano.b(2, this.f7566b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                f fVar = this.c[i];
                if (fVar != null) {
                    codedOutputByteBufferNano.b(3, fVar);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                com.google.b.a.a.a.b.a.b.p pVar = this.d[i2];
                if (pVar != null) {
                    codedOutputByteBufferNano.b(4, pVar);
                }
            }
        }
        if (this.g != null && this.g.length > 0) {
            for (int i3 = 0; i3 < this.g.length; i3++) {
                codedOutputByteBufferNano.a(6, this.g[i3]);
            }
        }
        if (this.j != null && this.j.length > 0) {
            for (int i4 = 0; i4 < this.j.length; i4++) {
                i iVar = this.j[i4];
                if (iVar != null) {
                    codedOutputByteBufferNano.b(7, iVar);
                }
            }
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.a(8, this.l);
        }
        if (this.m != null && this.m.length > 0) {
            for (int i5 = 0; i5 < this.m.length; i5++) {
                h hVar = this.m[i5];
                if (hVar != null) {
                    codedOutputByteBufferNano.b(9, hVar);
                }
            }
        }
        if (this.i != 0) {
            codedOutputByteBufferNano.a(10, this.i);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i6 = 0; i6 < this.h.length; i6++) {
                codedOutputByteBufferNano.a(11, this.h[i6]);
            }
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.a(13, this.f);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.a(14, this.k);
        }
        if (this.e != -1) {
            codedOutputByteBufferNano.a(15, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7565a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7565a);
        }
        if (this.f7566b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7566b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                f fVar = this.c[i2];
                if (fVar != null) {
                    i += CodedOutputByteBufferNano.d(3, fVar);
                }
            }
            a2 = i;
        }
        if (this.d != null && this.d.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.d.length; i4++) {
                com.google.b.a.a.a.b.a.b.p pVar = this.d[i4];
                if (pVar != null) {
                    i3 += CodedOutputByteBufferNano.d(4, pVar);
                }
            }
            a2 = i3;
        }
        if (this.g != null && this.g.length > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.g.length; i6++) {
                i5 += CodedOutputByteBufferNano.b(this.g[i6]);
            }
            a2 = a2 + i5 + (this.g.length * 1);
        }
        if (this.j != null && this.j.length > 0) {
            int i7 = a2;
            for (int i8 = 0; i8 < this.j.length; i8++) {
                i iVar = this.j[i8];
                if (iVar != null) {
                    i7 += CodedOutputByteBufferNano.d(7, iVar);
                }
            }
            a2 = i7;
        }
        if (!this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.l);
        }
        if (this.m != null && this.m.length > 0) {
            int i9 = a2;
            for (int i10 = 0; i10 < this.m.length; i10++) {
                h hVar = this.m[i10];
                if (hVar != null) {
                    i9 += CodedOutputByteBufferNano.d(9, hVar);
                }
            }
            a2 = i9;
        }
        if (this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(10, this.i);
        }
        if (this.h != null && this.h.length > 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.h.length; i12++) {
                i11 += CodedOutputByteBufferNano.b(this.h[i12]);
            }
            a2 = a2 + i11 + (this.h.length * 1);
        }
        if (this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(13, this.f);
        }
        if (!this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.k);
        }
        if (this.e != -1) {
            return a2 + CodedOutputByteBufferNano.c(15, this.e);
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        int i;
        int i2;
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.f7565a == null) {
                        this.f7565a = new com.google.b.a.a.a.b.a.a.j();
                    }
                    aVar.a(this.f7565a);
                    break;
                case 18:
                    if (this.f7566b == null) {
                        this.f7566b = new e();
                    }
                    aVar.a(this.f7566b);
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    f[] fVarArr = new f[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, fVarArr, 0, length);
                    }
                    while (length < fVarArr.length - 1) {
                        fVarArr[length] = new f();
                        aVar.a(fVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    fVarArr[length] = new f();
                    aVar.a(fVarArr[length]);
                    this.c = fVarArr;
                    break;
                case 34:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length2 = this.d == null ? 0 : this.d.length;
                    com.google.b.a.a.a.b.a.b.p[] pVarArr = new com.google.b.a.a.a.b.a.b.p[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, pVarArr, 0, length2);
                    }
                    while (length2 < pVarArr.length - 1) {
                        pVarArr[length2] = new com.google.b.a.a.a.b.a.b.p();
                        aVar.a(pVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    pVarArr[length2] = new com.google.b.a.a.a.b.a.b.p();
                    aVar.a(pVarArr[length2]);
                    this.d = pVarArr;
                    break;
                case 48:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 48);
                    int[] iArr = new int[b4];
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < b4) {
                        if (i3 != 0) {
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
                                i2 = i4 + 1;
                                iArr[i4] = e;
                                break;
                            default:
                                i2 = i4;
                                break;
                        }
                        i3++;
                        i4 = i2;
                    }
                    if (i4 != 0) {
                        int length3 = this.g == null ? 0 : this.g.length;
                        if (length3 == 0 && i4 == iArr.length) {
                            this.g = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length3 + i4];
                            if (length3 != 0) {
                                System.arraycopy(this.g, 0, iArr2, 0, length3);
                            }
                            System.arraycopy(iArr, 0, iArr2, length3, i4);
                            this.g = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 50:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i5 = 0;
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
                                i5++;
                                break;
                        }
                    }
                    if (i5 != 0) {
                        aVar.e(j);
                        int length4 = this.g == null ? 0 : this.g.length;
                        int[] iArr3 = new int[i5 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.g, 0, iArr3, 0, length4);
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
                                    iArr3[length4] = e2;
                                    length4++;
                                    break;
                            }
                        }
                        this.g = iArr3;
                    }
                    aVar.d(c);
                    break;
                case 58:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length5 = this.j == null ? 0 : this.j.length;
                    i[] iVarArr = new i[b5 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.j, 0, iVarArr, 0, length5);
                    }
                    while (length5 < iVarArr.length - 1) {
                        iVarArr[length5] = new i();
                        aVar.a(iVarArr[length5]);
                        aVar.a();
                        length5++;
                    }
                    iVarArr[length5] = new i();
                    aVar.a(iVarArr[length5]);
                    this.j = iVarArr;
                    break;
                case 66:
                    this.l = aVar.c();
                    break;
                case 74:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 74);
                    int length6 = this.m == null ? 0 : this.m.length;
                    h[] hVarArr = new h[b6 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.m, 0, hVarArr, 0, length6);
                    }
                    while (length6 < hVarArr.length - 1) {
                        hVarArr[length6] = new h();
                        aVar.a(hVarArr[length6]);
                        aVar.a();
                        length6++;
                    }
                    hVarArr[length6] = new h();
                    aVar.a(hVarArr[length6]);
                    this.m = hVarArr;
                    break;
                case 80:
                    this.i = aVar.e();
                    break;
                case 88:
                    int b7 = com.google.protobuf.nano.e.b(aVar, 88);
                    int[] iArr4 = new int[b7];
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < b7) {
                        if (i6 != 0) {
                            aVar.a();
                        }
                        int e3 = aVar.e();
                        switch (e3) {
                            case 0:
                            case 1:
                            case 2:
                                i = i7 + 1;
                                iArr4[i7] = e3;
                                break;
                            default:
                                i = i7;
                                break;
                        }
                        i6++;
                        i7 = i;
                    }
                    if (i7 != 0) {
                        int length7 = this.h == null ? 0 : this.h.length;
                        if (length7 == 0 && i7 == iArr4.length) {
                            this.h = iArr4;
                            break;
                        } else {
                            int[] iArr5 = new int[length7 + i7];
                            if (length7 != 0) {
                                System.arraycopy(this.h, 0, iArr5, 0, length7);
                            }
                            System.arraycopy(iArr4, 0, iArr5, length7, i7);
                            this.h = iArr5;
                            break;
                        }
                    } else {
                        break;
                    }
                case 90:
                    int c2 = aVar.c(aVar.e());
                    int j2 = aVar.j();
                    int i8 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 0:
                            case 1:
                            case 2:
                                i8++;
                                break;
                        }
                    }
                    if (i8 != 0) {
                        aVar.e(j2);
                        int length8 = this.h == null ? 0 : this.h.length;
                        int[] iArr6 = new int[i8 + length8];
                        if (length8 != 0) {
                            System.arraycopy(this.h, 0, iArr6, 0, length8);
                        }
                        while (aVar.i() > 0) {
                            int e4 = aVar.e();
                            switch (e4) {
                                case 0:
                                case 1:
                                case 2:
                                    iArr6[length8] = e4;
                                    length8++;
                                    break;
                            }
                        }
                        this.h = iArr6;
                    }
                    aVar.d(c2);
                    break;
                case 104:
                    int e5 = aVar.e();
                    switch (e5) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f = e5;
                            break;
                    }
                case 114:
                    this.k = aVar.c();
                    break;
                case 120:
                    this.e = aVar.e();
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
