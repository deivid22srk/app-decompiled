package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class eo extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public dp[] f3790a = dp.b();

    /* renamed from: b, reason: collision with root package name */
    public long f3791b = 0;
    public boolean c = false;
    public String d = "";
    public boolean e = false;

    public eo() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3790a != null && this.f3790a.length > 0) {
            for (int i = 0; i < this.f3790a.length; i++) {
                dp dpVar = this.f3790a[i];
                if (dpVar != null) {
                    codedOutputByteBufferNano.b(1, dpVar);
                }
            }
        }
        if (this.c || this.f3791b != 0) {
            codedOutputByteBufferNano.b(2, this.f3791b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3790a != null && this.f3790a.length > 0) {
            for (int i = 0; i < this.f3790a.length; i++) {
                dp dpVar = this.f3790a[i];
                if (dpVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, dpVar);
                }
            }
        }
        if (this.c || this.f3791b != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.f3791b);
        }
        if (this.e || !this.d.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(3, this.d);
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
                    int length = this.f3790a == null ? 0 : this.f3790a.length;
                    dp[] dpVarArr = new dp[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3790a, 0, dpVarArr, 0, length);
                    }
                    while (length < dpVarArr.length - 1) {
                        dpVarArr[length] = new dp();
                        aVar.a(dpVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dpVarArr[length] = new dp();
                    aVar.a(dpVarArr[length]);
                    this.f3790a = dpVarArr;
                    break;
                case 16:
                    this.f3791b = aVar.f();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
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
