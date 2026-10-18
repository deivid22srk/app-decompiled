package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ab extends com.google.protobuf.nano.c {
    private static volatile ab[] l;

    /* renamed from: a, reason: collision with root package name */
    public String f3578a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3579b = false;
    public long c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public il[] k = il.b();

    public static ab[] b() {
        if (l == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (l == null) {
                    l = new ab[0];
                }
            }
        }
        return l;
    }

    public ab() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3579b || !this.f3578a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3578a);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(2, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(3, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(4, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i = 0; i < this.k.length; i++) {
                il ilVar = this.k[i];
                if (ilVar != null) {
                    codedOutputByteBufferNano.b(5, ilVar);
                }
            }
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(6, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3579b || !this.f3578a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3578a);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.k.length; i2++) {
                il ilVar = this.k[i2];
                if (ilVar != null) {
                    i += CodedOutputByteBufferNano.d(5, ilVar);
                }
            }
            a2 = i;
        }
        if (this.d || this.c != 0) {
            return a2 + CodedOutputByteBufferNano.e(6, this.c);
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
                    this.f3578a = aVar.c();
                    this.f3579b = true;
                    break;
                case 16:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 26:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 34:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.k == null ? 0 : this.k.length;
                    il[] ilVarArr = new il[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, ilVarArr, 0, length);
                    }
                    while (length < ilVarArr.length - 1) {
                        ilVarArr[length] = new il();
                        aVar.a(ilVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ilVarArr[length] = new il();
                    aVar.a(ilVarArr[length]);
                    this.k = ilVarArr;
                    break;
                case 48:
                    this.c = aVar.f();
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
