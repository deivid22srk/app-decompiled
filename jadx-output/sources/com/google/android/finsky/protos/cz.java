package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class cz extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public cy[] f3709a = cy.b();

    /* renamed from: b, reason: collision with root package name */
    public String f3710b = "";
    public boolean c = false;

    public cz() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3709a != null && this.f3709a.length > 0) {
            for (int i = 0; i < this.f3709a.length; i++) {
                cy cyVar = this.f3709a[i];
                if (cyVar != null) {
                    codedOutputByteBufferNano.b(1, cyVar);
                }
            }
        }
        if (this.c || !this.f3710b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3710b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3709a != null && this.f3709a.length > 0) {
            for (int i = 0; i < this.f3709a.length; i++) {
                cy cyVar = this.f3709a[i];
                if (cyVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, cyVar);
                }
            }
        }
        if (this.c || !this.f3710b.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(2, this.f3710b);
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
                    int length = this.f3709a == null ? 0 : this.f3709a.length;
                    cy[] cyVarArr = new cy[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3709a, 0, cyVarArr, 0, length);
                    }
                    while (length < cyVarArr.length - 1) {
                        cyVarArr[length] = new cy();
                        aVar.a(cyVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    cyVarArr[length] = new cy();
                    aVar.a(cyVarArr[length]);
                    this.f3709a = cyVarArr;
                    break;
                case 18:
                    this.f3710b = aVar.c();
                    this.c = true;
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
