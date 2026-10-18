package com.google.b.a.a.a.b.a.a.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {
    private static volatile d[] c;

    /* renamed from: a, reason: collision with root package name */
    public String f7608a = "";

    /* renamed from: b, reason: collision with root package name */
    public b f7609b = null;

    public static d[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new d[0];
                }
            }
        }
        return c;
    }

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7608a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7608a);
        }
        if (this.f7609b != null) {
            codedOutputByteBufferNano.b(2, this.f7609b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7608a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7608a);
        }
        if (this.f7609b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f7609b);
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
                    this.f7608a = aVar.c();
                    break;
                case 18:
                    if (this.f7609b == null) {
                        this.f7609b = new b();
                    }
                    aVar.a(this.f7609b);
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
