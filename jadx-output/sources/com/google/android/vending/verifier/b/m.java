package com.google.android.vending.verifier.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f7140a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7141b = false;
    public byte[] c = com.google.protobuf.nano.e.h;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public m() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f7140a != 0 || this.f7141b) {
            codedOutputByteBufferNano.a(1, this.f7140a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || this.g) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f7140a != 0 || this.f7141b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f7140a);
        }
        if (this.d || !Arrays.equals(this.c, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || this.e) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.h || this.g) {
            a2 += CodedOutputByteBufferNano.c(4) + 1;
        }
        if (this.j || this.i) {
            return a2 + CodedOutputByteBufferNano.c(5) + 1;
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
                case 8:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                            this.f7140a = e;
                            this.f7141b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.d();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.b();
                    this.f = true;
                    break;
                case 32:
                    this.g = aVar.b();
                    this.h = true;
                    break;
                case 40:
                    this.i = aVar.b();
                    this.j = true;
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
