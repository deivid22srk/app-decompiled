package com.google.b.a.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7698a = com.google.protobuf.nano.e.h;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.a.b f7699b = null;
    public String c = "";
    public int d = 0;
    public long e = 0;
    public String f = "";
    public com.google.d.a.a.b g = null;
    public boolean h = false;

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f7698a, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7698a);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(7, this.c);
        }
        if (this.d != 0) {
            codedOutputByteBufferNano.a(8, this.d);
        }
        if (this.e != 0) {
            codedOutputByteBufferNano.b(9, this.e);
        }
        if (this.f7699b != null) {
            codedOutputByteBufferNano.b(10, this.f7699b);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(11, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(12, this.g);
        }
        if (this.h) {
            codedOutputByteBufferNano.a(13, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!Arrays.equals(this.f7698a, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7698a);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.c);
        }
        if (this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(8, this.d);
        }
        if (this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(9, this.e);
        }
        if (this.f7699b != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.f7699b);
        }
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.g);
        }
        if (this.h) {
            return a2 + CodedOutputByteBufferNano.c(13) + 1;
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
                case 18:
                    this.f7698a = aVar.d();
                    break;
                case 58:
                    this.c = aVar.c();
                    break;
                case 64:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.d = e;
                            break;
                    }
                case 72:
                    this.e = aVar.f();
                    break;
                case 82:
                    if (this.f7699b == null) {
                        this.f7699b = new com.google.b.a.a.a.a.b();
                    }
                    aVar.a(this.f7699b);
                    break;
                case 90:
                    this.f = aVar.c();
                    break;
                case 98:
                    if (this.g == null) {
                        this.g = new com.google.d.a.a.b();
                    }
                    aVar.a(this.g);
                    break;
                case 104:
                    this.h = aVar.b();
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
