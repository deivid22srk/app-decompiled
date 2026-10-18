package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class ac extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7656a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7657b = 0;
    public String c = "";
    public int d = 0;
    public int[] e = com.google.protobuf.nano.e.f7878a;
    public ad[] f = ad.b();
    public String g = "";
    public boolean h = false;
    public m i = null;

    public ac() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7656a != 0) {
            codedOutputByteBufferNano.a(1, this.f7656a);
        }
        if (this.f7657b != 0) {
            codedOutputByteBufferNano.a(2, this.f7657b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.d != 0) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i = 0; i < this.f.length; i++) {
                ad adVar = this.f[i];
                if (adVar != null) {
                    codedOutputByteBufferNano.b(5, adVar);
                }
            }
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(6, this.g);
        }
        if (this.h) {
            codedOutputByteBufferNano.a(8, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(14, this.i);
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.e.length; i3++) {
                i2 += CodedOutputByteBufferNano.b(this.e[i3]);
            }
            codedOutputByteBufferNano.d(122);
            codedOutputByteBufferNano.d(i2);
            for (int i4 = 0; i4 < this.e.length; i4++) {
                codedOutputByteBufferNano.d(this.e[i4]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7656a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7656a);
        }
        if (this.f7657b != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.f7657b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f.length; i2++) {
                ad adVar = this.f[i2];
                if (adVar != null) {
                    i += CodedOutputByteBufferNano.d(5, adVar);
                }
            }
            a2 = i;
        }
        if (!this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.g);
        }
        if (this.h) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.i);
        }
        if (this.e != null && this.e.length > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.e.length; i4++) {
                i3 += CodedOutputByteBufferNano.b(this.e[i4]);
            }
            return a2 + i3 + 1 + CodedOutputByteBufferNano.e(i3);
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
                case 8:
                    this.f7656a = aVar.e();
                    break;
                case 16:
                    this.f7657b = aVar.e();
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 32:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.d = e;
                            break;
                    }
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.f == null ? 0 : this.f.length;
                    ad[] adVarArr = new ad[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, adVarArr, 0, length);
                    }
                    while (length < adVarArr.length - 1) {
                        adVarArr[length] = new ad();
                        aVar.a(adVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    adVarArr[length] = new ad();
                    aVar.a(adVarArr[length]);
                    this.f = adVarArr;
                    break;
                case 50:
                    this.g = aVar.c();
                    break;
                case 64:
                    this.h = aVar.b();
                    break;
                case 114:
                    if (this.i == null) {
                        this.i = new m();
                    }
                    aVar.a(this.i);
                    break;
                case 120:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 120);
                    int[] iArr = new int[b3];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b3) {
                        if (i2 != 0) {
                            aVar.a();
                        }
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
                                i = i3 + 1;
                                iArr[i3] = e2;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length2 = this.e == null ? 0 : this.e.length;
                        if (length2 == 0 && i3 == iArr.length) {
                            this.e = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length2 + i3];
                            if (length2 != 0) {
                                System.arraycopy(this.e, 0, iArr2, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr2, length2, i3);
                            this.e = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 122:
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
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length3 = this.e == null ? 0 : this.e.length;
                        int[] iArr3 = new int[i4 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.e, 0, iArr3, 0, length3);
                        }
                        while (aVar.i() > 0) {
                            int e3 = aVar.e();
                            switch (e3) {
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
                                    iArr3[length3] = e3;
                                    length3++;
                                    break;
                            }
                        }
                        this.e = iArr3;
                    }
                    aVar.d(c);
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
