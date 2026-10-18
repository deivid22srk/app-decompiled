package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sx extends com.google.protobuf.nano.c {
    private static volatile sx[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f4409a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4410b = false;
    public boolean c = true;
    public boolean d = false;

    public static sx[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new sx[0];
                }
            }
        }
        return e;
    }

    public sx() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4410b || !this.f4409a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4409a);
        }
        if (this.d || !this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4410b || !this.f4409a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4409a);
        }
        if (this.d || !this.c) {
            return a2 + CodedOutputByteBufferNano.c(2) + 1;
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
                    this.f4409a = aVar.c();
                    this.f4410b = true;
                    break;
                case 16:
                    this.c = aVar.b();
                    this.d = true;
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
