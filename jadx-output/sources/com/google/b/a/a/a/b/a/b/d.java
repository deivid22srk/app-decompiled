package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {
    private static volatile d[] d;

    /* renamed from: a, reason: collision with root package name */
    public int f7666a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7667b = com.google.protobuf.nano.e.f7878a;
    public int[] c = com.google.protobuf.nano.e.f7878a;

    public static d[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new d[0];
                }
            }
        }
        return d;
    }

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7666a != 0) {
            codedOutputByteBufferNano.a(1, this.f7666a);
        }
        if (this.f7667b != null && this.f7667b.length > 0) {
            for (int i = 0; i < this.f7667b.length; i++) {
                codedOutputByteBufferNano.a(2, this.f7667b[i]);
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i2 = 0; i2 < this.c.length; i2++) {
                codedOutputByteBufferNano.a(3, this.c[i2]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7666a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7666a);
        }
        if (this.f7667b != null && this.f7667b.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f7667b.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.f7667b[i2]);
            }
            a2 = a2 + i + (this.f7667b.length * 1);
        }
        if (this.c != null && this.c.length > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.c.length; i4++) {
                i3 += CodedOutputByteBufferNano.b(this.c[i4]);
            }
            return a2 + i3 + (this.c.length * 1);
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
                    this.f7666a = aVar.e();
                    break;
                case 16:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 16);
                    int length = this.f7667b == null ? 0 : this.f7667b.length;
                    int[] iArr = new int[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7667b, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = aVar.e();
                        aVar.a();
                        length++;
                    }
                    iArr[length] = aVar.e();
                    this.f7667b = iArr;
                    break;
                case 18:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.f7667b == null ? 0 : this.f7667b.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f7667b, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = aVar.e();
                        length2++;
                    }
                    this.f7667b = iArr2;
                    aVar.d(c);
                    break;
                case 24:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 24);
                    int length3 = this.c == null ? 0 : this.c.length;
                    int[] iArr3 = new int[b3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.c, 0, iArr3, 0, length3);
                    }
                    while (length3 < iArr3.length - 1) {
                        iArr3[length3] = aVar.e();
                        aVar.a();
                        length3++;
                    }
                    iArr3[length3] = aVar.e();
                    this.c = iArr3;
                    break;
                case 26:
                    int c2 = aVar.c(aVar.e());
                    int j2 = aVar.j();
                    int i2 = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i2++;
                    }
                    aVar.e(j2);
                    int length4 = this.c == null ? 0 : this.c.length;
                    int[] iArr4 = new int[i2 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.c, 0, iArr4, 0, length4);
                    }
                    while (length4 < iArr4.length) {
                        iArr4[length4] = aVar.e();
                        length4++;
                    }
                    this.c = iArr4;
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
