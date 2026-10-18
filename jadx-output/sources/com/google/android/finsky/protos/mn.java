package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class mn extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public me f4136a = null;

    /* renamed from: b, reason: collision with root package name */
    public mo f4137b = null;

    public mn() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4136a != null) {
            codedOutputByteBufferNano.b(1, this.f4136a);
        }
        if (this.f4137b != null) {
            codedOutputByteBufferNano.b(2, this.f4137b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4136a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4136a);
        }
        if (this.f4137b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f4137b);
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
                    if (this.f4136a == null) {
                        this.f4136a = new me();
                    }
                    aVar.a(this.f4136a);
                    break;
                case 18:
                    if (this.f4137b == null) {
                        this.f4137b = new mo();
                    }
                    aVar.a(this.f4137b);
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
