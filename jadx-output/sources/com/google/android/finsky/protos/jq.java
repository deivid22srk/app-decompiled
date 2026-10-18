package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class jq extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4003a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4004b = false;
    public String[] c = com.google.protobuf.nano.e.f;
    public String[] d = com.google.protobuf.nano.e.f;
    public String[] e = com.google.protobuf.nano.e.f;

    public jq() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4004b || !this.f4003a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4003a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                String str = this.c[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                String str2 = this.d[i2];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(3, str2);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int i3 = 0; i3 < this.e.length; i3++) {
                String str3 = this.e[i3];
                if (str3 != null) {
                    codedOutputByteBufferNano.a(4, str3);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4004b || !this.f4003a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4003a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.c.length; i3++) {
                String str = this.c[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.d != null && this.d.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.d.length; i6++) {
                String str2 = this.d[i6];
                if (str2 != null) {
                    i5++;
                    i4 += CodedOutputByteBufferNano.a(str2);
                }
            }
            a2 = a2 + i4 + (i5 * 1);
        }
        if (this.e != null && this.e.length > 0) {
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < this.e.length; i9++) {
                String str3 = this.e[i9];
                if (str3 != null) {
                    i8++;
                    i7 += CodedOutputByteBufferNano.a(str3);
                }
            }
            return a2 + i7 + (i8 * 1);
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
                    this.f4003a = aVar.c();
                    this.f4004b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.c = strArr;
                    break;
                case 26:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length2 = this.d == null ? 0 : this.d.length;
                    String[] strArr2 = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr2[length2] = aVar.c();
                    this.d = strArr2;
                    break;
                case 34:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length3 = this.e == null ? 0 : this.e.length;
                    String[] strArr3 = new String[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.e, 0, strArr3, 0, length3);
                    }
                    while (length3 < strArr3.length - 1) {
                        strArr3[length3] = aVar.c();
                        aVar.a();
                        length3++;
                    }
                    strArr3[length3] = aVar.c();
                    this.e = strArr3;
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
