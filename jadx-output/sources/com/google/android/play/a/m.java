package com.google.android.play.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends com.google.protobuf.nano.c {
    private static volatile m[] L;
    public boolean A;
    public long B;
    public boolean C;
    public j D;
    public byte[] E;
    public boolean F;
    public int G;
    public boolean H;
    public int[] I;
    public long J;
    public boolean K;

    /* renamed from: a, reason: collision with root package name */
    public long f6771a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6772b;
    public long c;
    public boolean d;
    public long e;
    public boolean f;
    public String g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public n[] o;
    public byte[] p;
    public boolean q;
    public d r;
    public byte[] s;
    public boolean t;
    public String u;
    public boolean v;
    public String w;
    public boolean x;
    public b y;
    public String z;

    public static m[] b() {
        if (L == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (L == null) {
                    L = new m[0];
                }
            }
        }
        return L;
    }

    public m() {
        c();
    }

    public final m c() {
        this.f6771a = 0L;
        this.f6772b = false;
        this.c = 0L;
        this.d = false;
        this.e = 0L;
        this.f = false;
        this.g = "";
        this.h = false;
        this.i = 0;
        this.j = false;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = n.b();
        this.p = com.google.protobuf.nano.e.h;
        this.q = false;
        this.r = null;
        this.s = com.google.protobuf.nano.e.h;
        this.t = false;
        this.u = "";
        this.v = false;
        this.w = "";
        this.x = false;
        this.y = null;
        this.z = "";
        this.A = false;
        this.B = 0L;
        this.C = false;
        this.D = null;
        this.E = com.google.protobuf.nano.e.h;
        this.F = false;
        this.G = 0;
        this.H = false;
        this.I = com.google.protobuf.nano.e.f7878a;
        this.J = 0L;
        this.K = false;
        this.ar = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6772b || this.f6771a != 0) {
            codedOutputByteBufferNano.b(1, this.f6771a);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(2, this.g);
        }
        if (this.o != null && this.o.length > 0) {
            for (int i = 0; i < this.o.length; i++) {
                n nVar = this.o[i];
                if (nVar != null) {
                    codedOutputByteBufferNano.b(3, nVar);
                }
            }
        }
        if (this.q || !Arrays.equals(this.p, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(4, this.p);
        }
        if (this.t || !Arrays.equals(this.s, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(6, this.s);
        }
        if (this.y != null) {
            codedOutputByteBufferNano.b(7, this.y);
        }
        if (this.v || !this.u.equals("")) {
            codedOutputByteBufferNano.a(8, this.u);
        }
        if (this.r != null) {
            codedOutputByteBufferNano.b(9, this.r);
        }
        if (this.n || this.m) {
            codedOutputByteBufferNano.a(10, this.m);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(11, this.i);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.a(12, this.k);
        }
        if (this.x || !this.w.equals("")) {
            codedOutputByteBufferNano.a(13, this.w);
        }
        if (this.A || !this.z.equals("")) {
            codedOutputByteBufferNano.a(14, this.z);
        }
        if (this.C || this.B != 0) {
            long j = this.B;
            codedOutputByteBufferNano.e(15, 0);
            codedOutputByteBufferNano.a(CodedOutputByteBufferNano.c(j));
        }
        if (this.D != null) {
            codedOutputByteBufferNano.b(16, this.D);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(17, this.c);
        }
        if (this.F || !Arrays.equals(this.E, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(18, this.E);
        }
        if (this.G != 0 || this.H) {
            codedOutputByteBufferNano.a(19, this.G);
        }
        if (this.I != null && this.I.length > 0) {
            for (int i2 = 0; i2 < this.I.length; i2++) {
                codedOutputByteBufferNano.a(20, this.I[i2]);
            }
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(21, this.e);
        }
        if (this.K || this.J != 0) {
            codedOutputByteBufferNano.b(22, this.J);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6772b || this.f6771a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f6771a);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.g);
        }
        if (this.o != null && this.o.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.o.length; i2++) {
                n nVar = this.o[i2];
                if (nVar != null) {
                    i += CodedOutputByteBufferNano.d(3, nVar);
                }
            }
            a2 = i;
        }
        if (this.q || !Arrays.equals(this.p, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(4, this.p);
        }
        if (this.t || !Arrays.equals(this.s, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(6, this.s);
        }
        if (this.y != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.y);
        }
        if (this.v || !this.u.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.u);
        }
        if (this.r != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.r);
        }
        if (this.n || this.m) {
            a2 += CodedOutputByteBufferNano.c(10) + 1;
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(11, this.i);
        }
        if (this.l || this.k != 0) {
            a2 += CodedOutputByteBufferNano.c(12, this.k);
        }
        if (this.x || !this.w.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.w);
        }
        if (this.A || !this.z.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.z);
        }
        if (this.C || this.B != 0) {
            a2 += CodedOutputByteBufferNano.b(CodedOutputByteBufferNano.c(this.B)) + CodedOutputByteBufferNano.c(15);
        }
        if (this.D != null) {
            a2 += CodedOutputByteBufferNano.d(16, this.D);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(17, this.c);
        }
        if (this.F || !Arrays.equals(this.E, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(18, this.E);
        }
        if (this.G != 0 || this.H) {
            a2 += CodedOutputByteBufferNano.c(19, this.G);
        }
        if (this.I != null && this.I.length > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.I.length; i4++) {
                i3 += CodedOutputByteBufferNano.b(this.I[i4]);
            }
            a2 = a2 + i3 + (this.I.length * 2);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(21, this.e);
        }
        if (this.K || this.J != 0) {
            return a2 + CodedOutputByteBufferNano.e(22, this.J);
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
                    this.f6771a = aVar.f();
                    this.f6772b = true;
                    break;
                case 18:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.o == null ? 0 : this.o.length;
                    n[] nVarArr = new n[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.o, 0, nVarArr, 0, length);
                    }
                    while (length < nVarArr.length - 1) {
                        nVarArr[length] = new n();
                        aVar.a(nVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    nVarArr[length] = new n();
                    aVar.a(nVarArr[length]);
                    this.o = nVarArr;
                    break;
                case 34:
                    this.p = aVar.d();
                    this.q = true;
                    break;
                case 50:
                    this.s = aVar.d();
                    this.t = true;
                    break;
                case 58:
                    if (this.y == null) {
                        this.y = new b();
                    }
                    aVar.a(this.y);
                    break;
                case 66:
                    this.u = aVar.c();
                    this.v = true;
                    break;
                case 74:
                    if (this.r == null) {
                        this.r = new d();
                    }
                    aVar.a(this.r);
                    break;
                case 80:
                    this.m = aVar.b();
                    this.n = true;
                    break;
                case 88:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 96:
                    this.k = aVar.e();
                    this.l = true;
                    break;
                case 106:
                    this.w = aVar.c();
                    this.x = true;
                    break;
                case 114:
                    this.z = aVar.c();
                    this.A = true;
                    break;
                case 120:
                    long f = aVar.f();
                    this.B = (-(f & 1)) ^ (f >>> 1);
                    this.C = true;
                    break;
                case 130:
                    if (this.D == null) {
                        this.D = new j();
                    }
                    aVar.a(this.D);
                    break;
                case 136:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 146:
                    this.E = aVar.d();
                    this.F = true;
                    break;
                case 152:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.G = e;
                            this.H = true;
                            break;
                    }
                case 160:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 160);
                    int length2 = this.I == null ? 0 : this.I.length;
                    int[] iArr = new int[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.I, 0, iArr, 0, length2);
                    }
                    while (length2 < iArr.length - 1) {
                        iArr[length2] = aVar.e();
                        aVar.a();
                        length2++;
                    }
                    iArr[length2] = aVar.e();
                    this.I = iArr;
                    break;
                case 162:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length3 = this.I == null ? 0 : this.I.length;
                    int[] iArr2 = new int[i + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.I, 0, iArr2, 0, length3);
                    }
                    while (length3 < iArr2.length) {
                        iArr2[length3] = aVar.e();
                        length3++;
                    }
                    this.I = iArr2;
                    aVar.d(c);
                    break;
                case 168:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 176:
                    this.J = aVar.f();
                    this.K = true;
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
