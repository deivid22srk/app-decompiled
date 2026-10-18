package com.google.b.a.a.a.b.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7604a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7605b = com.google.protobuf.nano.e.h;
    public com.google.c.a.b c = null;
    public String d = "";
    public boolean e = false;

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.c != null) {
            codedOutputByteBufferNano.b(1, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(2, this.d);
        }
        if (this.e) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (!this.f7604a.equals("")) {
            codedOutputByteBufferNano.a(5, this.f7604a);
        }
        if (!Arrays.equals(this.f7605b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(7, this.f7605b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.d);
        }
        if (this.e) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (!this.f7604a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.f7604a);
        }
        if (!Arrays.equals(this.f7605b, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(7, this.f7605b);
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
                    if (this.c == null) {
                        this.c = new com.google.c.a.b();
                    }
                    aVar.a(this.c);
                    break;
                case 18:
                    this.d = aVar.c();
                    break;
                case 24:
                    this.e = aVar.b();
                    break;
                case 42:
                    this.f7604a = aVar.c();
                    break;
                case 58:
                    this.f7605b = aVar.d();
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
