package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lk extends com.google.protobuf.nano.c {
    private static volatile lk[] k;

    /* renamed from: a, reason: collision with root package name */
    public String f4084a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4085b = false;
    public byte[] c = com.google.protobuf.nano.e.h;
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public long i = 0;
    public boolean j = false;

    public static lk[] b() {
        if (k == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (k == null) {
                    k = new lk[0];
                }
            }
        }
        return k;
    }

    public lk() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4085b || !this.f4084a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4084a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.b(5, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4085b || !this.f4084a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4084a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.e(4, this.g);
        }
        if (this.j || this.i != 0) {
            return a2 + CodedOutputByteBufferNano.e(5, this.i);
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
                    this.f4084a = aVar.c();
                    this.f4085b = true;
                    break;
                case 18:
                    this.c = aVar.d();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.f();
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
