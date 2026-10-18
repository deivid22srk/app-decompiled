package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class dc extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public pb f3717a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3718b = false;
    public boolean c = false;

    public dc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3717a != null) {
            codedOutputByteBufferNano.b(1, this.f3717a);
        }
        if (this.c || this.f3718b) {
            codedOutputByteBufferNano.a(2, this.f3718b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3717a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3717a);
        }
        if (this.c || this.f3718b) {
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
                    if (this.f3717a == null) {
                        this.f3717a = new pb();
                    }
                    aVar.a(this.f3717a);
                    break;
                case 16:
                    this.f3718b = aVar.b();
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
