package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gy extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public jb[] f3892a = jb.b();

    /* renamed from: b, reason: collision with root package name */
    public String f3893b = "";
    public boolean c = false;
    public String d = "";
    public boolean e = false;

    public gy() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3892a != null && this.f3892a.length > 0) {
            for (int i = 0; i < this.f3892a.length; i++) {
                jb jbVar = this.f3892a[i];
                if (jbVar != null) {
                    codedOutputByteBufferNano.b(1, jbVar);
                }
            }
        }
        if (this.c || !this.f3893b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3893b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3892a != null && this.f3892a.length > 0) {
            for (int i = 0; i < this.f3892a.length; i++) {
                jb jbVar = this.f3892a[i];
                if (jbVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, jbVar);
                }
            }
        }
        if (this.c || !this.f3893b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f3893b);
        }
        if (this.e || !this.d.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(3, this.d);
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
                    int length = this.f3892a == null ? 0 : this.f3892a.length;
                    jb[] jbVarArr = new jb[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3892a, 0, jbVarArr, 0, length);
                    }
                    while (length < jbVarArr.length - 1) {
                        jbVarArr[length] = new jb();
                        aVar.a(jbVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jbVarArr[length] = new jb();
                    aVar.a(jbVarArr[length]);
                    this.f3892a = jbVarArr;
                    break;
                case 18:
                    this.f3893b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
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
