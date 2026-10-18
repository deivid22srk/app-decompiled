package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class l extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public i f4066a = null;

    /* renamed from: b, reason: collision with root package name */
    public j f4067b = null;
    public g c = null;
    public m d = null;
    public h e = null;

    public l() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4066a != null) {
            codedOutputByteBufferNano.b(1, this.f4066a);
        }
        if (this.f4067b != null) {
            codedOutputByteBufferNano.b(2, this.f4067b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4066a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4066a);
        }
        if (this.f4067b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4067b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(5, this.e);
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
                    if (this.f4066a == null) {
                        this.f4066a = new i();
                    }
                    aVar.a(this.f4066a);
                    break;
                case 18:
                    if (this.f4067b == null) {
                        this.f4067b = new j();
                    }
                    aVar.a(this.f4067b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new g();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new m();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new h();
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
