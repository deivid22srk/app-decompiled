package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ld extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public lc f4074a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4075b = false;
    public boolean c = false;

    public ld() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4074a != null) {
            codedOutputByteBufferNano.b(1, this.f4074a);
        }
        if (this.c || this.f4075b) {
            codedOutputByteBufferNano.a(2, this.f4075b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4074a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4074a);
        }
        if (this.c || this.f4075b) {
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
                    if (this.f4074a == null) {
                        this.f4074a = new lc();
                    }
                    aVar.a(this.f4074a);
                    break;
                case 16:
                    this.f4075b = aVar.b();
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
