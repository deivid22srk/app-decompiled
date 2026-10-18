package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class rm extends com.google.protobuf.nano.c {
    private static volatile rm[] i;

    /* renamed from: a, reason: collision with root package name */
    public int f4343a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4344b = false;
    public int c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;

    public static rm[] b() {
        if (i == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (i == null) {
                    i = new rm[0];
                }
            }
        }
        return i;
    }

    public rm() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4343a != 0 || this.f4344b) {
            codedOutputByteBufferNano.a(1, this.f4343a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4343a != 0 || this.f4344b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4343a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(4, this.g);
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
                            this.f4343a = e;
                            this.f4344b = true;
                            break;
                    }
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
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
