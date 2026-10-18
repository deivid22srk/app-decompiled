package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ca extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3661a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3662b = false;
    public v c = null;
    public ce d = null;
    public String e = "";
    public boolean f = false;

    public ca() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3661a != 1 || this.f3662b) {
            codedOutputByteBufferNano.a(1, this.f3661a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3661a != 1 || this.f3662b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3661a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.d);
        }
        if (this.f || !this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(4, this.e);
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
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f3661a = e;
                            this.f3662b = true;
                            break;
                    }
                case 18:
                    if (this.c == null) {
                        this.c = new v();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    if (this.d == null) {
                        this.d = new ce();
                    }
                    aVar.a(this.d);
                    break;
                case 34:
                    this.e = aVar.c();
                    this.f = true;
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
