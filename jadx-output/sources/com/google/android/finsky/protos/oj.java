package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oj extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ok[] f4209a = ok.b();

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4210b = com.google.protobuf.nano.e.h;
    public boolean c = false;

    public oj() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4209a != null && this.f4209a.length > 0) {
            for (int i = 0; i < this.f4209a.length; i++) {
                ok okVar = this.f4209a[i];
                if (okVar != null) {
                    codedOutputByteBufferNano.b(1, okVar);
                }
            }
        }
        if (this.c || !Arrays.equals(this.f4210b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f4210b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4209a != null && this.f4209a.length > 0) {
            for (int i = 0; i < this.f4209a.length; i++) {
                ok okVar = this.f4209a[i];
                if (okVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, okVar);
                }
            }
        }
        if (this.c || !Arrays.equals(this.f4210b, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(2, this.f4210b);
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f4209a == null ? 0 : this.f4209a.length;
                    ok[] okVarArr = new ok[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4209a, 0, okVarArr, 0, length);
                    }
                    while (length < okVarArr.length - 1) {
                        okVarArr[length] = new ok();
                        aVar.a(okVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    okVarArr[length] = new ok();
                    aVar.a(okVarArr[length]);
                    this.f4209a = okVarArr;
                    break;
                case 18:
                    this.f4210b = aVar.d();
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
