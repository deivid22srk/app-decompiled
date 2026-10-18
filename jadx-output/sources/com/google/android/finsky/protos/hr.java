package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hr extends com.google.protobuf.nano.c {
    private static volatile hr[] l;

    /* renamed from: a, reason: collision with root package name */
    public int f3924a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3925b = false;
    public int c = 0;
    public boolean d = false;
    public long e = 0;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public kr[] i = kr.b();
    public String j = "";
    public boolean k = false;

    public static hr[] b() {
        if (l == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (l == null) {
                    l = new hr[0];
                }
            }
        }
        return l;
    }

    public hr() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3924a != 0 || this.f3925b) {
            codedOutputByteBufferNano.a(1, this.f3924a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(4, this.j);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(5, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i = 0; i < this.i.length; i++) {
                kr krVar = this.i[i];
                if (krVar != null) {
                    codedOutputByteBufferNano.b(6, krVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3924a != 0 || this.f3925b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3924a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.e);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.j);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.e(5, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.i.length; i2++) {
                kr krVar = this.i[i2];
                if (krVar != null) {
                    i += CodedOutputByteBufferNano.d(6, krVar);
                }
            }
            return i;
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
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f3924a = e;
                            this.f3925b = true;
                            break;
                    }
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.f();
                    this.f = true;
                    break;
                case 34:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 40:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 50:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length = this.i == null ? 0 : this.i.length;
                    kr[] krVarArr = new kr[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.i, 0, krVarArr, 0, length);
                    }
                    while (length < krVarArr.length - 1) {
                        krVarArr[length] = new kr();
                        aVar.a(krVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    krVarArr[length] = new kr();
                    aVar.a(krVarArr[length]);
                    this.i = krVarArr;
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
