package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kx extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public io f4060a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f4061b = "";
    public boolean c = false;
    public String[] d = com.google.protobuf.nano.e.f;
    public boolean e = false;
    public boolean f = false;

    public kx() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4060a != null) {
            codedOutputByteBufferNano.b(1, this.f4060a);
        }
        if (this.c || !this.f4061b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4061b);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                String str = this.d[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(3, str);
                }
            }
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4060a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4060a);
        }
        if (this.c || !this.f4061b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4061b);
        }
        if (this.d != null && this.d.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.d.length; i3++) {
                String str = this.d[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.f || this.e) {
            return a2 + CodedOutputByteBufferNano.c(4) + 1;
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
                    if (this.f4060a == null) {
                        this.f4060a = new io();
                    }
                    aVar.a(this.f4060a);
                    break;
                case 18:
                    this.f4061b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.d == null ? 0 : this.d.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.d = strArr;
                    break;
                case 32:
                    this.e = aVar.b();
                    this.f = true;
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
