package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class n extends com.google.protobuf.nano.c {
    private static volatile n[] d;

    /* renamed from: a, reason: collision with root package name */
    public String f7682a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7683b = "";
    public String c = "";

    public static n[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new n[0];
                }
            }
        }
        return d;
    }

    public n() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7682a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7682a);
        }
        if (!this.f7683b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7683b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7682a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7682a);
        }
        if (!this.f7683b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7683b);
        }
        if (!this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(3, this.c);
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
                    this.f7682a = aVar.c();
                    break;
                case 18:
                    this.f7683b = aVar.c();
                    break;
                case 26:
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
