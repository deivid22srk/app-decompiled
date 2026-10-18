package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kv extends com.google.protobuf.nano.c {
    private static volatile kv[] d;

    /* renamed from: a, reason: collision with root package name */
    public long f4056a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4057b = false;
    public kw[] c = kw.b();

    public static kv[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new kv[0];
                }
            }
        }
        return d;
    }

    public kv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4057b || this.f4056a != 0) {
            codedOutputByteBufferNano.b(1, this.f4056a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                kw kwVar = this.c[i];
                if (kwVar != null) {
                    codedOutputByteBufferNano.b(2, kwVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4057b || this.f4056a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f4056a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                kw kwVar = this.c[i2];
                if (kwVar != null) {
                    i += CodedOutputByteBufferNano.d(2, kwVar);
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
                case 8:
                    this.f4056a = aVar.f();
                    this.f4057b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    kw[] kwVarArr = new kw[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, kwVarArr, 0, length);
                    }
                    while (length < kwVarArr.length - 1) {
                        kwVarArr[length] = new kw();
                        aVar.a(kwVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    kwVarArr[length] = new kw();
                    aVar.a(kwVarArr[length]);
                    this.c = kwVarArr;
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
