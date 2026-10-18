package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sv extends com.google.protobuf.nano.c {
    private static volatile sv[] c;

    /* renamed from: a, reason: collision with root package name */
    public gx f4406a = null;

    /* renamed from: b, reason: collision with root package name */
    public ea[] f4407b = ea.b();

    public static sv[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new sv[0];
                }
            }
        }
        return c;
    }

    public sv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4406a != null) {
            codedOutputByteBufferNano.b(1, this.f4406a);
        }
        if (this.f4407b != null && this.f4407b.length > 0) {
            for (int i = 0; i < this.f4407b.length; i++) {
                ea eaVar = this.f4407b[i];
                if (eaVar != null) {
                    codedOutputByteBufferNano.b(2, eaVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4406a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4406a);
        }
        if (this.f4407b != null && this.f4407b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4407b.length; i2++) {
                ea eaVar = this.f4407b[i2];
                if (eaVar != null) {
                    i += CodedOutputByteBufferNano.d(2, eaVar);
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
                    if (this.f4406a == null) {
                        this.f4406a = new gx();
                    }
                    aVar.a(this.f4406a);
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f4407b == null ? 0 : this.f4407b.length;
                    ea[] eaVarArr = new ea[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4407b, 0, eaVarArr, 0, length);
                    }
                    while (length < eaVarArr.length - 1) {
                        eaVarArr[length] = new ea();
                        aVar.a(eaVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    eaVarArr[length] = new ea();
                    aVar.a(eaVarArr[length]);
                    this.f4407b = eaVarArr;
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
