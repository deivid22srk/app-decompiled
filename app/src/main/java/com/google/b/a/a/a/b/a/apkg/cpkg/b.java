package com.google.b.a.a.a.b.a.apkg.cpkg;

import com.google.b.a.a.a.b.a.bpkg.r;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public r f7606a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f7607b = "";
    public String c = "";

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7607b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7607b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.f7606a != null) {
            codedOutputByteBufferNano.b(5, this.f7606a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7607b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7607b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.f7606a != null) {
            return a2 + CodedOutputByteBufferNano.d(5, this.f7606a);
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
                case 18:
                    this.f7607b = aVar.c();
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 42:
                    if (this.f7606a == null) {
                        this.f7606a = new r();
                    }
                    aVar.a(this.f7606a);
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
