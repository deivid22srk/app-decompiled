package com.google.b.a.a.a.b.a.apkg;

import com.google.b.a.a.a.b.a.bpkg.x;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class l extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public x f7630a = null;

    /* renamed from: b, reason: collision with root package name */
    public h f7631b = null;
    public String c = "";
    public String d = "";

    public l() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7630a != null) {
            codedOutputByteBufferNano.b(1, this.f7630a);
        }
        if (this.f7631b != null) {
            codedOutputByteBufferNano.b(2, this.f7631b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7630a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7630a);
        }
        if (this.f7631b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7631b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (!this.d.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(4, this.d);
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
                    if (this.f7630a == null) {
                        this.f7630a = new x();
                    }
                    aVar.a(this.f7630a);
                    break;
                case 18:
                    if (this.f7631b == null) {
                        this.f7631b = new h();
                    }
                    aVar.a(this.f7631b);
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 34:
                    this.d = aVar.c();
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
