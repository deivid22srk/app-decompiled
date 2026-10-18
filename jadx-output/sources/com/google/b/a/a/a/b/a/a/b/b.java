package com.google.b.a.a.a.b.a.a.b;

import com.google.b.a.a.a.b.a.a.b.a.d;
import com.google.b.a.a.a.b.a.a.b.a.n;
import com.google.b.a.a.a.b.a.a.b.a.u;
import com.google.b.a.a.a.b.a.a.b.a.x;
import com.google.b.a.a.a.b.a.a.q;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public n f7600a = null;

    /* renamed from: b, reason: collision with root package name */
    public u f7601b = null;
    public x c = null;
    public q d = null;
    public d e = null;
    public com.google.b.a.a.a.b.a.a.d.b f = null;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7600a != null) {
            codedOutputByteBufferNano.b(2, this.f7600a);
        }
        if (this.f7601b != null) {
            codedOutputByteBufferNano.b(5, this.f7601b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(7, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(11, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(14, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(15, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7600a != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7600a);
        }
        if (this.f7601b != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.f7601b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.e);
        }
        if (this.f != null) {
            return a2 + CodedOutputByteBufferNano.d(15, this.f);
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
                    if (this.f7600a == null) {
                        this.f7600a = new n();
                    }
                    aVar.a(this.f7600a);
                    break;
                case 42:
                    if (this.f7601b == null) {
                        this.f7601b = new u();
                    }
                    aVar.a(this.f7601b);
                    break;
                case 58:
                    if (this.c == null) {
                        this.c = new x();
                    }
                    aVar.a(this.c);
                    break;
                case 90:
                    if (this.d == null) {
                        this.d = new q();
                    }
                    aVar.a(this.d);
                    break;
                case 114:
                    if (this.e == null) {
                        this.e = new d();
                    }
                    aVar.a(this.e);
                    break;
                case 122:
                    if (this.f == null) {
                        this.f = new com.google.b.a.a.a.b.a.a.d.b();
                    }
                    aVar.a(this.f);
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
