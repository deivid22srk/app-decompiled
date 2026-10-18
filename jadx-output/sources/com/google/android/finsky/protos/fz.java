package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fz extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String[] f3853a = com.google.protobuf.nano.e.f;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3854b = com.google.protobuf.nano.e.f7878a;
    public boolean c = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public String g = "";
    public boolean h = false;

    public fz() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3853a != null && this.f3853a.length > 0) {
            for (int i = 0; i < this.f3853a.length; i++) {
                String str = this.f3853a[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.d || !this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.f3854b != null && this.f3854b.length > 0) {
            for (int i2 = 0; i2 < this.f3854b.length; i2++) {
                codedOutputByteBufferNano.a(7, this.f3854b[i2]);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f3853a == null || this.f3853a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f3853a.length; i4++) {
                String str = this.f3853a[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.d || !this.c) {
            i += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.f || this.e) {
            i += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.h || !this.g.equals("")) {
            i += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.f3854b != null && this.f3854b.length > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3854b.length; i6++) {
                i5 += CodedOutputByteBufferNano.b(this.f3854b[i6]);
            }
            return i + i5 + (this.f3854b.length * 1);
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
                    int length = this.f3853a == null ? 0 : this.f3853a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3853a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f3853a = strArr;
                    break;
                case 16:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.b();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 56:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 56);
                    int length2 = this.f3854b == null ? 0 : this.f3854b.length;
                    int[] iArr = new int[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f3854b, 0, iArr, 0, length2);
                    }
                    while (length2 < iArr.length - 1) {
                        iArr[length2] = aVar.e();
                        aVar.a();
                        length2++;
                    }
                    iArr[length2] = aVar.e();
                    this.f3854b = iArr;
                    break;
                case 58:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.e();
                        i++;
                    }
                    aVar.e(j);
                    int length3 = this.f3854b == null ? 0 : this.f3854b.length;
                    int[] iArr2 = new int[i + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.f3854b, 0, iArr2, 0, length3);
                    }
                    while (length3 < iArr2.length) {
                        iArr2[length3] = aVar.e();
                        length3++;
                    }
                    this.f3854b = iArr2;
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
