package com.google.d.b.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.a.b.c f7747a = null;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7748b = com.google.protobuf.nano.e.h;

    public d() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7747a != null) {
            codedOutputByteBufferNano.b(1, this.f7747a);
        }
        if (!Arrays.equals(this.f7748b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7748b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7747a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7747a);
        }
        if (!Arrays.equals(this.f7748b, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(2, this.f7748b);
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
                    if (this.f7747a == null) {
                        this.f7747a = new com.google.b.a.a.a.b.a.a.b.c();
                    }
                    aVar.a(this.f7747a);
                    break;
                case 18:
                    this.f7748b = aVar.d();
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
