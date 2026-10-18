package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class s extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public bx[] f4365a = bx.b();

    /* renamed from: b, reason: collision with root package name */
    public gx f4366b = null;
    public gx[] c = gx.b();

    public s() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4365a != null && this.f4365a.length > 0) {
            for (int i = 0; i < this.f4365a.length; i++) {
                bx bxVar = this.f4365a[i];
                if (bxVar != null) {
                    codedOutputByteBufferNano.b(1, bxVar);
                }
            }
        }
        if (this.f4366b != null) {
            codedOutputByteBufferNano.b(2, this.f4366b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i2 = 0; i2 < this.c.length; i2++) {
                gx gxVar = this.c[i2];
                if (gxVar != null) {
                    codedOutputByteBufferNano.b(4, gxVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4365a != null && this.f4365a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4365a.length; i2++) {
                bx bxVar = this.f4365a[i2];
                if (bxVar != null) {
                    i += CodedOutputByteBufferNano.d(1, bxVar);
                }
            }
            a2 = i;
        }
        if (this.f4366b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4366b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                gx gxVar = this.c[i3];
                if (gxVar != null) {
                    a2 += CodedOutputByteBufferNano.d(4, gxVar);
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f4365a == null ? 0 : this.f4365a.length;
                    bx[] bxVarArr = new bx[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4365a, 0, bxVarArr, 0, length);
                    }
                    while (length < bxVarArr.length - 1) {
                        bxVarArr[length] = new bx();
                        aVar.a(bxVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bxVarArr[length] = new bx();
                    aVar.a(bxVarArr[length]);
                    this.f4365a = bxVarArr;
                    break;
                case 18:
                    if (this.f4366b == null) {
                        this.f4366b = new gx();
                    }
                    aVar.a(this.f4366b);
                    break;
                case 34:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 34);
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
