package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class p extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7587a = "";

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.bpkg.p f7588b = null;
    public String c = "";
    public int d = 0;
    public com.google.b.a.a.a.b.a.bpkg.p e = null;
    public String f = "";
    public String g = "";
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public com.google.b.a.a.a.b.a.apkg.b l = null;
    public q m = null;
    public int[] n = com.google.protobuf.nano.e.f7878a;
    public com.google.b.a.a.a.b.a.apkg.cpkg.e o = null;

    public p() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.d != 0) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.h != 0) {
            codedOutputByteBufferNano.a(4, this.h);
        }
        if (this.i != 0) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.j != 0) {
            codedOutputByteBufferNano.a(6, this.j);
        }
        if (this.k != 0) {
            codedOutputByteBufferNano.a(7, this.k);
        }
        if (!this.f7587a.equals("")) {
            codedOutputByteBufferNano.a(8, this.f7587a);
        }
        if (this.f7588b != null) {
            codedOutputByteBufferNano.b(9, this.f7588b);
        }
        if (this.n != null && this.n.length > 0) {
            for (int i = 0; i < this.n.length; i++) {
                codedOutputByteBufferNano.a(10, this.n[i]);
            }
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(11, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(12, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(13, this.g);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(14, this.l);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(15, this.m);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(16, this.o);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.d);
        }
        if (this.h != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.h);
        }
        if (this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.i);
        }
        if (this.j != 0) {
            a2 += CodedOutputByteBufferNano.c(6, this.j);
        }
        if (this.k != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.k);
        }
        if (!this.f7587a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.f7587a);
        }
        if (this.f7588b != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.f7588b);
        }
        if (this.n != null && this.n.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.n.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.n[i2]);
            }
            a2 = a2 + i + (this.n.length * 1);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.e);
        }
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.f);
        }
        if (!this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.g);
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.l);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(15, this.m);
        }
        if (this.o != null) {
            return a2 + CodedOutputByteBufferNano.d(16, this.o);
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
                case 18:
                    this.c = aVar.c();
                    break;
                case 24:
                    this.d = aVar.e();
                    break;
                case 32:
                    this.h = aVar.e();
                    break;
                case 40:
                    this.i = aVar.e();
                    break;
                case 48:
                    this.j = aVar.e();
                    break;
                case 56:
                    this.k = aVar.e();
                    break;
                case 66:
                    this.f7587a = aVar.c();
                    break;
                case 74:
                    if (this.f7588b == null) {
                        this.f7588b = new com.google.b.a.a.a.b.a.bpkg.p();
                    }
                    aVar.a(this.f7588b);
                    break;
                case 80:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 80);
                    int[] iArr = new int[b2];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b2) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int e = aVar.e();
                        switch (e) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
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
                        int length = this.n == null ? 0 : this.n.length;
                        if (length == 0 && i3 == iArr.length) {
                            this.n = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length + i3];
                            if (length != 0) {
                                System.arraycopy(this.n, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i3);
                            this.n = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 82:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length2 = this.n == null ? 0 : this.n.length;
                        int[] iArr3 = new int[i4 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.n, 0, iArr3, 0, length2);
                        }
                        while (aVar.i() > 0) {
                            int e2 = aVar.e();
                            switch (e2) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    iArr3[length2] = e2;
                                    length2++;
                                    break;
                            }
                        }
                        this.n = iArr3;
                    }
                    aVar.d(c);
                    break;
                case 90:
                    if (this.e == null) {
                        this.e = new com.google.b.a.a.a.b.a.bpkg.p();
                    }
                    aVar.a(this.e);
                    break;
                case 98:
                    this.f = aVar.c();
                    break;
                case 106:
                    this.g = aVar.c();
                    break;
                case 114:
                    if (this.l == null) {
                        this.l = new com.google.b.a.a.a.b.a.apkg.b();
                    }
                    aVar.a(this.l);
                    break;
                case 122:
                    if (this.m == null) {
                        this.m = new q();
                    }
                    aVar.a(this.m);
                    break;
                case 130:
                    if (this.o == null) {
                        this.o = new com.google.b.a.a.a.b.a.apkg.cpkg.e();
                    }
                    aVar.a(this.o);
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
