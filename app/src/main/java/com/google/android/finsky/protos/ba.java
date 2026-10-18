package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ba extends com.google.protobuf.nano.c {
    private static volatile ba[] m;

    /* renamed from: a, reason: collision with root package name */
    public String f3619a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3620b = false;
    public ds c = null;
    public np d = null;
    public boolean e = false;
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public byte[] k = com.google.protobuf.nano.e.h;
    public boolean l = false;

    public static ba[] b() {
        if (m == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (m == null) {
                    m = new ba[0];
                }
            }
        }
        return m;
    }

    public ba() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3620b || !this.f3619a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3619a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(5, this.k);
        }
        if (this.g != 0 || this.h) {
            codedOutputByteBufferNano.a(6, this.g);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(7, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3620b || !this.f3619a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3619a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.d);
        }
        if (this.f || this.e) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.l || !Arrays.equals(this.k, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(5, this.k);
        }
        if (this.g != 0 || this.h) {
            a2 += CodedOutputByteBufferNano.c(6, this.g);
        }
        if (this.j || this.i) {
            return a2 + CodedOutputByteBufferNano.c(7) + 1;
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
                    this.f3619a = aVar.c();
                    this.f3620b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new ds();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    if (this.d == null) {
                        this.d = new np();
                    }
                    aVar.a(this.d);
                    break;
                case 32:
                    this.e = aVar.b();
                    this.f = true;
                    break;
                case 42:
                    this.k = aVar.d();
                    this.l = true;
                    break;
                case 48:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.g = e;
                            this.h = true;
                            break;
                    }
                case 56:
                    this.i = aVar.b();
                    this.j = true;
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
