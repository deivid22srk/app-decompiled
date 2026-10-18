package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sn extends com.google.protobuf.nano.c {
    private static volatile sn[] i;

    /* renamed from: a, reason: collision with root package name */
    public String f4392a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4393b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public int g = 0;
    public boolean h = false;

    public static sn[] b() {
        if (i == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (i == null) {
                    i = new sn[0];
                }
            }
        }
        return i;
    }

    public sn() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4393b || !this.f4392a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4392a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != 0 || this.h) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4393b || !this.f4392a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4392a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g != 0 || this.h) {
            return a2 + CodedOutputByteBufferNano.c(4, this.g);
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
                    this.f4392a = aVar.c();
                    this.f4393b = true;
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
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.g = e;
                            this.h = true;
                            break;
                    }
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
