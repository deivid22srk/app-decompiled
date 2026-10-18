package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class la extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4068a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4069b = false;
    public lb[] c = lb.b();

    public la() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4069b || !this.f4068a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4068a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                lb lbVar = this.c[i];
                if (lbVar != null) {
                    codedOutputByteBufferNano.b(2, lbVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4069b || !this.f4068a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4068a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                lb lbVar = this.c[i2];
                if (lbVar != null) {
                    i += CodedOutputByteBufferNano.d(2, lbVar);
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
                    this.f4068a = aVar.c();
                    this.f4069b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    lb[] lbVarArr = new lb[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, lbVarArr, 0, length);
                    }
                    while (length < lbVarArr.length - 1) {
                        lbVarArr[length] = new lb();
                        aVar.a(lbVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    lbVarArr[length] = new lb();
                    aVar.a(lbVarArr[length]);
                    this.c = lbVarArr;
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
