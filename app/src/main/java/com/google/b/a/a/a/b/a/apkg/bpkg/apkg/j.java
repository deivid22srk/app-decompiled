package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class j extends com.google.protobuf.nano.c {
    public static volatile j[] e;

    /* renamed from: a, reason: collision with root package name */
    public int f7577a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f7578b = 0;
    public long[] c = com.google.protobuf.nano.e.f7879b;
    public int[] d = com.google.protobuf.nano.e.f7878a;

    public static j[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new j[0];
                }
            }
        }
        return e;
    }

    public j() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7577a != 0) {
            codedOutputByteBufferNano.a(1, this.f7577a);
        }
        if (this.f7578b != 0) {
            codedOutputByteBufferNano.b(2, this.f7578b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.c[i2]);
            }
            codedOutputByteBufferNano.d(26);
            codedOutputByteBufferNano.d(i);
            for (int i3 = 0; i3 < this.c.length; i3++) {
                codedOutputByteBufferNano.a(this.c[i3]);
            }
        }
        if (this.d != null && this.d.length > 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.d.length; i5++) {
                i4 += CodedOutputByteBufferNano.b(this.d[i5]);
            }
            codedOutputByteBufferNano.d(34);
            codedOutputByteBufferNano.d(i4);
            for (int i6 = 0; i6 < this.d.length; i6++) {
                codedOutputByteBufferNano.a(this.d[i6]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7577a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7577a);
        }
        if (this.f7578b != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.f7578b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.c[i2]);
            }
            a2 = a2 + i + 1 + CodedOutputByteBufferNano.e(i);
        }
        if (this.d != null && this.d.length > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.d.length; i4++) {
                i3 += CodedOutputByteBufferNano.b(this.d[i4]);
            }
            return a2 + i3 + 1 + CodedOutputByteBufferNano.e(i3);
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
                    this.f7577a = aVar.e();
                    break;
                case 16:
                    this.f7578b = aVar.f();
                    break;
                case 24:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 24);
                    int length = this.c == null ? 0 : this.c.length;
                    long[] jArr = new long[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = aVar.f();
                        aVar.a();
                        length++;
                    }
                    jArr[length] = aVar.f();
                    this.c = jArr;
                    break;
                case 26:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.c == null ? 0 : this.c.length;
                    long[] jArr2 = new long[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = aVar.f();
                        length2++;
                    }
                    this.c = jArr2;
                    aVar.d(c);
                    break;
                case 32:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 32);
                    int length3 = this.d == null ? 0 : this.d.length;
                    int[] iArr = new int[b3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.d, 0, iArr, 0, length3);
                    }
                    while (length3 < iArr.length - 1) {
                        iArr[length3] = aVar.e();
                        aVar.a();
                        length3++;
                    }
                    iArr[length3] = aVar.e();
                    this.d = iArr;
                    break;
                case 34:
                    int c2 = aVar.c(aVar.e());
                    int j2 = aVar.j();
                    int i2 = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i2++;
                    }
                    aVar.e(j2);
                    int length4 = this.d == null ? 0 : this.d.length;
                    int[] iArr2 = new int[i2 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.d, 0, iArr2, 0, length4);
                    }
                    while (length4 < iArr2.length) {
                        iArr2[length4] = aVar.e();
                        length4++;
                    }
                    this.d = iArr2;
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
