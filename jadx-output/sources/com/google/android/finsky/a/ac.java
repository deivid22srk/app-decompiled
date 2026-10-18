package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ac extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ai f1441a;

    /* renamed from: b, reason: collision with root package name */
    public ai[] f1442b;
    public long c;
    public boolean d;

    public ac() {
        b();
    }

    public final ac b() {
        this.f1441a = null;
        this.f1442b = ai.b();
        this.c = 0L;
        this.d = false;
        this.ar = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1441a != null) {
            codedOutputByteBufferNano.b(1, this.f1441a);
        }
        if (this.f1442b != null && this.f1442b.length > 0) {
            for (int i = 0; i < this.f1442b.length; i++) {
                ai aiVar = this.f1442b[i];
                if (aiVar != null) {
                    codedOutputByteBufferNano.b(2, aiVar);
                }
            }
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1441a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f1441a);
        }
        if (this.f1442b != null && this.f1442b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f1442b.length; i2++) {
                ai aiVar = this.f1442b[i2];
                if (aiVar != null) {
                    i += CodedOutputByteBufferNano.d(2, aiVar);
                }
            }
            a2 = i;
        }
        if (this.d || this.c != 0) {
            return a2 + CodedOutputByteBufferNano.e(3, this.c);
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
                    if (this.f1441a == null) {
                        this.f1441a = new ai();
                    }
                    aVar.a(this.f1441a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f1442b == null ? 0 : this.f1442b.length;
                    ai[] aiVarArr = new ai[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f1442b, 0, aiVarArr, 0, length);
                    }
                    while (length < aiVarArr.length - 1) {
                        aiVarArr[length] = new ai();
                        aVar.a(aiVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    aiVarArr[length] = new ai();
                    aVar.a(aiVarArr[length]);
                    this.f1442b = aiVarArr;
                    break;
                case 24:
                    this.c = aVar.f();
                    this.d = true;
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
