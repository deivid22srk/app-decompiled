package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class am extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f1461a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1462b = false;
    public int c = 0;
    public boolean d = false;
    public int[] e = com.google.protobuf.nano.e.f7878a;
    public boolean f = false;
    public boolean g = false;

    public am() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1462b || this.f1461a != 0) {
            codedOutputByteBufferNano.b(1, this.f1461a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                codedOutputByteBufferNano.a(3, this.e[i]);
            }
        }
        if (this.g || this.f) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1462b || this.f1461a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f1461a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.e[i2]);
            }
            a2 = a2 + i + (this.e.length * 1);
        }
        if (this.g || this.f) {
            return a2 + CodedOutputByteBufferNano.c(4) + 1;
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
                    this.f1461a = aVar.f();
                    this.f1462b = true;
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 24:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 24);
                    int length = this.e == null ? 0 : this.e.length;
                    int[] iArr = new int[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = aVar.e();
                        aVar.a();
                        length++;
                    }
                    iArr[length] = aVar.e();
                    this.e = iArr;
                    break;
                case 26:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.e == null ? 0 : this.e.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.e, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = aVar.e();
                        length2++;
                    }
                    this.e = iArr2;
                    aVar.d(c);
                    break;
                case 32:
                    this.f = aVar.b();
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
