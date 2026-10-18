package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class qe extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public jm f4290a = null;

    /* renamed from: b, reason: collision with root package name */
    public lp f4291b = null;
    public int c = 0;
    public boolean d = false;

    public qe() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4290a != null) {
            codedOutputByteBufferNano.b(2, this.f4290a);
        }
        if (this.f4291b != null) {
            codedOutputByteBufferNano.b(3, this.f4291b);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4290a != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4290a);
        }
        if (this.f4291b != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.f4291b);
        }
        if (this.c != 0 || this.d) {
            return a2 + CodedOutputByteBufferNano.c(4, this.c);
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
                case 18:
                    if (this.f4290a == null) {
                        this.f4290a = new jm();
                    }
                    aVar.a(this.f4290a);
                    break;
                case 26:
                    if (this.f4291b == null) {
                        this.f4291b = new lp();
                    }
                    aVar.a(this.f4291b);
                    break;
                case 32:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.c = e;
                            this.d = true;
                            break;
                    }
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
