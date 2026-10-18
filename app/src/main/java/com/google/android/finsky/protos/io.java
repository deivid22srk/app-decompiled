package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class io extends com.google.protobuf.nano.c {
    private static volatile io[] J;

    /* renamed from: a, reason: collision with root package name */
    public String f3961a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3962b = false;
    public String c = "";
    public boolean d = false;
    public ds e = null;
    public int f = 0;
    public boolean g = false;
    public int h = 0;
    public boolean i = false;
    public v j = null;
    public aq k = null;
    public fo l = null;
    public cc m = null;
    public cd n = null;
    public pg o = null;
    public py p = null;
    public int q = 0;
    public boolean r = false;
    public gl[] s = gl.b();
    public String t = "";
    public boolean u = false;
    public byte[] v = com.google.protobuf.nano.e.h;
    public boolean w = false;
    public String x = "";
    public boolean y = false;
    public byte[] z = com.google.protobuf.nano.e.h;
    public boolean A = false;
    public ip B = null;
    public String C = "";
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public byte[] G = com.google.protobuf.nano.e.h;
    public boolean H = false;
    public String[] I = com.google.protobuf.nano.e.f;

    public static io[] b() {
        if (J == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (J == null) {
                    J = new io[0];
                }
            }
        }
        return J;
    }

    public io() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3962b || !this.f3961a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3961a);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(2, this.j);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(3, this.l);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(4, this.m);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(5, this.k);
        }
        if (this.f != 0 || this.g) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(7, this.n);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(8, this.c);
        }
        if (this.p != null) {
            codedOutputByteBufferNano.b(9, this.p);
        }
        if (this.r || this.q != 0) {
            codedOutputByteBufferNano.a(10, this.q);
        }
        if (this.o != null) {
            codedOutputByteBufferNano.b(11, this.o);
        }
        if (this.s != null && this.s.length > 0) {
            for (int i = 0; i < this.s.length; i++) {
                gl glVar = this.s[i];
                if (glVar != null) {
                    codedOutputByteBufferNano.b(12, glVar);
                }
            }
        }
        if (this.u || !this.t.equals("")) {
            codedOutputByteBufferNano.a(13, this.t);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(14, this.e);
        }
        if (this.w || !Arrays.equals(this.v, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(15, this.v);
        }
        if (this.y || !this.x.equals("")) {
            codedOutputByteBufferNano.a(16, this.x);
        }
        if (this.A || !Arrays.equals(this.z, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(17, this.z);
        }
        if (this.B != null) {
            codedOutputByteBufferNano.b(18, this.B);
        }
        if (this.D || !this.C.equals("")) {
            codedOutputByteBufferNano.a(19, this.C);
        }
        if (this.F || this.E) {
            codedOutputByteBufferNano.a(20, this.E);
        }
        if (this.H || !Arrays.equals(this.G, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(21, this.G);
        }
        if (this.h != 0 || this.i) {
            codedOutputByteBufferNano.a(22, this.h);
        }
        if (this.I != null && this.I.length > 0) {
            for (int i2 = 0; i2 < this.I.length; i2++) {
                String str = this.I[i2];
                if (str != null) {
                    codedOutputByteBufferNano.a(23, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3962b || !this.f3961a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3961a);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.j);
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.l);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.m);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.k);
        }
        if (this.f != 0 || this.g) {
            a2 += CodedOutputByteBufferNano.c(6, this.f);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.n);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.c);
        }
        if (this.p != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.p);
        }
        if (this.r || this.q != 0) {
            a2 += CodedOutputByteBufferNano.c(10, this.q);
        }
        if (this.o != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.o);
        }
        if (this.s != null && this.s.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.s.length; i2++) {
                gl glVar = this.s[i2];
                if (glVar != null) {
                    i += CodedOutputByteBufferNano.d(12, glVar);
                }
            }
            a2 = i;
        }
        if (this.u || !this.t.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.t);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.e);
        }
        if (this.w || !Arrays.equals(this.v, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(15, this.v);
        }
        if (this.y || !this.x.equals("")) {
            a2 += CodedOutputByteBufferNano.b(16, this.x);
        }
        if (this.A || !Arrays.equals(this.z, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(17, this.z);
        }
        if (this.B != null) {
            a2 += CodedOutputByteBufferNano.d(18, this.B);
        }
        if (this.D || !this.C.equals("")) {
            a2 += CodedOutputByteBufferNano.b(19, this.C);
        }
        if (this.F || this.E) {
            a2 += CodedOutputByteBufferNano.c(20) + 1;
        }
        if (this.H || !Arrays.equals(this.G, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(21, this.G);
        }
        if (this.h != 0 || this.i) {
            a2 += CodedOutputByteBufferNano.c(22, this.h);
        }
        if (this.I != null && this.I.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.I.length; i5++) {
                String str = this.I[i5];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.a(str);
                }
            }
            return a2 + i3 + (i4 * 2);
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
                    this.f3961a = aVar.c();
                    this.f3962b = true;
                    break;
                case 18:
                    if (this.j == null) {
                        this.j = new v();
                    }
                    aVar.a(this.j);
                    break;
                case 26:
                    if (this.l == null) {
                        this.l = new fo();
                    }
                    aVar.a(this.l);
                    break;
                case 34:
                    if (this.m == null) {
                        this.m = new cc();
                    }
                    aVar.a(this.m);
                    break;
                case 42:
                    if (this.k == null) {
                        this.k = new aq();
                    }
                    aVar.a(this.k);
                    break;
                case 48:
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
                            this.f = e;
                            this.g = true;
                            break;
                    }
                case 58:
                    if (this.n == null) {
                        this.n = new cd();
                    }
                    aVar.a(this.n);
                    break;
                case 66:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 74:
                    if (this.p == null) {
                        this.p = new py();
                    }
                    aVar.a(this.p);
                    break;
                case 80:
                    this.q = aVar.e();
                    this.r = true;
                    break;
                case 90:
                    if (this.o == null) {
                        this.o = new pg();
                    }
                    aVar.a(this.o);
                    break;
                case 98:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 98);
                    int length = this.s == null ? 0 : this.s.length;
                    gl[] glVarArr = new gl[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.s, 0, glVarArr, 0, length);
                    }
                    while (length < glVarArr.length - 1) {
                        glVarArr[length] = new gl();
                        aVar.a(glVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    glVarArr[length] = new gl();
                    aVar.a(glVarArr[length]);
                    this.s = glVarArr;
                    break;
                case 106:
                    this.t = aVar.c();
                    this.u = true;
                    break;
                case 114:
                    if (this.e == null) {
                        this.e = new ds();
                    }
                    aVar.a(this.e);
                    break;
                case 122:
                    this.v = aVar.d();
                    this.w = true;
                    break;
                case 130:
                    this.x = aVar.c();
                    this.y = true;
                    break;
                case 138:
                    this.z = aVar.d();
                    this.A = true;
                    break;
                case 146:
                    if (this.B == null) {
                        this.B = new ip();
                    }
                    aVar.a(this.B);
                    break;
                case 154:
                    this.C = aVar.c();
                    this.D = true;
                    break;
                case 160:
                    this.E = aVar.b();
                    this.F = true;
                    break;
                case 170:
                    this.G = aVar.d();
                    this.H = true;
                    break;
                case 176:
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
                            this.h = e2;
                            this.i = true;
                            break;
                    }
                case 186:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 186);
                    int length2 = this.I == null ? 0 : this.I.length;
                    String[] strArr = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.I, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr[length2] = aVar.c();
                    this.I = strArr;
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
