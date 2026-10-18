package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ao extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f1465a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1466b;
    public String c;
    public boolean d;
    public long e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public boolean j;
    public byte[] k;
    public boolean l;
    public byte[] m;
    public boolean n;
    public int o;
    public boolean p;

    public ao() {
        b();
    }

    public final ao b() {
        this.f1465a = "";
        this.f1466b = false;
        this.c = "";
        this.d = false;
        this.e = 0L;
        this.f = false;
        this.g = 0;
        this.h = false;
        this.i = 0;
        this.j = false;
        this.k = com.google.protobuf.nano.e.h;
        this.l = false;
        this.m = com.google.protobuf.nano.e.h;
        this.n = false;
        this.o = 0;
        this.p = false;
        this.ar = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1466b || !this.f1465a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f1465a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g != 0 || this.h) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || !Arrays.equals(this.m, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1466b || !this.f1465a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f1465a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.e);
        }
        if (this.g != 0 || this.h) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.i);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(6, this.k);
        }
        if (this.n || !Arrays.equals(this.m, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(7, this.m);
        }
        if (this.p || this.o != 0) {
            return a2 + CodedOutputByteBufferNano.c(8, this.o);
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
                    this.f1465a = aVar.c();
                    this.f1466b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 32:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.g = e;
                            this.h = true;
                            break;
                    }
                case 40:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 50:
                    this.k = aVar.d();
                    this.l = true;
                    break;
                case 58:
                    this.m = aVar.d();
                    this.n = true;
                    break;
                case 64:
                    this.o = aVar.e();
                    this.p = true;
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
