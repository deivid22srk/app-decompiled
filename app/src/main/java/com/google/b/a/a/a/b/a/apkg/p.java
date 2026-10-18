package com.google.b.a.a.a.b.a.apkg;

import com.google.b.a.a.a.b.a.bpkg.ae;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class p extends com.google.protobuf.nano.c {
    public static volatile p[] e;

    /* renamed from: a, reason: collision with root package name */
    public ae f7636a = null;

    /* renamed from: b, reason: collision with root package name */
    public c f7637b = null;
    public m c = null;
    public e d = null;

    public static p[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new p[0];
                }
            }
        }
        return e;
    }

    public p() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7636a != null) {
            codedOutputByteBufferNano.b(1, this.f7636a);
        }
        if (this.f7637b != null) {
            codedOutputByteBufferNano.b(2, this.f7637b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(6, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7636a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7636a);
        }
        if (this.f7637b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7637b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null) {
            return a2 + CodedOutputByteBufferNano.d(6, this.d);
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
                    if (this.f7636a == null) {
                        this.f7636a = new ae();
                    }
                    aVar.a(this.f7636a);
                    break;
                case 18:
                    if (this.f7637b == null) {
                        this.f7637b = new c();
                    }
                    aVar.a(this.f7637b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new m();
                    }
                    aVar.a(this.c);
                    break;
                case 50:
                    if (this.d == null) {
                        this.d = new e();
                    }
                    aVar.a(this.d);
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
