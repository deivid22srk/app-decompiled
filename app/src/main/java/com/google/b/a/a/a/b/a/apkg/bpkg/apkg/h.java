package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class h extends com.google.protobuf.nano.c {
    public static volatile h[] c;

    /* renamed from: a, reason: collision with root package name */
    public j[] f7573a = j.b();

    /* renamed from: b, reason: collision with root package name */
    public String f7574b = "";

    public static h[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new h[0];
                }
            }
        }
        return c;
    }

    public h() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7573a != null && this.f7573a.length > 0) {
            for (int i = 0; i < this.f7573a.length; i++) {
                j jVar = this.f7573a[i];
                if (jVar != null) {
                    codedOutputByteBufferNano.b(1, jVar);
                }
            }
        }
        if (!this.f7574b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7574b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7573a != null && this.f7573a.length > 0) {
            for (int i = 0; i < this.f7573a.length; i++) {
                j jVar = this.f7573a[i];
                if (jVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, jVar);
                }
            }
        }
        if (!this.f7574b.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(2, this.f7574b);
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
                    int length = this.f7573a == null ? 0 : this.f7573a.length;
                    j[] jVarArr = new j[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f7573a, 0, jVarArr, 0, length);
                    }
                    while (length < jVarArr.length - 1) {
                        jVarArr[length] = new j();
                        aVar.a(jVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jVarArr[length] = new j();
                    aVar.a(jVarArr[length]);
                    this.f7573a = jVarArr;
                    break;
                case 18:
                    this.f7574b = aVar.c();
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
