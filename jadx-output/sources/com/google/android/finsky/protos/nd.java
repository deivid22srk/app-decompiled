package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class nd extends com.google.protobuf.nano.c {
    private static volatile nd[] g;

    /* renamed from: a, reason: collision with root package name */
    public gn f4160a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f4161b = "";
    public boolean c = false;
    public ne d = null;
    public nf e = null;
    public ng f = null;

    public static nd[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new nd[0];
                }
            }
        }
        return g;
    }

    public nd() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.c || !this.f4161b.equals("")) {
            codedOutputByteBufferNano.a(3, this.f4161b);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        if (this.f4160a != null) {
            codedOutputByteBufferNano.b(7, this.f4160a);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(9, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.c || !this.f4161b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.f4161b);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.e);
        }
        if (this.f4160a != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.f4160a);
        }
        if (this.f != null) {
            return a2 + CodedOutputByteBufferNano.d(9, this.f);
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
                case 26:
                    this.f4161b = aVar.c();
                    this.c = true;
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new ne();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new nf();
                    }
                    aVar.a(this.e);
                    break;
                case 58:
                    if (this.f4160a == null) {
                        this.f4160a = new gn();
                    }
                    aVar.a(this.f4160a);
                    break;
                case 74:
                    if (this.f == null) {
                        this.f = new ng();
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
