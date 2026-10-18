package com.google.android.finsky.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class aj extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ak f1455a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f1456b = "";
    public boolean c = false;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public o h = null;

    public aj() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f1455a != null) {
            codedOutputByteBufferNano.b(1, this.f1455a);
        }
        if (this.c || !this.f1456b.equals("")) {
            codedOutputByteBufferNano.a(4, this.f1456b);
        }
        if (this.e || this.d != 0) {
            codedOutputByteBufferNano.a(5, this.d);
        }
        if (this.g || this.f) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(7, this.h);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f1455a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f1455a);
        }
        if (this.c || !this.f1456b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f1456b);
        }
        if (this.e || this.d != 0) {
            a2 += CodedOutputByteBufferNano.c(5, this.d);
        }
        if (this.g || this.f) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.h != null) {
            return a2 + CodedOutputByteBufferNano.d(7, this.h);
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
                    if (this.f1455a == null) {
                        this.f1455a = new ak();
                    }
                    aVar.a(this.f1455a);
                    break;
                case 34:
                    this.f1456b = aVar.c();
                    this.c = true;
                    break;
                case 40:
                    this.d = aVar.e();
                    this.e = true;
                    break;
                case 48:
                    this.f = aVar.b();
                    this.g = true;
                    break;
                case 58:
                    if (this.h == null) {
                        this.h = new o();
                    }
                    aVar.a(this.h);
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
