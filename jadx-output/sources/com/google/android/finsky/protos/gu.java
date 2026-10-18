package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gu extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public gv f3884a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3885b = 0;
    public boolean c = false;

    public gu() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3884a != null) {
            codedOutputByteBufferNano.b(1, this.f3884a);
        }
        if (this.f3885b != 0 || this.c) {
            codedOutputByteBufferNano.a(2, this.f3885b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3884a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3884a);
        }
        if (this.f3885b != 0 || this.c) {
            return a2 + CodedOutputByteBufferNano.c(2, this.f3885b);
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
                    if (this.f3884a == null) {
                        this.f3884a = new gv();
                    }
                    aVar.a(this.f3884a);
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f3885b = e;
                            this.c = true;
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
