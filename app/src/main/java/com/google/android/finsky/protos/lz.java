package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lz extends com.google.protobuf.nano.c {
    private static volatile lz[] h;

    /* renamed from: a, reason: collision with root package name */
    public gx f4107a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f4108b = "";
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public boolean g = false;

    public static lz[] b() {
        if (h == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (h == null) {
                    h = new lz[0];
                }
            }
        }
        return h;
    }

    public lz() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4107a != null) {
            codedOutputByteBufferNano.b(1, this.f4107a);
        }
        if (this.c || !this.f4108b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4108b);
        }
        if (this.e || this.d) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4107a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4107a);
        }
        if (this.c || !this.f4108b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4108b);
        }
        if (this.e || this.d) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.g || !this.f.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(4, this.f);
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
                    if (this.f4107a == null) {
                        this.f4107a = new gx();
                    }
                    aVar.a(this.f4107a);
                    break;
                case 18:
                    this.f4108b = aVar.c();
                    this.c = true;
                    break;
                case 24:
                    this.d = aVar.b();
                    this.e = true;
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
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
