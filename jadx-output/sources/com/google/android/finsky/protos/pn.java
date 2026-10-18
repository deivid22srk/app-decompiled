package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pn extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4258a = com.google.protobuf.nano.e.f7879b;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4259b = com.google.protobuf.nano.e.h;
    public boolean c = false;

    public pn() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4258a != null && this.f4258a.length > 0) {
            for (int i = 0; i < this.f4258a.length; i++) {
                codedOutputByteBufferNano.b(1, this.f4258a[i]);
            }
        }
        if (this.c || !Arrays.equals(this.f4259b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f4259b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f4258a == null || this.f4258a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f4258a.length; i3++) {
                i2 += CodedOutputByteBufferNano.b(this.f4258a[i3]);
            }
            i = a2 + i2 + (this.f4258a.length * 1);
        }
        if (this.c || !Arrays.equals(this.f4259b, com.google.protobuf.nano.e.h)) {
            return i + CodedOutputByteBufferNano.b(2, this.f4259b);
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
                case 8:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 8);
                    int length = this.f4258a == null ? 0 : this.f4258a.length;
                    long[] jArr = new long[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4258a, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = aVar.f();
                        aVar.a();
                        length++;
                    }
                    jArr[length] = aVar.f();
                    this.f4258a = jArr;
                    break;
                case 10:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.f4258a == null ? 0 : this.f4258a.length;
                    long[] jArr2 = new long[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f4258a, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = aVar.f();
                        length2++;
                    }
                    this.f4258a = jArr2;
                    aVar.d(c);
                    break;
                case 18:
                    this.f4259b = aVar.d();
                    this.c = true;
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
