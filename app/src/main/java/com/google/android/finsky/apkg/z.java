package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class z extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ai[] f1513a;

    public z() {
        b();
    }

    public final z b() {
        this.f1513a = ai.b();
        this.ar = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1513a != null && this.f1513a.length > 0) {
            for (int i = 0; i < this.f1513a.length; i++) {
                ai aiVar = this.f1513a[i];
                if (aiVar != null) {
                    codedOutputByteBufferNano.b(1, aiVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1513a != null && this.f1513a.length > 0) {
            for (int i = 0; i < this.f1513a.length; i++) {
                ai aiVar = this.f1513a[i];
                if (aiVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, aiVar);
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
                    int length = this.f1513a == null ? 0 : this.f1513a.length;
                    ai[] aiVarArr = new ai[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f1513a, 0, aiVarArr, 0, length);
                    }
                    while (length < aiVarArr.length - 1) {
                        aiVarArr[length] = new ai();
                        aVar.a(aiVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    aiVarArr[length] = new ai();
                    aVar.a(aiVarArr[length]);
                    this.f1513a = aiVarArr;
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
