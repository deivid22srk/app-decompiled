package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m extends com.google.protobuf.nano.c {
    public static volatile m[] h;

    /* renamed from: a, reason: collision with root package name */
    public l[] f7581a = l.b();

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.bpkg.p f7582b = null;
    public int c = 0;
    public byte[] d = com.google.protobuf.nano.e.h;
    public com.google.b.a.a.a.b.a.bpkg.p e = null;
    public String f = "";
    public String g = "";

    public static m[] b() {
        if (h == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (h == null) {
                    h = new m[0];
                }
            }
        }
        return h;
    }

    public m() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7581a != null && this.f7581a.length > 0) {
            for (int i = 0; i < this.f7581a.length; i++) {
                l lVar = this.f7581a[i];
                if (lVar != null) {
                    codedOutputByteBufferNano.b(1, lVar);
                }
            }
        }
        if (this.c != 0) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (!Arrays.equals(this.d, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(7, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(8, this.g);
        }
        if (this.f7582b != null) {
            codedOutputByteBufferNano.b(9, this.f7582b);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(11, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7581a != null && this.f7581a.length > 0) {
            for (int i = 0; i < this.f7581a.length; i++) {
                l lVar = this.f7581a[i];
                if (lVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, lVar);
                }
            }
        }
        if (this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.c);
        }
        if (!Arrays.equals(this.d, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(4, this.d);
        }
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.f);
        }
        if (!this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.g);
        }
        if (this.f7582b != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.f7582b);
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(11, this.e);
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
                    int length = this.f7581a == null ? 0 : this.f7581a.length;
                    l[] lVarArr = new l[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7581a, 0, lVarArr, 0, length);
                    }
                    while (length < lVarArr.length - 1) {
                        lVarArr[length] = new l();
                        aVar.a(lVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    lVarArr[length] = new l();
                    aVar.a(lVarArr[length]);
                    this.f7581a = lVarArr;
                    break;
                case 24:
                    this.c = aVar.e();
                    break;
                case 34:
                    this.d = aVar.d();
                    break;
                case 58:
                    this.f = aVar.c();
                    break;
                case 66:
                    this.g = aVar.c();
                    break;
                case 74:
                    if (this.f7582b == null) {
                        this.f7582b = new com.google.b.a.a.a.b.a.bpkg.p();
                    }
                    aVar.a(this.f7582b);
                    break;
                case 90:
                    if (this.e == null) {
                        this.e = new com.google.b.a.a.a.b.a.bpkg.p();
                    }
                    aVar.a(this.e);
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
