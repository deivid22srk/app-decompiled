package com.google.b.a.a.a.b.a.bpkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class j extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7677a = com.google.protobuf.nano.e.f7878a;

    /* renamed from: b, reason: collision with root package name */
    public String f7678b = "";

    public j() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7677a != null && this.f7677a.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f7677a.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.f7677a[i2]);
            }
            codedOutputByteBufferNano.d(10);
            codedOutputByteBufferNano.d(i);
            for (int i3 = 0; i3 < this.f7677a.length; i3++) {
                codedOutputByteBufferNano.a(this.f7677a[i3]);
            }
        }
        if (!this.f7678b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7678b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f7677a == null || this.f7677a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f7677a.length; i3++) {
                i2 += CodedOutputByteBufferNano.b(this.f7677a[i3]);
            }
            i = a2 + i2 + 1 + CodedOutputByteBufferNano.e(i2);
        }
        if (!this.f7678b.equals("")) {
            return i + CodedOutputByteBufferNano.b(2, this.f7678b);
        }
        return i;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 8);
                    int length = this.f7677a == null ? 0 : this.f7677a.length;
                    int[] iArr = new int[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7677a, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = aVar.e();
                        aVar.a();
                        length++;
                    }
                    iArr[length] = aVar.e();
                    this.f7677a = iArr;
                    break;
                case 10:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.f7677a == null ? 0 : this.f7677a.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f7677a, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = aVar.e();
                        length2++;
                    }
                    this.f7677a = iArr2;
                    aVar.d(c);
                    break;
                case 18:
                    this.f7678b = aVar.c();
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
