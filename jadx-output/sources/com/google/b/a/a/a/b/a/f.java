package com.google.b.a.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f7700a = -1;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7701b = com.google.protobuf.nano.e.h;
    public byte[] c = com.google.protobuf.nano.e.h;
    public String d = "";
    public byte[] e = com.google.protobuf.nano.e.h;
    public int[] f = com.google.protobuf.nano.e.f7878a;

    public f() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7700a != -1) {
            codedOutputByteBufferNano.b(1, this.f7700a);
        }
        if (!Arrays.equals(this.f7701b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7701b);
        }
        if (!Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(6, this.d);
        }
        if (!Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(7, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i = 0; i < this.f.length; i++) {
                codedOutputByteBufferNano.a(8, this.f[i]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7700a != -1) {
            a2 += CodedOutputByteBufferNano.e(1, this.f7700a);
        }
        if (!Arrays.equals(this.f7701b, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7701b);
        }
        if (!Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(5, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.d);
        }
        if (!Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(7, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.f[i2]);
            }
            return a2 + i + (this.f.length * 1);
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
                case 8:
                    this.f7700a = aVar.f();
                    break;
                case 18:
                    this.f7701b = aVar.d();
                    break;
                case 42:
                    this.c = aVar.d();
                    break;
                case 50:
                    this.d = aVar.c();
                    break;
                case 58:
                    this.e = aVar.d();
                    break;
                case 64:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 64);
                    int[] iArr = new int[b2];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b2) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int e = aVar.e();
                        switch (e) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i = i3 + 1;
                                iArr[i3] = e;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length = this.f == null ? 0 : this.f.length;
                        if (length == 0 && i3 == iArr.length) {
                            this.f = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length + i3];
                            if (length != 0) {
                                System.arraycopy(this.f, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i3);
                            this.f = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 66:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length2 = this.f == null ? 0 : this.f.length;
                        int[] iArr3 = new int[i4 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f, 0, iArr3, 0, length2);
                        }
                        while (aVar.i() > 0) {
                            int e2 = aVar.e();
                            switch (e2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    iArr3[length2] = e2;
                                    length2++;
                                    break;
                            }
                        }
                        this.f = iArr3;
                    }
                    aVar.d(c);
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
