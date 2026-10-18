package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class pe extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4241a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4242b = false;
    public jy c = null;
    public String d = "";
    public boolean e = false;
    public int f = 0;
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public aj j = null;
    public an k = null;

    public pe() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4242b || !this.f4241a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4241a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || this.f != 0) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(6, this.j);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(7, this.k);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4242b || !this.f4241a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4241a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.f);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.h);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.j);
        }
        if (this.k != null) {
            return a2 + CodedOutputByteBufferNano.d(7, this.k);
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
                    this.f4241a = aVar.c();
                    this.f4242b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new jy();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 32:
                    this.f = aVar.e();
                    this.g = true;
                    break;
                case 42:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 50:
                    if (this.j == null) {
                        this.j = new aj();
                    }
                    aVar.a(this.j);
                    break;
                case 58:
                    if (this.k == null) {
                        this.k = new an();
                    }
                    aVar.a(this.k);
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
