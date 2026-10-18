package com.google.b.a.a.a.b.b;

import com.google.b.a.a.a.b.a.apkg.bpkg.apkg.q;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.apkg.apkg.c f7714a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.b.a.a.a.b.a.apkg.bpkg.c f7715b = null;
    public q c = null;
    public byte[] d = com.google.protobuf.nano.e.h;

    public e() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7714a != null) {
            codedOutputByteBufferNano.b(1, this.f7714a);
        }
        if (this.f7715b != null) {
            codedOutputByteBufferNano.b(2, this.f7715b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (!Arrays.equals(this.d, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(6, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7714a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f7714a);
        }
        if (this.f7715b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f7715b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (!Arrays.equals(this.d, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(6, this.d);
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
                    if (this.f7714a == null) {
                        this.f7714a = new com.google.b.a.a.a.b.a.apkg.apkg.c();
                    }
                    aVar.a(this.f7714a);
                    break;
                case 18:
                    if (this.f7715b == null) {
                        this.f7715b = new com.google.b.a.a.a.b.a.apkg.bpkg.c();
                    }
                    aVar.a(this.f7715b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new q();
                    }
                    aVar.a(this.c);
                    break;
                case 50:
                    this.d = aVar.d();
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
