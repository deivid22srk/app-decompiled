package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class mt extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f4148a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4149b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public mt() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4149b || this.f4148a != 0) {
            codedOutputByteBufferNano.b(1, this.f4148a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(33, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(34, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4149b || this.f4148a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f4148a);
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(33) + 1;
        }
        if (this.f || this.e) {
            return a2 + CodedOutputByteBufferNano.c(34) + 1;
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
                    this.f4148a = aVar.f();
                    this.f4149b = true;
                    break;
                case 264:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 272:
                    this.e = aVar.b();
                    this.f = true;
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
