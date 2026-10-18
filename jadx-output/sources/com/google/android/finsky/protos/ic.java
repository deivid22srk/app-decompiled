package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ic extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public ny[] f3943a = ny.b();

    /* renamed from: b, reason: collision with root package name */
    public oc f3944b = null;
    public long c = 0;
    public boolean d = false;

    public ic() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3943a != null && this.f3943a.length > 0) {
            for (int i = 0; i < this.f3943a.length; i++) {
                ny nyVar = this.f3943a[i];
                if (nyVar != null) {
                    codedOutputByteBufferNano.b(1, nyVar);
                }
            }
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f3944b != null) {
            codedOutputByteBufferNano.b(3, this.f3944b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3943a != null && this.f3943a.length > 0) {
            for (int i = 0; i < this.f3943a.length; i++) {
                ny nyVar = this.f3943a[i];
                if (nyVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, nyVar);
                }
            }
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.c);
        }
        if (this.f3944b != null) {
            return a2 + CodedOutputByteBufferNano.d(3, this.f3944b);
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
                    int length = this.f3943a == null ? 0 : this.f3943a.length;
                    ny[] nyVarArr = new ny[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f3943a, 0, nyVarArr, 0, length);
                    }
                    while (length < nyVarArr.length - 1) {
                        nyVarArr[length] = new ny();
                        aVar.a(nyVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    nyVarArr[length] = new ny();
                    aVar.a(nyVarArr[length]);
                    this.f3943a = nyVarArr;
                    break;
                case 16:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 26:
                    if (this.f3944b == null) {
                        this.f3944b = new oc();
                    }
                    aVar.a(this.f3944b);
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
