package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class r extends com.google.protobuf.nano.c {
    private static volatile r[] e;

    /* renamed from: a, reason: collision with root package name */
    public int f7686a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f7687b = "";
    public String c = "";
    public String d = "";

    public static r[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new r[0];
                }
            }
        }
        return e;
    }

    public r() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7687b.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7687b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.f7686a != 0) {
            codedOutputByteBufferNano.a(4, this.f7686a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7687b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7687b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.f7686a != 0) {
            return a2 + CodedOutputByteBufferNano.c(4, this.f7686a);
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
                    this.f7687b = aVar.c();
                    break;
                case 18:
                    this.c = aVar.c();
                    break;
                case 26:
                    this.d = aVar.c();
                    break;
                case 32:
                    this.f7686a = aVar.e();
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
