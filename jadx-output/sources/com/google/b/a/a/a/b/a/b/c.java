package com.google.b.a.a.a.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class c extends com.google.protobuf.nano.c {
    private static volatile c[] e;

    /* renamed from: a, reason: collision with root package name */
    public b[] f7664a = b.b();

    /* renamed from: b, reason: collision with root package name */
    public b[] f7665b = b.b();
    public i[] c = i.b();
    public f[] d = f.b();

    public static c[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new c[0];
                }
            }
        }
        return e;
    }

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7664a != null && this.f7664a.length > 0) {
            for (int i = 0; i < this.f7664a.length; i++) {
                b bVar = this.f7664a[i];
                if (bVar != null) {
                    codedOutputByteBufferNano.b(1, bVar);
                }
            }
        }
        if (this.f7665b != null && this.f7665b.length > 0) {
            for (int i2 = 0; i2 < this.f7665b.length; i2++) {
                b bVar2 = this.f7665b[i2];
                if (bVar2 != null) {
                    codedOutputByteBufferNano.b(2, bVar2);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                i iVar = this.c[i3];
                if (iVar != null) {
                    codedOutputByteBufferNano.b(3, iVar);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i4 = 0; i4 < this.d.length; i4++) {
                f fVar = this.d[i4];
                if (fVar != null) {
                    codedOutputByteBufferNano.b(4, fVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7664a != null && this.f7664a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f7664a.length; i2++) {
                b bVar = this.f7664a[i2];
                if (bVar != null) {
                    i += CodedOutputByteBufferNano.d(1, bVar);
                }
            }
            a2 = i;
        }
        if (this.f7665b != null && this.f7665b.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.f7665b.length; i4++) {
                b bVar2 = this.f7665b[i4];
                if (bVar2 != null) {
                    i3 += CodedOutputByteBufferNano.d(2, bVar2);
                }
            }
            a2 = i3;
        }
        if (this.c != null && this.c.length > 0) {
            int i5 = a2;
            for (int i6 = 0; i6 < this.c.length; i6++) {
                i iVar = this.c[i6];
                if (iVar != null) {
                    i5 += CodedOutputByteBufferNano.d(3, iVar);
                }
            }
            a2 = i5;
        }
        if (this.d != null && this.d.length > 0) {
            for (int i7 = 0; i7 < this.d.length; i7++) {
                f fVar = this.d[i7];
                if (fVar != null) {
                    a2 += CodedOutputByteBufferNano.d(4, fVar);
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
                    int length = this.f7664a == null ? 0 : this.f7664a.length;
                    b[] bVarArr = new b[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7664a, 0, bVarArr, 0, length);
                    }
                    while (length < bVarArr.length - 1) {
                        bVarArr[length] = new b();
                        aVar.a(bVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bVarArr[length] = new b();
                    aVar.a(bVarArr[length]);
                    this.f7664a = bVarArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f7665b == null ? 0 : this.f7665b.length;
                    b[] bVarArr2 = new b[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f7665b, 0, bVarArr2, 0, length2);
                    }
                    while (length2 < bVarArr2.length - 1) {
                        bVarArr2[length2] = new b();
                        aVar.a(bVarArr2[length2]);
                        aVar.a();
                        length2++;
                    }
                    bVarArr2[length2] = new b();
                    aVar.a(bVarArr2[length2]);
                    this.f7665b = bVarArr2;
                    break;
                case 26:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length3 = this.c == null ? 0 : this.c.length;
                    i[] iVarArr = new i[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.c, 0, iVarArr, 0, length3);
                    }
                    while (length3 < iVarArr.length - 1) {
                        iVarArr[length3] = new i();
                        aVar.a(iVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    iVarArr[length3] = new i();
                    aVar.a(iVarArr[length3]);
                    this.c = iVarArr;
                    break;
                case 34:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length4 = this.d == null ? 0 : this.d.length;
                    f[] fVarArr = new f[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.d, 0, fVarArr, 0, length4);
                    }
                    while (length4 < fVarArr.length - 1) {
                        fVarArr[length4] = new f();
                        aVar.a(fVarArr[length4]);
                        aVar.a();
                        length4++;
                    }
                    fVarArr[length4] = new f();
                    aVar.a(fVarArr[length4]);
                    this.d = fVarArr;
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
