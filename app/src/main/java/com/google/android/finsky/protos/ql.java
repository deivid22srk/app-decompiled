package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ql extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public gx f4297a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f4298b = "";
    public boolean c = false;
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;

    public ql() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4297a != null) {
            codedOutputByteBufferNano.b(1, this.f4297a);
        }
        if (this.c || !this.f4298b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4298b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || this.h) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4297a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4297a);
        }
        if (this.c || !this.f4298b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4298b);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.i || this.h) {
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
                    if (this.f4297a == null) {
                        this.f4297a = new gx();
                    }
                    aVar.a(this.f4297a);
                    break;
                case 18:
                    this.f4298b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 40:
                    this.h = aVar.b();
                    this.i = true;
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
