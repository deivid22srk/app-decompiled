package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hc extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3899a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3900b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public su[] k = su.b();

    public hc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3900b || !this.f3899a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3899a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i = 0; i < this.k.length; i++) {
                su suVar = this.k[i];
                if (suVar != null) {
                    codedOutputByteBufferNano.b(6, suVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3900b || !this.f3899a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3899a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.k.length; i2++) {
                su suVar = this.k[i2];
                if (suVar != null) {
                    i += CodedOutputByteBufferNano.d(6, suVar);
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
                case 10:
                    this.f3899a = aVar.c();
                    this.f3900b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
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
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 50:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length = this.k == null ? 0 : this.k.length;
                    su[] suVarArr = new su[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, suVarArr, 0, length);
                    }
                    while (length < suVarArr.length - 1) {
                        suVarArr[length] = new su();
                        aVar.a(suVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    suVarArr[length] = new su();
                    aVar.a(suVarArr[length]);
                    this.k = suVarArr;
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
