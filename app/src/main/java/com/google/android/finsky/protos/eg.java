package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class eg extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public dz f3775a = null;

    /* renamed from: b, reason: collision with root package name */
    public dz f3776b = null;
    public boolean c = false;
    public boolean d = false;
    public eh e = null;

    public eg() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3775a != null) {
            codedOutputByteBufferNano.b(1, this.f3775a);
        }
        if (this.f3776b != null) {
            codedOutputByteBufferNano.b(2, this.f3776b);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3775a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3775a);
        }
        if (this.f3776b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f3776b);
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(5, this.e);
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
                    if (this.f3775a == null) {
                        this.f3775a = new dz();
                    }
                    aVar.a(this.f3775a);
                    break;
                case 18:
                    if (this.f3776b == null) {
                        this.f3776b = new dz();
                    }
                    aVar.a(this.f3776b);
                    break;
                case 32:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new eh();
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
