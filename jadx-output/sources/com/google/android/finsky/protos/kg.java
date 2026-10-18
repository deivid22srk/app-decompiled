package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kg extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4033a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4034b = false;
    public lp[] c = lp.b();

    public kg() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4034b || this.f4033a) {
            codedOutputByteBufferNano.a(1, this.f4033a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                lp lpVar = this.c[i];
                if (lpVar != null) {
                    codedOutputByteBufferNano.b(2, lpVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4034b || this.f4033a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                lp lpVar = this.c[i2];
                if (lpVar != null) {
                    i += CodedOutputByteBufferNano.d(2, lpVar);
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
                case 8:
                    this.f4033a = aVar.b();
                    this.f4034b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    lp[] lpVarArr = new lp[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, lpVarArr, 0, length);
                    }
                    while (length < lpVarArr.length - 1) {
                        lpVarArr[length] = new lp();
                        aVar.a(lpVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    lpVarArr[length] = new lp();
                    aVar.a(lpVarArr[length]);
                    this.c = lpVarArr;
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
