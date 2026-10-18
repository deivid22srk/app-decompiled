package com.google.android.vending.verifier.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends com.google.protobuf.nano.c {
    public static volatile e[] o;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7124a = com.google.protobuf.nano.e.h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7125b = false;
    public boolean c = false;
    public boolean d = false;
    public byte[] e = com.google.protobuf.nano.e.h;
    public boolean f = false;
    public byte[] g = com.google.protobuf.nano.e.h;
    public boolean h = false;
    public byte[] i = com.google.protobuf.nano.e.h;
    public boolean j = false;
    public long k = 0;
    public boolean l = false;
    public long m = 0;
    public boolean n = false;

    public static e[] b() {
        if (o == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (o == null) {
                    o = new e[0];
                }
            }
        }
        return o;
    }

    public e() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7125b || !Arrays.equals(this.f7124a, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(1, this.f7124a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !Arrays.equals(this.g, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !Arrays.equals(this.i, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.b(6, this.k);
        }
        if (this.n || this.m != 0) {
            codedOutputByteBufferNano.b(7, this.m);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7125b || !Arrays.equals(this.f7124a, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7124a);
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !Arrays.equals(this.g, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !Arrays.equals(this.i, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.l || this.k != 0) {
            a2 += CodedOutputByteBufferNano.e(6, this.k);
        }
        if (this.n || this.m != 0) {
            return a2 + CodedOutputByteBufferNano.e(7, this.m);
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
                    this.f7124a = aVar.d();
                    this.f7125b = true;
                    break;
                case 16:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.d();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.d();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.d();
                    this.j = true;
                    break;
                case 48:
                    this.k = aVar.f();
                    this.l = true;
                    break;
                case 56:
                    this.m = aVar.f();
                    this.n = true;
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
