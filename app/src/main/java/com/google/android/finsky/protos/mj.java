package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class mj extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String[] f4128a = com.google.protobuf.nano.e.f;

    /* renamed from: b, reason: collision with root package name */
    public String[] f4129b = com.google.protobuf.nano.e.f;
    public String[] c = com.google.protobuf.nano.e.f;
    public String d = "";
    public boolean e = false;

    public mj() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4128a != null && this.f4128a.length > 0) {
            for (int i = 0; i < this.f4128a.length; i++) {
                String str = this.f4128a[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.f4129b != null && this.f4129b.length > 0) {
            for (int i2 = 0; i2 < this.f4129b.length; i2++) {
                String str2 = this.f4129b[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(2, str2);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                String str3 = this.c[i3];
                if (str3 != null) {
                    codedOutputByteBufferNano.a(3, str3);
                }
            }
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f4128a == null || this.f4128a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f4128a.length; i4++) {
                String str = this.f4128a[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.f4129b != null && this.f4129b.length > 0) {
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f4129b.length; i7++) {
                String str2 = this.f4129b[i7];
                if (str2 != null) {
                    i6++;
                    i5 += CodedOutputByteBufferNano.a(str2);
                }
            }
            i = i + i5 + (i6 * 1);
        }
        if (this.c != null && this.c.length > 0) {
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < this.c.length; i10++) {
                String str3 = this.c[i10];
                if (str3 != null) {
                    i9++;
                    i8 += CodedOutputByteBufferNano.a(str3);
                }
            }
            i = i + i8 + (i9 * 1);
        }
        if (this.e || !this.d.equals("")) {
            return i + CodedOutputByteBufferNano.b(4, this.d);
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
                    int length = this.f4128a == null ? 0 : this.f4128a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4128a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f4128a = strArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f4129b == null ? 0 : this.f4129b.length;
                    String[] strArr2 = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f4129b, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr2[length2] = aVar.c();
                    this.f4129b = strArr2;
                    break;
                case 26:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length3 = this.c == null ? 0 : this.c.length;
                    String[] strArr3 = new String[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.c, 0, strArr3, 0, length3);
                    }
                    while (length3 < strArr3.length - 1) {
                        strArr3[length3] = aVar.c();
                        aVar.a();
                        length3++;
                    }
                    strArr3[length3] = aVar.c();
                    this.c = strArr3;
                    break;
                case 34:
                    this.d = aVar.c();
                    this.e = true;
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
