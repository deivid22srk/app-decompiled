package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ft extends com.google.protobuf.nano.c {
    private static volatile ft[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f3843a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3844b = false;
    public double c = 0.0d;
    public boolean d = false;

    public static ft[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new ft[0];
                }
            }
        }
        return e;
    }

    public ft() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3844b || !this.f3843a.equals("")) {
            codedOutputByteBufferNano.a(3, this.f3843a);
        }
        if (this.d || Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3844b || !this.f3843a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.f3843a);
        }
        if (this.d || Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            return a2 + CodedOutputByteBufferNano.c(4) + 8;
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
                case 26:
                    this.f3843a = aVar.c();
                    this.f3844b = true;
                    break;
                case 33:
                    this.c = Double.longBitsToDouble(aVar.h());
                    this.d = true;
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
