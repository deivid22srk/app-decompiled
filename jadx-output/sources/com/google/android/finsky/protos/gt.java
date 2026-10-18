package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gt extends com.google.protobuf.nano.c {
    private static volatile gt[] d;

    /* renamed from: a, reason: collision with root package name */
    public String f3882a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3883b = false;
    public gs[] c = gs.b();

    public static gt[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new gt[0];
                }
            }
        }
        return d;
    }

    public gt() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3883b || !this.f3882a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3882a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                gs gsVar = this.c[i];
                if (gsVar != null) {
                    codedOutputByteBufferNano.b(3, gsVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3883b || !this.f3882a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3882a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                gs gsVar = this.c[i2];
                if (gsVar != null) {
                    i += CodedOutputByteBufferNano.d(3, gsVar);
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
                    this.f3882a = aVar.c();
                    this.f3883b = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    gs[] gsVarArr = new gs[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, gsVarArr, 0, length);
                    }
                    while (length < gsVarArr.length - 1) {
                        gsVarArr[length] = new gs();
                        aVar.a(gsVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gsVarArr[length] = new gs();
                    aVar.a(gsVarArr[length]);
                    this.c = gsVarArr;
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
