package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class e extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public d[] f7668a = d.b();

    /* renamed from: b, reason: collision with root package name */
    public c[] f7669b = c.b();

    public e() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7668a != null && this.f7668a.length > 0) {
            for (int i = 0; i < this.f7668a.length; i++) {
                d dVar = this.f7668a[i];
                if (dVar != null) {
                    codedOutputByteBufferNano.b(1, dVar);
                }
            }
        }
        if (this.f7669b != null && this.f7669b.length > 0) {
            for (int i2 = 0; i2 < this.f7669b.length; i2++) {
                c cVar = this.f7669b[i2];
                if (cVar != null) {
                    codedOutputByteBufferNano.b(2, cVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7668a != null && this.f7668a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f7668a.length; i2++) {
                d dVar = this.f7668a[i2];
                if (dVar != null) {
                    i += CodedOutputByteBufferNano.d(1, dVar);
                }
            }
            a2 = i;
        }
        if (this.f7669b != null && this.f7669b.length > 0) {
            for (int i3 = 0; i3 < this.f7669b.length; i3++) {
                c cVar = this.f7669b[i3];
                if (cVar != null) {
                    a2 += CodedOutputByteBufferNano.d(2, cVar);
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
                    int length = this.f7668a == null ? 0 : this.f7668a.length;
                    d[] dVarArr = new d[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7668a, 0, dVarArr, 0, length);
                    }
                    while (length < dVarArr.length - 1) {
                        dVarArr[length] = new d();
                        aVar.a(dVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dVarArr[length] = new d();
                    aVar.a(dVarArr[length]);
                    this.f7668a = dVarArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f7669b == null ? 0 : this.f7669b.length;
                    c[] cVarArr = new c[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f7669b, 0, cVarArr, 0, length2);
                    }
                    while (length2 < cVarArr.length - 1) {
                        cVarArr[length2] = new c();
                        aVar.a(cVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    cVarArr[length2] = new c();
                    aVar.a(cVarArr[length2]);
                    this.f7669b = cVarArr;
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
