package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class at extends com.google.protobuf.nano.c {
    private static volatile at[] q;

    /* renamed from: a, reason: collision with root package name */
    public int f3607a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3608b = false;
    public String c = "";
    public boolean d = false;
    public ds e = null;
    public byte[] f = com.google.protobuf.nano.e.h;
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public cd l = null;
    public py m = null;
    public ia n = null;
    public byte[] o = com.google.protobuf.nano.e.h;
    public boolean p = false;

    public static at[] b() {
        if (q == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (q == null) {
                    q = new at[0];
                }
            }
        }
        return q;
    }

    public at() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3607a != 0 || this.f3608b) {
            codedOutputByteBufferNano.a(1, this.f3607a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(3, this.j);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(4, this.m);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(5, this.l);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(6, this.n);
        }
        if (this.p || !Arrays.equals(this.o, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(7, this.o);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(8, this.e);
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(9, this.f);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(10, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3607a != 0 || this.f3608b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3607a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.j);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.m);
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.l);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.n);
        }
        if (this.p || !Arrays.equals(this.o, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(7, this.o);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.e);
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(9, this.f);
        }
        if (this.i || !this.h.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(10, this.h);
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
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f3607a = e;
                            this.f3608b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 34:
                    if (this.m == null) {
                        this.m = new py();
                    }
                    aVar.a(this.m);
                    break;
                case 42:
                    if (this.l == null) {
                        this.l = new cd();
                    }
                    aVar.a(this.l);
                    break;
                case 50:
                    if (this.n == null) {
                        this.n = new ia();
                    }
                    aVar.a(this.n);
                    break;
                case 58:
                    this.o = aVar.d();
                    this.p = true;
                    break;
                case 66:
                    if (this.e == null) {
                        this.e = new ds();
                    }
                    aVar.a(this.e);
                    break;
                case 74:
                    this.f = aVar.d();
                    this.g = true;
                    break;
                case 82:
                    this.h = aVar.c();
                    this.i = true;
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
