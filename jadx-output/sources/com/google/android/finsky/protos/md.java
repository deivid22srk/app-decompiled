package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class md extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f4117a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4118b = false;
    public mg c = null;
    public ml d = null;

    public md() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4117a != 0 || this.f4118b) {
            codedOutputByteBufferNano.a(1, this.f4117a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4117a != 0 || this.f4118b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4117a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.d != null) {
            return a2 + CodedOutputByteBufferNano.d(3, this.d);
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
                            this.f4117a = e;
                            this.f4118b = true;
                            break;
                    }
                case 18:
                    if (this.c == null) {
                        this.c = new mg();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    if (this.d == null) {
                        this.d = new ml();
                    }
                    aVar.a(this.d);
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
