package com.google.d.b.a.a.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7733a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7734b = 0;
    public int[] c = e.f7878a;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7733a != 0) {
            codedOutputByteBufferNano.a(3, this.f7733a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                codedOutputByteBufferNano.a(4, this.c[i]);
            }
        }
        if (this.f7734b != 0) {
            codedOutputByteBufferNano.a(5, this.f7734b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7733a != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.f7733a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.c[i2]);
            }
            a2 = a2 + i + (this.c.length * 1);
        }
        if (this.f7734b != 0) {
            return a2 + CodedOutputByteBufferNano.c(5, this.f7734b);
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        int i;
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.f7733a = e;
                            break;
                    }
                case 32:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 32);
                    int[] iArr = new int[b2];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b2) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int e2 = aVar.e();
                        switch (e2) {
                            case 0:
                            case 1:
                            case 2:
                                i = i3 + 1;
                                iArr[i3] = e2;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length = this.c == null ? 0 : this.c.length;
                        if (length == 0 && i3 == iArr.length) {
                            this.c = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length + i3];
                            if (length != 0) {
                                System.arraycopy(this.c, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i3);
                            this.c = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 34:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 0:
                            case 1:
                            case 2:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length2 = this.c == null ? 0 : this.c.length;
                        int[] iArr3 = new int[i4 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.c, 0, iArr3, 0, length2);
                        }
                        while (aVar.i() > 0) {
                            int e3 = aVar.e();
                            switch (e3) {
                                case 0:
                                case 1:
                                case 2:
                                    iArr3[length2] = e3;
                                    length2++;
                                    break;
                            }
                        }
                        this.c = iArr3;
                    }
                    aVar.d(c);
                    break;
                case 40:
                    int e4 = aVar.e();
                    switch (e4) {
                        case 0:
                        case 1:
                        case 2:
                            this.f7734b = e4;
                            break;
                    }
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
