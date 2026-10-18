package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class gs extends com.google.protobuf.nano.c {
    private static volatile gs[] d;

    /* renamed from: a, reason: collision with root package name */
    public ds f3880a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f3881b = "";
    public boolean c = false;

    public static gs[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new gs[0];
                }
            }
        }
        return d;
    }

    public gs() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3880a != null) {
            codedOutputByteBufferNano.b(1, this.f3880a);
        }
        if (this.c || !this.f3881b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f3881b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3880a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f3880a);
        }
        if (this.c || !this.f3881b.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(2, this.f3881b);
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
                    if (this.f3880a == null) {
                        this.f3880a = new ds();
                    }
                    aVar.a(this.f3880a);
                    break;
                case 18:
                    this.f3881b = aVar.c();
                    this.c = true;
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
