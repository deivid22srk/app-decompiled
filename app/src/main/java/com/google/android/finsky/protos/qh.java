package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class qh extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public gk f4293a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f4294b = "";
    public boolean c = false;
    public fq d = null;
    public String e = "";
    public boolean f = false;

    public qh() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4293a != null) {
            codedOutputByteBufferNano.b(1, this.f4293a);
        }
        if (this.c || !this.f4294b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4294b);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4293a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4293a);
        }
        if (this.c || !this.f4294b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4294b);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.d != null) {
            return a2 + CodedOutputByteBufferNano.d(4, this.d);
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
                    if (this.f4293a == null) {
                        this.f4293a = new gk();
                    }
                    aVar.a(this.f4293a);
                    break;
                case 18:
                    this.f4294b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new fq();
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
