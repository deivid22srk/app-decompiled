package com.google.android.vending.verifier.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends com.google.protobuf.nano.c {
    private static volatile b[] D;

    /* renamed from: a, reason: collision with root package name */
    public String f7118a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f7119b = false;
    public f c = null;
    public long d = 0;
    public boolean e = false;
    public h[] f = h.b();
    public i g = null;
    public boolean h = false;
    public boolean i = false;
    public String[] j = com.google.protobuf.nano.e.f;
    public String k = "";
    public boolean l = false;
    public int m = 0;
    public boolean n = false;
    public String o = "";
    public boolean p = false;
    public c q = null;
    public long r = 0;
    public boolean s = false;
    public String[] t = com.google.protobuf.nano.e.f;
    public byte[] u = com.google.protobuf.nano.e.h;
    public boolean v = false;
    public i w = null;
    public String[] x = com.google.protobuf.nano.e.f;
    public i y = null;
    public String z = "";
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;

    public static b[] b() {
        if (D == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (D == null) {
                    D = new b[0];
                }
            }
        }
        return D;
    }

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7119b || !this.f7118a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7118a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i = 0; i < this.f.length; i++) {
                h hVar = this.f[i];
                if (hVar != null) {
                    codedOutputByteBufferNano.b(4, hVar);
                }
            }
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(5, this.g);
        }
        if (this.i || this.h) {
            codedOutputByteBufferNano.a(6, this.h);
        }
        if (this.j != null && this.j.length > 0) {
            for (int i2 = 0; i2 < this.j.length; i2++) {
                String str = this.j[i2];
                if (str != null) {
                    codedOutputByteBufferNano.a(8, str);
                }
            }
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(9, this.k);
        }
        if (this.m != 0 || this.n) {
            codedOutputByteBufferNano.a(10, this.m);
        }
        if (this.p || !this.o.equals("")) {
            codedOutputByteBufferNano.a(11, this.o);
        }
        if (this.q != null) {
            codedOutputByteBufferNano.b(12, this.q);
        }
        if (this.s || this.r != 0) {
            codedOutputByteBufferNano.c(13, this.r);
        }
        if (this.t != null && this.t.length > 0) {
            for (int i3 = 0; i3 < this.t.length; i3++) {
                String str2 = this.t[i3];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(15, str2);
                }
            }
        }
        if (this.v || !Arrays.equals(this.u, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(16, this.u);
        }
        if (this.w != null) {
            codedOutputByteBufferNano.b(17, this.w);
        }
        if (this.x != null && this.x.length > 0) {
            for (int i4 = 0; i4 < this.x.length; i4++) {
                String str3 = this.x[i4];
                if (str3 != null) {
                    codedOutputByteBufferNano.a(20, str3);
                }
            }
        }
        if (this.y != null) {
            codedOutputByteBufferNano.b(21, this.y);
        }
        if (this.A || !this.z.equals("")) {
            codedOutputByteBufferNano.a(23, this.z);
        }
        if (this.C || this.B) {
            codedOutputByteBufferNano.a(25, this.B);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7119b || !this.f7118a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7118a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f.length; i2++) {
                h hVar = this.f[i2];
                if (hVar != null) {
                    i += CodedOutputByteBufferNano.d(4, hVar);
                }
            }
            a2 = i;
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.g);
        }
        if (this.i || this.h) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.j != null && this.j.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.j.length; i5++) {
                String str = this.j[i5];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i3 + (i4 * 1);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.k);
        }
        if (this.m != 0 || this.n) {
            a2 += CodedOutputByteBufferNano.c(10, this.m);
        }
        if (this.p || !this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.o);
        }
        if (this.q != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.q);
        }
        if (this.s || this.r != 0) {
            a2 += CodedOutputByteBufferNano.c(13) + 8;
        }
        if (this.t != null && this.t.length > 0) {
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < this.t.length; i8++) {
                String str2 = this.t[i8];
                if (str2 != null) {
                    i7++;
                    i6 += CodedOutputByteBufferNano.a(str2);
                }
            }
            a2 = a2 + i6 + (i7 * 1);
        }
        if (this.v || !Arrays.equals(this.u, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(16, this.u);
        }
        if (this.w != null) {
            a2 += CodedOutputByteBufferNano.d(17, this.w);
        }
        if (this.x != null && this.x.length > 0) {
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < this.x.length; i11++) {
                String str3 = this.x[i11];
                if (str3 != null) {
                    i10++;
                    i9 += CodedOutputByteBufferNano.a(str3);
                }
            }
            a2 = a2 + i9 + (i10 * 2);
        }
        if (this.y != null) {
            a2 += CodedOutputByteBufferNano.d(21, this.y);
        }
        if (this.A || !this.z.equals("")) {
            a2 += CodedOutputByteBufferNano.b(23, this.z);
        }
        if (this.C || this.B) {
            return a2 + CodedOutputByteBufferNano.c(25) + 1;
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
                    this.f7118a = aVar.c();
                    this.f7119b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new f();
                    }
                    aVar.a(this.c);
                    break;
                case 24:
                    this.d = aVar.f();
                    this.e = true;
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.f == null ? 0 : this.f.length;
                    h[] hVarArr = new h[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, hVarArr, 0, length);
                    }
                    while (length < hVarArr.length - 1) {
                        hVarArr[length] = new h();
                        aVar.a(hVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    hVarArr[length] = new h();
                    aVar.a(hVarArr[length]);
                    this.f = hVarArr;
                    break;
                case 42:
                    if (this.g == null) {
                        this.g = new i();
                    }
                    aVar.a(this.g);
                    break;
                case 48:
                    this.h = aVar.b();
                    this.i = true;
                    break;
                case 66:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 66);
                    int length2 = this.j == null ? 0 : this.j.length;
                    String[] strArr = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.j, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr[length2] = aVar.c();
                    this.j = strArr;
                    break;
                case 74:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 80:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 2:
                            this.m = e;
                            this.n = true;
                            break;
                    }
                case 90:
                    this.o = aVar.c();
                    this.p = true;
                    break;
                case 98:
                    if (this.q == null) {
                        this.q = new c();
                    }
                    aVar.a(this.q);
                    break;
                case 105:
                    this.r = aVar.h();
                    this.s = true;
                    break;
                case 122:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 122);
                    int length3 = this.t == null ? 0 : this.t.length;
                    String[] strArr2 = new String[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.t, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = aVar.c();
                        aVar.a();
                        length3++;
                    }
                    strArr2[length3] = aVar.c();
                    this.t = strArr2;
                    break;
                case 130:
                    this.u = aVar.d();
                    this.v = true;
                    break;
                case 138:
                    if (this.w == null) {
                        this.w = new i();
                    }
                    aVar.a(this.w);
                    break;
                case 162:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 162);
                    int length4 = this.x == null ? 0 : this.x.length;
                    String[] strArr3 = new String[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.x, 0, strArr3, 0, length4);
                    }
                    while (length4 < strArr3.length - 1) {
                        strArr3[length4] = aVar.c();
                        aVar.a();
                        length4++;
                    }
                    strArr3[length4] = aVar.c();
                    this.x = strArr3;
                    break;
                case 170:
                    if (this.y == null) {
                        this.y = new i();
                    }
                    aVar.a(this.y);
                    break;
                case 186:
                    this.z = aVar.c();
                    this.A = true;
                    break;
                case 200:
                    this.B = aVar.b();
                    this.C = true;
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
