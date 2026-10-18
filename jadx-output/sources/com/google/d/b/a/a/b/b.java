package com.google.d.b.a.a.b;

import com.google.b.a.a.a.b.a.b.r;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public String[] f7739a = e.f;

    /* renamed from: b, reason: collision with root package name */
    public r f7740b = null;
    public r c = null;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7739a != null && this.f7739a.length > 0) {
            for (int i = 0; i < this.f7739a.length; i++) {
                String str = this.f7739a[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.f7740b != null) {
            codedOutputByteBufferNano.b(2, this.f7740b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f7739a == null || this.f7739a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f7739a.length; i4++) {
                String str = this.f7739a[i4];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.a(str);
                }
            }
            i = a2 + i2 + (i3 * 1);
        }
        if (this.f7740b != null) {
            i += CodedOutputByteBufferNano.d(2, this.f7740b);
        }
        if (this.c != null) {
            return i + CodedOutputByteBufferNano.d(3, this.c);
        }
        return i;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    int b2 = e.b(aVar, 10);
                    int length = this.f7739a == null ? 0 : this.f7739a.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7739a, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.f7739a = strArr;
                    break;
                case 18:
                    if (this.f7740b == null) {
                        this.f7740b = new r();
                    }
                    aVar.a(this.f7740b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new r();
                    }
                    aVar.a(this.c);
                    break;
                default:
                    if (!e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
