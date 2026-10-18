package com.google.b.a.a.a.b.a.apkg.epkg;

import com.google.b.a.a.a.b.a.bpkg.x;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.nano.c {
    public static volatile b[] d;

    /* renamed from: a, reason: collision with root package name */
    public String f7620a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7621b = "";
    public x[] c = x.b();

    public static b[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new b[0];
                }
            }
        }
        return d;
    }

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7620a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7620a);
        }
        if (!this.f7621b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7621b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                x xVar = this.c[i];
                if (xVar != null) {
                    codedOutputByteBufferNano.b(4, xVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7620a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7620a);
        }
        if (!this.f7621b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7621b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                x xVar = this.c[i2];
                if (xVar != null) {
                    i += CodedOutputByteBufferNano.d(4, xVar);
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
                case 10:
                    this.f7620a = aVar.c();
                    break;
                case 18:
                    this.f7621b = aVar.c();
                    break;
                case 34:
                    int b2 = e.b(aVar, 34);
                    int length = this.c == null ? 0 : this.c.length;
                    x[] xVarArr = new x[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, xVarArr, 0, length);
                    }
                    while (length < xVarArr.length - 1) {
                        xVarArr[length] = new x();
                        aVar.a(xVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    xVarArr[length] = new x();
                    aVar.a(xVarArr[length]);
                    this.c = xVarArr;
                    break;
                default:
                    if (!e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
