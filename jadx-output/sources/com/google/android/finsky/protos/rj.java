package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class rj extends com.google.protobuf.nano.c {
    private static volatile rj[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f4337a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4338b = false;
    public int c = 0;
    public boolean d = false;
    public String[] e = com.google.protobuf.nano.e.f;

    public static rj[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new rj[0];
                }
            }
        }
        return f;
    }

    public rj() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4338b || !this.f4337a.equals("")) {
            codedOutputByteBufferNano.a(11, this.f4337a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(12, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                String str = this.e[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(13, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4338b || !this.f4337a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.f4337a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(12, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.e.length; i3++) {
                String str = this.e[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            return a2 + i + (i2 * 1);
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
                case 90:
                    this.f4337a = aVar.c();
                    this.f4338b = true;
                    break;
                case 96:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 106:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 106);
                    int length = this.e == null ? 0 : this.e.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.e = strArr;
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
