package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class w extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f1507a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f1508b = false;
    public long c = 0;
    public boolean d = false;

    public w() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1508b || !this.f1507a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f1507a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1508b || !this.f1507a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f1507a);
        }
        if (this.d || this.c != 0) {
            return a2 + CodedOutputByteBufferNano.e(2, this.c);
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
                    this.f1507a = aVar.c();
                    this.f1508b = true;
                    break;
                case 16:
                    this.c = aVar.f();
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
