package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class of extends com.google.protobuf.nano.c {
    private static volatile of[] k;

    /* renamed from: a, reason: collision with root package name */
    public String f4203a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4204b = false;
    public String c = "";
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public int g = 1;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public static of[] b() {
        if (k == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (k == null) {
                    k = new of[0];
                }
            }
        }
        return k;
    }

    public of() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4204b || !this.f4203a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4203a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != 1 || this.h) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4204b || !this.f4203a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4203a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != 0 || this.f) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.g != 1 || this.h) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || this.i) {
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
                case 10:
                    this.f4203a = aVar.c();
                    this.f4204b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 24:
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
                            this.e = e;
                            this.f = true;
                            break;
                    }
                case 32:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.g = e2;
                            this.h = true;
                            break;
                    }
                case 40:
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
