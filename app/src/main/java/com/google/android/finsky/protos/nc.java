package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class nc extends com.google.protobuf.nano.c {
    private static volatile nc[] l;

    /* renamed from: a, reason: collision with root package name */
    public String f4158a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4159b = false;
    public String c = "";
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public String[] k = com.google.protobuf.nano.e.f;

    public static nc[] b() {
        if (l == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (l == null) {
                    l = new nc[0];
                }
            }
        }
        return l;
    }

    public nc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4159b || !this.f4158a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4158a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i = 0; i < this.k.length; i++) {
                String str = this.k[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(6, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4159b || !this.f4158a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4158a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != 0 || this.f) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.e(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.k.length; i3++) {
                String str = this.k[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            return a2 + i + (i2 * 1);
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
                    this.f4158a = aVar.c();
                    this.f4159b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.e = e;
                            this.f = true;
                            break;
                    }
                case 32:
                    this.g = aVar.f();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 50:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length = this.k == null ? 0 : this.k.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.k = strArr;
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
