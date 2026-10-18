package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gr extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3878a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3879b = false;
    public gt[] c = gt.b();

    public gr() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3879b || !this.f3878a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3878a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                gt gtVar = this.c[i];
                if (gtVar != null) {
                    codedOutputByteBufferNano.b(2, gtVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3879b || !this.f3878a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3878a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                gt gtVar = this.c[i2];
                if (gtVar != null) {
                    i += CodedOutputByteBufferNano.d(2, gtVar);
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
                    this.f3878a = aVar.c();
                    this.f3879b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    gt[] gtVarArr = new gt[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, gtVarArr, 0, length);
                    }
                    while (length < gtVarArr.length - 1) {
                        gtVarArr[length] = new gt();
                        aVar.a(gtVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gtVarArr[length] = new gt();
                    aVar.a(gtVarArr[length]);
                    this.c = gtVarArr;
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
