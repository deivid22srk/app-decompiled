package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class nu extends com.google.protobuf.nano.c {
    private static volatile nu[] k;

    /* renamed from: a, reason: collision with root package name */
    public long f4185a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4186b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public int i = 0;
    public boolean j = false;

    public static nu[] b() {
        if (k == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (k == null) {
                    k = new nu[0];
                }
            }
        }
        return k;
    }

    public nu() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4186b || this.f4185a != 0) {
            codedOutputByteBufferNano.b(1, this.f4185a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(4, this.i);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4186b || this.f4185a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f4185a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.i);
        }
        if (this.h || this.g != 0) {
            return a2 + CodedOutputByteBufferNano.d(5, this.g);
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
                    this.f4185a = aVar.f();
                    this.f4186b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 32:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 40:
                    this.g = aVar.f();
                    this.h = true;
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
