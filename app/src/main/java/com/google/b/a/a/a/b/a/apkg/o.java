package com.google.b.a.a.a.b.a.apkg;

import com.google.b.a.a.a.b.a.bpkg.x;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class o extends com.google.protobuf.nano.c {
    public static volatile o[] g;

    /* renamed from: a, reason: collision with root package name */
    public x f7634a = null;

    /* renamed from: b, reason: collision with root package name */
    public b f7635b = null;
    public com.google.b.a.a.a.b.a.bpkg.r c = null;
    public l d = null;
    public d e = null;
    public boolean f = false;

    public static o[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new o[0];
                }
            }
        }
        return g;
    }

    public o() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7634a != null) {
            codedOutputByteBufferNano.b(1, this.f7634a);
        }
        if (this.f7635b != null) {
            codedOutputByteBufferNano.b(2, this.f7635b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.f) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(8, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7634a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7634a);
        }
        if (this.f7635b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7635b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.f) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(8, this.e);
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
                    if (this.f7634a == null) {
                        this.f7634a = new x();
                    }
                    aVar.a(this.f7634a);
                    break;
                case 18:
                    if (this.f7635b == null) {
                        this.f7635b = new b();
                    }
                    aVar.a(this.f7635b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.bpkg.r();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new l();
                    }
                    aVar.a(this.d);
                    break;
                case 48:
                    this.f = aVar.b();
                    break;
                case 66:
                    if (this.e == null) {
                        this.e = new d();
                    }
                    aVar.a(this.e);
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
