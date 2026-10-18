package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class fw extends com.google.protobuf.nano.c {
    private static volatile fw[] i;

    /* renamed from: a, reason: collision with root package name */
    public String f3849a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3850b = false;
    public int c = 0;
    public boolean d = false;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    public static fw[] b() {
        if (i == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (i == null) {
                    i = new fw[0];
                }
            }
        }
        return i;
    }

    public fw() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3850b || !this.f3849a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3849a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e != 0) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3850b || !this.f3849a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3849a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.c(2, this.c);
        }
        if (this.f || this.e != 0) {
            a2 += CodedOutputByteBufferNano.c(3, this.e);
        }
        if (this.h || this.g) {
            return a2 + CodedOutputByteBufferNano.c(4) + 1;
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
                    this.f3849a = aVar.c();
                    this.f3850b = true;
                    break;
                case 16:
                    this.c = aVar.e();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.e();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.b();
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
