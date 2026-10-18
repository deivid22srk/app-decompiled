package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gc extends com.google.protobuf.nano.c {
    private static volatile gc[] x;

    /* renamed from: a, reason: collision with root package name */
    public String f3859a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3860b = false;
    public String c = "";
    public boolean d = false;
    public ds e = null;
    public int f = 0;
    public boolean g = false;
    public gd h = null;
    public byte[] i = com.google.protobuf.nano.e.h;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public float m = 0.0f;
    public boolean n = false;
    public int o = 0;
    public boolean p = false;
    public String q = "";
    public boolean r = false;
    public String s = "";
    public boolean t = false;
    public gg u = null;
    public ge v = null;
    public gf w = null;

    public static gc[] b() {
        if (x == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (x == null) {
                    x = new gc[0];
                }
            }
        }
        return x;
    }

    public gc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3860b || !this.f3859a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3859a);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(2, this.e);
        }
        if (this.g || this.f != 0) {
            codedOutputByteBufferNano.a(3, this.f);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(4, this.h);
        }
        if (this.j || !Arrays.equals(this.i, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k) {
            codedOutputByteBufferNano.a(6, this.k);
        }
        if (this.n || Float.floatToIntBits(this.m) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(7, this.m);
        }
        if (this.p || this.o != 0) {
            codedOutputByteBufferNano.a(8, this.o);
        }
        if (this.r || !this.q.equals("")) {
            codedOutputByteBufferNano.a(9, this.q);
        }
        if (this.t || !this.s.equals("")) {
            codedOutputByteBufferNano.a(10, this.s);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(11, this.c);
        }
        if (this.u != null) {
            codedOutputByteBufferNano.b(12, this.u);
        }
        if (this.v != null) {
            codedOutputByteBufferNano.b(13, this.v);
        }
        if (this.w != null) {
            codedOutputByteBufferNano.b(14, this.w);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3860b || !this.f3859a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3859a);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.e);
        }
        if (this.g || this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.f);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.h);
        }
        if (this.j || !Arrays.equals(this.i, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.l || this.k) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.n || Float.floatToIntBits(this.m) != Float.floatToIntBits(0.0f)) {
            a2 += CodedOutputByteBufferNano.c(7) + 4;
        }
        if (this.p || this.o != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.o);
        }
        if (this.r || !this.q.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.q);
        }
        if (this.t || !this.s.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.s);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.c);
        }
        if (this.u != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.u);
        }
        if (this.v != null) {
            a2 += CodedOutputByteBufferNano.d(13, this.v);
        }
        if (this.w != null) {
            return a2 + CodedOutputByteBufferNano.d(14, this.w);
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
                    this.f3859a = aVar.c();
                    this.f3860b = true;
                    break;
                case 18:
                    if (this.e == null) {
                        this.e = new ds();
                    }
                    aVar.a(this.e);
                    break;
                case 24:
                    this.f = aVar.e();
                    this.g = true;
                    break;
                case 34:
                    if (this.h == null) {
                        this.h = new gd();
                    }
                    aVar.a(this.h);
                    break;
                case 42:
                    this.i = aVar.d();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.b();
                    this.l = true;
                    break;
                case 61:
                    this.m = Float.intBitsToFloat(aVar.g());
                    this.n = true;
                    break;
                case 64:
                    this.o = aVar.e();
                    this.p = true;
                    break;
                case 74:
                    this.q = aVar.c();
                    this.r = true;
                    break;
                case 82:
                    this.s = aVar.c();
                    this.t = true;
                    break;
                case 90:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 98:
                    if (this.u == null) {
                        this.u = new gg();
                    }
                    aVar.a(this.u);
                    break;
                case 106:
                    if (this.v == null) {
                        this.v = new ge();
                    }
                    aVar.a(this.v);
                    break;
                case 114:
                    if (this.w == null) {
                        this.w = new gf();
                    }
                    aVar.a(this.w);
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
