package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mm extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public mc f4134a = null;

    /* renamed from: b, reason: collision with root package name */
    public dp f4135b = null;
    public int c = 1;
    public boolean d = false;
    public ly e = null;
    public String f = "";
    public boolean g = false;
    public ma h = null;
    public mf i = null;
    public mk j = null;
    public byte[] k = com.google.protobuf.nano.e.h;
    public boolean l = false;
    public kw[] m = kw.b();

    public mm() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4134a != null) {
            codedOutputByteBufferNano.b(1, this.f4134a);
        }
        if (this.f4135b != null) {
            codedOutputByteBufferNano.b(2, this.f4135b);
        }
        if (this.c != 1 || this.d) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(4, this.e);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(5, this.f);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(6, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(7, this.i);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(8, this.j);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(9, this.k);
        }
        if (this.m != null && this.m.length > 0) {
            for (int i = 0; i < this.m.length; i++) {
                kw kwVar = this.m[i];
                if (kwVar != null) {
                    codedOutputByteBufferNano.b(10, kwVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4134a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4134a);
        }
        if (this.f4135b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4135b);
        }
        if (this.c != 1 || this.d) {
            a2 += CodedOutputByteBufferNano.c(3, this.c);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.e);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.f);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.h);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.i);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.j);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(9, this.k);
        }
        if (this.m != null && this.m.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.m.length; i2++) {
                kw kwVar = this.m[i2];
                if (kwVar != null) {
                    i += CodedOutputByteBufferNano.d(10, kwVar);
                }
            }
            return i;
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
                    if (this.f4134a == null) {
                        this.f4134a = new mc();
                    }
                    aVar.a(this.f4134a);
                    break;
                case 18:
                    if (this.f4135b == null) {
                        this.f4135b = new dp();
                    }
                    aVar.a(this.f4135b);
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 34:
                    if (this.e == null) {
                        this.e = new ly();
                    }
                    aVar.a(this.e);
                    break;
                case 42:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 50:
                    if (this.h == null) {
                        this.h = new ma();
                    }
                    aVar.a(this.h);
                    break;
                case 58:
                    if (this.i == null) {
                        this.i = new mf();
                    }
                    aVar.a(this.i);
                    break;
                case 66:
                    if (this.j == null) {
                        this.j = new mk();
                    }
                    aVar.a(this.j);
                    break;
                case 74:
                    this.k = aVar.d();
                    this.l = true;
                    break;
                case 82:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 82);
                    int length = this.m == null ? 0 : this.m.length;
                    kw[] kwVarArr = new kw[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.m, 0, kwVarArr, 0, length);
                    }
                    while (length < kwVarArr.length - 1) {
                        kwVarArr[length] = new kw();
                        aVar.a(kwVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    kwVarArr[length] = new kw();
                    aVar.a(kwVarArr[length]);
                    this.m = kwVarArr;
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
