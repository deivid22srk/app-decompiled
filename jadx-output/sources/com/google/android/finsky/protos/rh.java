package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class rh extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4333a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4334b = false;
    public int c = 0;
    public boolean d = false;
    public ri[] e = ri.b();
    public rj[] f = rj.b();

    public rh() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4334b || this.f4333a) {
            codedOutputByteBufferNano.a(1, this.f4333a);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                ri riVar = this.e[i];
                if (riVar != null) {
                    codedOutputByteBufferNano.a(2, riVar);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            for (int i2 = 0; i2 < this.f.length; i2++) {
                rj rjVar = this.f[i2];
                if (rjVar != null) {
                    codedOutputByteBufferNano.a(10, rjVar);
                }
            }
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(14, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4334b || this.f4333a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                ri riVar = this.e[i2];
                if (riVar != null) {
                    i += CodedOutputByteBufferNano.c(2, riVar);
                }
            }
            a2 = i;
        }
        if (this.f != null && this.f.length > 0) {
            for (int i3 = 0; i3 < this.f.length; i3++) {
                rj rjVar = this.f[i3];
                if (rjVar != null) {
                    a2 += CodedOutputByteBufferNano.c(10, rjVar);
                }
            }
        }
        if (this.d || this.c != 0) {
            return a2 + CodedOutputByteBufferNano.c(14, this.c);
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
                    this.f4333a = aVar.b();
                    this.f4334b = true;
                    break;
                case 19:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 19);
                    int length = this.e == null ? 0 : this.e.length;
                    ri[] riVarArr = new ri[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, riVarArr, 0, length);
                    }
                    while (length < riVarArr.length - 1) {
                        riVarArr[length] = new ri();
                        aVar.a(riVarArr[length], 2);
                        aVar.a();
                        length++;
                    }
                    riVarArr[length] = new ri();
                    aVar.a(riVarArr[length], 2);
                    this.e = riVarArr;
                    break;
                case 83:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 83);
                    int length2 = this.f == null ? 0 : this.f.length;
                    rj[] rjVarArr = new rj[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f, 0, rjVarArr, 0, length2);
                    }
                    while (length2 < rjVarArr.length - 1) {
                        rjVarArr[length2] = new rj();
                        aVar.a(rjVarArr[length2], 10);
                        aVar.a();
                        length2++;
                    }
                    rjVarArr[length2] = new rj();
                    aVar.a(rjVarArr[length2], 10);
                    this.f = rjVarArr;
                    break;
                case 112:
                    this.c = aVar.e();
                    this.d = true;
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
