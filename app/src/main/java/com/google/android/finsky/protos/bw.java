package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class bw extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3655a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3656b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public db[] g = db.b();
    public nj h = null;

    public bw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3655a != 0 || this.f3656b) {
            codedOutputByteBufferNano.a(1, this.f3655a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            for (int i = 0; i < this.g.length; i++) {
                db dbVar = this.g[i];
                if (dbVar != null) {
                    codedOutputByteBufferNano.b(4, dbVar);
                }
            }
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(6, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3655a != 0 || this.f3656b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3655a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.g.length; i2++) {
                db dbVar = this.g[i2];
                if (dbVar != null) {
                    i += CodedOutputByteBufferNano.d(4, dbVar);
                }
            }
            a2 = i;
        }
        if (this.h != null) {
            return a2 + CodedOutputByteBufferNano.d(6, this.h);
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
                            this.f3655a = e;
                            this.f3656b = true;
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
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.g == null ? 0 : this.g.length;
                    db[] dbVarArr = new db[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.g, 0, dbVarArr, 0, length);
                    }
                    while (length < dbVarArr.length - 1) {
                        dbVarArr[length] = new db();
                        aVar.a(dbVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dbVarArr[length] = new db();
                    aVar.a(dbVarArr[length]);
                    this.g = dbVarArr;
                    break;
                case 50:
                    if (this.h == null) {
                        this.h = new nj();
                    }
                    aVar.a(this.h);
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
