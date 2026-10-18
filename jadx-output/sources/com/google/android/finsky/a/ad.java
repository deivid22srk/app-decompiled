package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ad extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ac f1443a;

    /* renamed from: b, reason: collision with root package name */
    public z f1444b;
    public y c;
    public af d;
    public aa e;
    public ah f;
    public ab g;

    public ad() {
        b();
    }

    public final ad b() {
        this.f1443a = null;
        this.f1444b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.ar = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1443a != null) {
            codedOutputByteBufferNano.b(1, this.f1443a);
        }
        if (this.f1444b != null) {
            codedOutputByteBufferNano.b(3, this.f1444b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(4, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(5, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(6, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(7, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(8, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1443a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f1443a);
        }
        if (this.f1444b != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.f1444b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.f);
        }
        if (this.g != null) {
            return a2 + CodedOutputByteBufferNano.d(8, this.g);
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
                    if (this.f1443a == null) {
                        this.f1443a = new ac();
                    }
                    aVar.a(this.f1443a);
                    break;
                case 26:
                    if (this.f1444b == null) {
                        this.f1444b = new z();
                    }
                    aVar.a(this.f1444b);
                    break;
                case 34:
                    if (this.c == null) {
                        this.c = new y();
                    }
                    aVar.a(this.c);
                    break;
                case 42:
                    if (this.d == null) {
                        this.d = new af();
                    }
                    aVar.a(this.d);
                    break;
                case 50:
                    if (this.e == null) {
                        this.e = new aa();
                    }
                    aVar.a(this.e);
                    break;
                case 58:
                    if (this.f == null) {
                        this.f = new ah();
                    }
                    aVar.a(this.f);
                    break;
                case 66:
                    if (this.g == null) {
                        this.g = new ab();
                    }
                    aVar.a(this.g);
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
