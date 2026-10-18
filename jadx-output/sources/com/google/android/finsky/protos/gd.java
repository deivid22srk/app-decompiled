package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gd extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public jd f3861a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f3862b = "";
    public boolean c = false;
    public String d = "";
    public boolean e = false;

    public gd() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3861a != null) {
            codedOutputByteBufferNano.b(1, this.f3861a);
        }
        if (this.c || !this.f3862b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3862b);
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
        if (this.f3861a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3861a);
        }
        if (this.c || !this.f3862b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f3862b);
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
                case 10:
                    if (this.f3861a == null) {
                        this.f3861a = new jd();
                    }
                    aVar.a(this.f3861a);
                    break;
                case 18:
                    this.f3862b = aVar.c();
                    this.c = true;
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
