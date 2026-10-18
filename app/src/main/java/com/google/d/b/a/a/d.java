package com.google.d.b.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {
    private static volatile d[] c;

    /* renamed from: a, reason: collision with root package name */
    public int f7741a = 0;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.b f7742b = null;

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
        if (this.f7741a != 0) {
            codedOutputByteBufferNano.a(1, this.f7741a);
        }
        if (this.f7742b != null) {
            codedOutputByteBufferNano.b(2, this.f7742b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7741a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7741a);
        }
        if (this.f7742b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f7742b);
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
                    this.f7741a = aVar.e();
                    break;
                case 18:
                    if (this.f7742b == null) {
                        this.f7742b = new com.google.b.a.a.a.b.a.b();
                    }
                    aVar.a(this.f7742b);
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
