package com.google.android.vending.verifier.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class n extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public b[] f7142a = b.b();

    /* renamed from: b, reason: collision with root package name */
    public boolean f7143b = false;
    public boolean c = false;
    public long d = 0;
    public boolean e = false;
    public long f = 0;
    public boolean g = false;

    public n() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7142a != null && this.f7142a.length > 0) {
            for (int i = 0; i < this.f7142a.length; i++) {
                b bVar = this.f7142a[i];
                if (bVar != null) {
                    codedOutputByteBufferNano.b(1, bVar);
                }
            }
        }
        if (this.c || this.f7143b) {
            codedOutputByteBufferNano.a(2, this.f7143b);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || this.f != 0) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7142a != null && this.f7142a.length > 0) {
            for (int i = 0; i < this.f7142a.length; i++) {
                b bVar = this.f7142a[i];
                if (bVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, bVar);
                }
            }
        }
        if (this.c || this.f7143b) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.e(3, this.d);
        }
        if (this.g || this.f != 0) {
            return a2 + CodedOutputByteBufferNano.e(4, this.f);
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
                    int length = this.f7142a == null ? 0 : this.f7142a.length;
                    b[] bVarArr = new b[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7142a, 0, bVarArr, 0, length);
                    }
                    while (length < bVarArr.length - 1) {
                        bVarArr[length] = new b();
                        aVar.a(bVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bVarArr[length] = new b();
                    aVar.a(bVarArr[length]);
                    this.f7142a = bVarArr;
                    break;
                case 16:
                    this.f7143b = aVar.b();
                    this.c = true;
                    break;
                case 24:
                    this.d = aVar.f();
                    this.e = true;
                    break;
                case 32:
                    this.f = aVar.f();
                    this.g = true;
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
