package com.google.b.a.a.a.b.a.apkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.apkg.bpkg.c f7557a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.apkg.c f7558b = null;
    public String c = "";
    public String d = "";
    public com.google.b.a.a.a.b.a.apkg.epkg.c e = null;

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7557a != null) {
            codedOutputByteBufferNano.b(1, this.f7557a);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.f7558b != null) {
            codedOutputByteBufferNano.b(4, this.f7558b);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(5, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(6, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7557a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7557a);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.f7558b != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f7558b);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.d);
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(6, this.e);
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
                    if (this.f7557a == null) {
                        this.f7557a = new com.google.b.a.a.a.b.a.apkg.bpkg.c();
                    }
                    aVar.a(this.f7557a);
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 34:
                    if (this.f7558b == null) {
                        this.f7558b = new com.google.b.a.a.a.b.a.apkg.c();
                    }
                    aVar.a(this.f7558b);
                    break;
                case 42:
                    this.d = aVar.c();
                    break;
                case 50:
                    if (this.e == null) {
                        this.e = new com.google.b.a.a.a.b.a.apkg.epkg.c();
                    }
                    aVar.a(this.e);
                    break;
                default:
                    if (!e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
