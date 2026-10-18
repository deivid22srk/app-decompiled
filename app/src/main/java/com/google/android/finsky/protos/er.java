package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class er extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f3796a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3797b = false;
    public int c = 0;
    public boolean d = false;
    public bx e = null;

    public er() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3797b || !this.f3796a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3796a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3797b || !this.f3796a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3796a);
        }
        if (this.c != 0 || this.d) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(3, this.e);
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
                    this.f3796a = aVar.c();
                    this.f3797b = true;
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 26:
                    if (this.e == null) {
                        this.e = new bx();
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
