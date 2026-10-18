package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x extends com.google.protobuf.nano.c {
    private static volatile x[] o;

    /* renamed from: a, reason: collision with root package name */
    public String f7692a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f7693b = 0;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public t g = null;
    public byte[] h = com.google.protobuf.nano.e.h;
    public int i = 0;
    public int j = 0;
    public ac k = null;
    public aa l = null;
    public y m = null;
    public z n = null;

    public static x[] b() {
        if (o == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (o == null) {
                    o = new x[0];
                }
            }
        }
        return o;
    }

    public x() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7692a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7692a);
        }
        if (this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.d) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(6, this.k);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(7, this.l);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(9, this.g);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(10, this.m);
        }
        if (this.e) {
            codedOutputByteBufferNano.a(11, this.e);
        }
        if (!Arrays.equals(this.h, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(14, this.h);
        }
        if (this.f7693b != 0) {
            codedOutputByteBufferNano.a(15, this.f7693b);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(16, this.n);
        }
        if (this.i != 0) {
            codedOutputByteBufferNano.a(17, this.i);
        }
        if (this.j != 0) {
            codedOutputByteBufferNano.a(18, this.j);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7692a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7692a);
        }
        if (this.c) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.d) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.k);
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.l);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.g);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.m);
        }
        if (this.e) {
            a2 += CodedOutputByteBufferNano.c(11) + 1;
        }
        if (!Arrays.equals(this.h, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(14, this.h);
        }
        if (this.f7693b != 0) {
            a2 += CodedOutputByteBufferNano.c(15, this.f7693b);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(16, this.n);
        }
        if (this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(17, this.i);
        }
        if (this.j != 0) {
            return a2 + CodedOutputByteBufferNano.c(18, this.j);
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
                    this.f7692a = aVar.c();
                    break;
                case 16:
                    this.c = aVar.b();
                    break;
                case 24:
                    this.d = aVar.b();
                    break;
                case 34:
                    this.f = aVar.c();
                    break;
                case 50:
                    if (this.k == null) {
                        this.k = new ac();
                    }
                    aVar.a(this.k);
                    break;
                case 58:
                    if (this.l == null) {
                        this.l = new aa();
                    }
                    aVar.a(this.l);
                    break;
                case 74:
                    if (this.g == null) {
                        this.g = new t();
                    }
                    aVar.a(this.g);
                    break;
                case 82:
                    if (this.m == null) {
                        this.m = new y();
                    }
                    aVar.a(this.m);
                    break;
                case 88:
                    this.e = aVar.b();
                    break;
                case 114:
                    this.h = aVar.d();
                    break;
                case 120:
                    this.f7693b = aVar.e();
                    break;
                case 130:
                    if (this.n == null) {
                        this.n = new z();
                    }
                    aVar.a(this.n);
                    break;
                case 136:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.i = e;
                            break;
                    }
                case 144:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.j = e2;
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
