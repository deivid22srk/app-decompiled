package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class dy extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long[] f3757a = com.google.protobuf.nano.e.f7879b;

    /* renamed from: b, reason: collision with root package name */
    public String f3758b = "";
    public boolean c = false;
    public dr d = null;
    public long e = 0;
    public boolean f = false;
    public String g = "";
    public boolean h = false;

    public dy() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3757a != null && this.f3757a.length > 0) {
            for (int i = 0; i < this.f3757a.length; i++) {
                codedOutputByteBufferNano.c(1, this.f3757a[i]);
            }
        }
        if (this.c || !this.f3758b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3758b);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.c(4, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3757a != null && this.f3757a.length > 0) {
            a2 = a2 + (this.f3757a.length * 8) + (this.f3757a.length * 1);
        }
        if (this.c || !this.f3758b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f3758b);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.d);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(4) + 8;
        }
        if (this.h || !this.g.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.g);
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
                case 9:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 9);
                    int length = this.f3757a == null ? 0 : this.f3757a.length;
                    long[] jArr = new long[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3757a, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = aVar.h();
                        aVar.a();
                        length++;
                    }
                    jArr[length] = aVar.h();
                    this.f3757a = jArr;
                    break;
                case 10:
                    int e = aVar.e();
                    int c = aVar.c(e);
                    int i = e / 8;
                    int length2 = this.f3757a == null ? 0 : this.f3757a.length;
                    long[] jArr2 = new long[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f3757a, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = aVar.h();
                        length2++;
                    }
                    this.f3757a = jArr2;
                    aVar.d(c);
                    break;
                case 18:
                    this.f3758b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    if (this.d == null) {
                        this.d = new dr();
                    }
                    aVar.a(this.d);
                    break;
                case 33:
                    this.e = aVar.h();
                    this.f = true;
                    break;
                case 42:
                    this.g = aVar.c();
                    this.h = true;
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
