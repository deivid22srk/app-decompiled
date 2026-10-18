package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ku extends com.google.protobuf.nano.c {
    private static volatile ku[] g;

    /* renamed from: a, reason: collision with root package name */
    public long f4054a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4055b = false;
    public long[] c = com.google.protobuf.nano.e.f7879b;
    public kw[] d = kw.b();
    public String e = "";
    public boolean f = false;

    public static ku[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new ku[0];
                }
            }
        }
        return g;
    }

    public ku() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4055b || this.f4054a != 0) {
            codedOutputByteBufferNano.b(1, this.f4054a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                codedOutputByteBufferNano.b(2, this.c[i]);
            }
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                kw kwVar = this.d[i2];
                if (kwVar != null) {
                    codedOutputByteBufferNano.b(4, kwVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4055b || this.f4054a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f4054a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                i += CodedOutputByteBufferNano.b(this.c[i2]);
            }
            a2 = a2 + i + (this.c.length * 1);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i3 = 0; i3 < this.d.length; i3++) {
                kw kwVar = this.d[i3];
                if (kwVar != null) {
                    a2 += CodedOutputByteBufferNano.d(4, kwVar);
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
                case 8:
                    this.f4054a = aVar.f();
                    this.f4055b = true;
                    break;
                case 16:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 16);
                    int length = this.c == null ? 0 : this.c.length;
                    long[] jArr = new long[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = aVar.f();
                        aVar.a();
                        length++;
                    }
                    jArr[length] = aVar.f();
                    this.c = jArr;
                    break;
                case 18:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i = 0;
                    while (aVar.i() > 0) {
                        aVar.f();
                        i++;
                    }
                    aVar.e(j);
                    int length2 = this.c == null ? 0 : this.c.length;
                    long[] jArr2 = new long[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = aVar.f();
                        length2++;
                    }
                    this.c = jArr2;
                    aVar.d(c);
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length3 = this.d == null ? 0 : this.d.length;
                    kw[] kwVarArr = new kw[b3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.d, 0, kwVarArr, 0, length3);
                    }
                    while (length3 < kwVarArr.length - 1) {
                        kwVarArr[length3] = new kw();
                        aVar.a(kwVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    kwVarArr[length3] = new kw();
                    aVar.a(kwVarArr[length3]);
                    this.d = kwVarArr;
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
