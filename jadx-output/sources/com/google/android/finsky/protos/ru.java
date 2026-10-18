package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ru extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4359a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4360b = false;
    public int c = 1;
    public boolean d = false;
    public String e = "";
    public boolean f = false;

    public ru() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4360b || !this.f4359a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4359a);
        }
        if (this.c != 1 || this.d) {
            codedOutputByteBufferNano.a(5, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(6, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4360b || !this.f4359a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4359a);
        }
        if (this.c != 1 || this.d) {
            a2 += CodedOutputByteBufferNano.c(5, this.c);
        }
        if (this.f || !this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(6, this.e);
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
                    this.f4359a = aVar.c();
                    this.f4360b = true;
                    break;
                case 40:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.c = e;
                            this.d = true;
                            break;
                    }
                case 50:
                    this.e = aVar.c();
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
