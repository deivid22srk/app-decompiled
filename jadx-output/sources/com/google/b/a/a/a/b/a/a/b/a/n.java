package com.google.b.a.a.a.b.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class n extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7583a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7584b = "";
    public m[] c = m.b();
    public l[] d = l.b();
    public com.google.b.a.a.a.b.a.a.b e = null;
    public o f = null;
    public com.google.b.a.a.a.b.a.a.c.e g = null;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public boolean l = true;
    public int[] m = com.google.protobuf.nano.e.f7878a;
    public int[] n = com.google.protobuf.nano.e.f7878a;

    public n() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.e != null) {
            codedOutputByteBufferNano.b(2, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(3, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(4, this.g);
        }
        if (!this.f7583a.equals("")) {
            codedOutputByteBufferNano.a(5, this.f7583a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                m mVar = this.c[i];
                if (mVar != null) {
                    codedOutputByteBufferNano.b(6, mVar);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                l lVar = this.d[i2];
                if (lVar != null) {
                    codedOutputByteBufferNano.b(7, lVar);
                }
            }
        }
        if (this.h != 0) {
            codedOutputByteBufferNano.a(8, this.h);
        }
        if (this.i != 0) {
            codedOutputByteBufferNano.a(9, this.i);
        }
        if (this.j != 0) {
            codedOutputByteBufferNano.a(10, this.j);
        }
        if (this.k != 0) {
            codedOutputByteBufferNano.a(11, this.k);
        }
        if (!this.l) {
            codedOutputByteBufferNano.a(12, this.l);
        }
        if (!this.f7584b.equals("")) {
            codedOutputByteBufferNano.a(13, this.f7584b);
        }
        if (this.m != null && this.m.length > 0) {
            for (int i3 = 0; i3 < this.m.length; i3++) {
                codedOutputByteBufferNano.a(15, this.m[i3]);
            }
        }
        if (this.n != null && this.n.length > 0) {
            for (int i4 = 0; i4 < this.n.length; i4++) {
                codedOutputByteBufferNano.a(16, this.n[i4]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.g);
        }
        if (!this.f7583a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.f7583a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                m mVar = this.c[i2];
                if (mVar != null) {
                    i += CodedOutputByteBufferNano.d(6, mVar);
                }
            }
            a2 = i;
        }
        if (this.d != null && this.d.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.d.length; i4++) {
                l lVar = this.d[i4];
                if (lVar != null) {
                    i3 += CodedOutputByteBufferNano.d(7, lVar);
                }
            }
            a2 = i3;
        }
        if (this.h != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.h);
        }
        if (this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(9, this.i);
        }
        if (this.j != 0) {
            a2 += CodedOutputByteBufferNano.c(10, this.j);
        }
        if (this.k != 0) {
            a2 += CodedOutputByteBufferNano.c(11, this.k);
        }
        if (!this.l) {
            a2 += CodedOutputByteBufferNano.c(12) + 1;
        }
        if (!this.f7584b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.f7584b);
        }
        if (this.m != null && this.m.length > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.m.length; i6++) {
                i5 += CodedOutputByteBufferNano.b(this.m[i6]);
            }
            a2 = a2 + i5 + (this.m.length * 1);
        }
        if (this.n != null && this.n.length > 0) {
            int i7 = 0;
            for (int i8 = 0; i8 < this.n.length; i8++) {
                i7 += CodedOutputByteBufferNano.b(this.n[i8]);
            }
            return a2 + i7 + (this.n.length * 2);
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
                case 18:
                    if (this.e == null) {
                        this.e = new com.google.b.a.a.a.b.a.a.b();
                    }
                    aVar.a(this.e);
                    break;
                case 26:
                    if (this.f == null) {
                        this.f = new o();
                    }
                    aVar.a(this.f);
                    break;
                case 34:
                    if (this.g == null) {
                        this.g = new com.google.b.a.a.a.b.a.a.c.e();
                    }
                    aVar.a(this.g);
                    break;
                case 42:
                    this.f7583a = aVar.c();
                    break;
                case 50:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length = this.c == null ? 0 : this.c.length;
                    m[] mVarArr = new m[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, mVarArr, 0, length);
                    }
                    while (length < mVarArr.length - 1) {
                        mVarArr[length] = new m();
                        aVar.a(mVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    mVarArr[length] = new m();
                    aVar.a(mVarArr[length]);
                    this.c = mVarArr;
                    break;
                case 58:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length2 = this.d == null ? 0 : this.d.length;
                    l[] lVarArr = new l[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, lVarArr, 0, length2);
                    }
                    while (length2 < lVarArr.length - 1) {
                        lVarArr[length2] = new l();
                        aVar.a(lVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    lVarArr[length2] = new l();
                    aVar.a(lVarArr[length2]);
                    this.d = lVarArr;
                    break;
                case 64:
                    this.h = aVar.e();
                    break;
                case 72:
                    this.i = aVar.e();
                    break;
                case 80:
                    this.j = aVar.e();
                    break;
                case 88:
                    this.k = aVar.e();
                    break;
                case 96:
                    this.l = aVar.b();
                    break;
                case 106:
                    this.f7584b = aVar.c();
                    break;
                case 120:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 120);
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
                        int length3 = this.m == null ? 0 : this.m.length;
                        if (length3 == 0 && i4 == iArr.length) {
                            this.m = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length3 + i4];
                            if (length3 != 0) {
                                System.arraycopy(this.m, 0, iArr2, 0, length3);
                            }
                            System.arraycopy(iArr, 0, iArr2, length3, i4);
                            this.m = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 122:
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
                        int length4 = this.m == null ? 0 : this.m.length;
                        int[] iArr3 = new int[i5 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.m, 0, iArr3, 0, length4);
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
                        this.m = iArr3;
                    }
                    aVar.d(c);
                    break;
                case 128:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 128);
                    int[] iArr4 = new int[b5];
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < b5) {
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
                        int length5 = this.n == null ? 0 : this.n.length;
                        if (length5 == 0 && i7 == iArr4.length) {
                            this.n = iArr4;
                            break;
                        } else {
                            int[] iArr5 = new int[length5 + i7];
                            if (length5 != 0) {
                                System.arraycopy(this.n, 0, iArr5, 0, length5);
                            }
                            System.arraycopy(iArr4, 0, iArr5, length5, i7);
                            this.n = iArr5;
                            break;
                        }
                    } else {
                        break;
                    }
                case 130:
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
                        int length6 = this.n == null ? 0 : this.n.length;
                        int[] iArr6 = new int[i8 + length6];
                        if (length6 != 0) {
                            System.arraycopy(this.n, 0, iArr6, 0, length6);
                        }
                        while (aVar.i() > 0) {
                            int e4 = aVar.e();
                            switch (e4) {
                                case 0:
                                case 1:
                                case 2:
                                    iArr6[length6] = e4;
                                    length6++;
                                    break;
                            }
                        }
                        this.n = iArr6;
                    }
                    aVar.d(c2);
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
