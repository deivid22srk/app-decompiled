package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lv extends com.google.protobuf.nano.c {
    private static volatile lv[] j;

    /* renamed from: a, reason: collision with root package name */
    public String f4101a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4102b = false;
    public String c = "";
    public boolean d = false;
    public ds[] e = ds.b();
    public String f = "";
    public boolean g = false;
    public String h = "";
    public boolean i = false;

    public static lv[] b() {
        if (j == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (j == null) {
                    j = new lv[0];
                }
            }
        }
        return j;
    }

    public lv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4102b || !this.f4101a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4101a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                ds dsVar = this.e[i];
                if (dsVar != null) {
                    codedOutputByteBufferNano.b(3, dsVar);
                }
            }
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4102b || !this.f4101a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4101a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                ds dsVar = this.e[i2];
                if (dsVar != null) {
                    i += CodedOutputByteBufferNano.d(3, dsVar);
                }
            }
            a2 = i;
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.i || !this.h.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.h);
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
                    this.f4101a = aVar.c();
                    this.f4102b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.e == null ? 0 : this.e.length;
                    ds[] dsVarArr = new ds[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, dsVarArr, 0, length);
                    }
                    while (length < dsVarArr.length - 1) {
                        dsVarArr[length] = new ds();
                        aVar.a(dsVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dsVarArr[length] = new ds();
                    aVar.a(dsVarArr[length]);
                    this.e = dsVarArr;
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 42:
                    this.h = aVar.c();
                    this.i = true;
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
