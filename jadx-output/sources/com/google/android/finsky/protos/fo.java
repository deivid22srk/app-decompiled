package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fo extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3834a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3835b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public int g = 0;
    public boolean h = false;
    public int i = 0;
    public boolean j = false;
    public hd[] k = hd.b();

    public fo() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3834a != 0 || this.f3835b) {
            codedOutputByteBufferNano.a(1, this.f3834a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i != 0) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i = 0; i < this.k.length; i++) {
                hd hdVar = this.k[i];
                if (hdVar != null) {
                    codedOutputByteBufferNano.b(6, hdVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3834a != 0 || this.f3835b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3834a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.j || this.i != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.i);
        }
        if (this.k != null && this.k.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.k.length; i2++) {
                hd hdVar = this.k[i2];
                if (hdVar != null) {
                    i += CodedOutputByteBufferNano.d(6, hdVar);
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
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 10:
                        case 27:
                        case 35:
                            this.f3834a = e;
                            this.f3835b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.e();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.e();
                    this.j = true;
                    break;
                case 50:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length = this.k == null ? 0 : this.k.length;
                    hd[] hdVarArr = new hd[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, hdVarArr, 0, length);
                    }
                    while (length < hdVarArr.length - 1) {
                        hdVarArr[length] = new hd();
                        aVar.a(hdVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    hdVarArr[length] = new hd();
                    aVar.a(hdVarArr[length]);
                    this.k = hdVarArr;
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
