package com.google.b.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7551a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f7552b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public int f = 0;
    public int g = 0;
    public float h = 0.0f;
    public float i = 0.0f;
    public int j = 0;
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public long r = 0;
    public b.a.b s = null;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7552b.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7552b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.a(5, this.f);
        }
        if (this.g != 0) {
            codedOutputByteBufferNano.a(6, this.g);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(7, this.h);
        }
        if (Float.floatToIntBits(this.i) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(8, this.i);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.a(9, this.k);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.a(10, this.l);
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.a(11, this.m);
        }
        if (this.s != null) {
            codedOutputByteBufferNano.b(12, this.s);
        }
        if (!this.n.equals("")) {
            codedOutputByteBufferNano.a(13, this.n);
        }
        if (!this.o.equals("")) {
            codedOutputByteBufferNano.a(14, this.o);
        }
        if (this.j != 0) {
            codedOutputByteBufferNano.a(15, this.j);
        }
        if (this.f7551a != 0) {
            codedOutputByteBufferNano.a(16, this.f7551a);
        }
        if (!this.p.equals("")) {
            codedOutputByteBufferNano.a(17, this.p);
        }
        if (!this.q.equals("")) {
            codedOutputByteBufferNano.a(18, this.q);
        }
        if (this.r != 0) {
            codedOutputByteBufferNano.b(19, this.r);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7552b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7552b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (!this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.f);
        }
        if (this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(6, this.g);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            a2 += CodedOutputByteBufferNano.c(7) + 4;
        }
        if (Float.floatToIntBits(this.i) != Float.floatToIntBits(0.0f)) {
            a2 += CodedOutputByteBufferNano.c(8) + 4;
        }
        if (!this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.k);
        }
        if (!this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.l);
        }
        if (!this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.m);
        }
        if (this.s != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.s);
        }
        if (!this.n.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.n);
        }
        if (!this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.o);
        }
        if (this.j != 0) {
            a2 += CodedOutputByteBufferNano.c(15, this.j);
        }
        if (this.f7551a != 0) {
            a2 += CodedOutputByteBufferNano.c(16, this.f7551a);
        }
        if (!this.p.equals("")) {
            a2 += CodedOutputByteBufferNano.b(17, this.p);
        }
        if (!this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(18, this.q);
        }
        if (this.r != 0) {
            return a2 + CodedOutputByteBufferNano.e(19, this.r);
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
                    this.f7552b = aVar.c();
                    break;
                case 18:
                    this.c = aVar.c();
                    break;
                case 26:
                    this.d = aVar.c();
                    break;
                case 34:
                    this.e = aVar.c();
                    break;
                case 40:
                    this.f = aVar.e();
                    break;
                case 48:
                    this.g = aVar.e();
                    break;
                case 61:
                    this.h = Float.intBitsToFloat(aVar.g());
                    break;
                case 69:
                    this.i = Float.intBitsToFloat(aVar.g());
                    break;
                case 74:
                    this.k = aVar.c();
                    break;
                case 82:
                    this.l = aVar.c();
                    break;
                case 90:
                    this.m = aVar.c();
                    break;
                case 98:
                    if (this.s == null) {
                        this.s = new b.a.b();
                    }
                    aVar.a(this.s);
                    break;
                case 106:
                    this.n = aVar.c();
                    break;
                case 114:
                    this.o = aVar.c();
                    break;
                case 120:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.j = e;
                            break;
                    }
                case 128:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                            this.f7551a = e2;
                            break;
                    }
                case 138:
                    this.p = aVar.c();
                    break;
                case 146:
                    this.q = aVar.c();
                    break;
                case 152:
                    this.r = aVar.f();
                    break;
                default:
                    if (!e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
