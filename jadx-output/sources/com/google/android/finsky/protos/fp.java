package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fp extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3836a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3837b = false;
    public ds c = null;
    public int d = 0;
    public boolean e = false;
    public int f = 0;
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public jd j = null;
    public ny[] k = ny.b();

    public fp() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3837b || !this.f3836a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3836a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || this.f != 0) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(5, this.h);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(6, this.j);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i = 0; i < this.k.length; i++) {
                ny nyVar = this.k[i];
                if (nyVar != null) {
                    codedOutputByteBufferNano.b(7, nyVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3837b || !this.f3836a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3836a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.d(3, this.d);
        }
        if (this.g || this.f != 0) {
            a2 += CodedOutputByteBufferNano.d(4, this.f);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.h);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.j);
        }
        if (this.k != null && this.k.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.k.length; i2++) {
                ny nyVar = this.k[i2];
                if (nyVar != null) {
                    i += CodedOutputByteBufferNano.d(7, nyVar);
                }
            }
            return i;
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
                    this.f3836a = aVar.c();
                    this.f3837b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new ds();
                    }
                    aVar.a(this.c);
                    break;
                case 24:
                    this.d = aVar.e();
                    this.e = true;
                    break;
                case 32:
                    this.f = aVar.e();
                    this.g = true;
                    break;
                case 42:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 50:
                    if (this.j == null) {
                        this.j = new jd();
                    }
                    aVar.a(this.j);
                    break;
                case 58:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length = this.k == null ? 0 : this.k.length;
                    ny[] nyVarArr = new ny[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.k, 0, nyVarArr, 0, length);
                    }
                    while (length < nyVarArr.length - 1) {
                        nyVarArr[length] = new ny();
                        aVar.a(nyVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    nyVarArr[length] = new ny();
                    aVar.a(nyVarArr[length]);
                    this.k = nyVarArr;
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
