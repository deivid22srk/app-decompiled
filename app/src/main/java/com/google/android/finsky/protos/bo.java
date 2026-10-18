package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class bo extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3640a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3641b = false;
    public as c = null;
    public String d = "";
    public boolean e = false;

    public bo() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3640a != 1 || this.f3641b) {
            codedOutputByteBufferNano.a(1, this.f3640a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3640a != 1 || this.f3641b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3640a);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.c);
        }
        if (this.e || !this.d.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(3, this.d);
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
                        case 1:
                        case 2:
                            this.f3640a = e;
                            this.f3641b = true;
                            break;
                    }
                case 18:
                    if (this.c == null) {
                        this.c = new as();
                    }
                    aVar.a(this.c);
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
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
