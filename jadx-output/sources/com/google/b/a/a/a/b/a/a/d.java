package com.google.b.a.a.a.b.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public j f7612a = null;

    /* renamed from: b, reason: collision with root package name */
    public String[] f7613b = com.google.protobuf.nano.e.f;
    public String c = "";

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7613b != null && this.f7613b.length > 0) {
            for (int i = 0; i < this.f7613b.length; i++) {
                String str = this.f7613b[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.f7612a != null) {
            codedOutputByteBufferNano.b(7, this.f7612a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f7613b == null || this.f7613b.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f7613b.length; i4++) {
                String str = this.f7613b[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (!this.c.equals("")) {
            i += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.f7612a != null) {
            return i + CodedOutputByteBufferNano.d(7, this.f7612a);
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
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.f7613b == null ? 0 : this.f7613b.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7613b, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f7613b = strArr;
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 58:
                    if (this.f7612a == null) {
                        this.f7612a = new j();
                    }
                    aVar.a(this.f7612a);
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
