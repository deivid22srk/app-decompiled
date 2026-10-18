package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.b.a.a.a.b.a.bpkg.ae;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class y extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ae f7598a = null;

    /* renamed from: b, reason: collision with root package name */
    public ae f7599b = null;
    public String c = "";
    public int d = 0;
    public String e = "";

    public y() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7598a != null) {
            codedOutputByteBufferNano.b(1, this.f7598a);
        }
        if (this.f7599b != null) {
            codedOutputByteBufferNano.b(2, this.f7599b);
        }
        if (this.d != 0) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7598a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7598a);
        }
        if (this.f7599b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7599b);
        }
        if (this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.d);
        }
        if (!this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (!this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.c);
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
                    if (this.f7598a == null) {
                        this.f7598a = new ae();
                    }
                    aVar.a(this.f7598a);
                    break;
                case 18:
                    if (this.f7599b == null) {
                        this.f7599b = new ae();
                    }
                    aVar.a(this.f7599b);
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.d = e;
                            break;
                    }
                case 34:
                    this.e = aVar.c();
                    break;
                case 42:
                    this.c = aVar.c();
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
