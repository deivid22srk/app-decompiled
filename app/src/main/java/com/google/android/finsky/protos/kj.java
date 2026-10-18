package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kj extends com.google.protobuf.nano.c {
    private static volatile kj[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f4039a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4040b = false;
    public String c = "";
    public boolean d = false;
    public ds e = null;

    public static kj[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new kj[0];
                }
            }
        }
        return f;
    }

    public kj() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4040b || !this.f4039a.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4039a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(5, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4040b || !this.f4039a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4039a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.c);
        }
        if (this.e != null) {
            return a2 + CodedOutputByteBufferNano.d(5, this.e);
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
                case 18:
                    this.f4039a = aVar.c();
                    this.f4040b = true;
                    break;
                case 34:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 42:
                    if (this.e == null) {
                        this.e = new ds();
                    }
                    aVar.a(this.e);
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
