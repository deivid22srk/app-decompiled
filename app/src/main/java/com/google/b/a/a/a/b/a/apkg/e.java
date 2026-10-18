package com.google.b.a.a.a.b.a.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7618a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7619b = com.google.protobuf.nano.e.h;
    public String c = "";

    public e() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7618a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7618a);
        }
        if (!Arrays.equals(this.f7619b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7619b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7618a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7618a);
        }
        if (!Arrays.equals(this.f7619b, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7619b);
        }
        if (!this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(3, this.c);
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
                    this.f7618a = aVar.c();
                    break;
                case 18:
                    this.f7619b = aVar.d();
                    break;
                case 26:
                    this.c = aVar.c();
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
