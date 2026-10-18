package com.google.b.a.a.a.b.a.a;

import com.google.b.a.a.a.b.a.b.ae;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class m extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ae f7632a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7633b = false;

    public m() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7632a != null) {
            codedOutputByteBufferNano.b(1, this.f7632a);
        }
        if (this.f7633b) {
            codedOutputByteBufferNano.a(2, this.f7633b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7632a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7632a);
        }
        if (this.f7633b) {
            return a2 + CodedOutputByteBufferNano.c(2) + 1;
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
                    if (this.f7632a == null) {
                        this.f7632a = new ae();
                    }
                    aVar.a(this.f7632a);
                    break;
                case 16:
                    this.f7633b = aVar.b();
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
