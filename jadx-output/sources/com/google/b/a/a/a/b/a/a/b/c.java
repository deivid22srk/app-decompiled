package com.google.b.a.a.a.b.a.a.b;

import com.google.b.a.a.a.b.a.a.b.a.e;
import com.google.b.a.a.a.b.a.a.b.a.o;
import com.google.b.a.a.a.b.a.a.b.a.v;
import com.google.b.a.a.a.b.a.a.b.a.y;
import com.google.b.a.a.a.b.a.a.s;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public o f7602a = null;

    /* renamed from: b, reason: collision with root package name */
    public v f7603b = null;
    public y c = null;
    public s d = null;
    public e e = null;
    public com.google.b.a.a.a.b.a.a.d.c f = null;

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7602a != null) {
            codedOutputByteBufferNano.b(1, this.f7602a);
        }
        if (this.f7603b != null) {
            codedOutputByteBufferNano.b(4, this.f7603b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(6, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(11, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(12, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(13, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7602a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7602a);
        }
        if (this.f7603b != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f7603b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(12, this.e);
        }
        if (this.f != null) {
            return a2 + CodedOutputByteBufferNano.d(13, this.f);
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
                    if (this.f7602a == null) {
                        this.f7602a = new o();
                    }
                    aVar.a(this.f7602a);
                    break;
                case 34:
                    if (this.f7603b == null) {
                        this.f7603b = new v();
                    }
                    aVar.a(this.f7603b);
                    break;
                case 50:
                    if (this.c == null) {
                        this.c = new y();
                    }
                    aVar.a(this.c);
                    break;
                case 90:
                    if (this.d == null) {
                        this.d = new s();
                    }
                    aVar.a(this.d);
                    break;
                case 98:
                    if (this.e == null) {
                        this.e = new e();
                    }
                    aVar.a(this.e);
                    break;
                case 106:
                    if (this.f == null) {
                        this.f = new com.google.b.a.a.a.b.a.a.d.c();
                    }
                    aVar.a(this.f);
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
