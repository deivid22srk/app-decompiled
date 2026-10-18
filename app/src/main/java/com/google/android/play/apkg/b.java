package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String[] f6750a = com.google.protobuf.nano.e.f;

    /* renamed from: b, reason: collision with root package name */
    public String[] f6751b = com.google.protobuf.nano.e.f;
    public int[] c = com.google.protobuf.nano.e.f7878a;
    public long[] d = com.google.protobuf.nano.e.f7879b;
    public long[] e = com.google.protobuf.nano.e.f7879b;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6750a != null && this.f6750a.length > 0) {
            for (int i = 0; i < this.f6750a.length; i++) {
                String str = this.f6750a[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.f6751b != null && this.f6751b.length > 0) {
            for (int i2 = 0; i2 < this.f6751b.length; i2++) {
                String str2 = this.f6751b[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(2, str2);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                codedOutputByteBufferNano.a(3, this.c[i3]);
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i4 = 0; i4 < this.d.length; i4++) {
                codedOutputByteBufferNano.b(4, this.d[i4]);
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int i5 = 0; i5 < this.e.length; i5++) {
                codedOutputByteBufferNano.b(5, this.e[i5]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f6750a == null || this.f6750a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f6750a.length; i4++) {
                String str = this.f6750a[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.f6751b != null && this.f6751b.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f6751b.length; i7++) {
                String str2 = this.f6751b[i7];
                if (str2 != null) {
                    i6++;
                    i5 += CodedOutputByteBufferNano.a(str2);
                }
            }
            i = i + i5 + (i6 * 1);
        }
        if (this.c != null && this.c.length > 0) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.c.length; i9++) {
                i8 += CodedOutputByteBufferNano.b(this.c[i9]);
            }
            i = i + i8 + (this.c.length * 1);
        }
        if (this.d != null && this.d.length > 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.d.length; i11++) {
                i10 += CodedOutputByteBufferNano.b(this.d[i11]);
            }
            i = i + i10 + (this.d.length * 1);
        }
        if (this.e != null && this.e.length > 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.e.length; i13++) {
                i12 += CodedOutputByteBufferNano.b(this.e[i13]);
            }
            return i + i12 + (this.e.length * 1);
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
                case 10:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f6750a == null ? 0 : this.f6750a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f6750a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f6750a = strArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f6751b == null ? 0 : this.f6751b.length;
                    String[] strArr2 = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f6751b, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr2[length2] = aVar.c();
                    this.f6751b = strArr2;
                    break;
                case 24:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 24);
                    int length3 = this.c == null ? 0 : this.c.length;
                    int[] iArr = new int[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.c, 0, iArr, 0, length3);
                    }
                    while (length3 < iArr.length - 1) {
                        iArr[length3] = aVar.e();
                        aVar.a();
                        length3++;
                    }
                    iArr[length3] = aVar.e();
                    this.c = iArr;
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
                    int length4 = this.c == null ? 0 : this.c.length;
                    int[] iArr2 = new int[i + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.c, 0, iArr2, 0, length4);
                    }
                    while (length4 < iArr2.length) {
                        iArr2[length4] = aVar.e();
                        length4++;
                    }
                    this.c = iArr2;
                    aVar.d(c);
                    break;
                case 32:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 32);
                    int length5 = this.d == null ? 0 : this.d.length;
                    long[] jArr = new long[b5 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.d, 0, jArr, 0, length5);
                    }
                    while (length5 < jArr.length - 1) {
                        jArr[length5] = aVar.f();
                        aVar.a();
                        length5++;
                    }
                    jArr[length5] = aVar.f();
                    this.d = jArr;
                    break;
                case 34:
                    int c2 = aVar.c(aVar.e());
                    int j2 = aVar.j();
                    int i2 = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i2++;
                    }
                    aVar.e(j2);
                    int length6 = this.d == null ? 0 : this.d.length;
                    long[] jArr2 = new long[i2 + length6];
                    if (length6 != 0) {
                        System.arraycopy(this.d, 0, jArr2, 0, length6);
                    }
                    while (length6 < jArr2.length) {
                        jArr2[length6] = aVar.f();
                        length6++;
                    }
                    this.d = jArr2;
                    aVar.d(c2);
                    break;
                case 40:
                    int b6 = com.google.protobuf.nano.e.b(aVar, 40);
                    int length7 = this.e == null ? 0 : this.e.length;
                    long[] jArr3 = new long[b6 + length7];
                    if (length7 != 0) {
                        System.arraycopy(this.e, 0, jArr3, 0, length7);
                    }
                    while (length7 < jArr3.length - 1) {
                        jArr3[length7] = aVar.f();
                        aVar.a();
                        length7++;
                    }
                    jArr3[length7] = aVar.f();
                    this.e = jArr3;
                    break;
                case 42:
                    int c3 = aVar.c(aVar.e());
                    int j3 = aVar.j();
                    int i3 = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i3++;
                    }
                    aVar.e(j3);
                    int length8 = this.e == null ? 0 : this.e.length;
                    long[] jArr4 = new long[i3 + length8];
                    if (length8 != 0) {
                        System.arraycopy(this.e, 0, jArr4, 0, length8);
                    }
                    while (length8 < jArr4.length) {
                        jArr4[length8] = aVar.f();
                        length8++;
                    }
                    this.e = jArr4;
                    aVar.d(c3);
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
