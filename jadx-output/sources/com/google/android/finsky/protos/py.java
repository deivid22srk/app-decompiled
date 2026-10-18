package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class py extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4277a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4278b = false;
    public dp c = null;
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;

    public py() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4278b || !this.f4277a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4277a);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(2, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(3, this.f);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(4, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4278b || !this.f4277a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4277a);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.f);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(4, this.c);
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
                    this.f4277a = aVar.c();
                    this.f4278b = true;
                    break;
                case 18:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 26:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 34:
                    if (this.c == null) {
                        this.c = new dp();
                    }
                    aVar.a(this.c);
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
