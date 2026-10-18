package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class on extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4217a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4218b = false;
    public int c = 0;
    public boolean d = false;

    public on() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4218b || this.f4217a) {
            codedOutputByteBufferNano.a(1, this.f4217a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4218b || this.f4217a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.d || this.c != 0) {
            return a2 + CodedOutputByteBufferNano.c(2, this.c);
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
                case 8:
                    this.f4217a = aVar.b();
                    this.f4218b = true;
                    break;
                case 16:
                    this.c = aVar.e();
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
