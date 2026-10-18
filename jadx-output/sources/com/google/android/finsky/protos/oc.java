package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class oc extends com.google.protobuf.nano.c {
    private static volatile oc[] i;

    /* renamed from: a, reason: collision with root package name */
    public String f4200a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4201b = false;
    public String c = "";
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public long g = 0;
    public boolean h = false;

    public static oc[] b() {
        if (i == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (i == null) {
                    i = new oc[0];
                }
            }
        }
        return i;
    }

    public oc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4201b || !this.f4200a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4200a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != 0 || this.f) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g != 0) {
            codedOutputByteBufferNano.b(4, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4201b || !this.f4200a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4200a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != 0 || this.f) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || this.g != 0) {
            return a2 + CodedOutputByteBufferNano.e(4, this.g);
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
                    this.f4200a = aVar.c();
                    this.f4201b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                            this.e = e;
                            this.f = true;
                            break;
                    }
                case 32:
                    this.g = aVar.f();
                    this.h = true;
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
