package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class az extends com.google.protobuf.nano.c {
    private static volatile az[] r;

    /* renamed from: a, reason: collision with root package name */
    public String f3617a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3618b = false;
    public byte[] c = com.google.protobuf.nano.e.h;
    public boolean d = false;
    public ba[] e = ba.b();
    public String f = "";
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public ax[] j = ax.b();
    public String k = "";
    public boolean l = false;
    public String m = "";
    public boolean n = false;
    public int o = 0;
    public boolean p = false;
    public bb q = null;

    public static az[] b() {
        if (r == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (r == null) {
                    r = new az[0];
                }
            }
        }
        return r;
    }

    public az() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3618b || !this.f3617a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3617a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(3, this.f);
        }
        if (this.j != null && this.j.length > 0) {
            for (int i = 0; i < this.j.length; i++) {
                ax axVar = this.j[i];
                if (axVar != null) {
                    codedOutputByteBufferNano.b(4, axVar);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int i2 = 0; i2 < this.e.length; i2++) {
                ba baVar = this.e[i2];
                if (baVar != null) {
                    codedOutputByteBufferNano.b(5, baVar);
                }
            }
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || !this.m.equals("")) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.o != 0 || this.p) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(9, this.h);
        }
        if (this.q != null) {
            codedOutputByteBufferNano.b(10, this.q);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3618b || !this.f3617a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3617a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.f);
        }
        if (this.j != null && this.j.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.j.length; i2++) {
                ax axVar = this.j[i2];
                if (axVar != null) {
                    i += CodedOutputByteBufferNano.d(4, axVar);
                }
            }
            a2 = i;
        }
        if (this.e != null && this.e.length > 0) {
            for (int i3 = 0; i3 < this.e.length; i3++) {
                ba baVar = this.e[i3];
                if (baVar != null) {
                    a2 += CodedOutputByteBufferNano.d(5, baVar);
                }
            }
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.k);
        }
        if (this.n || !this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.m);
        }
        if (this.o != 0 || this.p) {
            a2 += CodedOutputByteBufferNano.c(8, this.o);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.h);
        }
        if (this.q != null) {
            return a2 + CodedOutputByteBufferNano.d(10, this.q);
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
                    this.f3617a = aVar.c();
                    this.f3618b = true;
                    break;
                case 18:
                    this.c = aVar.d();
                    this.d = true;
                    break;
                case 26:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.j == null ? 0 : this.j.length;
                    ax[] axVarArr = new ax[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.j, 0, axVarArr, 0, length);
                    }
                    while (length < axVarArr.length - 1) {
                        axVarArr[length] = new ax();
                        aVar.a(axVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    axVarArr[length] = new ax();
                    aVar.a(axVarArr[length]);
                    this.j = axVarArr;
                    break;
                case 42:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length2 = this.e == null ? 0 : this.e.length;
                    ba[] baVarArr = new ba[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.e, 0, baVarArr, 0, length2);
                    }
                    while (length2 < baVarArr.length - 1) {
                        baVarArr[length2] = new ba();
                        aVar.a(baVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    baVarArr[length2] = new ba();
                    aVar.a(baVarArr[length2]);
                    this.e = baVarArr;
                    break;
                case 50:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 58:
                    this.m = aVar.c();
                    this.n = true;
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
                            this.o = e;
                            this.p = true;
                            break;
                    }
                case 74:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 82:
                    if (this.q == null) {
                        this.q = new bb();
                    }
                    aVar.a(this.q);
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
