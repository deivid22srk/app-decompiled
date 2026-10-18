package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class cx extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3705a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3706b = false;
    public cw[] c = cw.b();

    public cx() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3706b || !this.f3705a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3705a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                cw cwVar = this.c[i];
                if (cwVar != null) {
                    codedOutputByteBufferNano.b(2, cwVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3706b || !this.f3705a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3705a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                cw cwVar = this.c[i2];
                if (cwVar != null) {
                    i += CodedOutputByteBufferNano.d(2, cwVar);
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
                    this.f3705a = aVar.c();
                    this.f3706b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    cw[] cwVarArr = new cw[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, cwVarArr, 0, length);
                    }
                    while (length < cwVarArr.length - 1) {
                        cwVarArr[length] = new cw();
                        aVar.a(cwVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    cwVarArr[length] = new cw();
                    aVar.a(cwVarArr[length]);
                    this.c = cwVarArr;
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
