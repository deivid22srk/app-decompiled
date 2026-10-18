package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ik extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3953a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3954b = false;
    public int c = 0;
    public boolean d = false;

    public ik() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3953a != 0 || this.f3954b) {
            codedOutputByteBufferNano.a(1, this.f3953a);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3953a != 0 || this.f3954b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3953a);
        }
        if (this.c != 0 || this.d) {
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
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f3953a = e;
                            this.f3954b = true;
                            break;
                    }
                case 16:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = e2;
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
