package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ae extends com.google.protobuf.nano.c {
    private static volatile ae[] g;

    /* renamed from: a, reason: collision with root package name */
    public String f7660a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7661b = "";
    public int c = 0;
    public com.google.b.a.a.a.a.d d = null;
    public String e = "";
    public byte[] f = com.google.protobuf.nano.e.h;

    public static ae[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new ae[0];
                }
            }
        }
        return g;
    }

    public ae() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7660a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7660a);
        }
        if (!this.f7661b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7661b);
        }
        if (this.c != 0) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        if (!Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(7, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(8, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7660a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7660a);
        }
        if (!this.f7661b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7661b);
        }
        if (this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.c);
        }
        if (!Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(6, this.f);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.d);
        }
        if (!this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(8, this.e);
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
                    this.f7660a = aVar.c();
                    break;
                case 18:
                    this.f7661b = aVar.c();
                    break;
                case 40:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = e;
                            break;
                    }
                case 50:
                    this.f = aVar.d();
                    break;
                case 58:
                    if (this.d == null) {
                        this.d = new com.google.b.a.a.a.a.d();
                    }
                    aVar.a(this.d);
                    break;
                case 66:
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
