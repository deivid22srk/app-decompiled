package com.google.android.vending.verifier.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class d extends com.google.protobuf.nano.c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile d[] f7122b;

    /* renamed from: a, reason: collision with root package name */
    public e[] f7123a = e.b();

    public static d[] b() {
        if (f7122b == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f7122b == null) {
                    f7122b = new d[0];
                }
            }
        }
        return f7122b;
    }

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7123a != null && this.f7123a.length > 0) {
            for (int i = 0; i < this.f7123a.length; i++) {
                e eVar = this.f7123a[i];
                if (eVar != null) {
                    codedOutputByteBufferNano.b(1, eVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7123a != null && this.f7123a.length > 0) {
            for (int i = 0; i < this.f7123a.length; i++) {
                e eVar = this.f7123a[i];
                if (eVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, eVar);
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
                    int length = this.f7123a == null ? 0 : this.f7123a.length;
                    e[] eVarArr = new e[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7123a, 0, eVarArr, 0, length);
                    }
                    while (length < eVarArr.length - 1) {
                        eVarArr[length] = new e();
                        aVar.a(eVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    eVarArr[length] = new e();
                    aVar.a(eVarArr[length]);
                    this.f7123a = eVarArr;
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
