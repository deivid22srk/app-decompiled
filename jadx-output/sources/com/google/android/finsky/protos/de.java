package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class de extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3720a = com.google.protobuf.nano.e.h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3721b = false;
    public df[] c = df.b();

    public de() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3721b || !Arrays.equals(this.f3720a, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(1, this.f3720a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                df dfVar = this.c[i];
                if (dfVar != null) {
                    codedOutputByteBufferNano.b(2, dfVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3721b || !Arrays.equals(this.f3720a, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3720a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                df dfVar = this.c[i2];
                if (dfVar != null) {
                    i += CodedOutputByteBufferNano.d(2, dfVar);
                }
            }
            return i;
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
                    this.f3720a = aVar.d();
                    this.f3721b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    df[] dfVarArr = new df[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, dfVarArr, 0, length);
                    }
                    while (length < dfVarArr.length - 1) {
                        dfVarArr[length] = new df();
                        aVar.a(dfVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dfVarArr[length] = new df();
                    aVar.a(dfVarArr[length]);
                    this.c = dfVarArr;
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
