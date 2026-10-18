package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ky extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public kw[] f4062a = kw.b();

    /* renamed from: b, reason: collision with root package name */
    public long f4063b = 0;
    public boolean c = false;
    public ku[] d = ku.b();
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public int k = 0;
    public boolean l = false;

    public ky() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4062a != null && this.f4062a.length > 0) {
            for (int i = 0; i < this.f4062a.length; i++) {
                kw kwVar = this.f4062a[i];
                if (kwVar != null) {
                    codedOutputByteBufferNano.b(1, kwVar);
                }
            }
        }
        if (this.c || this.f4063b != 0) {
            codedOutputByteBufferNano.b(2, this.f4063b);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                ku kuVar = this.d[i2];
                if (kuVar != null) {
                    codedOutputByteBufferNano.b(3, kuVar);
                }
            }
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(6, this.i);
        }
        if (this.l || this.k != 0) {
            codedOutputByteBufferNano.a(7, this.k);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4062a != null && this.f4062a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4062a.length; i2++) {
                kw kwVar = this.f4062a[i2];
                if (kwVar != null) {
                    i += CodedOutputByteBufferNano.d(1, kwVar);
                }
            }
            a2 = i;
        }
        if (this.c || this.f4063b != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.f4063b);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i3 = 0; i3 < this.d.length; i3++) {
                ku kuVar = this.d[i3];
                if (kuVar != null) {
                    a2 += CodedOutputByteBufferNano.d(3, kuVar);
                }
            }
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.i);
        }
        if (this.l || this.k != 0) {
            return a2 + CodedOutputByteBufferNano.c(7, this.k);
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f4062a == null ? 0 : this.f4062a.length;
                    kw[] kwVarArr = new kw[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4062a, 0, kwVarArr, 0, length);
                    }
                    while (length < kwVarArr.length - 1) {
                        kwVarArr[length] = new kw();
                        aVar.a(kwVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    kwVarArr[length] = new kw();
                    aVar.a(kwVarArr[length]);
                    this.f4062a = kwVarArr;
                    break;
                case 16:
                    this.f4063b = aVar.f();
                    this.c = true;
                    break;
                case 26:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length2 = this.d == null ? 0 : this.d.length;
                    ku[] kuVarArr = new ku[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, kuVarArr, 0, length2);
                    }
                    while (length2 < kuVarArr.length - 1) {
                        kuVarArr[length2] = new ku();
                        aVar.a(kuVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    kuVarArr[length2] = new ku();
                    aVar.a(kuVarArr[length2]);
                    this.d = kuVarArr;
                    break;
                case 34:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 42:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 50:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 56:
                    this.k = aVar.e();
                    this.l = true;
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
