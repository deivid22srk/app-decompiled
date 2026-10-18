package com.google.b.a.a.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes2.dex */
public final class j extends com.google.protobuf.nano.c {
    private static volatile j[] c;

    /* renamed from: a, reason: collision with root package name */
    public b f7704a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f7705b = "";

    public static j[] b() {
        if (c == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (c == null) {
                    c = new j[0];
                }
            }
        }
        return c;
    }

    public j() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7705b.equals("")) {
            codedOutputByteBufferNano.a(3, this.f7705b);
        }
        if (this.f7704a != null) {
            codedOutputByteBufferNano.b(5, this.f7704a);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7705b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.f7705b);
        }
        if (this.f7704a != null) {
            return a2 + CodedOutputByteBufferNano.d(5, this.f7704a);
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
                case 26:
                    this.f7705b = aVar.c();
                    break;
                case 42:
                    if (this.f7704a == null) {
                        this.f7704a = new b();
                    }
                    aVar.a(this.f7704a);
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
