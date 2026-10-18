package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gv extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public jd[] f3886a = jd.b();

    /* renamed from: b, reason: collision with root package name */
    public jd f3887b = null;
    public jd c = null;

    public gv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3886a != null && this.f3886a.length > 0) {
            for (int i = 0; i < this.f3886a.length; i++) {
                jd jdVar = this.f3886a[i];
                if (jdVar != null) {
                    codedOutputByteBufferNano.b(1, jdVar);
                }
            }
        }
        if (this.f3887b != null) {
            codedOutputByteBufferNano.b(2, this.f3887b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3886a != null && this.f3886a.length > 0) {
            for (int i = 0; i < this.f3886a.length; i++) {
                jd jdVar = this.f3886a[i];
                if (jdVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, jdVar);
                }
            }
        }
        if (this.f3887b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3887b);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(3, this.c);
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
                    int length = this.f3886a == null ? 0 : this.f3886a.length;
                    jd[] jdVarArr = new jd[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3886a, 0, jdVarArr, 0, length);
                    }
                    while (length < jdVarArr.length - 1) {
                        jdVarArr[length] = new jd();
                        aVar.a(jdVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jdVarArr[length] = new jd();
                    aVar.a(jdVarArr[length]);
                    this.f3886a = jdVarArr;
                    break;
                case 18:
                    if (this.f3887b == null) {
                        this.f3887b = new jd();
                    }
                    aVar.a(this.f3887b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new jd();
                    }
                    aVar.a(this.c);
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
