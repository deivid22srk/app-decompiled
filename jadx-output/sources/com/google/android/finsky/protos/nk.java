package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class nk extends com.google.protobuf.nano.c {
    private static volatile nk[] c;

    /* renamed from: a, reason: collision with root package name */
    public String f4171a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4172b = false;

    public static nk[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new nk[0];
                }
            }
        }
        return c;
    }

    public nk() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4172b || !this.f4171a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4171a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4172b || !this.f4171a.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(1, this.f4171a);
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
                    this.f4171a = aVar.c();
                    this.f4172b = true;
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
