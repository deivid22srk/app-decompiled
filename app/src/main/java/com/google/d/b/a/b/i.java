package com.google.d.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class i extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public e f7754a = null;

    /* renamed from: b, reason: collision with root package name */
    public b f7755b = null;
    public com.google.d.b.a.a.b c = null;
    public com.google.d.b.a.a.d[] d = com.google.d.b.a.a.d.b();
    public boolean e = false;
    public com.google.d.b.a.a.d[] f = com.google.d.b.a.a.d.b();

    public i() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7754a != null) {
            codedOutputByteBufferNano.b(1, this.f7754a);
        }
        if (this.f7755b != null) {
            codedOutputByteBufferNano.b(2, this.f7755b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                com.google.d.b.a.a.d dVar = this.d[i];
                if (dVar != null) {
                    codedOutputByteBufferNano.b(4, dVar);
                }
            }
        }
        if (this.e) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i2 = 0; i2 < this.f.length; i2++) {
                com.google.d.b.a.a.d dVar2 = this.f[i2];
                if (dVar2 != null) {
                    codedOutputByteBufferNano.b(6, dVar2);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7754a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7754a);
        }
        if (this.f7755b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7755b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.d.length; i2++) {
                com.google.d.b.a.a.d dVar = this.d[i2];
                if (dVar != null) {
                    i += CodedOutputByteBufferNano.d(4, dVar);
                }
            }
            a2 = i;
        }
        if (this.e) {
            a2 += CodedOutputByteBufferNano.c(5) + 1;
        }
        if (this.f != null && this.f.length > 0) {
            for (int i3 = 0; i3 < this.f.length; i3++) {
                com.google.d.b.a.a.d dVar2 = this.f[i3];
                if (dVar2 != null) {
                    a2 += CodedOutputByteBufferNano.d(6, dVar2);
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
                    if (this.f7754a == null) {
                        this.f7754a = new e();
                    }
                    aVar.a(this.f7754a);
                    break;
                case 18:
                    if (this.f7755b == null) {
                        this.f7755b = new b();
                    }
                    aVar.a(this.f7755b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new com.google.d.b.a.a.b();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.d == null ? 0 : this.d.length;
                    com.google.d.b.a.a.d[] dVarArr = new com.google.d.b.a.a.d[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, dVarArr, 0, length);
                    }
                    while (length < dVarArr.length - 1) {
                        dVarArr[length] = new com.google.d.b.a.a.d();
                        aVar.a(dVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dVarArr[length] = new com.google.d.b.a.a.d();
                    aVar.a(dVarArr[length]);
                    this.d = dVarArr;
                    break;
                case 40:
                    this.e = aVar.b();
                    break;
                case 50:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length2 = this.f == null ? 0 : this.f.length;
                    com.google.d.b.a.a.d[] dVarArr2 = new com.google.d.b.a.a.d[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f, 0, dVarArr2, 0, length2);
                    }
                    while (length2 < dVarArr2.length - 1) {
                        dVarArr2[length2] = new com.google.d.b.a.a.d();
                        aVar.a(dVarArr2[length2]);
                        aVar.a();
                        length2++;
                    }
                    dVarArr2[length2] = new com.google.d.b.a.a.d();
                    aVar.a(dVarArr2[length2]);
                    this.f = dVarArr2;
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
