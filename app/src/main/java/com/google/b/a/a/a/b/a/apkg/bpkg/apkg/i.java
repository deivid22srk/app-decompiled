package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i extends com.google.protobuf.nano.c {
    public static volatile i[] i;

    /* renamed from: a, reason: collision with root package name */
    public j[] f7575a = j.b();

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7576b = com.google.protobuf.nano.e.h;
    public com.google.b.a.a.a.b.a.bpkg.m c = null;
    public int d = -1;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int[] h = com.google.protobuf.nano.e.f7878a;

    public static i[] b() {
        if (i == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (i == null) {
                    i = new i[0];
                }
            }
        }
        return i;
    }

    public i() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7575a != null && this.f7575a.length > 0) {
            for (int i2 = 0; i2 < this.f7575a.length; i2++) {
                j jVar = this.f7575a[i2];
                if (jVar != null) {
                    codedOutputByteBufferNano.b(1, jVar);
                }
            }
        }
        if (!Arrays.equals(this.f7576b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7576b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.g != 0) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.h.length; i4++) {
                i3 += CodedOutputByteBufferNano.b(this.h[i4]);
            }
            codedOutputByteBufferNano.d(42);
            codedOutputByteBufferNano.d(i3);
            for (int i5 = 0; i5 < this.h.length; i5++) {
                codedOutputByteBufferNano.a(this.h[i5]);
            }
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.e != 0) {
            codedOutputByteBufferNano.a(7, this.e);
        }
        if (this.d != -1) {
            codedOutputByteBufferNano.a(8, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7575a != null && this.f7575a.length > 0) {
            int i2 = a2;
            for (int i3 = 0; i3 < this.f7575a.length; i3++) {
                j jVar = this.f7575a[i3];
                if (jVar != null) {
                    i2 += CodedOutputByteBufferNano.d(1, jVar);
                }
            }
            a2 = i2;
        }
        if (!Arrays.equals(this.f7576b, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7576b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.g != 0) {
            a2 += CodedOutputByteBufferNano.c(4, this.g);
        }
        if (this.h != null && this.h.length > 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.h.length; i5++) {
                i4 += CodedOutputByteBufferNano.b(this.h[i5]);
            }
            a2 = a2 + i4 + 1 + CodedOutputByteBufferNano.e(i4);
        }
        if (this.f != 0) {
            a2 += CodedOutputByteBufferNano.c(6, this.f);
        }
        if (this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(7, this.e);
        }
        if (this.d != -1) {
            return a2 + CodedOutputByteBufferNano.c(8, this.d);
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
                    int length = this.f7575a == null ? 0 : this.f7575a.length;
                    j[] jVarArr = new j[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7575a, 0, jVarArr, 0, length);
                    }
                    while (length < jVarArr.length - 1) {
                        jVarArr[length] = new j();
                        aVar.a(jVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jVarArr[length] = new j();
                    aVar.a(jVarArr[length]);
                    this.f7575a = jVarArr;
                    break;
                case 18:
                    this.f7576b = aVar.d();
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.bpkg.m();
                    }
                    aVar.a(this.c);
                    break;
                case 32:
                    this.g = aVar.e();
                    break;
                case 40:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 40);
                    int length2 = this.h == null ? 0 : this.h.length;
                    int[] iArr = new int[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.h, 0, iArr, 0, length2);
                    }
                    while (length2 < iArr.length - 1) {
                        iArr[length2] = aVar.e();
                        aVar.a();
                        length2++;
                    }
                    iArr[length2] = aVar.e();
                    this.h = iArr;
                    break;
                case 42:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i2 = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i2++;
                    }
                    aVar.e(j);
                    int length3 = this.h == null ? 0 : this.h.length;
                    int[] iArr2 = new int[i2 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.h, 0, iArr2, 0, length3);
                    }
                    while (length3 < iArr2.length) {
                        iArr2[length3] = aVar.e();
                        length3++;
                    }
                    this.h = iArr2;
                    aVar.d(c);
                    break;
                case 48:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f = e;
                            break;
                    }
                case 56:
                    this.e = aVar.e();
                    break;
                case 64:
                    this.d = aVar.e();
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
