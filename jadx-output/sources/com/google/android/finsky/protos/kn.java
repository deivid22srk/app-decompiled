package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kn extends com.google.protobuf.nano.c {
    private static volatile kn[] d;

    /* renamed from: a, reason: collision with root package name */
    public String f4046a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4047b = false;
    public jd c = null;

    public static kn[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new kn[0];
                }
            }
        }
        return d;
    }

    public kn() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4047b || !this.f4046a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4046a);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4047b || !this.f4046a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4046a);
        }
        if (this.c != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.c);
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
                    this.f4046a = aVar.c();
                    this.f4047b = true;
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new jd();
                    }
                    aVar.a(this.c);
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
