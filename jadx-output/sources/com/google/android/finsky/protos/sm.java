package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sm extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4390a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4391b = false;
    public String c = "";
    public boolean d = false;

    public sm() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4391b || !this.f4390a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4390a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4391b || !this.f4390a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4390a);
        }
        if (this.d || !this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(2, this.c);
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
                    this.f4390a = aVar.c();
                    this.f4391b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
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
