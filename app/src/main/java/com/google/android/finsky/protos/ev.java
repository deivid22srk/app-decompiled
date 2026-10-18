package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ev extends com.google.protobuf.nano.c {
    private static volatile ev[] l;

    /* renamed from: a, reason: collision with root package name */
    public int f3802a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3803b = false;
    public ds c = null;
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public String j = "";
    public boolean k = false;

    public static ev[] b() {
        if (l == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (l == null) {
                    l = new ev[0];
                }
            }
        }
        return l;
    }

    public ev() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3803b || this.f3802a != 0) {
            codedOutputByteBufferNano.a(1, this.f3802a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || this.h) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(6, this.j);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3803b || this.f3802a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3802a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.i || this.h) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.k || !this.j.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(6, this.j);
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
                    this.f3802a = aVar.e();
                    this.f3803b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new ds();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 40:
                    this.h = aVar.b();
                    this.i = true;
                    break;
                case 50:
                    this.j = aVar.c();
                    this.k = true;
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
