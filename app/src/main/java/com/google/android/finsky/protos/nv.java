package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class nv extends com.google.protobuf.nano.c {
    private static volatile nv[] j;

    /* renamed from: a, reason: collision with root package name */
    public dp f4187a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f4188b = "";
    public boolean c = false;
    public int d = 0;
    public boolean e = false;
    public ds f = null;
    public int g = 0;
    public boolean h = false;
    public in i = null;

    public static nv[] b() {
        if (j == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (j == null) {
                    j = new nv[0];
                }
            }
        }
        return j;
    }

    public nv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4187a != null) {
            codedOutputByteBufferNano.b(1, this.f4187a);
        }
        if (this.c || !this.f4188b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4188b);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(8, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4187a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4187a);
        }
        if (this.c || !this.f4188b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4188b);
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.d);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.g);
        }
        if (this.i != null) {
            return a2 + CodedOutputByteBufferNano.d(8, this.i);
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
                    if (this.f4187a == null) {
                        this.f4187a = new dp();
                    }
                    aVar.a(this.f4187a);
                    break;
                case 18:
                    this.f4188b = aVar.c();
                    this.c = true;
                    break;
                case 24:
                    this.d = aVar.e();
                    this.e = true;
                    break;
                case 34:
                    if (this.f == null) {
                        this.f = new ds();
                    }
                    aVar.a(this.f);
                    break;
                case 40:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 66:
                    if (this.i == null) {
                        this.i = new in();
                    }
                    aVar.a(this.i);
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
