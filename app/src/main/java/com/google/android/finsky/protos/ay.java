package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ay extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3615a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3616b = false;
    public int c = 0;
    public boolean d = false;
    public az[] e = az.b();
    public int f = 0;
    public boolean g = false;
    public int h = 0;
    public boolean i = false;
    public int j = 0;
    public boolean k = false;
    public int l = 0;
    public boolean m = false;
    public byte[] n = com.google.protobuf.nano.e.h;
    public boolean o = false;
    public String p = "";
    public boolean q = false;
    public String r = "";
    public boolean s = false;
    public ax[] t = ax.b();
    public ax[] u = ax.b();
    public boolean v = false;
    public boolean w = false;
    public ba[] x = ba.b();

    public ay() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.q || !this.p.equals("")) {
            codedOutputByteBufferNano.a(1, this.p);
        }
        if (this.s || !this.r.equals("")) {
            codedOutputByteBufferNano.a(2, this.r);
        }
        if (this.t != null && this.t.length > 0) {
            for (int i = 0; i < this.t.length; i++) {
                ax axVar = this.t[i];
                if (axVar != null) {
                    codedOutputByteBufferNano.b(3, axVar);
                }
            }
        }
        if (this.u != null && this.u.length > 0) {
            for (int i2 = 0; i2 < this.u.length; i2++) {
                ax axVar2 = this.u[i2];
                if (axVar2 != null) {
                    codedOutputByteBufferNano.b(4, axVar2);
                }
            }
        }
        if (this.x != null && this.x.length > 0) {
            for (int i3 = 0; i3 < this.x.length; i3++) {
                ba baVar = this.x[i3];
                if (baVar != null) {
                    codedOutputByteBufferNano.b(5, baVar);
                }
            }
        }
        if (this.o || !Arrays.equals(this.n, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(6, this.n);
        }
        if (this.f3616b || !this.f3615a.equals("")) {
            codedOutputByteBufferNano.a(7, this.f3615a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(8, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i4 = 0; i4 < this.e.length; i4++) {
                az azVar = this.e[i4];
                if (azVar != null) {
                    codedOutputByteBufferNano.b(9, azVar);
                }
            }
        }
        if (this.g || this.f != 0) {
            codedOutputByteBufferNano.a(10, this.f);
        }
        if (this.i || this.h != 0) {
            codedOutputByteBufferNano.a(11, this.h);
        }
        if (this.k || this.j != 0) {
            codedOutputByteBufferNano.a(12, this.j);
        }
        if (this.w || this.v) {
            codedOutputByteBufferNano.a(14, this.v);
        }
        if (this.l != 0 || this.m) {
            codedOutputByteBufferNano.a(15, this.l);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.q || !this.p.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.p);
        }
        if (this.s || !this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.r);
        }
        if (this.t != null && this.t.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.t.length; i2++) {
                ax axVar = this.t[i2];
                if (axVar != null) {
                    i += CodedOutputByteBufferNano.d(3, axVar);
                }
            }
            a2 = i;
        }
        if (this.u != null && this.u.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.u.length; i4++) {
                ax axVar2 = this.u[i4];
                if (axVar2 != null) {
                    i3 += CodedOutputByteBufferNano.d(4, axVar2);
                }
            }
            a2 = i3;
        }
        if (this.x != null && this.x.length > 0) {
            int i5 = a2;
            for (int i6 = 0; i6 < this.x.length; i6++) {
                ba baVar = this.x[i6];
                if (baVar != null) {
                    i5 += CodedOutputByteBufferNano.d(5, baVar);
                }
            }
            a2 = i5;
        }
        if (this.o || !Arrays.equals(this.n, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(6, this.n);
        }
        if (this.f3616b || !this.f3615a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.f3615a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(8, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i7 = 0; i7 < this.e.length; i7++) {
                az azVar = this.e[i7];
                if (azVar != null) {
                    a2 += CodedOutputByteBufferNano.d(9, azVar);
                }
            }
        }
        if (this.g || this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(10, this.f);
        }
        if (this.i || this.h != 0) {
            a2 += CodedOutputByteBufferNano.c(11, this.h);
        }
        if (this.k || this.j != 0) {
            a2 += CodedOutputByteBufferNano.c(12, this.j);
        }
        if (this.w || this.v) {
            a2 += CodedOutputByteBufferNano.c(14) + 1;
        }
        if (this.l != 0 || this.m) {
            return a2 + CodedOutputByteBufferNano.c(15, this.l);
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
                    this.p = aVar.c();
                    this.q = true;
                    break;
                case 18:
                    this.r = aVar.c();
                    this.s = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.t == null ? 0 : this.t.length;
                    ax[] axVarArr = new ax[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.t, 0, axVarArr, 0, length);
                    }
                    while (length < axVarArr.length - 1) {
                        axVarArr[length] = new ax();
                        aVar.a(axVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    axVarArr[length] = new ax();
                    aVar.a(axVarArr[length]);
                    this.t = axVarArr;
                    break;
                case 34:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length2 = this.u == null ? 0 : this.u.length;
                    ax[] axVarArr2 = new ax[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.u, 0, axVarArr2, 0, length2);
                    }
                    while (length2 < axVarArr2.length - 1) {
                        axVarArr2[length2] = new ax();
                        aVar.a(axVarArr2[length2]);
                        aVar.a();
                        length2++;
                    }
                    axVarArr2[length2] = new ax();
                    aVar.a(axVarArr2[length2]);
                    this.u = axVarArr2;
                    break;
                case 42:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length3 = this.x == null ? 0 : this.x.length;
                    ba[] baVarArr = new ba[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.x, 0, baVarArr, 0, length3);
                    }
                    while (length3 < baVarArr.length - 1) {
                        baVarArr[length3] = new ba();
                        aVar.a(baVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    baVarArr[length3] = new ba();
                    aVar.a(baVarArr[length3]);
                    this.x = baVarArr;
                    break;
                case 50:
                    this.n = aVar.d();
                    this.o = true;
                    break;
                case 58:
                    this.f3615a = aVar.c();
                    this.f3616b = true;
                    break;
                case 64:
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
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 74:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 74);
                    int length4 = this.e == null ? 0 : this.e.length;
                    az[] azVarArr = new az[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.e, 0, azVarArr, 0, length4);
                    }
                    while (length4 < azVarArr.length - 1) {
                        azVarArr[length4] = new az();
                        aVar.a(azVarArr[length4]);
                        aVar.a();
                        length4++;
                    }
                    azVarArr[length4] = new az();
                    aVar.a(azVarArr[length4]);
                    this.e = azVarArr;
                    break;
                case 80:
                    this.f = aVar.e();
                    this.g = true;
                    break;
                case 88:
                    this.h = aVar.e();
                    this.i = true;
                    break;
                case 96:
                    this.j = aVar.e();
                    this.k = true;
                    break;
                case 112:
                    this.v = aVar.b();
                    this.w = true;
                    break;
                case 120:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                            this.l = e2;
                            this.m = true;
                            break;
                    }
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
