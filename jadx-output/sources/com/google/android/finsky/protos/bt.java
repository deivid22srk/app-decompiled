package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class bt extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public iq[] f3650a = iq.b();

    public bt() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3650a != null && this.f3650a.length > 0) {
            for (int i = 0; i < this.f3650a.length; i++) {
                iq iqVar = this.f3650a[i];
                if (iqVar != null) {
                    codedOutputByteBufferNano.b(1, iqVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3650a != null && this.f3650a.length > 0) {
            for (int i = 0; i < this.f3650a.length; i++) {
                iq iqVar = this.f3650a[i];
                if (iqVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, iqVar);
                }
            }
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
                    int length = this.f3650a == null ? 0 : this.f3650a.length;
                    iq[] iqVarArr = new iq[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3650a, 0, iqVarArr, 0, length);
                    }
                    while (length < iqVarArr.length - 1) {
                        iqVarArr[length] = new iq();
                        aVar.a(iqVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    iqVarArr[length] = new iq();
                    aVar.a(iqVarArr[length]);
                    this.f3650a = iqVarArr;
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
