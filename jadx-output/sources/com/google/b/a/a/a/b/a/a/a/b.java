package com.google.b.a.a.a.b.a.a.a;

import com.google.b.a.a.a.b.a.a.c.e;
import com.google.b.a.a.a.b.a.a.d;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7555a = "";

    /* renamed from: b, reason: collision with root package name */
    public d f7556b = null;
    public com.google.b.a.a.a.b.a.a.b c = null;
    public com.google.b.a.a.a.b.a.a.b.b d = null;
    public e e = null;
    public com.google.b.a.a.a.b.a.a.e.b[] f = com.google.b.a.a.a.b.a.a.e.b.b();
    public int g = -1;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.c != null) {
            codedOutputByteBufferNano.b(1, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(2, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(4, this.e);
        }
        if (!this.f7555a.equals("")) {
            codedOutputByteBufferNano.a(5, this.f7555a);
        }
        if (this.f7556b != null) {
            codedOutputByteBufferNano.b(6, this.f7556b);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i = 0; i < this.f.length; i++) {
                com.google.b.a.a.a.b.a.a.e.b bVar = this.f[i];
                if (bVar != null) {
                    codedOutputByteBufferNano.b(7, bVar);
                }
            }
        }
        if (this.g != -1) {
            codedOutputByteBufferNano.a(8, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.c);
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.e);
        }
        if (!this.f7555a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.f7555a);
        }
        if (this.f7556b != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.f7556b);
        }
        if (this.f != null && this.f.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f.length; i2++) {
                com.google.b.a.a.a.b.a.a.e.b bVar = this.f[i2];
                if (bVar != null) {
                    i += CodedOutputByteBufferNano.d(7, bVar);
                }
            }
            a2 = i;
        }
        if (this.g != -1) {
            return a2 + CodedOutputByteBufferNano.c(8, this.g);
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
                    if (this.c == null) {
                        this.c = new com.google.b.a.a.a.b.a.a.b();
                    }
                    aVar.a(this.c);
                    break;
                case 18:
                    if (this.d == null) {
                        this.d = new com.google.b.a.a.a.b.a.a.b.b();
                    }
                    aVar.a(this.d);
                    break;
                case 34:
                    if (this.e == null) {
                        this.e = new e();
                    }
                    aVar.a(this.e);
                    break;
                case 42:
                    this.f7555a = aVar.c();
                    break;
                case 50:
                    if (this.f7556b == null) {
                        this.f7556b = new d();
                    }
                    aVar.a(this.f7556b);
                    break;
                case 58:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 58);
                    int length = this.f == null ? 0 : this.f.length;
                    com.google.b.a.a.a.b.a.a.e.b[] bVarArr = new com.google.b.a.a.a.b.a.a.e.b[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, bVarArr, 0, length);
                    }
                    while (length < bVarArr.length - 1) {
                        bVarArr[length] = new com.google.b.a.a.a.b.a.a.e.b();
                        aVar.a(bVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    bVarArr[length] = new com.google.b.a.a.a.b.a.a.e.b();
                    aVar.a(bVarArr[length]);
                    this.f = bVarArr;
                    break;
                case 64:
                    this.g = aVar.e();
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
