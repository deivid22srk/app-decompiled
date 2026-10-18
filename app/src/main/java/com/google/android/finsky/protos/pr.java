package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class pr extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ps f4264a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f4265b = 0;
    public boolean c = false;

    public pr() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4264a != null) {
            codedOutputByteBufferNano.b(1, this.f4264a);
        }
        if (this.c || this.f4265b != 0) {
            codedOutputByteBufferNano.a(2, this.f4265b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4264a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4264a);
        }
        if (this.c || this.f4265b != 0) {
            return a2 + CodedOutputByteBufferNano.c(2, this.f4265b);
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
                    if (this.f4264a == null) {
                        this.f4264a = new ps();
                    }
                    aVar.a(this.f4264a);
                    break;
                case 16:
                    this.f4265b = aVar.e();
                    this.c = true;
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
