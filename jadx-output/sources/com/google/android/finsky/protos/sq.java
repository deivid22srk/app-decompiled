package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sq extends com.google.protobuf.nano.c {
    private static volatile sq[] f;

    /* renamed from: a, reason: collision with root package name */
    public int f4396a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4397b = false;
    public String c = "";
    public boolean d = false;
    public String[] e = com.google.protobuf.nano.e.f;

    public static sq[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new sq[0];
                }
            }
        }
        return f;
    }

    public sq() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4396a != 0 || this.f4397b) {
            codedOutputByteBufferNano.a(1, this.f4396a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                String str = this.e[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(3, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4396a != 0 || this.f4397b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4396a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
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
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f4396a = e;
                            this.f4397b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
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
