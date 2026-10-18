package com.google.b.a.a.a.b.a.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {
    public static volatile b[] c;

    /* renamed from: a, reason: collision with root package name */
    public int f7662a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7663b = com.google.protobuf.nano.e.f7878a;

    public static b[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new b[0];
                }
            }
        }
        return c;
    }

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7662a != 0) {
            codedOutputByteBufferNano.a(1, this.f7662a);
        }
        if (this.f7663b != null && this.f7663b.length > 0) {
            for (int i = 0; i < this.f7663b.length; i++) {
                codedOutputByteBufferNano.a(2, this.f7663b[i]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7662a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7662a);
        }
        if (this.f7663b != null && this.f7663b.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f7663b.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.f7663b[i2]);
            }
            return a2 + i + (this.f7663b.length * 1);
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
                    this.f7662a = aVar.e();
                    break;
                case 16:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 16);
                    int length = this.f7663b == null ? 0 : this.f7663b.length;
                    int[] iArr = new int[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7663b, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = aVar.e();
                        aVar.a();
                        length++;
                    }
                    iArr[length] = aVar.e();
                    this.f7663b = iArr;
                    break;
                case 18:
                    int c2 = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.f7663b == null ? 0 : this.f7663b.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f7663b, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = aVar.e();
                        length2++;
                    }
                    this.f7663b = iArr2;
                    aVar.d(c2);
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
