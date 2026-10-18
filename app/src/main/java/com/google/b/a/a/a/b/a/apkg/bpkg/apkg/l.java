package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class l extends com.google.protobuf.nano.c {
    public static volatile l[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f7579a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7580b = "";
    public int c = 0;
    public int[] d = com.google.protobuf.nano.e.f7878a;
    public String e = "";

    public static l[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new l[0];
                }
            }
        }
        return f;
    }

    public l() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7579a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7579a);
        }
        if (!this.f7580b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7580b);
        }
        if (this.c != 0) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                codedOutputByteBufferNano.a(4, this.d[i]);
            }
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7579a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7579a);
        }
        if (!this.f7580b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7580b);
        }
        if (this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.d.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.d[i2]);
            }
            a2 = a2 + i + (this.d.length * 1);
        }
        if (!this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.e);
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
                    this.f7579a = aVar.c();
                    break;
                case 18:
                    this.f7580b = aVar.c();
                    break;
                case 24:
                    this.c = aVar.e();
                    break;
                case 32:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 32);
                    int length = this.d == null ? 0 : this.d.length;
                    int[] iArr = new int[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = aVar.e();
                        aVar.a();
                        length++;
                    }
                    iArr[length] = aVar.e();
                    this.d = iArr;
                    break;
                case 34:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.d == null ? 0 : this.d.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = aVar.e();
                        length2++;
                    }
                    this.d = iArr2;
                    aVar.d(c);
                    break;
                case 42:
                    this.e = aVar.c();
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
