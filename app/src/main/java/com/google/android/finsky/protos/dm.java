package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class dm extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public al[] f3736a = al.b();

    /* renamed from: b, reason: collision with root package name */
    public nj f3737b = null;
    public int c = 0;
    public boolean d = false;

    public dm() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3736a != null && this.f3736a.length > 0) {
            for (int i = 0; i < this.f3736a.length; i++) {
                al alVar = this.f3736a[i];
                if (alVar != null) {
                    codedOutputByteBufferNano.b(1, alVar);
                }
            }
        }
        if (this.f3737b != null) {
            codedOutputByteBufferNano.b(2, this.f3737b);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3736a != null && this.f3736a.length > 0) {
            for (int i = 0; i < this.f3736a.length; i++) {
                al alVar = this.f3736a[i];
                if (alVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, alVar);
                }
            }
        }
        if (this.f3737b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3737b);
        }
        if (this.c != 0 || this.d) {
            return a2 + CodedOutputByteBufferNano.c(4, this.c);
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
                    int length = this.f3736a == null ? 0 : this.f3736a.length;
                    al[] alVarArr = new al[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3736a, 0, alVarArr, 0, length);
                    }
                    while (length < alVarArr.length - 1) {
                        alVarArr[length] = new al();
                        aVar.a(alVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    alVarArr[length] = new al();
                    aVar.a(alVarArr[length]);
                    this.f3736a = alVarArr;
                    break;
                case 18:
                    if (this.f3737b == null) {
                        this.f3737b = new nj();
                    }
                    aVar.a(this.f3737b);
                    break;
                case 32:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = e;
                            this.d = true;
                            break;
                    }
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
