package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ns extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public nr f4183a = null;

    /* renamed from: b, reason: collision with root package name */
    public op f4184b = null;
    public lk[] c = lk.b();
    public kf[] d = kf.b();
    public os e = null;
    public pn f = null;
    public or g = null;

    public ns() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4183a != null) {
            codedOutputByteBufferNano.b(1, this.f4183a);
        }
        if (this.f4184b != null) {
            codedOutputByteBufferNano.b(2, this.f4184b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                lk lkVar = this.c[i];
                if (lkVar != null) {
                    codedOutputByteBufferNano.b(3, lkVar);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                kf kfVar = this.d[i2];
                if (kfVar != null) {
                    codedOutputByteBufferNano.b(4, kfVar);
                }
            }
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(6, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(7, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4183a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4183a);
        }
        if (this.f4184b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4184b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                lk lkVar = this.c[i2];
                if (lkVar != null) {
                    i += CodedOutputByteBufferNano.d(3, lkVar);
                }
            }
            a2 = i;
        }
        if (this.d != null && this.d.length > 0) {
            for (int i3 = 0; i3 < this.d.length; i3++) {
                kf kfVar = this.d[i3];
                if (kfVar != null) {
                    a2 += CodedOutputByteBufferNano.d(4, kfVar);
                }
            }
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.f);
        }
        if (this.g != null) {
            return a2 + CodedOutputByteBufferNano.d(7, this.g);
        }
        return a2;
    }

    public static ns a(byte[] bArr) {
        return (ns) com.google.protobuf.nano.c.a(new ns(), bArr, bArr.length);
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.f4183a == null) {
                        this.f4183a = new nr();
                    }
                    aVar.a(this.f4183a);
                    break;
                case 18:
                    if (this.f4184b == null) {
                        this.f4184b = new op();
                    }
                    aVar.a(this.f4184b);
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    lk[] lkVarArr = new lk[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, lkVarArr, 0, length);
                    }
                    while (length < lkVarArr.length - 1) {
                        lkVarArr[length] = new lk();
                        aVar.a(lkVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    lkVarArr[length] = new lk();
                    aVar.a(lkVarArr[length]);
                    this.c = lkVarArr;
                    break;
                case 34:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length2 = this.d == null ? 0 : this.d.length;
                    kf[] kfVarArr = new kf[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, kfVarArr, 0, length2);
                    }
                    while (length2 < kfVarArr.length - 1) {
                        kfVarArr[length2] = new kf();
                        aVar.a(kfVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    kfVarArr[length2] = new kf();
                    aVar.a(kfVarArr[length2]);
                    this.d = kfVarArr;
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new os();
                    }
                    aVar.a(this.e);
                    break;
                case 50:
                    if (this.f == null) {
                        this.f = new pn();
                    }
                    aVar.a(this.f);
                    break;
                case 58:
                    if (this.g == null) {
                        this.g = new or();
                    }
                    aVar.a(this.g);
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
