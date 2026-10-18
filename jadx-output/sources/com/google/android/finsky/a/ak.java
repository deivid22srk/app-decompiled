package com.google.android.finsky.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ak extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f1457a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1458b = false;
    public boolean c = false;
    public boolean d = false;

    public ak() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1458b || this.f1457a != 0) {
            codedOutputByteBufferNano.a(1, this.f1457a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1458b || this.f1457a != 0) {
            a2 += CodedOutputByteBufferNano.c(1, this.f1457a);
        }
        if (this.d || this.c) {
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
                case 8:
                    this.f1457a = aVar.e();
                    this.f1458b = true;
                    break;
                case 16:
                    this.c = aVar.b();
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
