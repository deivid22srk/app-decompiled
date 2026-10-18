package com.google.android.vending.verifier.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends com.google.protobuf.nano.c {
    public static volatile k[] j;

    /* renamed from: a, reason: collision with root package name */
    public int f7136a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7137b = false;
    public l c = null;
    public byte[] d = com.google.protobuf.nano.e.h;
    public boolean e = false;
    public byte[] f = com.google.protobuf.nano.e.h;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;

    public static k[] b() {
        if (j == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (j == null) {
                    j = new k[0];
                }
            }
        }
        return j;
    }

    public k() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7136a != 0 || this.f7137b) {
            codedOutputByteBufferNano.a(1, this.f7136a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e || !Arrays.equals(this.d, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || this.h) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7136a != 0 || this.f7137b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7136a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.e || !Arrays.equals(this.d, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.i || this.h) {
            return a2 + CodedOutputByteBufferNano.c(5) + 1;
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
                        case 3:
                            this.f7136a = e;
                            this.f7137b = true;
                            break;
                    }
                case 18:
                    if (this.c == null) {
                        this.c = new l();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    this.d = aVar.d();
                    this.e = true;
                    break;
                case 34:
                    this.f = aVar.d();
                    this.g = true;
                    break;
                case 40:
                    this.h = aVar.b();
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
