package com.google.b.a.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class k extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7706a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f7707b = 1;
    public j[] c = j.b();
    public String d = "";
    public String e = "";

    public k() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7706a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7706a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                j jVar = this.c[i];
                if (jVar != null) {
                    codedOutputByteBufferNano.b(2, jVar);
                }
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (this.f7707b != 1) {
            codedOutputByteBufferNano.a(5, this.f7707b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7706a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7706a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                j jVar = this.c[i2];
                if (jVar != null) {
                    i += CodedOutputByteBufferNano.d(2, jVar);
                }
            }
            a2 = i;
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (!this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (this.f7707b != 1) {
            return a2 + CodedOutputByteBufferNano.c(5, this.f7707b);
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
                    this.f7706a = aVar.c();
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    j[] jVarArr = new j[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, jVarArr, 0, length);
                    }
                    while (length < jVarArr.length - 1) {
                        jVarArr[length] = new j();
                        aVar.a(jVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jVarArr[length] = new j();
                    aVar.a(jVarArr[length]);
                    this.c = jVarArr;
                    break;
                case 26:
                    this.d = aVar.c();
                    break;
                case 34:
                    this.e = aVar.c();
                    break;
                case 40:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                            this.f7707b = e;
                            break;
                    }
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
