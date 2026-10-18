package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class bl extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3636a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3637b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public fs g = null;

    public bl() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3636a != 0 || this.f3637b) {
            codedOutputByteBufferNano.a(1, this.f3636a);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(2, this.g);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3636a != 0 || this.f3637b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3636a);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.g);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.d || !this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(4, this.c);
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
                        case 2:
                            this.f3636a = e;
                            this.f3637b = true;
                            break;
                    }
                case 18:
                    if (this.g == null) {
                        this.g = new fs();
                    }
                    aVar.a(this.g);
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    this.c = aVar.c();
                    this.d = true;
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
