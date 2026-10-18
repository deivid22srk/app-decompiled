package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ae extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f1445a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f1446b = false;
    public long c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public int i = 0;
    public boolean j = false;
    public float k = 0.0f;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    public boolean p = false;
    public int q = 0;
    public boolean r = false;
    public int s = 0;
    public boolean t = false;
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;

    public ae() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1446b || !this.f1445a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f1445a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.b(5, this.i);
        }
        if (this.l || Float.floatToIntBits(this.k) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || this.m) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.o != 0 || this.p) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.q != 0 || this.r) {
            codedOutputByteBufferNano.a(9, this.q);
        }
        if (this.t || this.s != 0) {
            codedOutputByteBufferNano.b(10, this.s);
        }
        if (this.u != 0 || this.v) {
            codedOutputByteBufferNano.a(11, this.u);
        }
        if (this.x || this.w) {
            codedOutputByteBufferNano.a(12, this.w);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1446b || !this.f1445a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f1445a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.d(4, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.d(5, this.i);
        }
        if (this.l || Float.floatToIntBits(this.k) != Float.floatToIntBits(0.0f)) {
            a2 += CodedOutputByteBufferNano.c(6) + 4;
        }
        if (this.n || this.m) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.o != 0 || this.p) {
            a2 += CodedOutputByteBufferNano.c(8, this.o);
        }
        if (this.q != 0 || this.r) {
            a2 += CodedOutputByteBufferNano.c(9, this.q);
        }
        if (this.t || this.s != 0) {
            a2 += CodedOutputByteBufferNano.d(10, this.s);
        }
        if (this.u != 0 || this.v) {
            a2 += CodedOutputByteBufferNano.c(11, this.u);
        }
        if (this.x || this.w) {
            return a2 + CodedOutputByteBufferNano.c(12) + 1;
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
                    this.f1445a = aVar.c();
                    this.f1446b = true;
                    break;
                case 16:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 53:
                    this.k = Float.intBitsToFloat(aVar.g());
                    this.l = true;
                    break;
                case 56:
                    this.m = aVar.b();
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
                        case 8:
                            this.o = e;
                            this.p = true;
                            break;
                    }
                case 72:
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
                            this.q = e2;
                            this.r = true;
                            break;
                    }
                case 80:
                    this.s = aVar.e();
                    this.t = true;
                    break;
                case 88:
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
                            this.u = e3;
                            this.v = true;
                            break;
                    }
                case 96:
                    this.w = aVar.b();
                    this.x = true;
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
