package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class r extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public f f4321a = null;

    /* renamed from: b, reason: collision with root package name */
    public f f4322b = null;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public l i = null;

    public r() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4321a != null) {
            codedOutputByteBufferNano.b(1, this.f4321a);
        }
        if (this.f4322b != null) {
            codedOutputByteBufferNano.b(2, this.f4322b);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(5, this.i);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(6, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4321a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4321a);
        }
        if (this.f4322b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4322b);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.i);
        }
        if (this.d || !this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(6, this.c);
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
                    if (this.f4321a == null) {
                        this.f4321a = new f();
                    }
                    aVar.a(this.f4321a);
                    break;
                case 18:
                    if (this.f4322b == null) {
                        this.f4322b = new f();
                    }
                    aVar.a(this.f4322b);
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 42:
                    if (this.i == null) {
                        this.i = new l();
                    }
                    aVar.a(this.i);
                    break;
                case 50:
                    this.c = aVar.c();
                    this.d = true;
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
