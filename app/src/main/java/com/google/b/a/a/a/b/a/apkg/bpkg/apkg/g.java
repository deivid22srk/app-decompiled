package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class g extends com.google.protobuf.nano.c {
    public static volatile g[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f7571a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7572b = com.google.protobuf.nano.e.h;
    public c[] c = com.google.b.a.a.a.b.a.apkg.bpkg.apkg.c.b();
    public String d = "";

    public static g[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new g[0];
                }
            }
        }
        return e;
    }

    public g() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7571a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7571a);
        }
        if (!Arrays.equals(this.f7572b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7572b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                c cVar = this.c[i];
                if (cVar != null) {
                    codedOutputByteBufferNano.b(3, cVar);
                }
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7571a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7571a);
        }
        if (!Arrays.equals(this.f7572b, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7572b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                c cVar = this.c[i2];
                if (cVar != null) {
                    i += CodedOutputByteBufferNano.d(3, cVar);
                }
            }
            a2 = i;
        }
        if (!this.d.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(4, this.d);
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
                    this.f7571a = aVar.c();
                    break;
                case 18:
                    this.f7572b = aVar.d();
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    c[] cVarArr = new c[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, cVarArr, 0, length);
                    }
                    while (length < cVarArr.length - 1) {
                        cVarArr[length] = new c();
                        aVar.a(cVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    cVarArr[length] = new c();
                    aVar.a(cVarArr[length]);
                    this.c = cVarArr;
                    break;
                case 34:
                    this.d = aVar.c();
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
