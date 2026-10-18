package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class t extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public s[] f6785a = s.b();

    /* renamed from: b, reason: collision with root package name */
    public long f6786b = 0;
    public boolean c = false;

    public t() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6785a != null && this.f6785a.length > 0) {
            for (int i = 0; i < this.f6785a.length; i++) {
                s sVar = this.f6785a[i];
                if (sVar != null) {
                    codedOutputByteBufferNano.b(1, sVar);
                }
            }
        }
        if (this.c || this.f6786b != 0) {
            codedOutputByteBufferNano.b(2, this.f6786b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6785a != null && this.f6785a.length > 0) {
            for (int i = 0; i < this.f6785a.length; i++) {
                s sVar = this.f6785a[i];
                if (sVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, sVar);
                }
            }
        }
        if (this.c || this.f6786b != 0) {
            return a2 + CodedOutputByteBufferNano.e(2, this.f6786b);
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
                    int length = this.f6785a == null ? 0 : this.f6785a.length;
                    s[] sVarArr = new s[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f6785a, 0, sVarArr, 0, length);
                    }
                    while (length < sVarArr.length - 1) {
                        sVarArr[length] = new s();
                        aVar.a(sVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    sVarArr[length] = new s();
                    aVar.a(sVarArr[length]);
                    this.f6785a = sVarArr;
                    break;
                case 16:
                    this.f6786b = aVar.f();
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
