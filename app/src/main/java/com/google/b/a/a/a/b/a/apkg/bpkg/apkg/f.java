package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class f extends com.google.protobuf.nano.c {
    public static volatile f[] g;

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.apkg.j f7569a = null;

    /* renamed from: b, reason: collision with root package name */
    public g f7570b = null;
    public b[] c = b.b();
    public com.google.b.a.a.a.b.a.bpkg.v[] d = com.google.b.a.a.a.b.a.bpkg.v.b();
    public int e = -1;
    public com.google.b.a.a.a.b.a.apkg.cpkg.b f = null;

    public static f[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new f[0];
                }
            }
        }
        return g;
    }

    public f() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7569a != null) {
            codedOutputByteBufferNano.b(1, this.f7569a);
        }
        if (this.f7570b != null) {
            codedOutputByteBufferNano.b(2, this.f7570b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                b bVar = this.c[i];
                if (bVar != null) {
                    codedOutputByteBufferNano.b(3, bVar);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                com.google.b.a.a.a.b.a.bpkg.v vVar = this.d[i2];
                if (vVar != null) {
                    codedOutputByteBufferNano.b(4, vVar);
                }
            }
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(6, this.f);
        }
        if (this.e != -1) {
            codedOutputByteBufferNano.a(7, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7569a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7569a);
        }
        if (this.f7570b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7570b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                b bVar = this.c[i2];
                if (bVar != null) {
                    i += CodedOutputByteBufferNano.d(3, bVar);
                }
            }
            a2 = i;
        }
        if (this.d != null && this.d.length > 0) {
            for (int i3 = 0; i3 < this.d.length; i3++) {
                com.google.b.a.a.a.b.a.bpkg.v vVar = this.d[i3];
                if (vVar != null) {
                    a2 += CodedOutputByteBufferNano.d(4, vVar);
                }
            }
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.f);
        }
        if (this.e != -1) {
            return a2 + CodedOutputByteBufferNano.c(7, this.e);
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
                    if (this.f7569a == null) {
                        this.f7569a = new com.google.b.a.a.a.b.a.apkg.j();
                    }
                    aVar.a(this.f7569a);
                    break;
                case 18:
                    if (this.f7570b == null) {
                        this.f7570b = new g();
                    }
                    aVar.a(this.f7570b);
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    b[] bVarArr = new b[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, bVarArr, 0, length);
                    }
                    while (length < bVarArr.length - 1) {
                        bVarArr[length] = new b();
                        aVar.a(bVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bVarArr[length] = new b();
                    aVar.a(bVarArr[length]);
                    this.c = bVarArr;
                    break;
                case 34:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length2 = this.d == null ? 0 : this.d.length;
                    com.google.b.a.a.a.b.a.bpkg.v[] vVarArr = new com.google.b.a.a.a.b.a.bpkg.v[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.d, 0, vVarArr, 0, length2);
                    }
                    while (length2 < vVarArr.length - 1) {
                        vVarArr[length2] = new com.google.b.a.a.a.b.a.bpkg.v();
                        aVar.a(vVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    vVarArr[length2] = new com.google.b.a.a.a.b.a.bpkg.v();
                    aVar.a(vVarArr[length2]);
                    this.d = vVarArr;
                    break;
                case 50:
                    if (this.f == null) {
                        this.f = new com.google.b.a.a.a.b.a.apkg.cpkg.b();
                    }
                    aVar.a(this.f);
                    break;
                case 56:
                    this.e = aVar.e();
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
