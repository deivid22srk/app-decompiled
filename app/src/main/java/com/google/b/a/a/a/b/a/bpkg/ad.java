package com.google.b.a.a.a.b.a.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class ad extends com.google.protobuf.nano.c {
    public static volatile ad[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f7658a = "";

    /* renamed from: b, reason: collision with root package name */
    public double f7659b = Double.MAX_VALUE;
    public double c = -1.7976931348623157E308d;
    public String d = "";

    public static ad[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new ad[0];
                }
            }
        }
        return e;
    }

    public ad() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7658a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7658a);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(2, this.d);
        }
        if (Double.doubleToLongBits(this.f7659b) != Double.doubleToLongBits(Double.MAX_VALUE)) {
            codedOutputByteBufferNano.a(4, this.f7659b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(-1.7976931348623157E308d)) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7658a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7658a);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.d);
        }
        if (Double.doubleToLongBits(this.f7659b) != Double.doubleToLongBits(Double.MAX_VALUE)) {
            a2 += CodedOutputByteBufferNano.c(4) + 8;
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(-1.7976931348623157E308d)) {
            return a2 + CodedOutputByteBufferNano.c(5) + 8;
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
                    this.f7658a = aVar.c();
                    break;
                case 18:
                    this.d = aVar.c();
                    break;
                case 33:
                    this.f7659b = Double.longBitsToDouble(aVar.h());
                    break;
                case 41:
                    this.c = Double.longBitsToDouble(aVar.h());
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
