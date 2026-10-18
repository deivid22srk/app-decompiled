package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ak extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String[] f3594a = com.google.protobuf.nano.e.f;

    /* renamed from: b, reason: collision with root package name */
    public String f3595b = "";
    public boolean c = false;
    public String d = "";
    public boolean e = false;

    public ak() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3594a != null && this.f3594a.length > 0) {
            for (int i = 0; i < this.f3594a.length; i++) {
                String str = this.f3594a[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.c || !this.f3595b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3595b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f3594a == null || this.f3594a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f3594a.length; i4++) {
                String str = this.f3594a[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.c || !this.f3595b.equals("")) {
            i += CodedOutputByteBufferNano.b(2, this.f3595b);
        }
        if (this.e || !this.d.equals("")) {
            return i + CodedOutputByteBufferNano.b(3, this.d);
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
                    int length = this.f3594a == null ? 0 : this.f3594a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3594a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f3594a = strArr;
                    break;
                case 18:
                    this.f3595b = aVar.c();
                    this.c = true;
                    break;
                case 26:
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
