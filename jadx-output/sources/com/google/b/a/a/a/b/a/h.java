package com.google.b.a.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class h extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String[] f7702a = com.google.protobuf.nano.e.f;

    /* renamed from: b, reason: collision with root package name */
    public String[] f7703b = com.google.protobuf.nano.e.f;

    public h() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7702a != null && this.f7702a.length > 0) {
            for (int i = 0; i < this.f7702a.length; i++) {
                String str = this.f7702a[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.f7703b != null && this.f7703b.length > 0) {
            for (int i2 = 0; i2 < this.f7703b.length; i2++) {
                String str2 = this.f7703b[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(2, str2);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f7702a == null || this.f7702a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f7702a.length; i4++) {
                String str = this.f7702a[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.f7703b != null && this.f7703b.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f7703b.length; i7++) {
                String str2 = this.f7703b[i7];
                if (str2 != null) {
                    i6++;
                    i5 += CodedOutputByteBufferNano.a(str2);
                }
            }
            return i + i5 + (i6 * 1);
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
                    int length = this.f7702a == null ? 0 : this.f7702a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7702a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f7702a = strArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f7703b == null ? 0 : this.f7703b.length;
                    String[] strArr2 = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f7703b, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr2[length2] = aVar.c();
                    this.f7703b = strArr2;
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
