package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6765a = com.google.protobuf.nano.e.h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6766b = false;
    public byte[][] c = com.google.protobuf.nano.e.g;
    public boolean d = false;
    public boolean e = false;

    public j() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6766b || !Arrays.equals(this.f6765a, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(1, this.f6765a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                byte[] bArr = this.c[i];
                if (bArr != null) {
                    codedOutputByteBufferNano.a(2, bArr);
                }
            }
        }
        if (this.e || this.d) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6766b || !Arrays.equals(this.f6765a, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(1, this.f6765a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.c.length; i3++) {
                byte[] bArr = this.c[i3];
                if (bArr != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(bArr);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (this.e || this.d) {
            return a2 + CodedOutputByteBufferNano.c(3) + 1;
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
                    this.f6765a = aVar.d();
                    this.f6766b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    byte[][] bArr = new byte[b2 + length][];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, bArr, 0, length);
                    }
                    while (length < bArr.length - 1) {
                        bArr[length] = aVar.d();
                        aVar.a();
                        length++;
                    }
                    bArr[length] = aVar.d();
                    this.c = bArr;
                    break;
                case 24:
                    this.d = aVar.b();
                    this.e = true;
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
