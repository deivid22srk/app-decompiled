package com.google.b.a.a.a.b.a.apkg.cpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class e extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public b f7610a = null;

    /* renamed from: b, reason: collision with root package name */
    public d[] f7611b = d.b();

    public e() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7610a != null) {
            codedOutputByteBufferNano.b(1, this.f7610a);
        }
        if (this.f7611b != null && this.f7611b.length > 0) {
            for (int i = 0; i < this.f7611b.length; i++) {
                d dVar = this.f7611b[i];
                if (dVar != null) {
                    codedOutputByteBufferNano.b(2, dVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7610a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7610a);
        }
        if (this.f7611b != null && this.f7611b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f7611b.length; i2++) {
                d dVar = this.f7611b[i2];
                if (dVar != null) {
                    i += CodedOutputByteBufferNano.d(2, dVar);
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
                    if (this.f7610a == null) {
                        this.f7610a = new b();
                    }
                    aVar.a(this.f7610a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f7611b == null ? 0 : this.f7611b.length;
                    d[] dVarArr = new d[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7611b, 0, dVarArr, 0, length);
                    }
                    while (length < dVarArr.length - 1) {
                        dVarArr[length] = new d();
                        aVar.a(dVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dVarArr[length] = new d();
                    aVar.a(dVarArr[length]);
                    this.f7611b = dVarArr;
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
