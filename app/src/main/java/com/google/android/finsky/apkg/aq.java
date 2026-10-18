package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class aq extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f1469a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f1470b = false;
    public long c = 0;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public int i = 0;
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public int m = 0;
    public boolean n = false;
    public float o = 0.0f;
    public boolean p = false;
    public float q = 0.0f;
    public boolean r = false;

    public aq() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1470b || !this.f1469a.equals("")) {
            codedOutputByteBufferNano.a(2, this.f1469a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(6, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(7, this.i);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.a(8, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.a(9, this.m);
        }
        if (this.p || Float.floatToIntBits(this.o) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(10, this.o);
        }
        if (this.r || Float.floatToIntBits(this.q) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(11, this.q);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1470b || !this.f1469a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f1469a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.i);
        }
        if (this.l || this.k != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.k);
        }
        if (this.n || this.m != 0) {
            a2 += CodedOutputByteBufferNano.c(9, this.m);
        }
        if (this.p || Float.floatToIntBits(this.o) != Float.floatToIntBits(0.0f)) {
            a2 += CodedOutputByteBufferNano.c(10) + 4;
        }
        if (this.r || Float.floatToIntBits(this.q) != Float.floatToIntBits(0.0f)) {
            return a2 + CodedOutputByteBufferNano.c(11) + 4;
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
                case 18:
                    this.f1469a = aVar.c();
                    this.f1470b = true;
                    break;
                case 24:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 40:
                    this.e = aVar.e();
                    this.f = true;
                    break;
                case 50:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 56:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 64:
                    this.k = aVar.e();
                    this.l = true;
                    break;
                case 72:
                    this.m = aVar.e();
                    this.n = true;
                    break;
                case 85:
                    this.o = Float.intBitsToFloat(aVar.g());
                    this.p = true;
                    break;
                case 93:
                    this.q = Float.intBitsToFloat(aVar.g());
                    this.r = true;
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
