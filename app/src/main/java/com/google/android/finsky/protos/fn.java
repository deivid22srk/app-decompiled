package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fn extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public fl f3832a = null;

    /* renamed from: b, reason: collision with root package name */
    public fl f3833b = null;
    public fm c = null;
    public String d = "";
    public boolean e = false;
    public ds f = null;
    public String g = "";
    public boolean h = false;

    public fn() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3832a != null) {
            codedOutputByteBufferNano.b(1, this.f3832a);
        }
        if (this.f3833b != null) {
            codedOutputByteBufferNano.b(2, this.f3833b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(6, this.g);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(7, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3832a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3832a);
        }
        if (this.f3833b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3833b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.d);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.g);
        }
        if (this.f != null) {
            return a2 + CodedOutputByteBufferNano.d(7, this.f);
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
                    if (this.f3832a == null) {
                        this.f3832a = new fl();
                    }
                    aVar.a(this.f3832a);
                    break;
                case 18:
                    if (this.f3833b == null) {
                        this.f3833b = new fl();
                    }
                    aVar.a(this.f3833b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new fm();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 50:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 58:
                    if (this.f == null) {
                        this.f = new ds();
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
