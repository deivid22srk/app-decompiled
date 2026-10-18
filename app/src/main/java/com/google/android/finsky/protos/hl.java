package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hl extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3914a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3915b = false;
    public hi c = null;

    public hl() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3914a != 0 || this.f3915b) {
            codedOutputByteBufferNano.a(1, this.f3914a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3914a != 0 || this.f3915b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3914a);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.c);
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
                        case 4:
                            this.f3914a = e;
                            this.f3915b = true;
                            break;
                    }
                case 18:
                    if (this.c == null) {
                        this.c = new hi();
                    }
                    aVar.a(this.c);
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
