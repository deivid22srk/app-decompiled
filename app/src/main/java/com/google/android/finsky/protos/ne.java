package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ne extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4162a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4163b = false;
    public gx[] c = gx.b();
    public kj[] d = kj.b();

    public ne() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4163b || !this.f4162a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4162a);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                kj kjVar = this.d[i];
                if (kjVar != null) {
                    codedOutputByteBufferNano.b(2, kjVar);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i2 = 0; i2 < this.c.length; i2++) {
                gx gxVar = this.c[i2];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(3, gxVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4163b || !this.f4162a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4162a);
        }
        if (this.d != null && this.d.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.d.length; i2++) {
                kj kjVar = this.d[i2];
                if (kjVar != null) {
                    i += CodedOutputByteBufferNano.d(2, kjVar);
                }
            }
            a2 = i;
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                gx gxVar = this.c[i3];
                if (gxVar != null) {
                    a2 += CodedOutputByteBufferNano.d(3, gxVar);
                }
            }
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
                    this.f4162a = aVar.c();
                    this.f4163b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.d == null ? 0 : this.d.length;
                    kj[] kjVarArr = new kj[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, kjVarArr, 0, length);
                    }
                    while (length < kjVarArr.length - 1) {
                        kjVarArr[length] = new kj();
                        aVar.a(kjVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    kjVarArr[length] = new kj();
                    aVar.a(kjVarArr[length]);
                    this.d = kjVarArr;
                    break;
                case 26:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length2 = this.c == null ? 0 : this.c.length;
                    gx[] gxVarArr = new gx[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, gxVarArr, 0, length2);
                    }
                    while (length2 < gxVarArr.length - 1) {
                        gxVarArr[length2] = new gx();
                        aVar.a(gxVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    gxVarArr[length2] = new gx();
                    aVar.a(gxVarArr[length2]);
                    this.c = gxVarArr;
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
