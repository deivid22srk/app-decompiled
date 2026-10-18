package com.google.android.vending.verifier.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7126a = com.google.protobuf.nano.e.h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7127b = false;
    public byte[] c = com.google.protobuf.nano.e.h;
    public boolean d = false;
    public byte[] e = com.google.protobuf.nano.e.h;
    public boolean f = false;

    public f() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7127b || !Arrays.equals(this.f7126a, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(1, this.f7126a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7127b || !Arrays.equals(this.f7126a, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7126a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(3, this.e);
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
                    this.f7126a = aVar.d();
                    this.f7127b = true;
                    break;
                case 18:
                    this.c = aVar.d();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.d();
                    this.f = true;
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
