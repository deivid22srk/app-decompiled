package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gk extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3868a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3869b = false;
    public int c = 0;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public int m = 0;
    public boolean n = false;
    public int o = 0;
    public boolean p = false;
    public int q = 0;
    public boolean r = false;
    public int s = 0;
    public boolean t = false;
    public String[] u = com.google.protobuf.nano.e.f;
    public String[] v = com.google.protobuf.nano.e.f;
    public String[] w = com.google.protobuf.nano.e.f;
    public String[] x = com.google.protobuf.nano.e.f;
    public String[] y = com.google.protobuf.nano.e.f;
    public int z = 50;
    public boolean A = false;
    public int B = 0;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public long F = 0;
    public boolean G = false;
    public int H = 0;
    public boolean I = false;

    public gk() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3868a != 0 || this.f3869b) {
            codedOutputByteBufferNano.a(1, this.f3868a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != 0 || this.h) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.t || this.s != 0) {
            codedOutputByteBufferNano.a(8, this.s);
        }
        if (this.u != null && this.u.length > 0) {
            for (int i = 0; i < this.u.length; i++) {
                String str = this.u[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(9, str);
                }
            }
        }
        if (this.v != null && this.v.length > 0) {
            for (int i2 = 0; i2 < this.v.length; i2++) {
                String str2 = this.v[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(10, str2);
                }
            }
        }
        if (this.w != null && this.w.length > 0) {
            for (int i3 = 0; i3 < this.w.length; i3++) {
                String str3 = this.w[i3];
                if (str3 != null) {
                    codedOutputByteBufferNano.a(11, str3);
                }
            }
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.a(12, this.o);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.a(13, this.q);
        }
        if (this.x != null && this.x.length > 0) {
            for (int i4 = 0; i4 < this.x.length; i4++) {
                String str4 = this.x[i4];
                if (str4 != null) {
                    codedOutputByteBufferNano.a(14, str4);
                }
            }
        }
        if (this.y != null && this.y.length > 0) {
            for (int i5 = 0; i5 < this.y.length; i5++) {
                String str5 = this.y[i5];
                if (str5 != null) {
                    codedOutputByteBufferNano.a(15, str5);
                }
            }
        }
        if (this.A || this.z != 50) {
            codedOutputByteBufferNano.a(17, this.z);
        }
        if (this.C || this.B != 0) {
            codedOutputByteBufferNano.a(18, this.B);
        }
        if (this.E || this.D) {
            codedOutputByteBufferNano.a(19, this.D);
        }
        if (this.G || this.F != 0) {
            codedOutputByteBufferNano.b(20, this.F);
        }
        if (this.I || this.H != 0) {
            codedOutputByteBufferNano.a(21, this.H);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3868a != 0 || this.f3869b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3868a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e != 0 || this.f) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.g != 0 || this.h) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || this.i) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.n || this.m != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.m);
        }
        if (this.t || this.s != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.s);
        }
        if (this.u != null && this.u.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.u.length; i3++) {
                String str = this.u[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.v != null && this.v.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.v.length; i6++) {
                String str2 = this.v[i6];
                if (str2 != null) {
                    i5++;
                    i4 += CodedOutputByteBufferNano.a(str2);
                }
            }
            a2 = a2 + i4 + (i5 * 1);
        }
        if (this.w != null && this.w.length > 0) {
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < this.w.length; i9++) {
                String str3 = this.w[i9];
                if (str3 != null) {
                    i8++;
                    i7 += CodedOutputByteBufferNano.a(str3);
                }
            }
            a2 = a2 + i7 + (i8 * 1);
        }
        if (this.p || this.o != 0) {
            a2 += CodedOutputByteBufferNano.c(12, this.o);
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.c(13, this.q);
        }
        if (this.x != null && this.x.length > 0) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < this.x.length; i12++) {
                String str4 = this.x[i12];
                if (str4 != null) {
                    i11++;
                    i10 += CodedOutputByteBufferNano.a(str4);
                }
            }
            a2 = a2 + i10 + (i11 * 1);
        }
        if (this.y != null && this.y.length > 0) {
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < this.y.length; i15++) {
                String str5 = this.y[i15];
                if (str5 != null) {
                    i14++;
                    i13 += CodedOutputByteBufferNano.a(str5);
                }
            }
            a2 = a2 + i13 + (i14 * 1);
        }
        if (this.A || this.z != 50) {
            a2 += CodedOutputByteBufferNano.c(17, this.z);
        }
        if (this.C || this.B != 0) {
            a2 += CodedOutputByteBufferNano.c(18, this.B);
        }
        if (this.E || this.D) {
            a2 += CodedOutputByteBufferNano.c(19) + 1;
        }
        if (this.G || this.F != 0) {
            a2 += CodedOutputByteBufferNano.e(20, this.F);
        }
        if (this.I || this.H != 0) {
            return a2 + CodedOutputByteBufferNano.c(21, this.H);
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
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f3868a = e;
                            this.f3869b = true;
                            break;
                    }
                case 16:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = e2;
                            this.d = true;
                            break;
                    }
                case 24:
                    int e3 = aVar.e();
                    switch (e3) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.e = e3;
                            this.f = true;
                            break;
                    }
                case 32:
                    int e4 = aVar.e();
                    switch (e4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.g = e4;
                            this.h = true;
                            break;
                    }
                case 40:
                    this.i = aVar.b();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 56:
                    this.m = aVar.e();
                    this.n = true;
                    break;
                case 64:
                    this.s = aVar.e();
                    this.t = true;
                    break;
                case 74:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 74);
                    int length = this.u == null ? 0 : this.u.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.u, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.u = strArr;
                    break;
                case 82:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 82);
                    int length2 = this.v == null ? 0 : this.v.length;
                    String[] strArr2 = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.v, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr2[length2] = aVar.c();
                    this.v = strArr2;
                    break;
                case 90:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 90);
                    int length3 = this.w == null ? 0 : this.w.length;
                    String[] strArr3 = new String[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.w, 0, strArr3, 0, length3);
                    }
                    while (length3 < strArr3.length - 1) {
                        strArr3[length3] = aVar.c();
                        aVar.a();
                        length3++;
                    }
                    strArr3[length3] = aVar.c();
                    this.w = strArr3;
                    break;
                case 96:
                    this.o = aVar.e();
                    this.p = true;
                    break;
                case 104:
                    this.q = aVar.e();
                    this.r = true;
                    break;
                case 114:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 114);
                    int length4 = this.x == null ? 0 : this.x.length;
                    String[] strArr4 = new String[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.x, 0, strArr4, 0, length4);
                    }
                    while (length4 < strArr4.length - 1) {
                        strArr4[length4] = aVar.c();
                        aVar.a();
                        length4++;
                    }
                    strArr4[length4] = aVar.c();
                    this.x = strArr4;
                    break;
                case 122:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 122);
                    int length5 = this.y == null ? 0 : this.y.length;
                    String[] strArr5 = new String[b6 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.y, 0, strArr5, 0, length5);
                    }
                    while (length5 < strArr5.length - 1) {
                        strArr5[length5] = aVar.c();
                        aVar.a();
                        length5++;
                    }
                    strArr5[length5] = aVar.c();
                    this.y = strArr5;
                    break;
                case 136:
                    this.z = aVar.e();
                    this.A = true;
                    break;
                case 144:
                    this.B = aVar.e();
                    this.C = true;
                    break;
                case 152:
                    this.D = aVar.b();
                    this.E = true;
                    break;
                case 160:
                    this.F = aVar.f();
                    this.G = true;
                    break;
                case 168:
                    this.H = aVar.e();
                    this.I = true;
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
