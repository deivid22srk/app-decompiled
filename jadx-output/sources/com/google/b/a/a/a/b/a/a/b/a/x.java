package com.google.b.a.a.a.b.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7596a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7597b = "";
    public int c = 0;
    public byte[] d = com.google.protobuf.nano.e.h;
    public String e = "";
    public com.google.b.a.a.a.b.a.b.x f = null;
    public com.google.b.a.a.a.b.a.b.x g = null;
    public String h = "";
    public com.google.b.a.a.a.b.a.a.c.b i = null;

    public x() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7596a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7596a);
        }
        if (this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (!Arrays.equals(this.d, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(5, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(6, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.a(7, this.h);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(8, this.i);
        }
        if (!this.f7597b.equals("")) {
            codedOutputByteBufferNano.a(9, this.f7597b);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(10, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7596a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7596a);
        }
        if (this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (!Arrays.equals(this.d, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(4, this.d);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.g);
        }
        if (!this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.h);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.i);
        }
        if (!this.f7597b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.f7597b);
        }
        if (!this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(10, this.e);
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
                    this.f7596a = aVar.c();
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.c = e;
                            break;
                    }
                case 34:
                    this.d = aVar.d();
                    break;
                case 42:
                    if (this.f == null) {
                        this.f = new com.google.b.a.a.a.b.a.b.x();
                    }
                    aVar.a(this.f);
                    break;
                case 50:
                    if (this.g == null) {
                        this.g = new com.google.b.a.a.a.b.a.b.x();
                    }
                    aVar.a(this.g);
                    break;
                case 58:
                    this.h = aVar.c();
                    break;
                case 66:
                    if (this.i == null) {
                        this.i = new com.google.b.a.a.a.b.a.a.c.b();
                    }
                    aVar.a(this.i);
                    break;
                case 74:
                    this.f7597b = aVar.c();
                    break;
                case 82:
                    this.e = aVar.c();
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
